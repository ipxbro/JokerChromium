// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.page_info;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.ui.base.ViewUtils;
import org.chromium.ui.widget.ChromeImageView;

/**
 * View showing an icon, title and subtitle for a page info row.
 */
public class PageInfoRowView extends FrameLayout {
    /**  Parameters to configure the row view. */
    public static class ViewParams {
        public boolean visible;
        public @DrawableRes int iconResId;
        public @ColorRes int iconTint;
        public CharSequence title;
        public CharSequence subtitle;
        public Runnable clickCallback;
        public boolean decreaseIconSize;
        public @ColorRes int rowTint;
    }

    private final ChromeImageView mIcon;
    private final TextView mTitle;
    private final TextView mSubtitle;

    public PageInfoRowView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.page_info_row, this, true);
        mIcon = findViewById(R.id.page_info_row_icon);
        mTitle = findViewById(R.id.page_info_row_title);
        mSubtitle = findViewById(R.id.page_info_row_subtitle);
    }

    public void setParams(ViewParams params) {
        setVisibility(params.visible ? VISIBLE : GONE);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        mIcon.setImageResource(params.iconResId);
        if (params.decreaseIconSize) {
            // All icons are 24dp but some are effectively 20dp because fill the side with padding.
            // Add 2dp padding for the images that are otherwise too large to make them
            // equal size.
            // TODO(crbug.com/1135124): Figure out why we have these differences.
            int p = ViewUtils.dpToPx(displayMetrics, 2);
            mIcon.setPadding(p, p, p, p);
        }
        ApiCompatibilityUtils.setImageTintList(mIcon,
                ColorStateList.valueOf(getResources().getColor(
                        params.iconTint != 0 ? params.iconTint : R.color.default_icon_color)));

        mTitle.setText(params.title);
        mTitle.setVisibility(params.title != null ? VISIBLE : GONE);
        updateSubtitle(params.subtitle);
        if (params.title != null && params.subtitle != null) {
            mTitle.setPadding(0, 0, 0, ViewUtils.dpToPx(displayMetrics, 4));
        }
        if (params.clickCallback != null) {
            setClickable(true);
            setFocusable(true);
            getChildAt(0).setOnClickListener((v) -> params.clickCallback.run());
        }
        if (params.rowTint != 0) {
            setBackgroundColor(params.rowTint);
        }
    }

    public void updateSubtitle(CharSequence subtitle) {
        mSubtitle.setText(subtitle);
        mSubtitle.setVisibility(subtitle != null ? VISIBLE : GONE);
    }
}

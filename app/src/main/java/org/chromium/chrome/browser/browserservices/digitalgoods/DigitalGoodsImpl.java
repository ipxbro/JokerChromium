// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.browserservices.digitalgoods;

import android.net.Uri;

import androidx.annotation.Nullable;

import org.chromium.mojo.system.MojoException;
import org.chromium.payments.mojom.DigitalGoods;
import org.chromium.payments.mojom.DigitalGoods.AcknowledgeResponse;
import org.chromium.payments.mojom.DigitalGoods.GetDetailsResponse;
import org.chromium.payments.mojom.DigitalGoods.ListPurchasesResponse;
import org.chromium.url.GURL;

/**
 * An implementation of the {@link DigitalGoods} mojo interface that communicates with Trusted Web
 * Activity clients to call Billing APIs.
 */
public class DigitalGoodsImpl implements DigitalGoods {
    private final DigitalGoodsAdapter mAdapter;
    private final Delegate mDelegate;

    /** A Delegate that provides the current URL. */
    public interface Delegate {
        /** @return The current URL or null when the frame is being destroyed. */
        @Nullable
        GURL getUrl();
    }

    /** Constructs the object with a given adapter and delegate. */
    public DigitalGoodsImpl(DigitalGoodsAdapter adapter, Delegate delegate) {
        mAdapter = adapter;
        mDelegate = delegate;
    }

    @Override
    public void getDetails(String[] itemIds, GetDetailsResponse callback) {
        GURL url = mDelegate.getUrl();
        if (url != null) mAdapter.getDetails(Uri.parse(url.getSpec()), itemIds, callback);
    }

    @Override
    public void acknowledge(
            String purchaseToken, boolean makeAvailableAgain, AcknowledgeResponse callback) {
        GURL url = mDelegate.getUrl();
        if (url != null) {
            mAdapter.acknowledge(
                    Uri.parse(url.getSpec()), purchaseToken, makeAvailableAgain, callback);
        }
    }

    @Override
    public void listPurchases(ListPurchasesResponse callback) {
        GURL url = mDelegate.getUrl();
        if (url != null) mAdapter.listPurchases(Uri.parse(url.getSpec()), callback);
    }

    @Override
    public void close() {}

    @Override
    public void onConnectionError(MojoException e) {}
}

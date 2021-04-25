
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/safe_browsing/core/common/safe_browsing_settings_metrics.h

package org.chromium.chrome.browser.safe_browsing.metrics;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SettingsAccessPoint.DEFAULT, SettingsAccessPoint.PARENT_SETTINGS,
    SettingsAccessPoint.SAFETY_CHECK, SettingsAccessPoint.SURFACE_EXPLORER_PROMO_SLINGER,
    SettingsAccessPoint.SECURITY_INTERSTITIAL, SettingsAccessPoint.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface SettingsAccessPoint {
  int DEFAULT = 0;
  /**
   * From Settings > Privacy and security.
   */
  int PARENT_SETTINGS = 1;
  /**
   * From Settings > Safety check.
   */
  int SAFETY_CHECK = 2;
  /**
   * From PromoSlinger on Surface Explorer on Android.
   */
  int SURFACE_EXPLORER_PROMO_SLINGER = 3;
  /**
   * From security interstitial.
   */
  int SECURITY_INTERSTITIAL = 4;
  int MAX_VALUE = SURFACE_EXPLORER_PROMO_SLINGER;
}

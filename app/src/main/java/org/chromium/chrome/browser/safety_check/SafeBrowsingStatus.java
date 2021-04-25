
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/safety_check/safety_check.h

package org.chromium.chrome.browser.safety_check;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SafeBrowsingStatus.CHECKING, SafeBrowsingStatus.ENABLED, SafeBrowsingStatus.DISABLED,
    SafeBrowsingStatus.DISABLED_BY_ADMIN, SafeBrowsingStatus.DISABLED_BY_EXTENSION,
    SafeBrowsingStatus.ENABLED_STANDARD, SafeBrowsingStatus.ENABLED_ENHANCED,
    SafeBrowsingStatus.ENABLED_STANDARD_AVAILABLE_ENHANCED, SafeBrowsingStatus.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface SafeBrowsingStatus {
  int CHECKING = 0;
  int ENABLED = 1;
  int DISABLED = 2;
  int DISABLED_BY_ADMIN = 3;
  int DISABLED_BY_EXTENSION = 4;
  int ENABLED_STANDARD = 5;
  int ENABLED_ENHANCED = 6;
  int ENABLED_STANDARD_AVAILABLE_ENHANCED = 7;
  /**
   * New enum values must go above here.
   */
  int MAX_VALUE = ENABLED_STANDARD_AVAILABLE_ENHANCED;
}


// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/password_check/android/password_check_ui_status.h

package org.chromium.chrome.browser.password_check;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PasswordCheckUIStatus.IDLE, PasswordCheckUIStatus.RUNNING, PasswordCheckUIStatus.CANCELED,
    PasswordCheckUIStatus.ERROR_OFFLINE, PasswordCheckUIStatus.ERROR_NO_PASSWORDS,
    PasswordCheckUIStatus.ERROR_SIGNED_OUT, PasswordCheckUIStatus.ERROR_QUOTA_LIMIT,
    PasswordCheckUIStatus.ERROR_QUOTA_LIMIT_ACCOUNT_CHECK, PasswordCheckUIStatus.ERROR_UNKNOWN
})
@Retention(RetentionPolicy.SOURCE)
public @interface PasswordCheckUIStatus {
  int IDLE = 0;
  int RUNNING = 1;
  int CANCELED = 2;
  int ERROR_OFFLINE = 3;
  int ERROR_NO_PASSWORDS = 4;
  int ERROR_SIGNED_OUT = 5;
  int ERROR_QUOTA_LIMIT = 6;
  int ERROR_QUOTA_LIMIT_ACCOUNT_CHECK = 7;
  int ERROR_UNKNOWN = 8;
}

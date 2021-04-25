
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/sync/base/passphrase_enums.h

package org.chromium.components.sync;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PassphraseType.IMPLICIT_PASSPHRASE, PassphraseType.KEYSTORE_PASSPHRASE,
    PassphraseType.FROZEN_IMPLICIT_PASSPHRASE, PassphraseType.CUSTOM_PASSPHRASE,
    PassphraseType.TRUSTED_VAULT_PASSPHRASE, PassphraseType.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface PassphraseType {
  /**
   * GAIA-based passphrase (deprecated).
   */
  int IMPLICIT_PASSPHRASE = 0;
  /**
   * Keystore passphrase.
   */
  int KEYSTORE_PASSPHRASE = 1;
  /**
   * Frozen GAIA passphrase.
   */
  int FROZEN_IMPLICIT_PASSPHRASE = 2;
  /**
   * User-provided passphrase.
   */
  int CUSTOM_PASSPHRASE = 3;
  /**
   * Trusted-vault passphrase.
   */
  int TRUSTED_VAULT_PASSPHRASE = 4;
  /**
   * Alias used by UMA macros to deduce the correct boundary value.
   */
  int MAX_VALUE = TRUSTED_VAULT_PASSPHRASE;
}

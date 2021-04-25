
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/offline_pages/core/prefetch/prefetch_types.h

package org.chromium.components.offlinepages;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PrefetchBackgroundTaskRescheduleType.NO_RESCHEDULE,
    PrefetchBackgroundTaskRescheduleType.RESCHEDULE_WITHOUT_BACKOFF,
    PrefetchBackgroundTaskRescheduleType.RESCHEDULE_WITH_BACKOFF,
    PrefetchBackgroundTaskRescheduleType.RESCHEDULE_DUE_TO_SYSTEM,
    PrefetchBackgroundTaskRescheduleType.SUSPEND
})
@Retention(RetentionPolicy.SOURCE)
public @interface PrefetchBackgroundTaskRescheduleType {
  /**
   * No reschedule.
   */
  int NO_RESCHEDULE = 0;
  /**
   * Reschedules the task in the next available WiFi window after 15 minutes have passed.
   */
  int RESCHEDULE_WITHOUT_BACKOFF = 1;
  /**
   * Reschedules the task with backoff included.
   */
  int RESCHEDULE_WITH_BACKOFF = 2;
  /**
   * Reschedules the task due to the fact that it is killed due to the system constraint.
   */
  int RESCHEDULE_DUE_TO_SYSTEM = 3;
  /**
   * Reschedules the task after 1 day.
   */
  int SUSPEND = 4;
}

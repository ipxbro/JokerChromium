
// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/content_settings/core/common/content_settings_types.h

package org.chromium.components.content_settings;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ContentSettingsType.DEFAULT, ContentSettingsType.COOKIES, ContentSettingsType.IMAGES,
    ContentSettingsType.JAVASCRIPT, ContentSettingsType.DEPRECATED_PLUGINS,
    ContentSettingsType.POPUPS, ContentSettingsType.GEOLOCATION, ContentSettingsType.NOTIFICATIONS,
    ContentSettingsType.AUTO_SELECT_CERTIFICATE, ContentSettingsType.MIXEDSCRIPT,
    ContentSettingsType.MEDIASTREAM_MIC, ContentSettingsType.MEDIASTREAM_CAMERA,
    ContentSettingsType.PROTOCOL_HANDLERS, ContentSettingsType.PPAPI_BROKER,
    ContentSettingsType.AUTOMATIC_DOWNLOADS, ContentSettingsType.MIDI_SYSEX,
    ContentSettingsType.SSL_CERT_DECISIONS, ContentSettingsType.PROTECTED_MEDIA_IDENTIFIER,
    ContentSettingsType.APP_BANNER, ContentSettingsType.SITE_ENGAGEMENT,
    ContentSettingsType.DURABLE_STORAGE, ContentSettingsType.USB_CHOOSER_DATA,
    ContentSettingsType.BLUETOOTH_GUARD, ContentSettingsType.BACKGROUND_SYNC,
    ContentSettingsType.AUTOPLAY, ContentSettingsType.IMPORTANT_SITE_INFO,
    ContentSettingsType.PERMISSION_AUTOBLOCKER_DATA, ContentSettingsType.ADS,
    ContentSettingsType.ADS_DATA, ContentSettingsType.MIDI, ContentSettingsType.PASSWORD_PROTECTION,
    ContentSettingsType.MEDIA_ENGAGEMENT, ContentSettingsType.SOUND,
    ContentSettingsType.CLIENT_HINTS, ContentSettingsType.SENSORS,
    ContentSettingsType.ACCESSIBILITY_EVENTS, ContentSettingsType.PAYMENT_HANDLER,
    ContentSettingsType.USB_GUARD, ContentSettingsType.BACKGROUND_FETCH,
    ContentSettingsType.INTENT_PICKER_DISPLAY, ContentSettingsType.IDLE_DETECTION,
    ContentSettingsType.SERIAL_GUARD, ContentSettingsType.SERIAL_CHOOSER_DATA,
    ContentSettingsType.PERIODIC_BACKGROUND_SYNC, ContentSettingsType.BLUETOOTH_SCANNING,
    ContentSettingsType.HID_GUARD, ContentSettingsType.HID_CHOOSER_DATA,
    ContentSettingsType.WAKE_LOCK_SCREEN, ContentSettingsType.WAKE_LOCK_SYSTEM,
    ContentSettingsType.LEGACY_COOKIE_ACCESS, ContentSettingsType.FILE_SYSTEM_WRITE_GUARD,
    ContentSettingsType.INSTALLED_WEB_APP_METADATA, ContentSettingsType.NFC,
    ContentSettingsType.BLUETOOTH_CHOOSER_DATA, ContentSettingsType.CLIPBOARD_READ_WRITE,
    ContentSettingsType.CLIPBOARD_SANITIZED_WRITE, ContentSettingsType.SAFE_BROWSING_URL_CHECK_DATA,
    ContentSettingsType.VR, ContentSettingsType.AR, ContentSettingsType.FILE_SYSTEM_READ_GUARD,
    ContentSettingsType.STORAGE_ACCESS, ContentSettingsType.CAMERA_PAN_TILT_ZOOM,
    ContentSettingsType.WINDOW_PLACEMENT, ContentSettingsType.INSECURE_PRIVATE_NETWORK,
    ContentSettingsType.FONT_ACCESS, ContentSettingsType.PERMISSION_AUTOREVOCATION_DATA,
    ContentSettingsType.FILE_SYSTEM_LAST_PICKED_DIRECTORY, ContentSettingsType.DISPLAY_CAPTURE,
    ContentSettingsType.NUM_TYPES
})
@Retention(RetentionPolicy.SOURCE)
public @interface ContentSettingsType {
  /**
   * "DEFAULT" is only used as an argument to the Content Settings Window opener; there it means
   * "whatever was last shown".
   */
  int DEFAULT = -1;
  int COOKIES = 0;
  int IMAGES = 1;
  int JAVASCRIPT = 2;
  int DEPRECATED_PLUGINS = 3;
  /**
   * This setting governs both popups and unwanted redirects like tab-unders and framebusting.
   * TODO(csharrison): Consider renaming it to POPUPS_AND_REDIRECTS, but it might not be worth the
   * trouble.
   */
  int POPUPS = 4;
  int GEOLOCATION = 5;
  int NOTIFICATIONS = 6;
  int AUTO_SELECT_CERTIFICATE = 7;
  int MIXEDSCRIPT = 8;
  int MEDIASTREAM_MIC = 9;
  int MEDIASTREAM_CAMERA = 10;
  int PROTOCOL_HANDLERS = 11;
  int PPAPI_BROKER = 12;
  int AUTOMATIC_DOWNLOADS = 13;
  int MIDI_SYSEX = 14;
  int SSL_CERT_DECISIONS = 15;
  int PROTECTED_MEDIA_IDENTIFIER = 16;
  int APP_BANNER = 17;
  int SITE_ENGAGEMENT = 18;
  int DURABLE_STORAGE = 19;
  int USB_CHOOSER_DATA = 20;
  int BLUETOOTH_GUARD = 21;
  int BACKGROUND_SYNC = 22;
  int AUTOPLAY = 23;
  int IMPORTANT_SITE_INFO = 24;
  int PERMISSION_AUTOBLOCKER_DATA = 25;
  int ADS = 26;
  /**
   * Website setting which stores metadata for the subresource filter to aid in decisions for
   * whether or not to show the UI.
   */
  int ADS_DATA = 27;
  /**
   * This is special-cased in the permissions layer to always allow, and as such doesn't have
   * associated prefs data.
   */
  int MIDI = 28;
  /**
   * This content setting type is for caching password protection service's verdicts of each origin.
   */
  int PASSWORD_PROTECTION = 29;
  /**
   * Website setting which stores engagement data for media related to a specific origin.
   */
  int MEDIA_ENGAGEMENT = 30;
  /**
   * Content setting which stores whether or not the site can play audible sound. This will not
   * block playback but instead the user will not hear it.
   */
  int SOUND = 31;
  /**
   * Website setting which stores the list of client hints (and the preference expiration time for
   * each of the client hints) that the origin requested the browser to remember. Spec:
   * http://httpwg.org/http-extensions/client-hints.html#accept-ch-lifetime. The setting is stored
   * as a dictionary that includes the mapping from different client hints to their respective
   * expiration times (seconds since epoch). The browser is expected to send all the unexpired
   * client hints in the HTTP request headers for every resource requested from that origin.
   */
  int CLIENT_HINTS = 32;
  /**
   * Generic Sensor API covering ambient-light-sensor, accelerometer, gyroscope and magnetometer are
   * all mapped to a single content_settings_type. Setting for the Generic Sensor API covering
   * ambient-light-sensor, accelerometer, gyroscope and magnetometer. These are all mapped to a
   * single ContentSettingsType.
   */
  int SENSORS = 33;
  /**
   * Content setting which stores whether or not the user has granted the site permission to respond
   * to accessibility events, which can be used to provide a custom accessibility experience.
   * Requires explicit user consent because some users may not want sites to know they're using
   * assistive technology.
   */
  int ACCESSIBILITY_EVENTS = 34;
  /**
   * Used to store whether to allow a website to install a payment handler.
   */
  int PAYMENT_HANDLER = 35;
  /**
   * Content setting which stores whether to allow sites to ask for permission to access USB
   * devices. If this is allowed specific device permissions are stored under USB_CHOOSER_DATA.
   */
  int USB_GUARD = 36;
  /**
   * Nothing is stored in this setting at present. Please refer to BackgroundFetchPermissionContext
   * for details on how this permission is ascertained.
   */
  int BACKGROUND_FETCH = 37;
  /**
   * Website setting which stores the amount of times the user has dismissed intent picker UI
   * without explicitly choosing an option.
   */
  int INTENT_PICKER_DISPLAY = 38;
  /**
   * Used to store whether to allow a website to detect user active/idle state.
   */
  int IDLE_DETECTION = 39;
  /**
   * Content settings for access to serial ports. The "guard" content setting stores whether to
   * allow sites to ask for permission to access a port. The permissions granted to access
   * particular ports are stored in the "chooser data" website setting.
   */
  int SERIAL_GUARD = 40;
  int SERIAL_CHOOSER_DATA = 41;
  /**
   * Nothing is stored in this setting at present. Please refer to
   * PeriodicBackgroundSyncPermissionContext for details on how this permission is ascertained. This
   * content setting is not registered because it does not require access to any existing providers.
   */
  int PERIODIC_BACKGROUND_SYNC = 42;
  /**
   * Content setting which stores whether to allow sites to ask for permission to do Bluetooth
   * scanning.
   */
  int BLUETOOTH_SCANNING = 43;
  /**
   * Content settings for access to HID devices. The "guard" content setting stores whether to allow
   * sites to ask for permission to access a device. The permissions granted to access particular
   * devices are stored in the "chooser data" website setting.
   */
  int HID_GUARD = 44;
  int HID_CHOOSER_DATA = 45;
  /**
   * Wake Lock API, which has two lock types: screen and system locks. Currently, screen locks do
   * not need any additional permission, and system locks are always denied while the right UI is
   * worked out.
   */
  int WAKE_LOCK_SCREEN = 46;
  int WAKE_LOCK_SYSTEM = 47;
  /**
   * Legacy SameSite cookie behavior. This disables SameSiteByDefaultCookies,
   * CookiesWithoutSameSiteMustBeSecure, and SchemefulSameSite, forcing the legacy behavior wherein
   * cookies that don't specify SameSite are treated as SameSite=None, SameSite=None cookies are not
   * required to be Secure, and schemeful same-site is not active. This will also be used to revert
   * to legacy behavior when future changes in cookie handling are introduced.
   */
  int LEGACY_COOKIE_ACCESS = 48;
  /**
   * Content settings which stores whether to allow sites to ask for permission to save changes to
   * an original file selected by the user through the File System API.
   */
  int FILE_SYSTEM_WRITE_GUARD = 49;
  /**
   * Content settings for installed web apps that browsing history may be inferred from e.g. last
   * update check timestamp.
   */
  int INSTALLED_WEB_APP_METADATA = 50;
  /**
   * Used to store whether to allow a website to exchange data with NFC devices.
   */
  int NFC = 51;
  /**
   * Website setting to store permissions granted to access particular Bluetooth devices.
   */
  int BLUETOOTH_CHOOSER_DATA = 52;
  /**
   * Full access to the system clipboard (sanitized read without user gesture, and unsanitized read
   * and write with user gesture). TODO(https://crbug.com/1027225): Move CLIPBOARD_READ_WRITE uses
   * to be ordered in the same order as listed in the enum.
   */
  int CLIPBOARD_READ_WRITE = 53;
  /**
   * This is special-cased in the permissions layer to always allow, and as such doesn't have
   * associated prefs data. TODO(https://crbug.com/1027225): Move CLIPBOARD_SANITIZED_WRITE uses to
   * be ordered in the same order as listed in the enum.
   */
  int CLIPBOARD_SANITIZED_WRITE = 54;
  /**
   * This content setting type is for caching safe browsing real time url check's verdicts of each
   * origin.
   */
  int SAFE_BROWSING_URL_CHECK_DATA = 55;
  /**
   * Used to store whether a site is allowed to request AR or VR sessions with the WebXr Device API.
   */
  int VR = 56;
  int AR = 57;
  /**
   * Content setting which stores whether to allow site to open and read files and directories
   * selected through the File System API.
   */
  int FILE_SYSTEM_READ_GUARD = 58;
  /**
   * Access to first party storage in a third-party context. Exceptions are scoped to the
   * combination of requesting/top-level origin, and are managed through the Storage Access API. For
   * the time being, this content setting exists in parallel to third-party cookie rules stored in
   * COOKIES. TODO(https://crbug.com/989663): Reconcile the two.
   */
  int STORAGE_ACCESS = 59;
  /**
   * Content setting which stores whether to allow a site to control camera movements. It does not
   * give access to camera.
   */
  int CAMERA_PAN_TILT_ZOOM = 60;
  /**
   * Content setting for Screen Enumeration and Window Placement functionality. Permits access to
   * information about the screens, like size and position. Permits creating and placing windows
   * across the set of connected screens.
   */
  int WINDOW_PLACEMENT = 61;
  /**
   * Stores whether to allow insecure websites to make private network requests. See also:
   * https://wicg.github.io/cors-rfc1918 Set through enterprise policies only.
   */
  int INSECURE_PRIVATE_NETWORK = 62;
  /**
   * Content setting which stores whether or not a site can access low-level locally installed font
   * data using the Font Access API.
   */
  int FONT_ACCESS = 63;
  /**
   * Stores per-origin state for permission auto-revocation (for all permission types).
   */
  int PERMISSION_AUTOREVOCATION_DATA = 64;
  /**
   * Stores per-origin state of the most recently selected directory for the use by the File System
   * Access API.
   */
  int FILE_SYSTEM_LAST_PICKED_DIRECTORY = 65;
  /**
   * Capture the current tab using getCurrentBrowsingContextMedia(). TODO(crbug.com/1150788): Apply
   * this to getDisplayMedia() as well. No values are stored for this type, this is solely needed to
   * be able to register the PermissionContext.
   */
  int DISPLAY_CAPTURE = 66;
  int NUM_TYPES = 67;
}

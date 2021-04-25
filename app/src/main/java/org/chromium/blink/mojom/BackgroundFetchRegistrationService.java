// BackgroundFetchRegistrationService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/background_fetch/background_fetch.mojom
//

package org.chromium.blink.mojom;


public interface BackgroundFetchRegistrationService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends BackgroundFetchRegistrationService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<BackgroundFetchRegistrationService, BackgroundFetchRegistrationService.Proxy> MANAGER = BackgroundFetchRegistrationService_Internal.MANAGER;


    void updateUi(
String title, org.chromium.skia.mojom.Bitmap icon, 
UpdateUiResponse callback);

    interface UpdateUiResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void abort(

AbortResponse callback);

    interface AbortResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void matchRequests(
FetchApiRequest requestToMatch, CacheQueryOptions cacheQueryOptions, boolean matchAll, 
MatchRequestsResponse callback);

    interface MatchRequestsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<BackgroundFetchSettledFetch[]> { }



    void addRegistrationObserver(
BackgroundFetchRegistrationObserver observer);


}

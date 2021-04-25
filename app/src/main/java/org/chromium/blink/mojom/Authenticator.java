// Authenticator.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webauthn/authenticator.mojom
//

package org.chromium.blink.mojom;


public interface Authenticator extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends Authenticator, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<Authenticator, Authenticator.Proxy> MANAGER = Authenticator_Internal.MANAGER;


    void makeCredential(
PublicKeyCredentialCreationOptions options, 
MakeCredentialResponse callback);

    interface MakeCredentialResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, MakeCredentialAuthenticatorResponse> { }



    void getAssertion(
PublicKeyCredentialRequestOptions options, 
GetAssertionResponse callback);

    interface GetAssertionResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, GetAssertionAuthenticatorResponse> { }



    void isUserVerifyingPlatformAuthenticatorAvailable(

IsUserVerifyingPlatformAuthenticatorAvailableResponse callback);

    interface IsUserVerifyingPlatformAuthenticatorAvailableResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void cancel(
);


}

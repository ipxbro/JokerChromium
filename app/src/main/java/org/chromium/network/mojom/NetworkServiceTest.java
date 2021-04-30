// NetworkServiceTest.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_service_test.mojom
//

package org.chromium.network.mojom;


public interface NetworkServiceTest extends org.chromium.mojo.bindings.Interface {



    public static final class RequireCt {
        private static final boolean IS_EXTENSIBLE = false;

        public static final int DEFAULT = 0;
        public static final int REQUIRE = 1;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 1;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          return value;
        }

        private RequireCt() {}
    }


    public interface Proxy extends NetworkServiceTest, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NetworkServiceTest, NetworkServiceTest.Proxy> MANAGER = NetworkServiceTest_Internal.MANAGER;


    void addRules(
Rule[] rules, 
AddRulesResponse callback);

    interface AddRulesResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void simulateNetworkChange(
int type, 
SimulateNetworkChangeResponse callback);

    interface SimulateNetworkChangeResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void simulateNetworkQualityChange(
int type, 
SimulateNetworkQualityChangeResponse callback);

    interface SimulateNetworkQualityChangeResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void simulateCrash(
);



    void mockCertVerifierSetDefaultResult(
int defaultResult, 
MockCertVerifierSetDefaultResultResponse callback);

    interface MockCertVerifierSetDefaultResultResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void mockCertVerifierAddResultForCertAndHost(
X509Certificate cert, String hostPattern, CertVerifyResult verifyResult, int rv, 
MockCertVerifierAddResultForCertAndHostResponse callback);

    interface MockCertVerifierAddResultForCertAndHostResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setRequireCt(
int required, 
SetRequireCtResponse callback);

    interface SetRequireCtResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setTransportSecurityStateSource(
short reportingPort, 
SetTransportSecurityStateSourceResponse callback);

    interface SetTransportSecurityStateSourceResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setAllowNetworkAccessToHostResolutions(

SetAllowNetworkAccessToHostResolutionsResponse callback);

    interface SetAllowNetworkAccessToHostResolutionsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void crashOnResolveHost(
String host);



    void crashOnGetCookieList(
);



    void getLatestMemoryPressureLevel(

GetLatestMemoryPressureLevelResponse callback);

    interface GetLatestMemoryPressureLevelResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void getPeerToPeerConnectionsCountChange(

GetPeerToPeerConnectionsCountChangeResponse callback);

    interface GetPeerToPeerConnectionsCountChangeResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void getEnvironmentVariableValue(
String name, 
GetEnvironmentVariableValueResponse callback);

    interface GetEnvironmentVariableValueResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<String> { }



    void log(
String message, 
LogResponse callback);

    interface LogResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void activateFieldTrial(
String fieldTrialName);



    void setEvPolicy(
byte[] fingerprintSha256, String policyOid, 
SetEvPolicyResponse callback);

    interface SetEvPolicyResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void getFirstPartySetEntriesCount(

GetFirstPartySetEntriesCountResponse callback);

    interface GetFirstPartySetEntriesCountResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Long> { }


}

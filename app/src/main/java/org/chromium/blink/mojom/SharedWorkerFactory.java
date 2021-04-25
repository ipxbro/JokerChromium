// SharedWorkerFactory.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/shared_worker_factory.mojom
//

package org.chromium.blink.mojom;


public interface SharedWorkerFactory extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends SharedWorkerFactory, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SharedWorkerFactory, SharedWorkerFactory.Proxy> MANAGER = SharedWorkerFactory_Internal.MANAGER;


    void createSharedWorker(
SharedWorkerInfo info, SharedWorkerToken token, org.chromium.url.internal.mojom.Origin constructorOrigin, String userAgent, UserAgentMetadata uaMetadata, boolean pauseOnStart, org.chromium.mojo_base.mojom.UnguessableToken devtoolsWorkerToken, RendererPreferences rendererPreferences, org.chromium.mojo.bindings.InterfaceRequest<RendererPreferenceWatcher> preferenceWatcherReceiver, WorkerContentSettingsProxy contentSettings, ServiceWorkerContainerInfoForClient serviceWorkerContainerInfo, org.chromium.mojo_base.mojom.UnguessableToken appcacheHostId, WorkerMainScriptLoadParams mainScriptLoadParams, UrlLoaderFactoryBundle subresourceLoaderFactories, ControllerServiceWorkerInfo controllerInfo, SharedWorkerHost host, org.chromium.mojo.bindings.InterfaceRequest<SharedWorker> sharedWorker, BrowserInterfaceBroker browserInterfaceBroker, long ukmSourceId);


}

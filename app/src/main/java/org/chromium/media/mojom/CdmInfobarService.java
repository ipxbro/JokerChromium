// CdmInfobarService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/cdm_infobar_service.mojom
//

package org.chromium.media.mojom;


public interface CdmInfobarService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CdmInfobarService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CdmInfobarService, CdmInfobarService.Proxy> MANAGER = CdmInfobarService_Internal.MANAGER;


    void notifyUnsupportedPlatform(
);


}

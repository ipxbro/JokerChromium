package org.chromium.chrome.browser.compositor.scene_layer;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class StaticTabSceneLayerJni implements StaticTabSceneLayer.Natives {
  private static StaticTabSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<StaticTabSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.StaticTabSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.StaticTabSceneLayer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(StaticTabSceneLayer caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_StaticTabSceneLayer_init(caller);
  }

  @Override
  public void updateTabLayer(long nativeStaticTabSceneLayer, StaticTabSceneLayer caller, int id,
      boolean canUseLiveLayer, int backgroundColor, float x, float y, float staticToViewBlend,
      float saturation, float brightness) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_StaticTabSceneLayer_updateTabLayer(nativeStaticTabSceneLayer, caller, id, canUseLiveLayer, backgroundColor, x, y, staticToViewBlend, saturation, brightness);
  }

  @Override
  public void setTabContentManager(long nativeStaticTabSceneLayer, StaticTabSceneLayer caller,
      TabContentManager tabContentManager) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_StaticTabSceneLayer_setTabContentManager(nativeStaticTabSceneLayer, caller, tabContentManager);
  }

  public static StaticTabSceneLayer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.StaticTabSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new StaticTabSceneLayerJni();
  }
}

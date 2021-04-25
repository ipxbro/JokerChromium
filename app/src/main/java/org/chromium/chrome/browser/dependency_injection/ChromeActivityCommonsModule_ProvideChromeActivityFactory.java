// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.chromium.chrome.browser.app.ChromeActivity;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideChromeActivityFactory implements Factory<ChromeActivity<?>> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideChromeActivityFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ChromeActivity<?> get() {
    return provideChromeActivity(module);
  }

  public static ChromeActivityCommonsModule_ProvideChromeActivityFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideChromeActivityFactory(module);
  }

  public static ChromeActivity<?> provideChromeActivity(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNull(instance.provideChromeActivity(), "Cannot return null from a non-@Nullable @Provides method");
  }
}

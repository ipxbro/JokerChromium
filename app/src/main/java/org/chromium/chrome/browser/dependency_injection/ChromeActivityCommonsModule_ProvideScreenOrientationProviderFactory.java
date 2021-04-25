// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.chromium.content_public.browser.ScreenOrientationProvider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideScreenOrientationProviderFactory implements Factory<ScreenOrientationProvider> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideScreenOrientationProviderFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ScreenOrientationProvider get() {
    return provideScreenOrientationProvider(module);
  }

  public static ChromeActivityCommonsModule_ProvideScreenOrientationProviderFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideScreenOrientationProviderFactory(module);
  }

  public static ScreenOrientationProvider provideScreenOrientationProvider(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNull(instance.provideScreenOrientationProvider(), "Cannot return null from a non-@Nullable @Provides method");
  }
}

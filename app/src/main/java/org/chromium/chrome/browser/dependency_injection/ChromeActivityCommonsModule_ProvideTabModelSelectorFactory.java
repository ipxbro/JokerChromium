// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideTabModelSelectorFactory implements Factory<TabModelSelector> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideTabModelSelectorFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public TabModelSelector get() {
    return provideTabModelSelector(module);
  }

  public static ChromeActivityCommonsModule_ProvideTabModelSelectorFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideTabModelSelectorFactory(module);
  }

  public static TabModelSelector provideTabModelSelector(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNull(instance.provideTabModelSelector(), "Cannot return null from a non-@Nullable @Provides method");
  }
}

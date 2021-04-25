// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.chromium.chrome.browser.tabmodel.TabCreatorManager;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory implements Factory<TabCreatorManager> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public TabCreatorManager get() {
    return provideTabCreatorManager(module);
  }

  public static ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory(module);
  }

  public static TabCreatorManager provideTabCreatorManager(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNull(instance.provideTabCreatorManager(), "Cannot return null from a non-@Nullable @Provides method");
  }
}

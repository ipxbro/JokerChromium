// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.chromium.chrome.browser.browserservices.ClientAppDataRegister;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvideClientAppDataRegisterFactory implements Factory<ClientAppDataRegister> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvideClientAppDataRegisterFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public ClientAppDataRegister get() {
    return provideClientAppDataRegister(module);
  }

  public static BaseCustomTabActivityModule_ProvideClientAppDataRegisterFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvideClientAppDataRegisterFactory(module);
  }

  public static ClientAppDataRegister provideClientAppDataRegister(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNull(instance.provideClientAppDataRegister(), "Cannot return null from a non-@Nullable @Provides method");
  }
}

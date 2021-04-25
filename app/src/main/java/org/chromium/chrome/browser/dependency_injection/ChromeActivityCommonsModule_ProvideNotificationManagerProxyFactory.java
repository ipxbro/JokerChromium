// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.chromium.components.browser_ui.notifications.NotificationManagerProxy;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideNotificationManagerProxyFactory implements Factory<NotificationManagerProxy> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideNotificationManagerProxyFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public NotificationManagerProxy get() {
    return provideNotificationManagerProxy(module);
  }

  public static ChromeActivityCommonsModule_ProvideNotificationManagerProxyFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideNotificationManagerProxyFactory(module);
  }

  public static NotificationManagerProxy provideNotificationManagerProxy(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNull(instance.provideNotificationManagerProxy(), "Cannot return null from a non-@Nullable @Provides method");
  }
}

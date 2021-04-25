// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.feed.library.sharedstream.piet;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.chromium.chrome.browser.feed.library.common.time.Clock;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PietStringFormatter_Factory implements Factory<PietStringFormatter> {
  private final Provider<Clock> clockProvider;

  public PietStringFormatter_Factory(Provider<Clock> clockProvider) {
    this.clockProvider = clockProvider;
  }

  @Override
  public PietStringFormatter get() {
    return newInstance(clockProvider.get());
  }

  public static PietStringFormatter_Factory create(Provider<Clock> clockProvider) {
    return new PietStringFormatter_Factory(clockProvider);
  }

  public static PietStringFormatter newInstance(Clock clock) {
    return new PietStringFormatter(clock);
  }
}

package nyc.friendlyrobot.sample.injection.component;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Component;
import nyc.friendlyrobot.sample.BoilerplateApplication;
import nyc.friendlyrobot.sample.injection.module.ActivityModule;
import nyc.friendlyrobot.sample.injection.module.ApplicationModule;
import nyc.friendlyrobot.sample.injection.module.NetworkModule;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        NetworkModule.class,
})
public interface ApplicationComponent {
    @NonNull
    ActivityComponent plus(@NonNull ActivityModule activityModule);

    void inject(@NonNull BoilerplateApplication boxBeeApplication);
}

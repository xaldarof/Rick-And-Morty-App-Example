// Generated by Dagger (https://dagger.dev).
package com.example.daggerhilt.core;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.daggerhilt.data.cache.core.AppDataBase;
import com.example.daggerhilt.data.cache.data_source.RickAndMortyRepository;
import com.example.daggerhilt.data.cache.di.CacheDataModule;
import com.example.daggerhilt.data.cache.di.CacheDataModule_ProvideDatabaseFactory;
import com.example.daggerhilt.data.cache.di.CacheDataModule_ProvideLogRepositoryFactory;
import com.example.daggerhilt.data.cloud.data_source.RickAndMortyApiService;
import com.example.daggerhilt.data.cloud.di.CloudModule;
import com.example.daggerhilt.data.cloud.di.CloudModule_ProvideRetrofitInstanceFactory;
import com.example.daggerhilt.data.cloud.di.CloudModule_ProvideServiceFactory;
import com.example.daggerhilt.ui.activity.MainActivity;
import com.example.daggerhilt.ui.fragments.CharactersFragment;
import com.example.daggerhilt.ui.fragments.InformationFragment;
import com.example.daggerhilt.vm.CommonViewModel;
import com.example.daggerhilt.vm.CommonViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_SingletonC extends App_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object appDataBase = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object rickAndMortyApiService = new MemoizedSentinel();

  private DaggerApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private AppDataBase appDataBase() {
    Object local = appDataBase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appDataBase;
        if (local instanceof MemoizedSentinel) {
          local = CacheDataModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          appDataBase = DoubleCheck.reentrantCheck(appDataBase, local);
        }
      }
    }
    return (AppDataBase) local;
  }

  private Retrofit retrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = CloudModule_ProvideRetrofitInstanceFactory.provideRetrofitInstance();
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private RickAndMortyApiService rickAndMortyApiService() {
    Object local = rickAndMortyApiService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = rickAndMortyApiService;
        if (local instanceof MemoizedSentinel) {
          local = CloudModule_ProvideServiceFactory.provideService(retrofit());
          rickAndMortyApiService = DoubleCheck.reentrantCheck(rickAndMortyApiService, local);
        }
      }
    }
    return (RickAndMortyApiService) local;
  }

  private RickAndMortyRepository.Base base() {
    return new RickAndMortyRepository.Base(appDataBase(), rickAndMortyApiService());
  }

  private RickAndMortyRepository rickAndMortyRepository() {
    return CacheDataModule_ProvideLogRepositoryFactory.provideLogRepository(base());
  }

  @Override
  public void injectApp(App app) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder cacheDataModule(CacheDataModule cacheDataModule) {
      Preconditions.checkNotNull(cacheDataModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder cloudModule(CloudModule cloudModule) {
      Preconditions.checkNotNull(cloudModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public App_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends App_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_SingletonC.this.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder());
      }

      @Override
      public Set<String> getViewModelKeys() {
        return Collections.<String>singleton(CommonViewModel_HiltModules_KeyModule_ProvideFactory.provide());
      }

      @Override
      public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new ViewModelCBuilder();
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public App_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCI(fragment);
        }
      }

      private final class FragmentCI extends App_HiltComponents.FragmentC {
        private FragmentCI(Fragment fragment) {

        }

        @Override
        public void injectCharactersFragment(CharactersFragment charactersFragment) {
        }

        @Override
        public void injectInformationFragment(InformationFragment informationFragment) {
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return ActivityCImpl.this.getHiltInternalFactoryFactory();
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public App_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCI(view);
          }
        }

        private final class ViewWithFragmentCI extends App_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCI(View view) {

          }
        }
      }

      private final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public App_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCI(view);
        }
      }

      private final class ViewCI extends App_HiltComponents.ViewC {
        private ViewCI(View view) {

        }
      }
    }

    private final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public App_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
      private volatile Provider<CommonViewModel> commonViewModelProvider;

      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      private CommonViewModel commonViewModel() {
        return new CommonViewModel(DaggerApp_HiltComponents_SingletonC.this.rickAndMortyRepository());
      }

      private Provider<CommonViewModel> commonViewModelProvider() {
        Object local = commonViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          commonViewModelProvider = (Provider<CommonViewModel>) local;
        }
        return (Provider<CommonViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return Collections.<String, Provider<ViewModel>>singletonMap("com.example.daggerhilt.vm.CommonViewModel", (Provider) commonViewModelProvider());
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.daggerhilt.vm.CommonViewModel 
            return (T) ViewModelCImpl.this.commonViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}

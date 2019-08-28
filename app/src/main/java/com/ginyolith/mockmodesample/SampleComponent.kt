package com.ginyolith.mockmodesample

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    SampleModule::class
])
interface SampleComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun setApp(app : Application) : Builder

        fun build() : SampleComponent
    }

    fun inject(activity : MainActivity)
}
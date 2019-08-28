package com.ginyolith.mockmodesample

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [
    MockModule::class
])
class SampleModule {
    @Provides
    @Singleton
    fun provideSampleRepository(@IsMockMode isMockMode: Boolean) : SampleRepository
            = if(isMockMode) {
        SampleRepositoryMockImpl()
    } else {
        SampleRepositoryImpl()
    }
}
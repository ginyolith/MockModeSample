package com.ginyolith.mockmodesample

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SampleModule {

    @Provides
    @Singleton
    fun provideSampleRepository() : SampleRepository
        = SampleRepositoryImpl()
}
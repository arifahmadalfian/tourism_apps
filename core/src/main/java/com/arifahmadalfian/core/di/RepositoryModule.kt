package com.arifahmadalfian.core.di

import com.arifahmadalfian.core.data.TourismRepository
import com.arifahmadalfian.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository
}
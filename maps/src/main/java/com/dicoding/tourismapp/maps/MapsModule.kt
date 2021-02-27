package com.dicoding.tourismapp.maps

import com.dicoding.tourismapp.core.domain.usecase.TourismInteractor
import com.dicoding.tourismapp.core.domain.usecase.TourismUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class MapsModule {
    @Binds
    abstract fun provideMapsViewModel(tourismInteractor: TourismInteractor): TourismUseCase
}
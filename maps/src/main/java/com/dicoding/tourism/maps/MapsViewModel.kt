package com.dicoding.tourism.maps

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.tourismapp.core.domain.usecase.TourismUseCase

class MapsViewModel @ViewModelInject constructor(tourismUseCase: TourismUseCase): ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}
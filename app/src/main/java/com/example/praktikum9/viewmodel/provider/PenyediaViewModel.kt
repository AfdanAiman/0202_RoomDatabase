package com.example.praktikum9.viewmodel.provider

import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.praktikum9.viewmodel.DetailViewModel
import com.example.praktikum9.viewmodel.EditViewModel
import com.example.praktikum9.viewmodel.EntryViewModel
import com.example.praktikum9.viewmodel.HomeViewModel
import com.example.praktikum9.viewmodel.aplikasiSiswa


object PenyediaViewModel{
    val factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        //edit : tambah initializer untuk DetailViewModel

        initializer {
            DetailViewModel(this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EditViewModel(this.createSavedStateHandle(), aplikasiSiswa().container.repositoriSiswa)
        }
    }
}
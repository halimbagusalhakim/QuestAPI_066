package com.example.praktikum10.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.praktikum10.repositori.AplikasiDataSiswa
import com.example.praktikum10.repositori.ContainerApp
import com.example.praktikum10.viewmodel.EntryViewModel
import com.example.praktikum10.viewmodel.HomeViewModel

fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa
        )

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiDataSiswa().container
            .repositoryDataSiswa) }
        initializer { EntryViewModel(aplikasiDataSiswa().container
            .repositoryDataSiswa) }

    }
}

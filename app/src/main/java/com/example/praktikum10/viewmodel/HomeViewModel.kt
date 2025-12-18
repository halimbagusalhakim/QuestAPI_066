package com.example.praktikum10.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.praktikum10.modeldata.DataSiswa
import com.example.praktikum10.repositori.RepositoryDataSiswa
import kotlinx.coroutines.launch
import okio.IOException
import retrofit2.HttpException

sealed interface StatusUiSiswa {
    data class Success(val siswa: List<DataSiswa> = listOf()) : StatusUiSiswa

    object Error : StatusUiSiswa

    object Loading : StatusUiSiswa
}


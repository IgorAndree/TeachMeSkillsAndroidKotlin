package com.example.teachmeskillsandroidkotlin.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPost
import com.example.teachmeskillsandroidkotlin.domain.use_cases.GetPostInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
open class ClubViewModel @Inject constructor(
    private val getPostInfoUseCase: GetPostInfoUseCase
) : ViewModel() {

    private val _postInfo = MutableLiveData<DomainPost>()
    val postInfo: LiveData<DomainPost> = _postInfo

    init {
        viewModelScope.launch {
            getPostInfo()
        }
    }

    private suspend fun getPostInfo() {
        _postInfo.value = getPostInfoUseCase.getPostInfoById()
    }
}
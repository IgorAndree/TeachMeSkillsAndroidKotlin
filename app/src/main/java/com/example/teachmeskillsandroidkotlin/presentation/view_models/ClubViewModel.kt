package com.example.teachmeskillsandroidkotlin.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPost
import com.example.teachmeskillsandroidkotlin.domain.use_cases.GetPostInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
 open class ClubViewModel @Inject constructor(
    private val getPostInfoUseCase : GetPostInfoUseCase
)  : ViewModel() {

    private val _postInfo = MutableLiveData<DomainPost>()
    val postInfo: LiveData<DomainPost> = _postInfo

    init {
        getPostInfo()
    }

    private fun getPostInfo() {
        _postInfo.value = getPostInfoUseCase.getPostInfo()
    }
}
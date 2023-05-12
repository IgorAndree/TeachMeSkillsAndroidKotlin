package com.example.teachmeskillsandroidkotlin.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPostList
import com.example.teachmeskillsandroidkotlin.domain.use_cases.PostsUseCase

open class LeagueViewModel : ViewModel() {

    private val _postList = MutableLiveData<DomainPostList>()
    val postList: LiveData<DomainPostList> = _postList

    init {
        getPosts()
    }

    private fun getPosts() {
        _postList.value = PostsUseCase().getPosts()
    }
}
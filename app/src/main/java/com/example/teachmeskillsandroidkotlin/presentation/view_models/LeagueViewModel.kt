package com.example.teachmeskillsandroidkotlin.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.teachmeskillsandroidkotlin.domain.models.DomainPostList
import com.example.teachmeskillsandroidkotlin.domain.use_cases.PostsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
 open class LeagueViewModel @Inject constructor(
    private val postsUseCase: PostsUseCase
) : ViewModel() {

    private val _postList = MutableLiveData<DomainPostList>()
    val postList: LiveData<DomainPostList> = _postList

    init {
        getPosts()
    }

    private fun getPosts() {
        _postList.value = postsUseCase.getPosts()
    }
}
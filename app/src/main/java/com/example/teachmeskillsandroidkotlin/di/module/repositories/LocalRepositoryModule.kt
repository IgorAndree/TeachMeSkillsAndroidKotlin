package com.example.teachmeskillsandroidkotlin.di.module.repositories

import com.example.teachmeskillsandroidkotlin.data.local.PostsDao
import com.example.teachmeskillsandroidkotlin.data.repository.local.PostsLocal
import com.example.teachmeskillsandroidkotlin.data.repository.local.PostsLocalImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class LocalRepositoryModule {

    @Provides
    fun providePostsLocal(postsDao: PostsDao): PostsLocal =
        PostsLocalImpl(postsDao = postsDao)
}
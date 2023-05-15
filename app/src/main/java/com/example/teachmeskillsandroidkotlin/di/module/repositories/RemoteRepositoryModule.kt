package com.example.teachmeskillsandroidkotlin.di.module.repositories

import com.example.teachmeskillsandroidkotlin.data.repository.remote.PostsRemote
import com.example.teachmeskillsandroidkotlin.data.repository.remote.PostsRemoteImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RemoteRepositoryModule {

    @Provides
    fun providePostsRemote(): PostsRemote = PostsRemoteImpl()
}
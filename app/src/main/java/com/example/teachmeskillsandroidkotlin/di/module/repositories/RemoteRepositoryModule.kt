package com.example.teachmeskillsandroidkotlin.di.module.repositories

import com.example.teachmeskillsandroidkotlin.data.remote.api.PostsApi
import com.example.teachmeskillsandroidkotlin.data.repository.remote.PostsRemote
import com.example.teachmeskillsandroidkotlin.data.repository.remote.PostsRemoteImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteRepositoryModule {
    @Singleton
    @Provides
    fun providePostsRemote(postsApi: PostsApi): PostsRemote = PostsRemoteImpl(postsApi = postsApi)
}
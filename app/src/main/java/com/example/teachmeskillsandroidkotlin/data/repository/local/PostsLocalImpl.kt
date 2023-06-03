package com.example.teachmeskillsandroidkotlin.data.repository.local

import com.example.teachmeskillsandroidkotlin.data.local.PostEntity
import com.example.teachmeskillsandroidkotlin.data.local.PostsDao
import javax.inject.Inject

class PostsLocalImpl @Inject constructor(
    private val postsDao: PostsDao
) : PostsLocal {
    override suspend fun getLocalPosts(): List<PostEntity>? = postsDao.getAll()

    override suspend fun getById(id: Long): PostEntity? =
        postsDao.getById(id)

    override suspend fun insertPost(post: PostEntity) {
        postsDao.insert(postEntity = post)
    }

    override suspend fun deletePost(post: PostEntity) {
        postsDao.delete(postEntity = post)
    }

    override suspend fun updatePost(post: PostEntity) {
        postsDao.update(postEntity = post)
    }
}

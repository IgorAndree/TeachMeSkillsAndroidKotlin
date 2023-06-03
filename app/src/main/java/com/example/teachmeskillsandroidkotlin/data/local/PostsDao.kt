package com.example.teachmeskillsandroidkotlin.data.local

import androidx.room.*

@Dao
interface PostsDao {
//    @get:Query("SELECT * FROM post")
//    val all: List<Post>?  --- Старый подход для примера.

    @Query("SELECT * FROM PostEntity")
    suspend fun getAll(): List<PostEntity>?

    @Query("SELECT * FROM PostEntity public WHERE id = :postId")
    suspend fun getById(postId: Long): PostEntity?

    @Insert
    suspend fun insert(postEntity: PostEntity?)

    @Update
    suspend fun update(postEntity: PostEntity?)

    @Delete
    suspend fun delete(postEntity: PostEntity?)
}
package com.example.teachmeskillsandroidkotlin.data.local

import androidx.room.*

@Dao
interface PostsDao {
//    @get:Query("SELECT * FROM post")
//    val all: List<Post>?  --- Старый подход для примера.

    @Query("SELECT * FROM PostEntity")
    suspend fun getAll(): List<PostEntity>?

    @Query("SELECT * FROM PostEntity public WHERE id = :id")
    suspend fun getById(id: Long): PostEntity?

    @Insert
    suspend fun insert(post: PostEntity?)

    @Update
    suspend fun update(post: PostEntity?)

    @Delete
    suspend fun delete(post: PostEntity?)
}
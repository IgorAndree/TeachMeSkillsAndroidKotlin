package com.example.teachmeskillsandroidkotlin.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PostEntity::class], version = 3)
abstract class PostsDatabase : RoomDatabase() {
    abstract fun postsDao(): PostsDao
}
package com.example.harsh.esynote.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context


/**
 * Created by Harsh on 05/02/18.
 */
@Database(entities = [(Note::class)], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun noteDao(): NoteDao



    companion object {
        private val DATABASE = "EsyNote"
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context, AppDatabase::class.java,DATABASE)
                        .allowMainThreadQueries()
                        .build()
            }
            return INSTANCE!!
        }
    }
}
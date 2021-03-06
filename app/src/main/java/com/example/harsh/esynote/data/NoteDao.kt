package com.example.harsh.esynote.data

import android.arch.persistence.room.*


/**
 * Created by Harsh on 05/02/18.
 */
@Dao interface NoteDao {

    @Query("SELECT * FROM Notes ORDER BY date desc")
    fun getAll(): List<Note>

    @Query("SELECT * FROM Notes WHERE id=:arg0")
    fun getNote(note_id: Int): Note

    @Insert
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)

    @Update
    fun update(note: Note)
}
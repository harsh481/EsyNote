package com.example.harsh.esynote.composenote

/**
 * Created by harsh.
 */

import com.example.harsh.esynote.data.Note

/**
 * This specifies the contract between the view and the presenter.
 */
interface NoteComposeContract {

    interface View {

        fun showNoteList()

        fun setNoteDetails(note: Note)
    }

    interface Presenter {

        fun saveNote(title: String, description: String)

        fun fetchNote()

    }
}

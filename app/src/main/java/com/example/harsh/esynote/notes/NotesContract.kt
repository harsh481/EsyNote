package com.example.harsh.esynote.notes

import com.example.harsh.esynote.data.Note

/**
 * Created by Harsh on 05/02/18.
 */
interface NotesContract {
    
    interface View {

        fun showNotes(Notes: List<Note>)

        fun openComposeNote()

        fun openNote(taskId: Int)

        fun showNoNotes()

        fun onNotesUpdate(message: String)

    }

    interface Presenter {

        fun loadNotes(filter: Filter)

        fun addNewNote()

        fun openNoteDetails(task: Note)

        fun deleteNote(note: Note)

        fun makeNoteFavourite(note: Note, favourite: Boolean)

        fun makeNoteHearted(note: Note,hearted: Boolean)

    }
}
package com.example.harsh.esynote.notedetail

import com.example.harsh.esynote.data.Note

/**
* Created by Harsh on 06/02/18.
*/
class NoteDetailContract {

    interface View {

        fun showNoteList()

        fun setNoteDetails(note: Note)

         fun showEditNote(noteId: Int)
    }

    interface Presenter {

         fun editNote()

         fun fetchNote()

    }
}
package com.example.harsh.esynote.notedetail

import android.content.Context
import com.example.harsh.esynote.data.AppDatabase


/**
 * Created by rahul on 25/8/17.
 */

/**
 * Listens to user actions from the UI ([NoteDetailActivity]), retrieves the data and updates
 * the UI as required.
 */
class NoteDetailPresenter( context: Context,private val mNoteId: Int,
                          private val mNoteDetailView: NoteDetailContract.View) : NoteDetailContract.Presenter {
    private val db = AppDatabase.getInstance(context)

    override fun fetchNote() {
         val note = db.noteDao().getNote(mNoteId)
         mNoteDetailView.setNoteDetails(note)
    }

    override fun editNote() {
        mNoteDetailView.showEditNote(mNoteId)
    }


}

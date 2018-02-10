package com.example.harsh.esynote

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.harsh.esynote.notes.NotesActivity


/**
 * Created by Harsh on 05/02/18.
 */

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            Thread.sleep((2 * 1000).toLong())
            val intent = Intent(this, NotesActivity::class.java)
            startActivity(intent)
            // close this activity
            finish()

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    }


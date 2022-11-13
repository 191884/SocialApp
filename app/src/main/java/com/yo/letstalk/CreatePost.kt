package com.yo.letstalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.yo.letstalk.daos.PostDao

class CreatePost : AppCompatActivity() {

    lateinit var postDao: PostDao


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        postDao = PostDao()

        val postButton: Button = findViewById(R.id.postButton)
        postButton.setOnClickListener{
            val input: EditText = findViewById(R.id.inputText)
            if(input.text.toString().trim().isNotEmpty()){
                postDao.addPost(input.text.toString())
                finish()
            }
        }
    }
}
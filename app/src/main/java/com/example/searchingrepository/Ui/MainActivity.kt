package com.example.searchingrepository.Ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.searchingrepository.DataRepositoryApp
import com.example.searchingrepository.R
import com.example.searchingrepository.Ui.List.ListFragment
import com.example.searchingrepository.models.Users
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var buttonSearch: Button? = null
    private var textLink: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSearch = findViewById<View>(R.id.buttonSearch) as Button
        textLink = findViewById<View>(R.id.textRepositoryLink) as TextView

        supportFragmentManager.beginTransaction()
            .replace(R.id.recyclerViewList, ListFragment())
            .commit()

    }

    override fun onClick(v: View?) {



    }
}

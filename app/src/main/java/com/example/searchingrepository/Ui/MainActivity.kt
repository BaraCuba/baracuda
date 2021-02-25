package com.example.searchingrepository.Ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.searchingrepository.R
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var recyclerView: RecyclerView? = null
    private var buttonSearch: Button? = null
    private var textLink: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSearch = findViewById<View>(R.id.buttonSearch) as Button
        textLink = findViewById<View>(R.id.textRepositoryLink) as TextView


    }

    override fun onClick(v: View?) {

        val repository = SearchRepositoryProvider.provideSearchRepository()
        repository.searchUsers("Omsk", "Java")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe ({
                    result ->
                Log.d("Result", "There are ${result.items.size} Java developers in Lagos")
            }, { error ->
                error.printStackTrace()
            })

    }
}

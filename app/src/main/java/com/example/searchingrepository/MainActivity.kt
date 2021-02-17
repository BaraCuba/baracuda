package com.example.searchingrepository

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.jsoup.Jsoup
import java.io.IOException

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private val parseItems = ArrayList<ParseItem>()
    private val recyclerView: RecyclerView? = null
    private val buttonSearch: Button? = null
    private val textLink: TextView? = null
    private val adapter: ParseAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<View>(R.id.buttonSearch) as Button
        val textLink = findViewById<View>(R.id.textRepositoryLink) as TextView
        val recyclerView = findViewById<View>(R.id.recyclerViewList) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        val adapter: ParseAdapter = ParseAdapter(parseItems,this)
        recyclerView!!.adapter = adapter
    }

    override fun onClick(v: View?) {
        parseItems.clear()
        val context: Context
        textLink!!.text = ""

    }

    private inner class Context {
        override fun doInBackground(vararg params: Void): Void?{
            try {
                val doc = Jsoup.connect(textLink!!.text.toString()).get()


            }catch(e: IOException){
                e.printStackTrace()
            }
            return null
        }
    }
}
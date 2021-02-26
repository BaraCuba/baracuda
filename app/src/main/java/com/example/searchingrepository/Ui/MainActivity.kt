package com.example.searchingrepository.Ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.searchingrepository.DataRepository
import com.example.searchingrepository.R
import com.example.searchingrepository.Users
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
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


    }

    override fun onClick(v: View?) {

        val postService = DataRepository.create()

        postService.getUser(textLink?.text as String).enqueue(object : Callback<Users> {
            fun onFailure(call: Call<Users>?, t: Throwable?) {
                Log.e("LogUrl","gagal ${t}")
            }

            fun onResponse(call: Call<String>?, response: Response<String>?) {
                val responseBody = response?.body()
                Log.e("LogUrl","response body as string = ${responseBody}")

                val user: Users = Gson().fromJson(responseBody, Users::class.java)
            }


        })
    }
}

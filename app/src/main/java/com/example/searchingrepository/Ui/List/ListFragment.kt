package com.example.searchingrepository.Ui.List

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.example.searchingrepository.DataRepositoryApp
import com.example.searchingrepository.R
import okhttp3.Headers.Companion.of
import retrofit2.Invocation.of



class ListFragment: Fragment(R.layout.info_links) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listViewModel = ViewModelStoreOwner.of(this).get(ListViewModel::class.java)

        listViewModel.fetchList((activity?.application as? DataRepositoryApp).retrofitInstanceApi)
    }

}
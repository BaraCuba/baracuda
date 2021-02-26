package com.example.searchingrepository.Ui.List

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.searchingrepository.models.RetrofitInstanceApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class ListViewModel(application: Application): AndroidViewModel(application){

    private val compositeDisposable = CompositeDisposable()

    override fun onCleared(){
        compositeDisposable.dispose()
        super.onCleared()
    }

    fun fetchList (retrofitInstanceApi: RetrofitInstanceApi){
        compositeDisposable.add(retrofitInstanceApi.getListUser()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({

            },{

            }))
    }


}
package com.example.testemobilus

import android.arch.lifecycle.MutableLiveData
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.testemobilus.Adapter.AdapterCovid
import com.example.testemobilus.Model.ResultCovid
import com.example.testemobilus.Repository.RepositoryCovid
import com.example.testemobilus.Repository.ResultResponse
import com.example.testemobilus.Repository.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var results = mutableSetOf <MainActivity>()
    val listMutableCharacter = MutableLiveData<MutableSet<ResultCovid>>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        val remote = RepositoryCovid.createService(Service::class.java)
        val call: Call<List<ResultResponse>> = remote.list()



        //config recycler
        val adapterCharacter = AdapterCovid(results, this)
        recycler.adapter = adapterCharacter
        val layoutManager = GridLayoutManager(this, 2)
        recycler.layoutManager = layoutManager



        //configurando chamada
        val response = call.enqueue(object : Callback<List<ResultResponse>>{
            override fun onFailure(call: Call<List<ResultResponse>>, t: Throwable) {
              val s = t.message
            }

            override fun onResponse(call: Call<List<ResultResponse>>, res: Response<List<ResultResponse>>) {
                val s = res.body()
            }
        })
    }


}
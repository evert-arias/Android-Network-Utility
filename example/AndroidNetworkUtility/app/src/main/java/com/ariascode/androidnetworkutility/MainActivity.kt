package com.ariascode.androidnetworkutility

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ariascode.networkutility.NetworkInfo

class MainActivity : AppCompatActivity(), NetworkInfo.NetworkInfoListener {

    override fun networkStatusChange(network: NetworkInfo.Network) {
        when(network.status){
            NetworkInfo.NetworkStatus.INTERNET -> {
                Toast.makeText(this, "ONLINE: ${network.type}", Toast.LENGTH_SHORT).show()
            }
            NetworkInfo.NetworkStatus.OFFLINE -> {
                Toast.makeText(this, "OFFLINE: ${network.type}", Toast.LENGTH_SHORT).show()
            }
        }
    }

   private lateinit var networkInfo: NetworkInfo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        networkInfo = NetworkInfo.getInstance(this)
        networkInfo.addListener(this)
    }
}

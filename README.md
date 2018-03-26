# Android Network Utility

Android kotlin library that provides useful information about the network

## :man_technologist: Getting started

## NetworkInfo

Provide information about the device's network connectivity and let you set callbacks function to get notified when certain network related events occurs. 

### Usage

This is a simple example of how to use the library to receive a notification upon a connectivity change.

```Kotlin
class MainActivity : AppCompatActivity(), NetworkInfo.NetworkInfoListener {
   
    // instance of NetworkInfo
    private lateinit var networkInfo: NetworkInfo
    
    // called when network's status changes
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
    
    // onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get a singleton instance of the class
        networkInfo = NetworkInfo.getInstance(this)
        // add a listener
        networkInfo.addListener(this)
    }
}

```



## That's all

:grinning: Enjoy it!



## Copyright

[MIT](https://github.com/evert-arias/android-network-utility/blob/master/LICENSE) © [Evert Arias](https://evert-arias.github.io/)

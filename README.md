# Android Network Utility

Android kotlin library that provides useful information about the network

## Getting started

### Installation :man_technologist:

Here goes the installation instructions

### Dependencies

This library depends on some third parties libraries, which are the followings:

### Usage

This is a simple example of how to use the library to receive a notification upon a connectivity change.

```Kotlin
class MainActivity : AppCompatActivity(), NetworkInfo.NetworkInfoListener {
   
    // instance of NetworkInfo
    private lateinit var networkInfo: NetworkInfo
    
    // listener function to be called when network's status changes
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
        // get the class's singleton
        networkInfo = NetworkInfo.getInstance(this)
        // add a listener function
        networkInfo.addListener(this)
    }
}

```

## That's all :relieved:

Enjoy it! :relieved:



## Copyright

[MIT](https://github.com/evert-arias/android-network-utility/blob/master/LICENSE) © [Evert Arias](https://evert-arias.github.io/)
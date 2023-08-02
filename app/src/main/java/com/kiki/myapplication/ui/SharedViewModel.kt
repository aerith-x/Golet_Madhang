package com.kiki.myapplication.ui

import android.content.Context
import android.location.Address
import android.location.Geocoder
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kiki.myapplication.data.MakanDataSource
import com.kiki.myapplication.model.Makan
import com.google.android.gms.maps.model.LatLng
import java.util.Locale

class SharedViewModel : ViewModel() {
    /**
     * This is a LiveData object. It will be used to communicate between fragments and activity.
     */
    private val _location = MutableLiveData<LatLng>()
    val location get() = _location

    private val _makanData = MutableLiveData<List<Makan>>()
    val touristAttractionData get() = _makanData


    /**
     * This is a function to initialize the data.
     */
    init {
        _makanData.value = MakanDataSource.createMakanData()
            }

    /**
     * This is a function to set the location.
     */
    fun setLocation(latitude: Double, longitude: Double) {
        _location.value = LatLng(latitude, longitude)
    }

    /**
     * This is a function to set the location.
     */
    fun filterTouristAttraction(category: String) {
        _makanData.value =
            MakanDataSource.createMakanData().filter { it.category == category }
    }

    /**
     * This is a function to set the Food.
     */


    /**
     * This is a function to get the location name from latitude and longitude.
     */
    fun getStringLocation(context: Context, location: LatLng): String {
        var stringLocation: String
        location.let {
            val currentLatLong = LatLng(it.latitude, it.longitude)
            val geocoder = Geocoder(context, Locale.getDefault())
            val addresses: MutableList<Address>? = geocoder.getFromLocation(
                currentLatLong.latitude,
                currentLatLong.longitude,
                1
            )
            /* get regency and province */
            val regency = addresses?.get(0)?.subAdminArea ?: "Pemalang"
            val province = addresses?.get(0)?.adminArea ?: "Jawa Tengah"

            stringLocation = "${regency.substringAfter("Kabupaten")} $province"
        }

        return stringLocation
    }
}

package com.kiki.myapplication.ui.detail

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.kiki.myapplication.R
import com.kiki.myapplication.databinding.ActivityDetailBinding
import com.kiki.myapplication.model.Makan


class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TOURIST_ATTRACTION = "extra_tourist_attraction"
        const val EXTRA_LATITUDE = "extra_latitude"
        const val EXTRA_LONGITUDE = "extra_longitude"
    }

    private lateinit var binding: ActivityDetailBinding

    private var makan: Makan? = null

    private var latitude: Double? = null
    private var longitude: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        * Ambil data dari intent yang dikirimkan dari HomeFragment/ListFragment
         */
        makan = intent.getParcelableExtra(EXTRA_TOURIST_ATTRACTION)
        latitude = intent.getDoubleExtra(EXTRA_LATITUDE, 0.0)
        longitude = intent.getDoubleExtra(EXTRA_LONGITUDE, 0.0)

        makan?.let { setDataTouristAttraction(it) }
        initListener()

    }

    /* Mengatur action */
    private fun initListener() {
        binding.apply {
            cvBack.setOnClickListener { finish() }
        }
    }


    /* Mengatur data untuk detail tourist attraction */
    private fun setDataTouristAttraction(data: Makan) {
        binding.apply {
            ivDetail.load(data.imageUrl)
            tvDetailName.text = data.name
            tvDetailLocation.text = data.locationName
            tvDetailDesc.text = data.description

            cardRating.apply {
                tvCardDesc.text = data.rating.toString()
                tvCardTitle.text = getString(R.string.nilai)
                ivCardDetail.load(R.drawable.ic_star)
            }


            btnShowLocation.setOnClickListener {
                openGoogleMaps(
                    data.latitude.toString(),
                    data.longitude.toString(),
                    data.name,
                    "15"
                )
            }
        }
    }

    /* Mmebuka google map */
    private fun openGoogleMaps(
        latitude: String,
        longitude: String,
        name: String,
        zoom: String,
    ) {
        val uri =
            Uri.parse("geo:$latitude,$longitude?z=$zoom&q=$latitude,$longitude ($name)")
        val mapsIntent = Intent(Intent.ACTION_VIEW, uri)
        try {
            startActivity(mapsIntent)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(this,
                getString(R.string.google_maps_is_not_available), Toast.LENGTH_SHORT
            ).show()
        }
    }

}

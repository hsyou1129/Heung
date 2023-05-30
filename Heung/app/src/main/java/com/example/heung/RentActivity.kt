package com.example.heung

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.GroundOverlayOptions
import com.google.android.gms.maps.model.LatLng

class RentActivity : AppCompatActivity(), OnMapReadyCallback {
    lateinit var gMap: GoogleMap
    lateinit var mapFrag: MapFragment
    lateinit var videoMark: GroundOverlayOptions

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rent)

        supportActionBar!!.setDisplayShowHomeEnabled(true)
        title = "Google 지도 활용"

        mapFrag = fragmentManager.findFragmentById(R.id.map) as MapFragment
        mapFrag.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap) {
        gMap = map
        gMap.uiSettings.isZoomControlsEnabled = true
        gMap.setOnMapClickListener { point ->
            videoMark = GroundOverlayOptions().image(
                BitmapDescriptorFactory.fromResource(R.drawable.music_icon))
                .position(point, 100f, 100f)
            gMap.addGroundOverlay(videoMark)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        menu.add(0, 1, 0, "위성 지도")
        menu.add(0, 2, 0, "일반 지도")
        menu.add(0, 3, 0, "월드컵경기장 바로가기")
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            1 -> {
                gMap.mapType = GoogleMap.MAP_TYPE_HYBRID
                return true
            }
            2 -> {
                gMap.mapType = GoogleMap.MAP_TYPE_NORMAL
                return true
            }
            3 -> {
                gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                    LatLng(
                    37.568256, 126.897240), 15f))
                return true
            }
        }
        return false
    }
}

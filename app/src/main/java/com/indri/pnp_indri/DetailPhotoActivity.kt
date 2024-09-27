package com.indri.pnp_indri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailPhotoActivity : AppCompatActivity() {
    private lateinit var btnBack2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_photo)

        btnBack2 = findViewById(R.id.btnBack2)

        btnBack2.setOnClickListener() {
            intent = Intent(this@DetailPhotoActivity, RecycleKampusActivity::class.java)
            startActivity(intent)
        }

        // Get the ImageView in the layout
        val imageView: ImageView = findViewById(R.id.fullscreen_image)

        // Get the image resource ID passed from the previous activity
        val imageResId = intent.getIntExtra("imageResId", -1)

        // Set the image in the ImageView
        if (imageResId != -1) {
            imageView.setImageResource(imageResId)
        }
    }
}
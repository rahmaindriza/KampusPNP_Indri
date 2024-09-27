package com.indri.pnp_indri

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.indri.pnp_indri.adapter.PnpAdapter
import com.indri.pnp_indri.model.Mocklist
import com.indri.pnp_indri.model.PnpModel

class RecycleKampusActivity : AppCompatActivity() {
    private lateinit var rv_pnp : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_kampus)

        rv_pnp = findViewById(R.id.rv_pnp)

        rv_pnp.layoutManager = GridLayoutManager(this, 1)
        val adapter = PnpAdapter(Mocklist.getModel() as ArrayList<PnpModel>, this)
        rv_pnp.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
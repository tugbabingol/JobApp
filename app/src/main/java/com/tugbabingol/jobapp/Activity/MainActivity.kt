package com.tugbabingol.jobapp.Activity

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugbabingol.jobapp.Adapter.CategoryAdapter
import com.tugbabingol.jobapp.R
import com.tugbabingol.jobapp.ViewModel.MainViewModel
import com.tugbabingol.jobapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        initLocation()
        initRecyclerViewCat()
        initRecyclerViewSuggest()

    }

    private fun initRecyclerViewSuggest() {
        TODO("Not yet implemented")
    }

    private fun initLocation() {
        val adapter = ArrayAdapter(this, R.layout.spinner_item, mainViewModel.loadLocation())
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.locationSpin.adapter = adapter
    }

    private fun initRecyclerViewCat() {
        binding.progressBarCategory.visibility = View.VISIBLE
        binding.viewCategory.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.viewCategory.adapter =
            CategoryAdapter(mainViewModel.loadCategory(), object : CategoryAdapter.ClickListener {
                override fun onClick(category: String) {

                }

            })
        binding.progressBarCategory.visibility = View.GONE
    }
}
package com.vicente.practica1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.google.android.material.bottomappbar.BottomAppBar
import com.vicente.practica1.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val openUrl = Intent(Intent.ACTION_VIEW)

        Glide.with(this)
            .load("https://cdn.pixabay.com/photo/2016/03/04/08/37/dance-1235587_960_720.jpg")
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.imgPortada)

        Glide.with(this)
            .load("https://i.pinimg.com/564x/7f/2f/4d/7f2f4dd69f0205057a7684a7293d7498.jpg")
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.imgContent1)

        Glide.with(this)
            .load("https://i.pinimg.com/564x/b4/ea/42/b4ea42e26760e85603cb9b2af814724a.jpg")
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.imgContent2)

        Glide.with(this)
            .load("https://i.pinimg.com/564x/aa/92/e4/aa92e4cd93ad47a0e76b6fa141ab2e2d.jpg")
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.imgContent3)

        Glide.with(this)
            .load("https://i.pinimg.com/564x/84/47/cd/8447cd612366e46ec3157e34d2095a53.jpg")
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.imgContent4)

        binding.content.btnWiki1.setOnClickListener{
            val url1: String = "https://es.wikipedia.org/wiki/Lana_Del_Rey"
            openUrl.data = Uri.parse(url1)
            startActivity(openUrl)
        }

        binding.content.btnWiki2.setOnClickListener{
            val url1: String = "https://es.wikipedia.org/wiki/Taylor_Swift"
            openUrl.data = Uri.parse(url1)
            startActivity(openUrl)
        }

        binding.content.btnWiki3.setOnClickListener{
            val url1: String = "https://es.wikipedia.org/wiki/Madison_Beer"
            openUrl.data = Uri.parse(url1)
            startActivity(openUrl)
        }

        binding.content.btnWiki4.setOnClickListener{
            val url1: String = "https://es.wikipedia.org/wiki/Maggie_Lindemann"
            openUrl.data = Uri.parse(url1)
            startActivity(openUrl)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
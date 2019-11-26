package com.example.testapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import com.example.testapp.R
import kotlinx.android.synthetic.main.activity_home.*
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController


class HomeActivity : AppCompatActivity() {

    private lateinit var appBarConfig: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(toolbar)

        val navController: NavController = findNavController(R.id.nav_host_fragment)

        appBarConfig = AppBarConfiguration(
            setOf(
                R.id.nav_home,
                R.id.nav_contact_us,
                R.id.nav_rate,
                R.id.nav_share
            )
            , drawer_layout
        )

        setupActionBarWithNavController(navController, appBarConfig)
        nav_view.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.nav_host_fragment).navigateUp(appBarConfig)
                || super.onSupportNavigateUp()
    }
}

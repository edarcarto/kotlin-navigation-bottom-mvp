package com.edarcarto.mymenu.ui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.edarcarto.mymenu.R
import com.edarcarto.mymenu.interfaces.MainInterface
import com.edarcarto.mymenu.presenter.MainPresenter
import com.edarcarto.mymenu.ui.fragments.HomeFragment
import com.edarcarto.mymenu.view.IMainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IMainView {
    val manager = supportFragmentManager
    private var mMainPresenter : MainInterface.Presenter? = null
    override fun goToFragment(selectedFragment: Fragment) {
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fragment_container,selectedFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMainPresenter = MainPresenter(this)
        navigation.setOnNavigationItemSelectedListener(mMainPresenter!!.navListener())
        if (savedInstanceState == null){
            manager.beginTransaction().replace(R.id.fragment_container, HomeFragment()).commit()
        }
    }
}

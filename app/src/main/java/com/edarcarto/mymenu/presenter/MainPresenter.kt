package com.edarcarto.mymenu.presenter

import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import com.edarcarto.mymenu.R
import com.edarcarto.mymenu.interfaces.MainInterface
import com.edarcarto.mymenu.ui.fragments.DashboardFragment
import com.edarcarto.mymenu.ui.fragments.HomeFragment
import com.edarcarto.mymenu.ui.fragments.NotificationFragment
import com.edarcarto.mymenu.view.IMainView

class MainPresenter(private val mIMainView : IMainView) : MainInterface.Presenter {
    override fun navListener(): BottomNavigationView.OnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
        menuItem ->
        val selectedFragment: Fragment
        when(menuItem.itemId){
            R.id.navigation_home -> {
                selectedFragment = HomeFragment()
                mIMainView.goToFragment(selectedFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                selectedFragment = DashboardFragment()
                mIMainView.goToFragment(selectedFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                selectedFragment = NotificationFragment()
                mIMainView.goToFragment(selectedFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
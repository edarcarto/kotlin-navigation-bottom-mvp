package com.edarcarto.mymenu.interfaces

import android.support.design.widget.BottomNavigationView

interface MainInterface {
    interface View {
        fun showMessage()
    }
    interface Presenter{
        fun navListener() : BottomNavigationView.OnNavigationItemSelectedListener
    }
    interface Model{
        fun getName(): String
    }
}
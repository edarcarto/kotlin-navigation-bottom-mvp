package com.edarcarto.mymenu.model

import com.edarcarto.mymenu.interfaces.MainInterface

class View(private val name: String) : MainInterface.Model {
    override fun getName(): String {
        return this.name
    }
}
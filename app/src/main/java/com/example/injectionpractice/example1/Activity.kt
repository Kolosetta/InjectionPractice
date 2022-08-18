package com.example.injectionpractice.example1

import dagger.internal.DaggerGenerated
import javax.inject.Inject

class Activity {

    //@Inject
    //lateinit var keyboard: Keyboard

    val keyboard = DaggerNewComponent.create().getKeyboard()

    init{
        //DaggerNewComponent.create().inject(this)
    }
}
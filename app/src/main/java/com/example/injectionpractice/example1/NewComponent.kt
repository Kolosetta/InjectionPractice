package com.example.injectionpractice.example1

import dagger.Component

@Component
interface NewComponent {
    //fun inject(activity: Activity)

    fun getKeyboard(): Keyboard
}
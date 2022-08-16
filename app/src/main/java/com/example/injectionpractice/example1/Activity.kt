package com.example.injectionpractice.example1

import com.example.dependencyinjectionstart.example1.Component
import com.example.dependencyinjectionstart.example1.Computer

class Activity {

    lateinit var computer: Computer

    init{
        Component().inject(this)
    }
}
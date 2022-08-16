package com.example.dependencyinjectionstart.example1

import com.example.injectionpractice.example1.Mouse

class Computer(
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse
)

package com.example.injectionpractice.example1

import com.example.dependencyinjectionstart.example1.*

class Component {

    //Класс для инъекции в поля класса

    //Первый способЖ самостоятельно запрашивать зависимость из класса
    fun getComputer(): Computer {
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )
        return Computer(monitor, computerTower, keyboard, mouse)
    }

    //Второй способ: доставка зависимостей снаружи
    fun inject(activity: Activity){
        //activity.keyboard = Keyboard()
    }
}
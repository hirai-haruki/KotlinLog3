package jp.techacademy.haruki.kotlinlog

import android.util.Log

open class Dog:Animal,Movable {

    constructor(name:String,age:Int):super(name,age){
    }

    override fun say(){
        Log.d("kotlintest",this.name+"("+this.age+"歳)"+"「ワンワン」")
    }

    override fun move() {
        Log.d("kotlintest",this.name+"("+this.age+"歳)"+"は全力で走った。")
    }
}
package jp.techacademy.haruki.kotlinlog
import  android.util.Log

open class Human:Animal,Thinkable {
    constructor(name:String,age:Int):super(name,age){
    }

    override fun say(){
        Log.d("kotlintest",this.name+"("+this.age+"歳)"+"「こんにちは」")
    }

    override fun hobby() {
        Log.d("kotlintest",this.name+"("+this.age+"歳)"+"～ついて考える。")
    }
}
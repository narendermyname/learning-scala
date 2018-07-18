package com.naren.scala

class Closures {

  def getHello = ()=> "Hello" ///Kinda similar to java lambda's

  def greet(m: () => String): Unit ={
    println(m())
  }

  def greet(m:String): Unit ={
    println(m)
  }
}

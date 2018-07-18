package com.naren.scala
import java.util.Date

class Functions {

  // no return statement required
  def time(): Long = { // def trim() = { are same
    println()
    System.nanoTime()
  }

  def delayed(t: => Long) = { //Scala - Functions Call-by-Name
    println("In delayed method")
    println("Param: " + t)
  }

  def printInt(a: Int, b: Int) = { //Scala - Functions with Named Arguments
    println("Value of a : " + a);
    println("Value of b : " + b);
  }

  def printStrings(args: String*) = { //call with printStrings("Hello", "Scala", "Python");
    var i: Int = 0;
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }
  def strcat(s1: String)(s2: String) = s1 + s2 // or def strcat(s1: String)(s2: String) = s1 + s2

  def factorial(n:Int) : Int = {
    if(n == 1){
      1
    } else {
      n*factorial(n-1)
    }
  }

  //HIGH order function

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]" //call with  println( apply( layout, 10) )

  //default value function

  def addInt( a:Int = 5, b:Int = 7 ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  } //call with println( "Returned Value : " + addInt() );

  //nested function
  def factorial1(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  //anonymous function
  var inc = (x:Int) => x+1 //call var x = inc(7)-1

  //Scala - Partially Applied Functions
  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }
  /*
      Call val date = new Date
      val logWithDateBound = log(date, _ : String)
      logWithDateBound("message1" )
   */

}

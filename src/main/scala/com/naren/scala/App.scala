package com.naren.scala

import com.naren.java.Test
import com.naren.scala.singlton.APIFactory

import scala.Array._

/**
  * Object is always singalton
  *
  * @author ${user.name}
  */
object App {

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {

    variable()
    inheritance()
    functions();
    clsours()
    val test = new Test();
    test.start()
  }

  def clsours(): Unit = {
    val cl = APIFactory.getClosures()
    cl.greet(cl.getHello())
    cl.greet(() => "Test") // pass function like java script callback function
  }

  def functions(): Unit = {
    val function = APIFactory.getFunction()
    function.delayed(function.time())
    val concatedStr = function.strcat("Hello ")("Scala!")
    println(concatedStr)
  }

  def inheritance(): Unit = {
    val loc = APIFactory.getLocation(10, 20, 15);
    loc.move(10, 10, 5)
  }

  def variable(): Unit = {
    //variable
    var a =
      """Multi
              line
              string variable
    """
    //constant
    val b = "single line constant"
    var myVar: Int = 10;
    val myVal: String = "Hello Scala with datatype declaration.";
    var myVar1 = 20;
    val myVal1 = "Hello Scala new without datatype declaration.";
    println(a + " " + b)
  }

  def arrays(): Unit = {
    var z: Array[String] = new Array[String](3) //or var z = new Array[String](3)

    var z1 = Array("Zara", "Nuha", "Ayan")

    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // Print all the array elements
    for (x <- myList) {
      println(x)
    }

    // Summing all elements
    var total = 0.0;

    for (i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("Total is " + total);

    // Finding the largest element
    var max = myList(0);

    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i);
    }

    //two-dimensional array
    var myMatrix = ofDim[Int](3,3)

    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 =  concat( myList1, myList2)

    //Create aray with range of
    var myList11 = range(10, 20, 2)
    var myList22 = range(10,20)

    // Print all the array elements
    for ( x <- myList11 ) {
      print( " " + x )
    }

    println()
    for ( x <- myList22 ) {
      print( " " + x )
    }

  }

}

package com.naren.scala.collections

class Collection {

  def list(): Unit ={
    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")

    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)

    // Empty List.
    val empty: List[Nothing] = List()
    // or
    val empty1 = Nil

    // Two dimensional list
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )

    //two fundamental building blocks, a tail Nil and ::, which is pronounced cons. Nil also represents the empty list

    // Two dimensional list
    val dim2 = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil


    // Basic Operations on Lists

    val fruit11 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums4 = Nil

    println( "Head of fruit : " + fruit11.head )
    println( "Tail of fruit : " + fruit11.tail )
    println( "Check if fruit is empty : " + fruit11.isEmpty )
    println( "Check if nums is empty : " + nums4.isEmpty )
    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("banana" :: Nil)

    //Concatenating Lists

    // use two or more lists with ::: operator
    var fruit12 = fruit1 ::: fruit2
    println( "fruit1 ::: fruit2 : " + fruit12 )

    // use two lists with Set.:::() method
    fruit12 = fruit1.:::(fruit2)
    println( "fruit1.:::(fruit2) : " + fruit12 )

    // pass two or more lists as arguments
    fruit12 = List.concat(fruit1, fruit2)
    println( "List.concat(fruit1, fruit2) : " + fruit12  )

//Creating Uniform Lists
    val fruit3 = List.fill(3)("apples") // Repeats apples three times.
    println( "fruit : " + fruit3  )

    val num = List.fill(10)(2)         // Repeats 2, 10 times.
    println( "num : " + num  )

    //Tabulating a Function

    // Creates 5 elements using the given function.
    val squares = List.tabulate(6)(n => n * n)
    println( "squares : " + squares  )

    val mul = List.tabulate( 4,5 )( _ * _ )
    println( "mul : " + mul  )

    /*
    squares : List(0, 1, 4, 9, 16, 25)
mul : List(List(0, 0, 0, 0, 0), List(0, 1, 2, 3, 4),
   List(0, 2, 4, 6, 8), List(0, 3, 6, 9, 12))
     */


  }

  def set(): Unit = {
    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mangoes", "banana")

    // use two or more sets with ++ as operator
    var fruit = fruit1 ++ fruit2
    println( "fruit1 ::: fruit2 : " + fruit )

    // use two sets with ++ as method
    fruit = fruit1.++(fruit2)
    println( "fruit1.++(fruit2) : " + fruit )

    val num = Set(5,6,9,20,30,45)

    // find min and max of the elements
    println( "Min element in Set(5,6,9,20,30,45) : " + num.min )
    println( "Max element in Set(5,6,9,20,30,45) : " + num.max )

    //Find Common Values Insets

    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)

    // find common elements between two sets
    println( "num1.&(num2) : " + num1.&(num2) )
    println( "num1.intersect(num2) : " + num1.intersect(num2) )
  }

  def map(): Unit = {
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

    val nums: Map[Int, Int] = Map()

    println( "Keys in colors : " + colors.keys )
    println( "Values in colors : " + colors.values )
    println( "Check if colors is empty : " + colors.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )

    //Concatenating Maps

    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")

    // use two or more Maps with ++ as operator
    var colors12 = colors1 ++ colors2
    println( "colors1 ++ colors2 : " + colors12 )

    // use two maps with ++ as method
    colors12 = colors1.++(colors2)
    println( "colors1.++(colors2)) : " + colors12 )

    //inerate map

    colors.keys.foreach{ i =>
      print( "Key = " + i )
      println(" Value = " + colors(i) )}
  }

  def tuple(): Unit = {

  }

}

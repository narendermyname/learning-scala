package com.naren.scala.singlton

import com.naren.scala.{Closures, Functions}
import com.naren.scala.iheritance.Location

object APIFactory {

  def getLocation( x:Int, y:Int,z:Int): Location =
  {
    return new Location(x,y,z)
  }


  def getFunction() : Functions = {
    return new Functions()
  }

  def getClosures() : Closures = {
    new Closures()
  }
}
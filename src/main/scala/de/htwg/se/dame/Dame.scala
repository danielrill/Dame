package de.htwg.se.dame

import de.htwg.se.dame.aview.Tui
import de.htwg.se.dame.controller.Controller
import de.htwg.se.dame.model.Matrix

import scala.io.StdIn.readLine

/*
object Dame {
  val controller = new Controller(new Matrix)
  val tui = new Tui(controller)
  controller.notifyObservers

  def main(args: Array[String]): Unit = {
    var input: String = ""
    tui.processInputLine("help")

    while (input != "quit") {
      input = readLine()
      tui.processInputLine(input)
    }
  }
}
*/

@main def hello: Unit =

  val m = Matrix().initFill()
  //m.data.foreach(println)
  println(m.rightMovePossible(0,0))
  println(m.rightMovePossible(5,5))
  println(m.rightMovePossible(3,2))
  println(m.rightMovePossible(3,0))
  println(m.rightMovePossible(0,3))
    

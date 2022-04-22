package de.htwg.se.dame

import scala.compiletime.ops.boolean

case class Matrix[T](
    data: List[List[T]] = Nil,
    cells: Int = 6,
    player1: String = "O",
    player2: String = "X"
) {


  def initFill(): Matrix[Int] = {
    val p1 = List.tabulate((cells * (cells - 2) / 2))(_ => 1)
    val p2 = List.tabulate((cells * (cells - 2) / 2))(_ => 2)
    val mid = List.tabulate(cells * 2)(_ => 0)
    val concat = p1 :: mid :: p2 :: List()
    Matrix(concat)
  }

  def numToPlayer(num: T) : String = {
    if (num == 1) player1 else if (num == 2) player2 else " "
  }


  def tup(): List[List[(String,String)]] = {
    val flat = data.flatMap(x => x).map(x => numToPlayer(x))
    val r = List.range(0,flat.length-1,2)
    val res = for{
      c <- r
    } yield(flat(c),flat(c+1))
    (res grouped cells/2).toList
  }

  def replaceCell(row: Int, col : Int, symbol: T): Matrix[T] = {
    copy(data.updated(row,data(row).updated(col,symbol)))
  }

}
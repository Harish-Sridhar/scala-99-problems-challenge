package com.hs.challenges.ninetynine.problems

import scala.annotation.tailrec

class WorkingWithLists {

  def last(list: List[Int]):Either[String,Int]=
    //list.last
  {
    list match {
      case s::Nil => Right(s)
      case Nil => Left("The list is Empty!")
      case s::x => last(x)
    }
  }

  def penultimate(list: List[Int]): Either[String,Int] = list match {
    case s::x if x.size==1 => Right(s)
    case s::Nil => Right(s)
    case Nil => Left("The list is Empty!")
    case _::x => penultimate(x)
  }


  def nth(n: Int, list: List[Int]): Either[String,Int] = (n,list) match {
    case (0, s::_ ) => Right(s)
    case (n, x) if(n>x.size) => Left("List is Small")
    case (_, Nil) => Left("List is Empty")
    case (n, _::x ) => nth(n-1,x)
  }

  def length(list: Input): IntResult = {
    @tailrec
    def lengthrec(length: Int, list: Input): IntResult =
      list match{
        case Nil => Left("List is Empty")
        case s::Nil => Right(length)
        case _::x => lengthrec(length+1,x)
      }
    lengthrec(1,list)
  }

  def reverse(list: Input): ListResult = {

    def reverserec(inlist: Input, outlist: Input): ListResult = {
      inlist match {
      case Nil => Left("List is Empty")
      case s::Nil => Right(List(s):::outlist)
      case s::x => reverserec(x,List(s):::outlist)
      }
    }
    reverserec(list,List())
  }

}

object WorkingWithLists {

  def apply() = new WorkingWithLists()

}

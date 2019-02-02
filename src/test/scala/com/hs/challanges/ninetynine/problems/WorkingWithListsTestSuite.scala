package com.hs.challanges.ninetynine.problems

import com.hs.challenges.ninetynine.problems.WorkingWithLists
import org.scalatest.FunSuite

class WorkingWithListsTestSuite extends FunSuite {
  val workingWithLists = WorkingWithLists()
  val testList = List(1,3,5,8,11)
  val oneElementList = List(1)
  val emptyList = List()

  test("P01-Last-Element-from-List") {
    assert(workingWithLists.last(testList).getOrElse("List is Empty!")==testList.last)
    assert(workingWithLists.last(oneElementList).getOrElse("List is Empty!")==oneElementList.last)
    assert(workingWithLists.last(emptyList).getOrElse("List is Empty!")=="List is Empty!")
  }

  test("P02-Penultimate-Element-from-List"){
    assert(workingWithLists.penultimate(testList).getOrElse("List is Empty!")==testList.dropRight(1).last)
    assert(workingWithLists.penultimate(oneElementList).getOrElse("List is Empty!")==oneElementList.last)
    assert(workingWithLists.penultimate(emptyList).getOrElse("List is Empty!")=="List is Empty!")
  }

  test("P03-Nth-Element-from-List") {
    assert(workingWithLists.nth(2,testList).getOrElse("List is Empty!")==testList(2))
    assert(workingWithLists.nth(5,emptyList).getOrElse("List is Empty!")=="List is Empty!")
    assert(workingWithLists.nth(5,oneElementList).getOrElse("List is Small!")=="List is Small!")
    assert(workingWithLists.nth(0,testList).getOrElse("List is Empty!")==testList(0))
    assert(workingWithLists.nth(0,oneElementList).getOrElse("List is Empty!")==oneElementList(0))
  }

  test("P04-Length-of-List"){
    assert(workingWithLists.length(testList).getOrElse("List is Empty!")==testList.size)
    assert(workingWithLists.length(emptyList).getOrElse("List is Empty!")=="List is Empty!")
    assert(workingWithLists.length(oneElementList).getOrElse("List is Empty!")==oneElementList.size)
  }

  test("P05-Reverse-of-List"){
    assert(workingWithLists.reverse(testList).getOrElse("List is Empty!")==testList.reverse)
    assert(workingWithLists.reverse(emptyList).getOrElse("List is Empty!")=="List is Empty!")
    assert(workingWithLists.reverse(oneElementList).getOrElse("List is Empty!")==oneElementList.reverse)
  }







}

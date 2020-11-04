package com.blz.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class TestLinkedList {

	@Test
	public void givenThreeNumbersAdded_ShouldReturnTrue() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedAtTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(myFirstNode);
		lst.add(mySecondNode);
		lst.add(myThirdNode);
		boolean result = LinkedList.head.equals(myThirdNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAppendedToLinkedListShouldBeAddedAtTheLast() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenInsertedToLinkedListShouldBeAddedInBetweenElements() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(myFirstNode);
		lst.append(myThirdNode);
		lst.insert(myFirstNode, mySecondNode);
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAddedtoLinkedListAndDeleteFirstElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(myFirstNode);
		lst.pop();
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		boolean result = LinkedList.head.equals(mySecondNode) && LinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAdded_toLinkedList_AndDeleteLastElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.popLast();
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3Numbers_WhenAddedtoLinkedList_AndSearchElement() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		lst.search(30);
		boolean result = LinkedList.head.equals(mySecondNode);
		Assert.assertTrue(result);
	}
}

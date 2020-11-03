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
		LinkedList lst = new LinkedList();
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
		LinkedList lst = new LinkedList();
		lst.add(myFirstNode);
		lst.append(mySecondNode);
		lst.append(myThirdNode);
		boolean result = LinkedList.head.equals(myFirstNode) && LinkedList.head.getNext().equals(mySecondNode)
				&& LinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}

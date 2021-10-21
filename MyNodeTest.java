package LinkListPractice;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
	@Test
	public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkList myLinkList =new MyLinkList();
		myLinkList.add(myThirdNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myFirstNode);
		myLinkList.pop();
		myLinkList.printMyNode();
		boolean result = myLinkList.head.equals(myFirstNode) && 
						 myLinkList.head.getNext().equals(mySecondNode) && 
						 myLinkList.tail.equals(myThirdNode);
		Assert.assertTrue(result);

	}
}
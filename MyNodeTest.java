package LinkListPractice;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
	@Test
	public void given3NumberWhenLinkedShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkList myLinkList =new MyLinkList();
		myLinkList.add(myFirstNode);
		myLinkList.add(mySecondNode);
		myLinkList.add(myThirdNode);
		myLinkList.printMyNode();
		boolean result = myLinkList.head.equals(myThirdNode) && 
						 myLinkList.head.getNext().equals(mySecondNode) && 
						 myLinkList.tail.equals(myFirstNode);
		Assert.assertTrue(result);

	}
}
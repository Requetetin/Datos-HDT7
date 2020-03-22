import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;


class jUnitTesting {
	BinaryTree<String> tree = new BinaryTree<String>();
	ArrayList<String> test = new ArrayList<String>();
	
	
	@Test
	void testInsert() {
		tree.addValue("House");
		tree.addValue("Dog");
		tree.addValue("Homework");
		tree.addValue("Woman");
		tree.addValue("Town");
		tree.addValue("Yes");
		
		test.add("Dog");
		test.add("Homework");
		test.add("House");
		test.add("Town");
		test.add("Woman");
		test.add("Yes");
		
		assertEquals(test,tree.inOrder(tree.getRoot()));
	}
	
	
	@Test
		void testGet() {
			tree.addValue("House");
			tree.addValue("Dog");
			tree.addValue("Homework");
			tree.addValue("Woman");
			tree.addValue("Town");
			tree.addValue("Yes");
			
			assertEquals(true, tree.containsNode("House"));
		}

}

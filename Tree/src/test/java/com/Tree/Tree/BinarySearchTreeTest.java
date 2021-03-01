package com.Tree.Tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BinarySearchTreeTest 
{
	BinarySearchTree bst;
	@Before
	public void init() {
		bst = new BinarySearchTree();
		bst.addData(56);
		bst.addData(30);
		bst.addData(70);
	}
	
    /**
     * Checks that size equals the number of elements added to BST
     */
    @Test
    public void sizeAfterAddition_Correct()
    {
        assertEquals( 3 , bst.size(bst.getRoot()) );
    }
    
    /**
     * Checks whether after addition the size does not remain same
     */
    @Test
    public void sizeAfterAddition_InCorrect()
    {
    	bst.addData(40);
        assertNotEquals( 3 , bst.size(bst.getRoot()) );
    }
}

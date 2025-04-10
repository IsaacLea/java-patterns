package patterns.creational.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PrototypeTests {

	@Test
	void test() {
		
		double mass = 5.0;
		double height = 2.0;
		String position = "Living Room";
		String otherPosition = "Bedroom";
		
		PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(otherPosition);

        assertEquals(position, plasticTree.getPosition());
        assertEquals(otherPosition, anotherPlasticTree.getPosition());
	}
	
	@Test
	public void givenA_ListOfTreesWhenClonedThenCreateListOfClones() {

		PlasticTree plasticTree = new PlasticTree(5.0, 2.0);
		PineTree pineTree = new PineTree(7.0, 4.0);
        
	    List<Tree> trees = Arrays.asList(plasticTree, pineTree);
	    
	    // Clone all the trees
	    List<Tree> treeClones = trees.stream().map(Tree::copy).collect(toList());


	}

}

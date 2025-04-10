package patterns.structural.decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecoratorTests {

	@Test
	void testDecorator() {
		ChristmasTree tree = new ChristmasTreeImpl();
		System.out.println(tree.decorate());
		
		tree = new BubbleLights(tree);
		System.out.println(tree.decorate());
		
		// Add garland twice and then some bubble lights
		ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
		
		System.out.println(tree2.decorate());
		assertEquals(tree2.decorate(), "Christmas tree with Garland with Garland with Bubble Lights");
		
//		tree = new TinselDecorator(tree);
//		System.out.println(tree.decorate());
//		
//		tree = new StarDecorator(tree);
//		System.out.println(tree.decorate());
//		
//		assertEquals("Star, Tinsel, Bauble, Christmas tree", tree.decorate());
//		
//		tree = new BaubleDecorator(new TinselDecorator(new StarDecorator(new ChristmasTreeImpl())));
//		assertEquals("Star, Tinsel, Bauble, Christmas tree", tree.decorate());
	}

}

package patterns.structural.adapter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AdapterTests {

	@Test
	void test() {

        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        
        // Round peg with 5 radius fits round hole with 5 radius
        assertTrue(hole.fits(rpeg));
        
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        
        // Since square pegs are not compatible with round holes, we need to use an adapter
        // hole.fits(smallSqPeg); // Won't compile.

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        
        // Small square peg with radius 2 width fits round hole with 5 radius
        assertTrue(hole.fits(smallSqPegAdapter));
        
        // Large square peg with radius 20 does not fit round hole with 5 radius
        assertFalse(hole.fits(largeSqPegAdapter));
        
	}

}

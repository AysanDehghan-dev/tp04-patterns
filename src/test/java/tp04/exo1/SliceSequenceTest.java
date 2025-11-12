package tp04.exo1;
import static org.junit.Assert.*;
import org.junit.Test;

public class SliceSequenceTest {
	    
	    @Test
	    public void testSliceBasic() {
	        String[] lignes = {"L0", "L1", "L2", "L3", "L4", "L5"};
	        Sequence s = new SliceSequence(new ArraySequence(lignes), 2, 5);
	        
	        assertEquals("L1", s.ligneSuivante());
	        assertEquals("L2", s.ligneSuivante());
	        assertEquals("L3", s.ligneSuivante());
	        assertNull(s.ligneSuivante());
	    }
	    
	    @Test
	    public void testSliceFromStart() {
	        String[] lignes = {"L0", "L1", "L2", "L3", "L4"};
	        Sequence s = new SliceSequence(new ArraySequence(lignes), 1, 4);
	        
	        assertEquals("L0", s.ligneSuivante());
	        assertEquals("L1", s.ligneSuivante());
	        assertEquals("L2", s.ligneSuivante());
	        assertNull(s.ligneSuivante());
	    }
	    
	    @Test
	    public void testSliceSingleLine() {
	        String[] lignes = {"L0", "L1", "L2", "L3", "L4"};
	        Sequence s = new SliceSequence(new ArraySequence(lignes), 3, 4);
	        
	        assertEquals("L2", s.ligneSuivante());
	        assertNull(s.ligneSuivante());
	    }
	    
	    @Test
	    public void testSliceEmpty() {
	        String[] lignes = {"L0", "L1", "L2", "L3", "L4"};
	        Sequence s = new SliceSequence(new ArraySequence(lignes), 2, 2);
	        
	        assertNull(s.ligneSuivante());
	    }
	    
	    @Test
	    public void testSliceOutOfBounds() {
	        String[] lignes = {"L0", "L1", "L2"};
	        Sequence s = new SliceSequence(new ArraySequence(lignes), 10, 20);
	        
	        assertNull(s.ligneSuivante());
	    }
	    
	    @Test
	    public void testSliceEndOutOfBounds() {
	        String[] lignes = {"L0", "L1", "L2", "L3", "L4"};
	        Sequence s = new SliceSequence(new ArraySequence(lignes), 3, 100);
	        
	        assertEquals("L2", s.ligneSuivante());
	        assertEquals("L3", s.ligneSuivante());
	        assertEquals("L4", s.ligneSuivante());
	        assertNull(s.ligneSuivante());
	    }
	    
	    @Test
	    public void testSliceWithNumbers() {
	        String[] lignes = {"ligne 0", "ligne 1", "ligne 2", "ligne 3", "ligne 4"};
	        Sequence s = new SliceSequence(new ArraySequence(lignes), 1, 3);
	        
	        assertEquals("ligne 0", s.ligneSuivante());
	        assertEquals("ligne 1", s.ligneSuivante());
	        assertNull(s.ligneSuivante());
	    }
}
package tp04.exo1;

import static org.junit.Assert.*;

import org.junit.Test;



	public class LineNumberSequenceTest {
	    
	    @Test
	    public void testLineNumbering() {
	        String[] lignes = {"première", "deuxième", "troisième"};
	        LineNumberSequence s = new LineNumberSequence(new ArraySequence(lignes));
	        
	        assertEquals(0, s.getLineNumber());
	        
	        assertEquals("première", s.ligneSuivante());
	        assertEquals(1, s.getLineNumber());
	        
	        assertEquals("deuxième", s.ligneSuivante());
	        assertEquals(2, s.getLineNumber());
	        
	        assertEquals("troisième", s.ligneSuivante());
	        assertEquals(3, s.getLineNumber());
	        
	        assertNull(s.ligneSuivante());
	        assertEquals(3, s.getLineNumber());
	    }
	    
	    @Test
	    public void testLineNumberingEmptySequence() {
	        String[] lignes = {};
	        LineNumberSequence s = new LineNumberSequence(new ArraySequence(lignes));
	        
	        assertEquals(0, s.getLineNumber());
	        assertNull(s.ligneSuivante());
	        assertEquals(0, s.getLineNumber());
	    }
	    
	    @Test
	    public void testLineNumberWithOutput() {
	        String[] lignes = {"Alice", "Bob", "Charlie"};
	        LineNumberSequence s = new LineNumberSequence(new ArraySequence(lignes));
	        
	        String ligne;
	        while ((ligne = s.ligneSuivante()) != null) {
	            System.out.println(s.getLineNumber() + ": " + ligne);
	        }
	        
	        assertEquals(3, s.getLineNumber());
	    }
	    
	    @Test
	    public void testLineNumberSingleLine() {
	        String[] lignes = {"seule"};
	        LineNumberSequence s = new LineNumberSequence(new ArraySequence(lignes));
	        
	        assertEquals("seule", s.ligneSuivante());
	        assertEquals(1, s.getLineNumber());
	        
	        assertNull(s.ligneSuivante());
	        assertEquals(1, s.getLineNumber());
	    }

}

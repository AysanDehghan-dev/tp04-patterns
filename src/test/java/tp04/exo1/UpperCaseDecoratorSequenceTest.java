package tp04.exo1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UpperCaseDecoratorSequenceTest {
    
    @Test
    public void testUpperCaseConversion() {
        String[] lignes = {"hello", "world", "java"};
        Sequence s = new UpperCaseDecoratorSequence(new ArraySequence(lignes));
        
        assertEquals("HELLO", s.ligneSuivante());
        assertEquals("WORLD", s.ligneSuivante());
        assertEquals("JAVA", s.ligneSuivante());
        assertNull(s.ligneSuivante());
    }
    
    @Test
    public void testEmptySequence() {
        String[] lignes = {};
        Sequence s = new UpperCaseDecoratorSequence(new ArraySequence(lignes));
        assertNull(s.ligneSuivante());
    }
    
    @Test
    public void testMixedCase() {
        String[] lignes = {"HeLLo", "WoRLd"};
        Sequence s = new UpperCaseDecoratorSequence(new ArraySequence(lignes));
        
        assertEquals("HELLO", s.ligneSuivante());
        assertEquals("WORLD", s.ligneSuivante());
    }
}
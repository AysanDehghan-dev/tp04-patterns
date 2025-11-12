package tp04.exo1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class GrepSequenceTest {
    
    @Test
    public void testGrepFiltering() {
        String[] lignes = {"chemin/vers/fichier", "autre/ligne", "chemin/vers/dossier"};
        Sequence s = new GrepSequence(new ArraySequence(lignes), "chemin");
        
        assertEquals("chemin/vers/fichier", s.ligneSuivante());
        assertEquals("chemin/vers/dossier", s.ligneSuivante());
        assertNull(s.ligneSuivante());
    }
    
    @Test
    public void testGrepNoMatch() {
        String[] lignes = {"apple", "banana", "orange"};
        Sequence s = new GrepSequence(new ArraySequence(lignes), "xyz");
        
        assertNull(s.ligneSuivante());
    }
    
    @Test
    public void testGrepAllMatch() {
        String[] lignes = {"java", "javascript", "java-runtime"};
        Sequence s = new GrepSequence(new ArraySequence(lignes), "java");
        
        assertEquals("java", s.ligneSuivante());
        assertEquals("javascript", s.ligneSuivante());
        assertEquals("java-runtime", s.ligneSuivante());
        assertNull(s.ligneSuivante());
    }
    
    @Test
    public void testGrepEmptySequence() {
        String[] lignes = {};
        Sequence s = new GrepSequence(new ArraySequence(lignes), "test");
        
        assertNull(s.ligneSuivante());
    }
    
    @Test
    public void testGrepPartialMatch() {
        String[] lignes = {"Hello World", "Goodbye World", "Hello Java"};
        Sequence s = new GrepSequence(new ArraySequence(lignes), "World");
        
        assertEquals("Hello World", s.ligneSuivante());
        assertEquals("Goodbye World", s.ligneSuivante());
        assertNull(s.ligneSuivante());
    }
}
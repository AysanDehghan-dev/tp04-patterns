package tp04.exo1;


/**
 * Un décorateur qui retourne seulement une tranche (slice) des lignes d'une séquence.
 * Retourne les lignes entre l'indice start (inclus) et end (exclus).
 */
public class SliceSequence implements Sequence {
    private LineNumberSequence sequence;
    private int start;
    private int end;

    public SliceSequence(Sequence sequence, int start, int end) {
        this.sequence = new LineNumberSequence(sequence);
        this.start = start;
        this.end = end;
    }

    @Override
    public String ligneSuivante() {
        String ligne;
        
        while ((ligne = sequence.ligneSuivante()) != null) {
            int currentLineNumber = sequence.getLineNumber();
            
            // On retourne la ligne si elle est dans la plage [start, end[
            if (currentLineNumber >= start && currentLineNumber < end) {
                return ligne;
            }
            
            // Si on a dépassé end, on arrête
            if (currentLineNumber >= end) {
                return null;
            }
        }
        
        return null;
    }
}

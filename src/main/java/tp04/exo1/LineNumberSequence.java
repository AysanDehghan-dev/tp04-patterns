package tp04.exo1;

/**
 * Un décorateur qui numérote les lignes d'une séquence.
 * Permet de connaître le numéro de la dernière ligne lue via getLineNumber().
 */

public class LineNumberSequence implements Sequence {
    private Sequence sequence;
    private int lineNumber;

    public LineNumberSequence(Sequence sequence) {
        this.sequence = sequence;
        this.lineNumber = 0;
    }

    @Override
    public String ligneSuivante() {
        String ligne = sequence.ligneSuivante();
        if (ligne != null) {
            lineNumber++;
        }
        return ligne;
    }

    /**
     * Retourne le numéro de la dernière ligne lue (ou 0 si aucune ligne n'a été lue).
     */
    public int getLineNumber() {
        return lineNumber;
    }
}
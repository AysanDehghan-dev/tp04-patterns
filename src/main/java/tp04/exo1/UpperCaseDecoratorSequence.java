package tp04.exo1;


/**
 * Un décorateur qui convertit chaque ligne en majuscules.
 */
public class UpperCaseDecoratorSequence implements Sequence {
    private Sequence sequence;

    public UpperCaseDecoratorSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public String ligneSuivante() {
        String ligne = sequence.ligneSuivante();
        if (ligne == null) {
            return null;
        }
        return ligne.toUpperCase();
    }
}
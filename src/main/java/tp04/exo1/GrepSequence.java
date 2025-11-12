package tp04.exo1;

	/**
	 * Un décorateur qui filtre les lignes d'une séquence selon un motif de recherche.
	 * Seules les lignes contenant le motif sont retournées.
	 */
	public class GrepSequence implements Sequence {
	    private Sequence sequence;
	    private String motif;

	    public GrepSequence(Sequence sequence, String motif) {
	        this.sequence = sequence;
	        this.motif = motif;
	    }

	    @Override
	    public String ligneSuivante() {
	        String ligne;
	        // On continue jusqu'à trouver une ligne contenant le motif, ou jusqu'à la fin
	        while ((ligne = sequence.ligneSuivante()) != null) {
	            if (ligne.contains(motif)) {
	                return ligne;
	            }
	        }
	        return null;
	    }
	}



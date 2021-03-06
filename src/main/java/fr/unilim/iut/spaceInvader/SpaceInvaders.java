package fr.unilim.iut.spaceInvader;
  
    public class SpaceInvaders {

	    int longueur;
	    int hauteur;
	    Vaisseau vaisseau;

	    
	    public SpaceInvaders(int longueur, int hauteur) {
		   this.longueur = longueur;
		   this.hauteur = hauteur;
	   }
	    @Override
		public String toString() {
			StringBuilder espaceDeJeu = new StringBuilder();
			for (int y = 0; y < hauteur; y++) {
				for (int x = 0; x < longueur; x++) {
					espaceDeJeu.append(recupererMarqueDeLaPosition(x, y));
				}
				espaceDeJeu.append('\n');
			}
			return espaceDeJeu.toString();
		}
	    private boolean aUnVaisseau(){
	    	return vaisseau!=null;
	    }
	    private boolean aUnVaisseauQuiOccupeLaPosition(int x, int y){
	    	return ( this.aUnVaisseau() && this.vaisseau.occupeLaPosition(x, y));
	    }
	    private char recupererMarqueDeLaPosition(int x, int y) {
	        char marque;
	        if (this.aUnVaisseauQuiOccupeLaPosition(x, y))
	           marque='V';
	        else
	           marque='.';
	        return marque;
		}
	    
	    private boolean estDansEspaceJeu(int x, int y){
	    	return (((x >= 0) && (x < longueur)) && ((y >= 0) && (y < hauteur)));
	    }
	    
	    public void positionnerUnNouveauVaisseau(int x, int y) {
	    	if (  !estDansEspaceJeu(x, y) )
				throw new HorsEspaceJeuException("La position du vaisseau est en dehors de l'espace jeu");
	    	
	        this.vaisseau = new Vaisseau(x, y);
		}
	    public void deplacerVaisseauVersLaDroite() {
	    	if (vaisseau.getX()< (longueur-1))
			   vaisseau.seDeplacerVersLaDroite();
		}
	    public void deplacerVaisseauVersLaGauche() {
	    	if (vaisseau.getX()>(0))
			   vaisseau.seDeplacerVersLaGauche();
		}
	    public void positionnerUnNouveauVaisseau(int longueur, int hauteur, int x, int y) {
			if (!estDansEspaceJeu(x, y))
			    throw new HorsEspaceJeuException("La position du vaisseau est en dehors de l'espace jeu");

			vaisseau = new Vaisseau(longueur,hauteur);
			vaisseau.positionner(x, y);
	}
}
    
    
    
    
    
    
    
    
    
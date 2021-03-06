package fr.unilim.iut.spaceInvader;

public class Vaisseau {

	private int x;
	private int y;
	private int longueur;
	private int hauteur;

	public Vaisseau(int x, int y) {
		this(x, y, 0, 0);
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean occupeLaPosition(int x, int y) {
		if ((this.x<=x) && (x<=this.x+this.longueur-1)) 
		      if ( (this.y-this.hauteur+1<=y) && (y<=this.y))
			  return true;
		
	     return false;
	}
	
	public void seDeplacerVersLaDroite() {
	      this.x = this.x + 1 ;
	}
	public void seDeplacerVersLaGauche() {
	      this.x = this.x - 1 ;
	}
	public Vaisseau(int longueur, int hauteur, int x, int y) {
		   this.longueur=longueur;
		   this.hauteur=hauteur;
		   this.x = x;
		   this.y = y;
	    }
	public void positionner(int x, int y) {
	    this.x = x;
	    this.y = y;
    }
}

package tema7;
import java.util.*;
public class Punto {
	
	private double posx;
	private double posy;
	    Scanner e=new Scanner(System.in);
	    public Punto(){

	    }
	    public Punto(int x, int y){
	        posx=x;
	        posy=y;
	    }
	
	
	    public Punto(Punto p){
		Punto q = new Punto(p.getPosx(), p.getPosy());    
		this.posx = q.getPosx();
		this.posy = q.getPosy();
		    
	        this.posx = p.getPosx();
		this.posy = p.getPosy();
	    	
	    }
	//    public Punto(Punto uno) {
	//    	posx=uno.getPosx();
	//    	posy=uno.getPosy();
	//    }
		public double getPosx() {
			return posx;
		}
		public void setPosx(double posx) {
			this.posx = posx;
		}
		public double getPosy() {
			return posy;
		}
		public void setPosy(double posy) {
			this.posy = posy;
		}

	
}

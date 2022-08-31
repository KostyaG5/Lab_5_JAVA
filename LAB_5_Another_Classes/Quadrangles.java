package LAB_5_Another_Classes;

public class Quadrangles {
	private static Quadrangle[] quadrangles ;
	
	public  Quadrangle[] getQuadrangles() {
		return quadrangles;
	}
	
	public void setQuadrangleAt(int index , Quadrangle quadrangle ) {
		quadrangles[index] = quadrangle ;
	}
		
	
	public Quadrangles(int length) {
		this.quadrangles = new Quadrangle[length];
	}
	
	public static Quadrangle getQuadrangles(int length) {
		return quadrangles[length] ;
	}

	public static double getAverageSquare()
    {
        double area = 0;
        for (int i = 0; i < quadrangles.length; i++) {
            area+=quadrangles[i].getArea();
        }
        return area/quadrangles.length;
    }

	
		
	
}

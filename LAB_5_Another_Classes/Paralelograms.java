package LAB_5_Another_Classes;

public class Paralelograms {
	private static Paralelogram[] paralelograms ;
	
	public  Paralelogram[] getParalelograms() {
		return paralelograms;
	}
	
	
	public void setParalelogramAt(int index , Paralelogram paralelogram ) {
		paralelograms[index] = paralelogram ;
	}
	
	
	public Paralelograms(int length) {
		this.paralelograms = new Paralelogram[length];
	}
	
	public static Paralelogram getParalelograms(int length) {
		return paralelograms[length] ;
	}
	
	
	
	
	public static Paralelogram findParalelogramMaxSquare() {
		Paralelogram maxParalelogramArea = paralelograms[0];
        for (int i = 1; i < paralelograms.length; i++) {
            if (paralelograms[i].getArea() > maxParalelogramArea.getArea()) {
                maxParalelogramArea = paralelograms[i];
            }
        }
        return maxParalelogramArea;
    }
    public static Paralelogram findParalelogramMinSquare() {
    	Paralelogram minParalelogramArea = paralelograms[0];
        for (int i = 1; i < paralelograms.length; i++) {
            if (paralelograms[i].getArea() < minParalelogramArea.getArea()) {
                minParalelogramArea = paralelograms[i];
            }
        }
        return minParalelogramArea;
    }
	
	
	
	
	
	
	
	
	
}

package LAB_5;
import java.util.Scanner;
import LAB_5_Another_Classes.Paralelogram;
import LAB_5_Another_Classes.Paralelograms;
import LAB_5_Another_Classes.Quadrangle ;
import LAB_5_Another_Classes.Quadrangles ;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		// Создаем и инициализируем массив N четырехугольников 
		System.out.println("\tEnter number of Quadrangles \n") ;
		final int  currentNumberQuadrangles = sc.nextInt();
		System.out.println("\tEnter number of Paralelograms \n") ;
		final int  currentNumberParalelograms = sc.nextInt();
		
		Quadrangles quadrangles = new Quadrangles(currentNumberQuadrangles) ;
		Paralelograms paralelograms = new Paralelograms(currentNumberParalelograms) ;
		
		for(int i = 0 ; i < currentNumberQuadrangles ; i++) {
			boolean correct = false ; 
			while(correct == false) {
				int x1 = (int)((Math.random()*40)-20) , x2 = (int)((Math.random()*40)-20) , x3 = (int)((Math.random()*40)-20) , x4 = (int)((Math.random()*40)-20)  , y1 = (int)((Math.random()*40)-20) , y2 = (int)((Math.random()*40)-20) , y3 = (int)((Math.random()*40)-20) , y4 = (int)((Math.random()*40)-20) ;
				boolean tempCorrect = Quadrangle.CheckCorrectCoordinate( x1,  x2,  x3,  x4,  y1,  y2,  y3, y4) ;
				if( tempCorrect == false) {
					correct = false ;
				} else {
					correct = true ; 
					Quadrangle quadrangel = new Quadrangle(x1 , x2 , x3 , x4 , y1 , y2 , y3 , y4);
					quadrangles.setQuadrangleAt(i, quadrangel); 
					System.out.println(quadrangel);
				}
			 }
		 }
	  
	
		
		
		//System.out.print(Quadrangles.getQuadrangles(1)); // Вызываем любой элемент массива четырехугольников  ;
		System.out.print(" Average square of quadrangles   is " + String.format("%.2f", Quadrangles.getAverageSquare()) + "\n\n"); // Выводим в консоль общую площадь ;
		
		for(int i = 0 ; i < currentNumberParalelograms ; i++) {
			boolean correct = false ; 
			while(correct == false) {
				int x1 = (int)((Math.random()*40)-20) , x2 = (int)((Math.random()*40)-20) , x3 = (int)((Math.random()*40)-20) , x4 = (int)((Math.random()*40)-20)  , y1 = (int)((Math.random()*40)-20) , y2 = (int)((Math.random()*40)-20) , y3 = (int)((Math.random()*40)-20) , y4 = (int)((Math.random()*40)-20) ;
				boolean tempCorrect = Paralelogram.CheckCorrectCoordinate( x1,  x2,  x3,  x4,  y1,  y2,  y3, y4) ;
				if( tempCorrect == false) {
					correct = false ;
				} else {
					correct = true ; 
					Paralelogram paralelogram = new Paralelogram(x1 , x2 , x3 , x4 , y1 , y2 , y3 , y4);
					paralelograms.setParalelogramAt(i, paralelogram); 
					System.out.println(paralelogram);
				}
			 }
		 }
		
		
		System.out.print(" Min square of paralelograms  is " + Paralelograms.findParalelogramMinSquare() + "\n\n");
		System.out.print(" Max square of paralelograms  is " + Paralelograms.findParalelogramMaxSquare() + "\n\n");
	}
	
	
	
}

package oops2;

import java.util.*; 
public class vehicleUSe {

	public static void main(String[] args) {
		
		vehicle v = new Car(10,20);
		
		Car c = new Car(10,20);
		
		boolean ans = v.isConvertible();
		  
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		vehicle v;
		if(n == 0) {
			v = new Car(10,20);
		}else {
			v = new vehicle(20);
		}
		v.isConvertible();
		v.print();
		
		c.color = "Black"; 
		c.setMaxSpeed(100);
	}
}
//		vehicle  v = new vehicle();
//		v.color = "Red";
//		v.setColor("red");
//		v.maxSpeed = 80;
//		v.print();
//		
//		Car c = new Car();
////		c.color = "Black";
//		c.setColor("black");
//		c.maxSpeed = 100;
//		c.numDoors = 4;
//		c.print();
////		c.printCar();
//		
//		Bicycle b= new Bicycle();
//		b.print();
		
 		
//		vehicle V =  new vehicle();
//		V.color = "Black";
//		V.setMaxSpeed(10);
//		V.print();
////		Vehicle 
//		
//		Car c = new Car();
//		
//
//		c.numGears = 10; 
//		c.color = "Black";
//		c.print();
//		c.setMaxSpeed(100);
//		c.printCar();
//	}
//}



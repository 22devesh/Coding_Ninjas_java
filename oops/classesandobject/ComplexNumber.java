package classesandobject;
import java.util.*;


//public class ComplexNumber {
//
//	private int real;
//	private int imaginary;
//	
//	public ComplexNumber(int real, int imaginary) {
//		this.real = real;
//		if(imaginary ==0) {
//			
//		}
//		this.imaginary = imaginary;
//		simlpify();
//	}
//	
//	public int getimaginary() {
//		return imaginary;
//		
//	}
//	public int getreal() {
//		return real;
//		
//	}
//	public void setreal(int n) {
//		this.real = n;
//		simplify();
//	}
//	
//	public void setimaginary(int d) {
//		if (d == 0){
//			// TODO error out
//			return;
//		}
//		this.imaginary = d;
//		this.simplify();
//	}
//	
//	public void print() {
//		if (imaginary == 1) {
//			System.out.println(real);
//		} else {
//			System.out.println(real + "/" + imaginary);
//		}
//	}
//	
//	
//}



















public class ComplexNumber {
private int real;
    private int imaginary;
    public ComplexNumber(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public void plus(ComplexNumber c2)
    { 
     this.real =(this.real+c2.real);
         this.imaginary=this.imaginary+c2.imaginary;
     
    }
    public void multiply(ComplexNumber c2)
        
    {
      int temp=this.real;  
    this.real = (this.real*c2.real)-(this.imaginary*c2.imaginary);
        this.imaginary =temp*c2.imaginary+this.imaginary*c2.real; 
            
    }
                public void print()
                {
                    System.out.println(this.real+" + "+"i"+this.imaginary );
                }



 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumber c1 = new ComplexNumber(real1, imaginary1);
		ComplexNumber c2 = new ComplexNumber(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}
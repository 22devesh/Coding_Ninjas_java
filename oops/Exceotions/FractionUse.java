package Exceotions;

public class FractionUse {

	public static void temp() throws ZeroDenominatorException {
		Fraction f1 = new Fraction(20,30);
		f1.print();
		//2/3
		
		f1.setNumerator(12);
		//4/1
		int d = f1.getDenominator();
		System.out.println(d);
		f1.print();
		
		f1.setNumerator(10);
		
		try {
			f1.setDenominator(0);
		}catch(ZeroDenominatorException e) {
			System.out.println("Hey  dont input 0 as denominator");
		}
		f1.setDenominator(30);
		//1/3
		f1.print();
		
		Fraction f2 = new Fraction(3,4);
		f1.add(f2);
		f1.print();
		//f1 =?13/12
		f2.print();
		// f2 => 3/4
		
		Fraction f3 = new Fraction(4,5);
		f3.multiply(f2);
		f3.print();
		// f2 => 3/4
		
		Fraction f4 = Fraction.add(f1, f3);
		f1.print();
		f3.print();
		f4.print();
	}
	
	public static void main(String[] args) throws ZeroDenominatorException{
		temp();
//		String s=" ";
//		File f;
//		try{
//			f = new File(s);
//			// read file
//			f.close;
//		}catch(FileNotFoundException exception) {
//		}finally {
//			f.close();
//		}
	}
	

}

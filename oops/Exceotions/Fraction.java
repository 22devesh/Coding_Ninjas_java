package Exceotions;

public class Fraction {



		private int numerator;
		private int denominator;

		public Fraction(int numerator, int denominator) {
			this.numerator = numerator;
			if(denominator == 0) {
				//TODO error out
			}
			this.denominator = denominator;
			simplify();
		}
		
		private void simplify() {
			// TODO Auto-generated method stub
			
		}

		public int geyDenominator() {
			return denominator;
		}
		
		public int getNumerator() {
			return numerator;
			
		}
		
		public void setNumerator(int n) {
			this.numerator = n;
			simplify();
		}
		
		public void setDenominator(int d) throws Exception
		{
			if(d == 0) {
				ZeroDenominatorException e = new ZeroDenominatorException();
//				Exception e = new Exception("Denominator cannot be 0");
				
				throw e;
			}
			this.denominator = d;
			this.simplify();
		}
		public void print() {
			if(denominator ==1) {
				System.out.println(numerator);
			}else {
				System.out.println(numerator + "/" + denominator);
				
			}
		}

}

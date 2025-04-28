package lecture1;

public class DataTypes {

	public static void main(String[] args) {

		char c= 'a';
//		System.out.println(c + 3);
		
		int i = c +10;
//		System.out.println(i);
		
		i= c ;
//		char abc = i; // char has 2 bytes and int has 4 bytes
		
		long l = i; 
		l = 12345654321L;
		i = (int)l;
		System.out.println(l);
		System.out.println(i);

// 		i=l; // long has 8 bytes and int has 4 bytes
		
		double d = i;
//		int j = d; //double  has 8 bytes and int has 4 bytes
		
		float f= 1.23f;
		//f =d;
		d=f;
	}

}

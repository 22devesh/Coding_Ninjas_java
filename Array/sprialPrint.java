package Array;

public class sprialPrint {

	public static void sprialPrint(int mat[][]) {
		int nRows = mat.length;
		if(nRows ==0) {
			return;
		}
		int mCols  = mat[0].length;
		
		int rowStart = 0, colStart = 0;
		int numElements = nRows*mCols;
		int count =0;
		
		while(count<numElements) {
			for(int i = colStart;count<numElements && i<mCols;i++) {
				System.out.println(mat[rowStart][i]+" ");
				
				count++;
			}
			rowStart++;
			
			for(int i = rowStart;count<numElements && i<nRows;i++) {
				System.out.println(mat[i][mCols-1]+" ");
				count++;
			}
			mCols--;
			
			for(int i = mCols-1;count<numElements && i>=colStart;i--) {
				System.out.println(mat[nRows-1][i]+" ");
				count++;
			}
			nRows--;
			
			for(int i = nRows-1;count<numElements && i>= rowStart;i--) {
				System.out.println(mat[i][colStart]+" ");
				count++;
			}
			colStart++;
		}
	}
	
}


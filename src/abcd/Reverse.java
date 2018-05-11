package abcd;

public class Reverse {
	

	public static void main(String[] args) {

		String s= "Test";
		
		char[] c = s.toCharArray();
		
		int x,y;
		x= 0;
		y=c.length-1;
		
		for (int i=0; i<c.length; i++) {
			while (x<y) {
				
				char a= c[x];
				c[x] = c[y];
				c[y] = a;
				
				x++;
				y--;
				
			}
		}
		System.out.println("This is swapped string " + String.valueOf(c));
	}
	
}
		
	
	
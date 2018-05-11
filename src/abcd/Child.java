package abcd;

class Parent {
   void show() {
	   System.out.println("This");
   }
}
   
   public class Child extends Parent
   {
	   void show() {
		   System.out.println("This is a Sample");
	   }
   
	public static void main(String[] args) {

		Parent obj = new Parent();
		obj.show();
		
		Parent obj2= new Child();
		obj2.show();
	}

}

class Car{
   public Car()
   {
	System.out.println("Class Car");
   }
}
class Maruti extends Car{
   
   public void brand()
   {
	System.out.println("Brand: Maruti");
   }
}
public class Maruti800 extends Maruti{

   public void brand()
   {
	System.out.println("Brand: Maruti800");
   }
   public static void main(String args[])
   {
	 Maruti800 obj=new Maruti800();
	 obj.brand();
   }
}

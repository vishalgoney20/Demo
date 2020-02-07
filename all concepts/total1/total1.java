import java.util.Date;
abstract class Laptop
{
      void monitor()
	  {
	  System.out.println("displays content on monitor ....\n" );
	  }
	  
	  abstract void display();	
}

class Trackpad extends Laptop {
   
      private String name;
	  
      void monitor()
	  {
	     System.out.println("displays content on Trackpad screen i.e, runtime polymorphism and inheritance successfull ....\n");
	  }
	  
	  void display()
	  {
	      System.out.println("abstract class overridden method i.e, abstraction succesfull ....\n");
	  }
	  
	  void addNewScreen(int quantity,String name)
	  {
	      System.out.println(quantity+" screens  with name "+name +"  are added to trackpad ....compile time polymorphism succesfull\n");
	  }
	  
	  void addNewScreen(String model,String name,int quantity)
	  {
	      System.out.println(quantity+" screens  with name "+name +" and model "+model+ "  are added to trackpad ....compile time polymorphism succesfull\n");
	  }  
	  
	  public void setName(String newName) 
	  {
		name = newName;
	  }
	  
      public String getName()
	  {
			return name;
      }
	  
}

class Driver
{
   public static void main(String[] args)
  {
      Trackpad obj=new Trackpad();
	  obj.monitor();
      obj.display();
	  obj.addNewScreen("LG","vishal",2);
	  obj.setName("vishal");
	  System.out.println(" name of the author is "+obj.getName()+"i.e, encapsualtion and data hiding succesfull....\n");
	  
	  
      Date date = new Date();
	  
      System.out.println("Todays date is...."+ date.toString());
	  
  }

}

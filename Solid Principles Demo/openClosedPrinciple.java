/*
class Tourism
{
       void displayTouristSpots(String place)
	   {
		   if(place.equals("Hyderabad"))
		   {
			     // retrieve data from database and print the places...
			     System.out.println("Charminar \nGolconda \nZoo Park.......");
		   }
		   else if(place.equals("Goa"))
		   {
			     // retrieve data from database and print the places...
			     System.out.println("Baga Beach\nCalangute Beach \nDudhsagar Waterfalls.......");
		   }
	   }
}
class OpenClosedPrinciple{
	
    public static void main(String[] args) {
		
            Tourism spot=new Tourism();
	    spot.displayTouristSpots("Hyderabad");
    }
 
}


*/

class Tourism
{
	 public String placeslist;
         String  getPlaces(String place)
	 {
         // retrieve data from database and return the result...
         return "retrieved places....";			
	 }
}
class Hyderabad extends Tourism{
    void displayTouristSpots()
	{
	   placeslist=super.getPlaces(this.getClass().getName());
	   System.out.println(placeslist + "of "+this.getClass().getName());
	}
}
class Goa extends Tourism{
    void displayTouristSpots()
	{
	   placeslist=super.getPlaces(this.getClass().getName());
	   System.out.println(placeslist + "of "+this.getClass().getName());
	}
}
class OpenClosedPrinciple{
	    public static void main(String[] args) {	
            Hyderabad list1=new Hyderabad();
	    list1.displayTouristSpots();
			
	    Goa list2=new Goa();
	    list2.displayTouristSpots();
    }
 
}

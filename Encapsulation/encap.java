 class Encap {

   private String name;
   
   public String getName() {
      return name;
   }

   public void setName(String newName) {
      name = newName;
   }
}

 class Driver {

   public static void main(String args[]) {
      Encap obj = new Encap();
      obj.setName("James");

      System.out.print("Name : " + obj.getName()+"\n" );
   }
}


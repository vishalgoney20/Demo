/*

//   violates Liskov Substitution Principle

class Birds {
    void fly() {

    }
	void walk()
	{
		
	}
}
class Parrot extends Birds {
    void fly() {
        // parrot is flying....
    }
	void walk(){
	
	}
}
class Penguin extends Birds {
     void fly() {
        // Penguin can't fly....
    }
	void walk()
	{
		// penguins can walk....
	}
}
class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Birds bird1=new Parrot();
		bird1.fly();
		bird1.walk();
		Birds bird2=new Penguin();
		bird2.fly();
		bird2.walk();
		
    }
}
*/



//   doesn't violate Liskov Substitution Principle

class FlyingBirds {
    void fly()
	{

    }
	void walk()
	{
		
	}
}
class Birds
{
	void walk()
	{
		
	}
}
class Parrot extends FlyingBirds {
    void fly() {
        System.out.println(" parrot is flying");		
    }
	void walk()
	{
        System.out.println(" parrot is walking");		
	}
}
class  penguin extends Birds {
    void walk() {
        System.out.println(" penguin is walking");
    }
}
class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        FlyingBirds bird1=new Parrot();
		bird1.fly();
		bird1.walk();
		Birds bird2=new penguin();
		bird2.walk();
    }
}
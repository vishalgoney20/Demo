class University {

public void display() {

System.out.println("This is university...");

}

}

//inheritance

class Osmania extends University {

@Override

public void display() {

System.out.println("This is osmania univeristy");

}

public int add(int x, int y) {

return x+y;

}

//Overload

public double add(double x,double y) {

return x+y;

}

}

//encapsulation example

class EncapTest {

private String name;

public String getName() {

return name;

}

public void setName(String newName) {

name = newName;

}

}

//abstraction

abstract class TwoWheeler {

public abstract void run();

}

class Honda extends TwoWheeler{

public void run(){

System.out.println("\nbike is Running..");

}

}

class MainClass {

public static void main(String[] args) {

University a=new University();

a.display();

Osmania b=new Osmania();

b.display();

System.out.println(b.add(4,2));

System.out.println(b.add(5.,2.)); //polymorphism

EncapTest encap = new EncapTest();

encap.setName("Sandeep's");

System.out.print("Name : " + encap.getName() );

TwoWheeler test = new Honda();

test.run();

}

}

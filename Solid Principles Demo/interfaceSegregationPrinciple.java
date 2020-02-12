/*

// violates interface segregation principle

interface SoftwareDeveloper {
    void design();
    void develop();
    void test();
}
class DevelopmentBasedCompany implements SoftwareDeveloper {

    @Override
    public void design() {

    }

    @Override
    public develop(){

    }

    @Override
    public test(){

    }
}
class TestingBasedCompany implements SoftwareDeveloper {

    @Override
    public void design() {

    }

    @Override
    public develop(){

    }

    @Override
    public test(){

    }
}


class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
		
        //object creation and method calling
		
    }
}

*/



// doesn't  violates interface segregation principle

interface Developer {
   void design();
   void develop();
}
interface TestingEngineer {
   void testAutomate();
}
class DevelopmentBasedCompany implements Developer{

    @Override
    public void design() {

    }

    @Override
    public develop(){

    }
}
class  TestingBasedCompany implements TestingEngineer {

    @Override
    public testAutomate(){

    }
}

class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
		
        //object creation and method calling
		
    }
}
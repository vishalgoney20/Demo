/*

class Recruitment{
  int finalCountOfSelects;
  String dateOfRecruitment;
  String typeOfRecruitment;
  String placeOfRecruitment;
  Recruitment(String dateOfRecruitment,String typeOfRecruitment,String placeOfRecruitment)
  {
          this.dateOfRecruitment=dateOfRecruitment;
	  this.typeOfRecruitment=typeOfRecruitment;
	  this.placeOfRecruitment=placeOfRecruitment;
  }
  void printDetailsOfRecruitment()
  {
	  // displays details of recruitment.
  }
  void screeningTest()
  {
	  // conducting screening( online/offline ) test for elgible candidates.
  }
  void technicalInterview()
  {
	  // conducting technical Interviews .
  }
  String  HRInterview()
  {
	  // conducting HR interviews
	  // return finalCountOfSelects;
  }

}

class MainClass
{
	public static void main(String[] args)
	{
	   Recruitment recruit=new Recruitment("1-1-2020","on Campus","Hyderabad");
	   recruit.printDetailsOfRecruitment();
           recruit.screeningTest();
           recruit.technicalInterview();
           recruit.HRInterview();		   
	}
}

*/



class Recruitment{
  int finalCountOfSelects;
  String dateOfRecruitment;
  String typeOfRecruitment;
  String placeOfRecruitment;
  Recruitment(String dateOfRecruitment,String typeOfRecruitment,String placeOfRecruitment)
  {
      this.dateOfRecruitment=dateOfRecruitment;
      this.typeOfRecruitment=typeOfRecruitment;
      this.placeOfRecruitment=placeOfRecruitment;
  }
  void printDetailsOfRecruitment()
  {
	  // displays details of recruitment.
  }

}

class ScreeningTest extends Recruitment
{
	void conductTest()
	{
		//  conducting screening( online/offline ) test for elgible candidates.
	}
}

class TechnicalInterview extends Recruitment
{
     void conductTechnicalInterview()
	{
		//  conducting technical Interviews .
	} 
}

class HRInterview extends Recruitment
{
     void conductHRInterview()
	{
		//  conducting HR Interviews .
	} 	
}

class MainClass
{
	public static void main(String[] args)
	{
	           Recruitment recruit=new Recruitment("1-1-2020","on Campus","Hyderabad");
		   recruit.printDetailsOfRecruitment();
		   
		   ScreeningTest  test=new ScreeningTest();
		   test.conductTest();
		   
		   TechnicalInterview round1=new TechnicalInterview();
		   round1.conductTechnicalInterview();
		   
		   HRInterview round2=new HRInterview();
		   round2.conductHRInterview();
		   
	}
}




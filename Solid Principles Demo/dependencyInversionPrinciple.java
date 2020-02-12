/*

// violates Dependency Inversion Principle


class BackEndDeveloper{
	void javaDeveloper()
	{
		System.out.println(" writes java code");
	}
}
class FrontEndDeveloper{
	void javaScriptDeveloper()
	{
		System.out.println(" writes java Script code");
	}
}
// if we add any other class we need to modify project class  i.e, tightly coupled.
class Project
{
	void writeJava(BackEndDeveloper back)
	{
		//  depending on BackEndDeveloper class
		back.javaDeveloper();
	}
	void writeJavaScript(FrontEndDeveloper  front)
	{
		//  depending on FrontEndDeveloper class
		front.javaScriptDeveloper();
	}
}
class DependencyInversionPrinciple
{
	public static void main(String[] args)
	{
		Project project=new Project();
		project.writeJava(new BackEndDeveloper());
		project.writeJavaScript(new FrontEndDeveloper());
	}
}


*/


interface Developer
{
	 void develop();
}
class BackEndDeveloper implements Developer{
	
	//@override
	public void develop()
	{
		System.out.println(" writes java code");
	}
}
class FrontEndDeveloper implements Developer{
	
	//@override
	public void develop()
	{
		System.out.println(" writes javaScript  code");
	}
}

class Project
{
	public void writeCode(Developer dev)
	{
		dev.develop();
	}
}
class DependencyInversionPrinciple
{
	public static void main(String[] args)
	{
                Developer deve1=new BackEndDeveloper();
		Developer deve2=new FrontEndDeveloper();
		Project project=new Project();
		project.writeCode(deve1);
                project.writeCode(deve2);

	}
}


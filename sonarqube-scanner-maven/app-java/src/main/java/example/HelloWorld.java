package example;

public class HelloWorld {

  public void coveredByUnitTest() {
    System.out.println("coveredByUnitTest1");
    System.out.println("coveredByUnitTest2");
  }

  public void coveredByIntegrationTest() {
    System.out.println("coveredByIntegrationTest1");
    System.out.println("coveredByIntegrationTest2");
    System.out.println("coveredByIntegrationTest3");
  }

  public void notCovered() {
    System.out.println("notCovered");
  }
private String name;
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void printHello() 
	{
		System.out.println("Hello ! " + name);
	}
	class MyThread extends Thread
	{

		@Override
		public void run()
		{
			synchronized(this)
			{
			// ...
			notify();  // Noncompliant
			}
		}
	}
}

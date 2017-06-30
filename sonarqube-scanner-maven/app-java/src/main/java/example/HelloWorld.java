package example;

public class HelloWorld {
	
  public void fakemethod ()
  {
	var target =-5;
	var num = 3;

	target =- num;  // Noncompliant; target = -3. Is that really what's meant?
	target =+ num; // Noncompliant; target = 3
	  
  }
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

}

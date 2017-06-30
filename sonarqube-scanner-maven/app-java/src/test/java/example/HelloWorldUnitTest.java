package example;

import org.junit.Test;

public class HelloWorldUnitTest {

  @Test
  public void test() {
    new HelloWorld().coveredByUnitTest();
	new HelloWorld2().notCovered();
  }

}

package lesson2016_11_10;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;
import org.junit.rules.TestName;

public class NameRuleTest {
	  @Rule
	  public TestName name = new TestName();

	  @Test
	  public void testA() {
	    assertEquals("testA", name.getMethodName());
	  }

	  @Test
	  public void testB() {
	    assertEquals("testB", name.getMethodName());
	  }
	}
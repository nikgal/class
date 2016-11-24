package by.galov.fileman;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMan {

  

    @Before
    public void setUp() throws Exception {
    }

   

    @Test
    public void test() {
        TestManager tm = new TestManager();
        String[] args ={"first","second"};
        Map<String,String> arguments = new HashMap<>();
        Map<String,String> argumentsEx = new HashMap<>();
        argumentsEx.put("arg0","first");
        argumentsEx.put("arg1","second");
        arguments = TestManager.parseArguments(args);
        assertEquals(argumentsEx.get("arg1"), arguments.get("arg1"));
        //fail("Not yet implemented");
    }

}

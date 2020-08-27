package homeWork_7_JenkinsJob;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("run_test")
public class WorkWithJenkinsTests {

    private static Logger LOGGER = LoggerFactory.getLogger(WorkWithJenkinsTests.class);

    @Test
    @Tag("HW_7_JenkinsJob")
    public void NumTest() {
        int a = 200;
        int b = 10;
        System.out.println(a + " " + b);
        assertEquals(20, a / b);
    }

    @Test
    @Tag("HW_7_JenkinsJob")
    public void StringTest() {
        String a = "Hello";
        String b = "Jenkins";
        System.out.println(a + " " + b);
        assertEquals(a, b);
    }
}

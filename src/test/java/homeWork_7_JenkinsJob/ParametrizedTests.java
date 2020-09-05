package homeWork_7_JenkinsJob;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("run_test")
public class ParametrizedTests {
    static Logger logger = LoggerFactory.getLogger(ParametrizedTests.class);

    @Test
    @Tag("mango_tag")
    void paramitrizedStringTest() {
        String a = System.getProperty("test", "paramtest");

        logger.info("\na = " + a);
        assertEquals("paramtest", a, "b = " + a);
    }
}
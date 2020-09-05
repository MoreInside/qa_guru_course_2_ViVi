package homeWork_7_JenkinsJob;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 1. Зарегистрироваться в Jenkins https://jenkins.autotests.cloud/
 * 2. Написать простейший автотест и добиться чтобы можно было запустить тесты из терминала командой типа "gradle some_tests"
 * 3. Сделать джобу в дженкинсе:
 * - Указать в настройках джобы ссылку на свой гитхаб-проект
 * - Указать команду для запуска.
 * 4. Добавьте в код автотестов возможность передавать параметр из терминала
 * 5. И добавьте в вашу джобу в jenkins возможнось передавать параметр в запуск тестов
 */

@Tag("run_test")
public class WorkWithJenkinsTests {

    static Logger logger = LoggerFactory.getLogger(WorkWithJenkinsTests.class);

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
        String a = "Hello,";
        String b = "Jenkins!";
        System.out.println(a + " " + b);
        assertEquals(a, a, b);
    }
}

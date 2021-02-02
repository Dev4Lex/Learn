package ru.javaedu.autotests.template.service;

import org.testng.annotations.Test;
import ru.javaedu.autotests.user.notification.service.UtilClass;

public class TemplateNotificationServiceTest {

    @Test
    public void test () {
        System.out.println(new UtilClass().sayHi());
    }
}

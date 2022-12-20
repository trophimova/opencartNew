package org.opencartNew;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.opencartNew.AbstractTest;

public class PositiveRegTest extends AbstractTest {

    @Test
    @DisplayName("Проверка успешной регистрации")
    public void Test() throws InterruptedException {

        RegPage regPage = new RegPage(getDriver());

        regPage
                .clickPersonalAccount()
                .clickRegistration()
                .clickFirstname()
                .validFirstname()
                .clickLastname()
                .validLastname()
                .clickEmail()
                .validEmail()
                .clickTelephone()
                .validTelephone()
                .clickPassword()
                .validPassword()
                .clickConfirm()
                .validConfirm()
                .clickCheckbox()
                .clickSubmitButton()
                .title()
                .getNameTitle();


        String nameTitle = regPage.getNameTitle();
        Assertions.assertEquals(nameTitle, Data.successRegMessage);


        Thread.sleep(1000l);

    }


}

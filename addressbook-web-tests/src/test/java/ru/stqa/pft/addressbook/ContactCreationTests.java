package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase{

  @Test
  public void testUntitledTestCase() throws Exception {
    addNewContact();
    fillContactForm(new ContactData("Andrey", "Kutischev", "akut", "77777777", "a.kut@gmail.com"));
    submitContactCreation();
    goToHomePage();
    logout();
  }
}

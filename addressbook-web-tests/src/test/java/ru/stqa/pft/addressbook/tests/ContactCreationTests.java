package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testUntitledTestCase() throws Exception {
    app.getContactHelper().addNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Andrey", "Kutischev", "akut", "77777777", "a.kut@gmail.com", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomePage();
    app.logout();
  }
}

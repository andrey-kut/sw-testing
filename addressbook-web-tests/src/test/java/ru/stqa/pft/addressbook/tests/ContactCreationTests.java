package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testUntitledTestCase() throws Exception {
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().createContact(new ContactData("Andrey", "Kutischev", "akut", "77777777", "a.kut@gmail.com", "test1"), true);
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before + 1);
    app.logout();
  }
}

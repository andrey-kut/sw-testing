package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase{

  @Test
  public void testUntitledTestCase() throws Exception {
      List<ContactData> before = app.getContactHelper().getContactlist();
      app.getContactHelper().createContact(new ContactData("Andrey", "Kutischev", "akut", "77777777", "a.kut@gmail.com", "test1"), true);
      List<ContactData> after = app.getContactHelper().getContactlist();
      Assert.assertEquals(after.size(), before.size() + 1);
    app.logout();
  }
}

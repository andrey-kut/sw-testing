package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() throws Exception {
    app.getNavigationHelper().goToHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Andrey", "Kutischev", "akut", "77777777", "a.kut@gmail.com", "test1"), true);
    }
      List<ContactData> before = app.getContactHelper().getContactlist();
    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().acceptNextAlert = true;
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().confirmContactDeletePopup();
    app.getNavigationHelper().goToHomePage();
    List<ContactData> after = app.getContactHelper().getContactlist();
    Assert.assertEquals(after.size(), before.size() - 1);
  }
}

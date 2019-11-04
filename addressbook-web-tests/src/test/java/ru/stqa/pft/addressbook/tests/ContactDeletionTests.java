package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() throws Exception {
    app.goToHomePage();
    app.selectContact();
    app.acceptNextAlert = true;
    app.deleteSelectedContact();
    app.confirmContactDeletePopup();
    app.goToHomePage();
  }
}

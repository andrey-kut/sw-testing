package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.testng.Assert.assertTrue;


public class ContactHelper extends BaseHelper {
    public boolean acceptNextAlert = true;

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("email"), contactData.getEmail());
    }

    public void addNewContact() {
      wd.get("http://localhost:8080/addressbook/edit.php");
    }

    public void submitContactCreation() {
      click(By.xpath("(//input[@name='submit'])"));
    }

    public void confirmContactDeletePopup() {
      assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    }

    public void deleteSelectedContact() {
      click(By.xpath("//input[@value='Delete']"));
    }

    public void selectContact() {
      click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td/input"));
    }

    private String closeAlertAndGetItsText() {
      try {
        Alert alert = wd.switchTo().alert();
        String alertText = alert.getText();
        if (acceptNextAlert) {
          alert.accept();
        } else {
          alert.dismiss();
        }
        return alertText;
      } finally {
        acceptNextAlert = true;
      }
    }
}

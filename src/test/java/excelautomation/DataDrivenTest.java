package excelautomation;

import com.weborders.utilities.Driver;
import com.weborders.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenTest extends TestBase {

    @Test
    public void employeesFormTest() {
        EmployeesFormPage empPage = new EmployeesFormPage();
        empPage.firstName.sendKeys("Mark");
        empPage.lastName.sendKeys("Smith");
        empPage.role.sendKeys("Student");
        empPage.selectGender("male");
        empPage.email.sendKeys("kigus@parcel4.net");
        empPage.annualSalary.sendKeys("90123");
        new Select(empPage.education).selectByVisibleText("High School");
        empPage.javaOCACert.click();
        empPage.additionalSkills.sendKeys("Google > Copy > Paste");
        empPage.submitBttn.click();

    }

}

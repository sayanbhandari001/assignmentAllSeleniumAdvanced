
package assignmentAllSeleniumAdvanced;
import org.testng.annotations.DataProvider;

public class MyDataClass {
    @DataProvider
    public Object[][] myTestData() {
        Object[][] obj = { 
                                { "kanza5123@gmail.com", "test1234" }

                        };
        return obj;
    }

    @DataProvider
    public Object[][] myTestData1() {
        Object[][] obj1 = { 
                                {"Kann1","Kann1","kanza5@gmail.com", "test1234" }, 

                        };
        return obj1;
    }
}
import Utils.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void start(){
        BrowserFactory.initBrowser();
    }

    @After
    public void tearDown(){
        BrowserFactory.close();
    }
}

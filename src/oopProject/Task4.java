package oopProject;

public class Task4 {
    /*. Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.*/
    public static void main(String[] args) {
                    SafariDriver safariDriver=new SafariDriver();
        safariDriver.open();
        safariDriver.close();
        safariDriver.getTitle();
        safariDriver.getScreenshot();
        safariDriver.navigate();
                    FireFoxDriver fireFoxDriver=new FireFoxDriver();
        fireFoxDriver.open();
        fireFoxDriver.close();
        fireFoxDriver.getTitle();
        fireFoxDriver.getScreenshot();
        fireFoxDriver.navigate();
                        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.open();
        chromeDriver.close();
        chromeDriver.getTitle();
        chromeDriver.getScreenshot();
        chromeDriver.navigate();
        // we got the methods of all interfaces which we extends and child class use all methods via multiple inheritance
        //using interfaces
    }
}

interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakeScreenShot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakeScreenShot {
 void navigate();
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }

    @Override
    public void navigate() {

    }
}
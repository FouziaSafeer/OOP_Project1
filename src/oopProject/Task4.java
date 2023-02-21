package oopProject;

public class Task4 {
    /*. Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.*/
    public static void main(String[] args) {
        RemoteWebDriver[] browsers={new SafariDriver(),new FireFoxDriver(),new ChromeDriver()};
        for (RemoteWebDriver remoteWebDriver:browsers) {
            remoteWebDriver.open();
            remoteWebDriver.close();
            remoteWebDriver.getTitle();
            remoteWebDriver.getScreenshot();
            remoteWebDriver.navigate();
// we got the methods of all interfaces which we extends and child class use all methods via multiple inheritance
            //using interfaces
        }


                   /* SafariDriver safariDriver=new SafariDriver();
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
        chromeDriver.navigate();*/

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
        System.out.println("Safari Open");

    }

    @Override
    public void close() {
        System.out.println("Safari close");

    }

    @Override
    public String getTitle() {
        System.out.println("Safari Title");
        return "Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println(" Safari screenshot");

    }

    @Override
    public void navigate() {
        System.out.println("Safari navigate");

    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("FF open");

    }

    @Override
    public void close() {
        System.out.println("FF close");
    }

    @Override
    public String getTitle() {
        System.out.println("FF get title");
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("FF screenshot");

    }

    @Override
    public void navigate() {
        System.out.println("FF navigate");

    }
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Chrome open");

    }

    @Override
    public void close() {
        System.out.println("Chrome close");

    }

    @Override
    public String getTitle() {
        System.out.println("Chrome title");
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("chrome screenshot");

    }

    @Override
    public void navigate() {
        System.out.println("Chrome navigate");

    }
}
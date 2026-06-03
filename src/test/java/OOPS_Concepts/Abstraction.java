class Main
{
    public static void main (String[] args)
    {
        Login user = new Login();
        user.openUrl();
        user.openBrowser();
    }
}

abstract class WebBrowser
{
    abstract void openBrowser();
    void openUrl()
    {
        System.out.println("Open URL");
    }
}

class Login extends WebBrowser
{
    void openBrowser()
    {
        System.out.println("Open Web Browser");
        
    }
}

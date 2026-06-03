class Main
{
    public static void main (String[] args)
    {
      Login user = new Login();
      user.login();
      user.OpenUrl();
      user.OpenUrl();
    }
}

interface WebBrowser
{
    void openBrowser();
}

interface WebUrl
{
    void OpenUrl();
}

class Login implements WebBrowser, WebUrl
{
    public void openBrowser()
    {
        System.out.println("Open Web Browser");
    }
    public void OpenUrl()
    {
        System.out.println("Open Web Url");
    }
    void login()
    {
        System.out.println("Login to the Website");
    }
    
}

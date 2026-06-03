class Main
{
    public static void main(String[] args)
    {
        Login user = new Login();
        user.userLogin();
        user.openBrowser();
        
        WebUrl user2 = new WebUrl();
        user2.openUrl();
        user2.openBrowser();
    }
}

class WebBrowser
{
    void openBrowser()
    {
        System.out.println("Open Chrome Browser");
    }
}

class WebUrl extends WebBrowser
{
    void openUrl()
    {
        System.out.println("Open Website Url");
    }
}

class Login extends WebBrowser
{
    void userLogin()
    {
        System.out.println("User is able to Login");
    }
}

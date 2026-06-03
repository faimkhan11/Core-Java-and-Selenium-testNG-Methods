class Main
{
    public static void main(String[] args)
    {
        Login user = new Login();
        user.userLogin();
        user.openUrl();
        user.openBrowser();
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

class Login extends WebUrl
{
    void userLogin()
    {
        System.out.println("User is able to Login");
    }
}

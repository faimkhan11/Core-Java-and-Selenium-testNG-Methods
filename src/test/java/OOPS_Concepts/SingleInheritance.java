class Main {
    public static void main(String[] args) 
    {
       WebUrl user = new WebUrl();
       user.openWebsite();
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
    void openWebsite()
    {
        System.out.println("Open Website");
    }
}

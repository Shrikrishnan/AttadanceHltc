package com.attadanceHltc;
public class MainPage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hltc.formulahr.co.in/Login.aspx");
    }
}



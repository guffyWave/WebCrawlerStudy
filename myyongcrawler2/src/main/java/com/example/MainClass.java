package com.example;

public class MainClass {
    public static void main(String args[]) {
        System.out.println("Hello");

        // new BasicWebCrawler().getPageLinks("http://www.rudimentsofwisdom.com/");
        new WebCrawlerWithDepth().getPageLinks("http://list25.com/", 0);

    }
}

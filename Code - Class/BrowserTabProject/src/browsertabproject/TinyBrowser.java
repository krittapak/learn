/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browsertabproject;

import int105.model.Browser;
import int105.model.Tab;

/**
 *
 * @author Tisanai.Cha
 */
public class TinyBrowser {
    
    public static void main(String[] args) {
        //add two tabs to the Browser pointing to “www.sit.kmutt.ac.th” and "www.kmutt.ac.th" respectively
        
        //1
        Browser browser = new Browser(5);        
        Tab tab=new Tab("www.sit.kmutt.ac.th");
        Tab tab2=new Tab("www.kmutt.ac.th");
        //2
        browser.newTab(tab);
        browser.newTab(tab2);
        
        System.out.println("Output #01\n" + browser);
        browser.setActiveTabIndex(0);
        //1
        Tab tempTab=browser.getActiveTab();
        tempTab.setUrl("www.kmutt.ac.th");
        //2
        browser.getActiveTab().setUrl("www.kmutt.ac.th");
        //change the URL of the default tab (at index 0) to "www.kmutt.ac.th"
        
        
        
        //1
        
        
        System.out.println("Output #02\n" + browser);
        System.out.println("First Tab is "+browser.getFirstTab().getUrl());
        System.out.println("First Tab is "+browser.getLastTab().getUrl());
    }
}

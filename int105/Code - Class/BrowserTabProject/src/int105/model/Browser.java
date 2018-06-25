/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.model;

/**
 *
 * @author Tisanai.Cha
 */
public class Browser {

    private Tab[] tabs;
    private int numOfTab;
    private int activeTabPosition;

    public Browser(int maximumTab) {
        this.tabs = new Tab[maximumTab + 1];
        this.tabs[0] = new Tab("Default");
        this.activeTabPosition = 0;
        this.numOfTab = 1;
    }

    public int newTab(Tab tab) {
        if (tabs.length>numOfTab) {
            tabs[numOfTab]=tab;
            setActiveTabIndex(numOfTab);
            return ++numOfTab;
        }else{
            return-1;
        }
        
        //set the tab to the next empty array and set activeTabPosition to the position of this tab in the tabs array, 
        //return the number of tabs after adding the new tab if successful, otherwise return -1.
        //??
       
    }

    public boolean setActiveTabIndex(int index) {
        boolean result = false;
        if (index < tabs.length && tabs[index] != null) {
            this.activeTabPosition = index;
            result = true;
        }
        return result;
    }

    public int getMaximumNoOfTab() {
        return this.tabs.length;
    }

    public int getNumOfTab() {
        return this.numOfTab;
    }

    public Tab getActiveTab() {
        return this.tabs[activeTabPosition];
    }
    
    public Tab getFirstTab(){
        return tabs[0];
    
    }
    
    public Tab getLastTab(){
        return tabs[numOfTab-1];
    }

    @Override
    public String toString() {
        String output = "Browser consists of " + this.numOfTab + " tabs:\n";
        for (Tab tempTab : this.tabs) {
            if (tempTab != null) {
                output += tempTab + "\n";
            }
        }
        output += "Active tab = "
                + this.tabs[activeTabPosition].toString();
        return output;
    }

}

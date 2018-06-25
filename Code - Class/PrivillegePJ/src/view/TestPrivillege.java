
package view;

import packageprivillege.Privillege;
import packageprivillege.Sliver;


public class TestPrivillege {
    public static void main(String[] args) {
        Sliver p1 = new Sliver(200,"boss",60154564L,04564L,"Sliver",10);
        System.out.println(p1.toString());
        
        Sliver s1 = new Sliver(200,"boss",60154564L,04564L,"Sliver",10);
        System.out.println(s1);
        System.out.println(s1.equals(p1));
    }
    
    
}
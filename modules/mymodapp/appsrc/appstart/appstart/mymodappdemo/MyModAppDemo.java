package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;

public class MyModAppDemo {
    public static void main(String[] args) {
        if(SupportFuncs.isFactor(2, 10))
            System.out.println("2 is a factor of 10");

        System.out.println("Smallest factor common to both 35 and 105 is " +
                            SimpleMathFuncs.lcf(35, 105));

        System.out.println("Largest factor common to both 35 and 105 is " +
                            SimpleMathFuncs.gcf(35, 105));

        Module myMod = MyModAppDemo.class.getModule();
        System.out.println("Module is " + myMod.getName());

        System.out.print("Packages: ");
        for(String pkg : myMod.getPackages())
            System.out.println(pkg + " ");
    }
}
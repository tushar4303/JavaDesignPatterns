package com.BridgePattern;

public class Assemble  implements WorkShop{
    @Override
    public void make() {
        System.out.print("..also");
        System.out.println("Assembled");
    }
}

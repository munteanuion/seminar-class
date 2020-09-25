package com.company;

public class Main
{

    public static void main(String[] args)
    {
	Student ans = new Student( "Ion", 20, "CIM");
    telefon mob = new telefon("Meizu", 2016, 4000);
        System.out.println(ans.printst());
        System.out.println(mob.printtel());
        ans.setName("Sorin");
        mob.setMarca("Xioami");
        System.out.println(ans.printst());
        System.out.println(mob.printtel());
    }
}

package com.qagenic.training;

public class BranchingSwitchCaseExample {
    public static String getCompleteBrowserNameUsingIfElse(String browsernameShort) {
        if (browsernameShort.equals("f") || browsernameShort.equalsIgnoreCase("ff"))
            return "Firefox";
        else if (browsernameShort.equalsIgnoreCase("c"))
            return "Chrome";
        else if (browsernameShort.equalsIgnoreCase("s"))
            return "Safari";
        else
            return "Edge";
    }

    public static String getCompleteBrowserNameUsingSwitch(String browsernameShort){

        switch (browsernameShort.toLowerCase()) {
            case "f":
            case "ff":
                System.out.println("This is test");
                return "Firefox";
            case "c":
            case "cr":
                return "Chrome";
            case "s":
            case "sf":
                return "Safari";
            default:
                return "Edge";
        }

    }
}

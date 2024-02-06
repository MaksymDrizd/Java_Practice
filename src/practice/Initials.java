package practice;

import java.util.Arrays;

public class Initials {

    public static void main(String[] args) {

        String name = "   mona lisa Great ";
        name = name.trim().toUpperCase();
        //String[] initials = name.split(" ");
        //initials[name] = name.charAt(0) + "." +
        //System.out.println(Arrays.toString(initials));

        System.out.println(name.charAt(0) + "." + name.charAt(name.lastIndexOf(" ") + 1) + ".");

        /* name = name.replace(name,name.substring(0,1) + ".") +
                name.replace(name,name.substring(name.lastIndexOf(" ")
                        + 1, name.lastIndexOf(" ") + 2) + ".");
        System.out.println(name);

        */



    }
}/*
        String firstInitial = name.replace(name.substring(0, name.length()), name.toUpperCase().substring(0, 1)),
                secondInitial = name.replace(name.substring(0, name.length()), name.toUpperCase().substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2));
        System.out.println(firstInitial + "." + secondInitial + ".");
         */

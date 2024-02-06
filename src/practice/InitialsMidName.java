package practice;

public class InitialsMidName {

    public static void main(String[] args) {

        String name = "  mike tyson  ";
        name = name.trim().toUpperCase();

        if (name.indexOf(" ") == name.lastIndexOf(" ")){
            System.out.println(name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1) + ".");
        }else if (name.indexOf(" ") != name.lastIndexOf(" ")){
            System.out.println(name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1) + "." + name.charAt(name.lastIndexOf(" ") + 1) + ".");
        }
    }

}

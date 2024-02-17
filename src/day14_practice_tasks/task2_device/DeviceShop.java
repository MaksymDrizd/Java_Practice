package day14_practice_tasks.task2_device;

public class DeviceShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","15Pro",1100,"Silver","6.2 inches",true,true);
        Samsung samsung = new Samsung("Samsung","Galaxy 8",800,"Black","7 inches",true,true);
        Google google = new Google("Google","Pixel 8",300,"Yellow","5 inches",true,true);

        Desktop desktop = new Desktop("Asus","Rog",1200,"Black","20 inches",false,true);
        Laptop laptop = new Laptop("Acer","Stealth",2700,"Gray","17 inches",true,true);


        System.out.println(iphone);
        iphone.turnOn();
        iphone.turnOff();
        iphone.call(124_234_5255);
        iphone.text(135_643_3266);
        iphone.downloadApp();
        System.out.println(iphone.OS());
        System.out.println(iphone.AppStoreName());
        System.out.println("---------------------------");

        System.out.println(samsung);
        samsung.turnOn();
        samsung.turnOff();
        samsung.call(123_235_2356);
        samsung.text(152_366_5235);
        samsung.downloadApp();
        System.out.println(samsung.OS());
        System.out.println(samsung.AppStoreName());
        System.out.println("---------------------------------------");

        System.out.println(google);
        google.turnOn();
        google.turnOff();
        google.call(134_623_2325);
        google.text(164_234_2366);
        google.downloadApp();
        System.out.println("----------------------------");

        System.out.println(desktop);
        desktop.turnOn();
        desktop.turnOff();
        System.out.println("----------------------");

        System.out.println(laptop);
        laptop.turnOn();
        laptop.turnOff();

    }

}

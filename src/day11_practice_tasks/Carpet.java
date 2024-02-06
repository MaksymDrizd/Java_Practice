package day11_practice_tasks;

public class Carpet {

    public double width,length,unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calCost(){
        double totalCost = (width * length) * unitPrice;
        totalCost = isPersian == true ? totalCost + 200 : totalCost;
        return totalCost;
        }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost= $" + calCost() +
                '}';
    }
}

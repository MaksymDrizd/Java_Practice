package day13_practice_tasks.state_task;

public class Texas extends State{

    private String capital;

    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population, String capital) {
        super(name, abbreviation, politicalParty, governor, senator, population);
        this.capital = capital;
    }
    public void founded(){
        System.out.println(getName() + "Founded : March 2, 1836");
    }

    @Override
    public String toString() {
        return super.toString() + "capital='" + capital + '\'' +
                "} ";
    }
}

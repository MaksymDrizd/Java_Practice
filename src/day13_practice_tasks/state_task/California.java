package day13_practice_tasks.state_task;

public class California extends State{

    private String capital;

    public California(String name, String abbreviation, String politicalParty, String governor, String senator, int population, String capital) {
        super(name, abbreviation, politicalParty, governor, senator, population);
        this.capital = capital;
    }
    public void founded(){
        System.out.println(getName() + "Founded : September 9, 1850.");
    }

    @Override
    public String toString() {
        return super.toString() + "capital='" + capital + '\'' +
                "} ";
    }
}

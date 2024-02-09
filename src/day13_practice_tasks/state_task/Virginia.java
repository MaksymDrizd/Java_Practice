package day13_practice_tasks.state_task;

public class Virginia extends State{
    private String capital;

    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population, String capital) {
        super(name, abbreviation, politicalParty, governor, senator, population);
        this.capital = capital;
    }
    public void founded(){
        System.out.println(getName() + "Founded :  May 14, 1607");
    }

    @Override
    public String toString() {
        return super.toString() + "capital='" + capital + '\'' +
                "} ";
    }
}

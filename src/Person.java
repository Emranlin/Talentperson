public class Person {
    private String name;
    private String designation;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
    public Person(String name,String designation){
        this.name=name;
        this.designation=designation;
    }
    public void learn(){
        System.out.println(name+ " is learn English");
    }
    public void work(){
        System.out.println(name+ " work at the " +designation);
    }
    public void eat(){
        System.out.println(name+ " eat breakfast at seven o'clock in "+designation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

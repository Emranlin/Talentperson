public class Dancer extends Person{
    public String groupName;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public Dancer( String name,String designation,String groupName){
        super(name,designation);
        this.groupName=groupName;
    }

    public void dancing(){
        System.out.println("He is the best dancer of his "+groupName);

    }
}

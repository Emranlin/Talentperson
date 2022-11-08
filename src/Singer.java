public class Singer extends Person{
    private String bandName;

    public void setBandName(String bandName) {
        this.bandName = bandName;

    }
    public String getBandName() {
        return bandName;
    }
    public Singer(String name,String designation,String bandName){
                  super(name,designation);
                  this.bandName=bandName;
    }

    public void singing(){
        System.out.println("He is the best singer of the " +bandName);

    }
    public void playGitar(){
        System.out.println("Also he can play the gitar before coming the company "+ bandName);

    }

}

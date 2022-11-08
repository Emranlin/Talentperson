public class Main {
    public static void main(String[] args) {
        Programmer programmer=new Programmer("Zhiidegul Zhalilova","Kyrgyzstan ","Google");
        System.out.println(programmer.getName() +"\n"+programmer.getDesignation()+"\n"+programmer.getCompanyName());
        programmer.learn();
        programmer.work();
        programmer.eat();
        programmer.coding();
        System.out.println(programmer.toString());
        System.out.println();



        Dancer dancer=new Dancer("Atai Omuzakov","Kyrgyzstan","Tumar KG Group");
        System.out.println(dancer.getName()+"\n"+dancer.getDesignation()+"\n"+dancer.getGroupName());
        dancer.learn();
        dancer.work();
        dancer.eat();
        dancer.dancing();
        System.out.println(dancer.toString());
        System.out.println();


        Singer singer=new Singer("Bruno Mars","USA","Jesika Caben");
        System.out.println(singer.getName()+"\n"+singer.getDesignation()+"\n"+singer.getBandName());
        singer.learn();
        singer.work();
        singer.eat();
        singer.singing();
        singer.playGitar();
        System.out.println(singer.toString());
        System.out.println();
    }
}
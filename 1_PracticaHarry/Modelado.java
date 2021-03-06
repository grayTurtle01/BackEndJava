class Personaje{
    String name;
    String house;
    String gender;
    String patronus;
    String boggart;

    public Personaje(String name, String house, String gender, String patronus, String boggart){
        this.name = name;
        this.house = house;
        this.gender = gender;
        this.patronus = patronus;
        this.boggart = boggart;
    }

    public Personaje(String name, String house, String gender){
        this.name = name;
        this.house = house;
        this.gender = gender;
        this.patronus = "?";
        this.boggart = "?";
    }

    

    public String toString(){
        return String.format("Name: %s \nHouse: %s \nGender: %s \nPatronus: %s \nBoggart: %s \n",
                             name, house, gender, patronus, boggart);
    }

    public void setPatronus(String patronus){
        this.patronus = patronus;
    }

    public String getPatronus(String patronus){
        return patronus;
    }

    public void setBoggart(String boggart){
        this.boggart = boggart;
    }

    public String getBoggart(String boggart){
        return boggart;
    }
}

public class Modelado{
    
    public static void main(String[] args){
        Personaje harry = new Personaje("Harry Potter", "Gryffindor", "Male", "Ciervo", "Dementor");
        Personaje hermione = new Personaje("Hermione Granger", "Gryffindor", "Female", "Nutria", "McGonagall");
        Personaje ron = new Personaje("Ron Weasley", "Gryffindor", "Male", "Jack Russell Terrier", "Araña");
        Personaje luna = new Personaje("Luna Lovegood", "Ravenclaw", "Female", "Liebre", "?");
        Personaje draco = new Personaje("Draco Malfoy", "Slytherin", "Male", "?", "?");
        draco.setBoggart("Voldemort");
       
        System.out.println(harry);
        System.out.println(hermione);
        System.out.println(ron);
        System.out.println(luna);
        System.out.println(draco);
        
    }
}

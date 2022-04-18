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

    public String toString(){
        return String.format("%s | %s | %s | %s | %s",
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
        Personaje harry = new Personaje("Harry", "Gryffindor", "Male", "Ciervo", "Dementor");
       
        System.out.println(harry);
        
    }
}

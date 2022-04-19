class Champion{
    String name;
    String role;
    String description;
    String difficulty;

    public Champion(String name, String role, String description, String difficulty){
        this.name = name;
        this.role = role;
        this.description = description;
        this.difficulty = difficulty;
    }

    public String showMessage(){
        return "name: " + name + "\n" +
               "role: " + role + "\n" +
               "difficulty: " + difficulty + "\n" +
               "description: " + description; 
     }
}

public class Interfaces{

    public static void main(String[] args){
        Champion ashe = new Champion("Ashe", "mid", "Frost Archer", "moderate" );
        System.out.println(ashe.showMessage());
    }
}

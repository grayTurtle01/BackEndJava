public class Champion{
    String name;
    String role;
    String description;
    String difficulty;
    String image;

    String firstMove;
    String secondMove;
    String thirdMove;
    String ultimate;
    String pasive;

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

interface Moves{
    void pasive();
    void firstMove_Q();
    void secondMove_W();
    void thirdMove_E();
    void ultimate_R();
}



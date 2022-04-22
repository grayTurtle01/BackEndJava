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

    public String firstMove_Q(){
        return "";
    }

    public String secondMove_W(){
        return "";
    }

    public String thirdMove_E(){
        return "";
    }

    public String ultimate_R(){
        return "";
    }
}

interface Moves{
    void pasive();
    String firstMove_Q();
    String secondMove_W();
    String thirdMove_E();
    String ultimate_R();
}



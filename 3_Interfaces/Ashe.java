interface AsheMoves{
    void frostShot();
    void hawkShot();
    //~ void thirdMove_E();
    //~ void ultimate_R();
    //~ void pasive();
}

public class Ashe extends Champion implements Moves{
    
    public Ashe(String name, String role, String description, String difficulty){
        super( name,  role,  description,  difficulty);
        firstMove = "Frost Shot";
        secondMove = "Hawk Shot";
        thirdMove = "Ranger Focus";
        ultimate = "Crystal Arrow";
    }

    public void firstMove_Q(){
        System.out.println(firstMove + ": Lanza una flecha");
    }

    public void secondMove_W(){
        System.out.println(secondMove + ": Lanza una un alcón ");
    }

    public void frostShot(){
        System.out.println("Lanzó una flecha");
    }

    public void hawkShot(){
        System.out.println("Lanzó un alcón");
    }
}


interface AsheMoves{
    void frostShot();
    void hawkShot();
    //~ void thirdMove_E();
    //~ void ultimate_R();
    //~ void pasive();
}

public class Ashe extends Champion implements AsheMoves{
    
    public Ashe(String name, String role, String description, String difficulty){
        super( name,  role,  description,  difficulty);
    }

    public void frostShot(){
        System.out.println("Lanzó una flecha");
    }

    public void hawkShot(){
        System.out.println("Lanzó un alcón");
    }
}


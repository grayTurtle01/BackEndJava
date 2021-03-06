class Octocat{
    String description;
    String name;
    String skin_color;
    int arms;

    public Octocat(){
        description = "A black cat with five octupuss arms";
        name = "Mona";
        skin_color = "black";
        arms = 5;
    }

    public void greet(){
        System.out.println("Hello my name is " + name );
        System.out.println("I am a " + description);
    }

    public void move(){
        System.out.println("I am holding one arm up");
    }
    
}

class DinoCat extends Octocat{

    public DinoCat(){
        super();
        name = "DinoCat";
        description = "An octocat wearing a dino-pijama";

    }

    public void move(){
        System.out.println("I am crushing one bug");
    }
}

class UmbrellaCat extends Octocat{
    String[] accessories = {"umbrella"}; 


    public UmbrellaCat(){
        super();
        name = "UmbrellaCat";
        description = "An octocat with an umbrella";

    }

    public void move(){
        System.out.println("I am jumping over puddle");
    }
}

class FilmToCat extends Octocat{
    String[] accessories = {"camera", "mic", "glasses"}; 


    public FilmToCat(){
        super();
        name = "filmToCat";
        description = "An octocat with glasses, a camera and mic";

    }

    public void move(){
        System.out.println("I am filming you");
    }
}



public class Polimorfismo{

    public static void main(String[] args){
        Octocat mona = new Octocat();
        mona.greet();
        mona.move();
        System.out.println();

        DinoCat dino = new DinoCat();
        dino.greet();
        dino.move();
        System.out.println();

        UmbrellaCat umbrella = new UmbrellaCat();
        umbrella.greet();
        umbrella.move();
        System.out.println();

        FilmToCat film = new FilmToCat();
        film.greet();
        film.move();
        System.out.println();
        
        
    }
}

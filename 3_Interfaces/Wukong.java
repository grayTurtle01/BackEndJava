
public class Wukong extends Champion implements Moves{
    
    public Wukong(){
        super( "Wukong",  "Luchador",  "El Rey Mono",  "Baja");

        pasive = "Piel de Piedra";
        firstMove = "Golpe Aplastante";
        secondMove = "Guerrero Pícaro";
        thirdMove = "Golpe de Nimbo";
        ultimate = "Ciclón";
        image = "Wukong.jpg";
    }

    public void pasive(){
        System.out.println(pasive + ": \n\n\tGana armadura y se regenera mientras lucha.");
    }

    public String firstMove_Q(){
        return firstMove + ": \n\n\tAumenta el daño y el alcance del próximo ataque";
    }

    public String secondMove_W(){
        return secondMove + ": \n\n\tSe vuleve invisible y deja un clon que ataca";
    }

    public String thirdMove_E(){
        return thirdMove + ": \n\n\tSe lanaza y crea clones atacantes";
    }

    public String ultimate_R(){
        return ultimate + ": \n\n\tGana velocidad y manda a los cielos a los enemigos";
    }

    public String toString(){
        return name + " : " + description;
    }

    public void showMoves(){
        System.out.println("Moves: ");
        pasive();
        firstMove_Q();
        secondMove_W();
        thirdMove_E();
        ultimate_R();
    }

}


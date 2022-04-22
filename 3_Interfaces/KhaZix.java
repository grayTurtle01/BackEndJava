
public class KhaZix extends Champion implements Moves{
    
    public KhaZix(){
        super( "KhaZix",  "Asesino",  "El Saqueador del Vacio",  "Moderate");

        pasive = "Amenaza Invisible";
        firstMove = "Saborea su Miedo";
        secondMove = "Pincho del Vacio";
        thirdMove = "Salto";
        ultimate = "Asalto del Vacio";
        image = "KhaZix.jpg";
    }

    public void pasive(){
        System.out.println(pasive + ": \n\n\t");
    }

    public String firstMove_Q(){
        return firstMove + ": \n\n\tAumenta el daño en objetivos aislados";
    }

    public String secondMove_W(){
        return secondMove + ": \n\n\tLanza Pinchos explosivos";
    }

    public String thirdMove_E(){
        return thirdMove + ": \n\n\tSe lanaza a una zona infligiendo daño al aterrizar";
    }

    public String ultimate_R(){
        return ultimate + ": \n\n\tPermite Evolucionar una de sus habilidades";
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


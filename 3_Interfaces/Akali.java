
public class Akali extends Champion implements Moves{
    
    public Akali(){
        super( "Akali",  "Asesino",  "Asesina Furtiva",  "Moderate");

        pasive = "Marca de la Asesina";
        firstMove = "Ráfaga de los 5 filos";
        secondMove = "Manto Crepuscular";
        thirdMove = "Maniobra de Shuriken";
        ultimate = "Ejecución Perfecta";
        image = "akali.jpg";
    }

    public void pasive(){
        System.out.println(pasive + ": \n\n\tAumenta el daño en el próximo ataque");
    }

    public String firstMove_Q(){
        return firstMove + ": \n\n\tLanza 5 kunais que relantizan";
    }

    public String secondMove_W(){
        return secondMove + ": \n\n\tCrea un anillo de humo donde gana invisibilidad";
    }

    public String thirdMove_E(){
        return thirdMove + ": \n\n\tArroja un shoriken con el que puede marcar al enemigo";
    }

    public String ultimate_R(){
        return ultimate + ": \n\n\tEnviste a un enemigo, se lanza otra vez";
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


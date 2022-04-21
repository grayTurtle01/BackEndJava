
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
        System.out.println(pasive + ": Aumenta el daño en el próximo ataque");
    }

    public void firstMove_Q(){
        System.out.println(firstMove + ": Lanza 5 kunais que relantizan");
    }

    public void secondMove_W(){
        System.out.println(secondMove + ": Crea un anillo de humo donde gana invisibilidad");
    }

    public void thirdMove_E(){
        System.out.println(thirdMove + ": Arroja un shoriken con el que puede marcar al enemigo");
    }

    public void ultimate_R(){
        System.out.println(ultimate + ": Enviste a un enemigo, se lanza otra vez");
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


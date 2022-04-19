
public class LeeSin extends Champion implements Moves{
    
    public LeeSin(){
        super( "LeeSin",  "Luchador",  "Monje Ciego",  "Moderate");

        pasive = "Ráfaga";
        firstMove = "Onda Sónica";
        secondMove = "Salvaguarda";
        thirdMove = "Tempestad";
        ultimate = "Furia de Dragón";
    }

    public void pasive(){
        System.out.println(pasive + ": Después de utlizar una habilidad, sus 2 siguientes ataques reciben velocidad");
    }

    public void firstMove_Q(){
        System.out.println(firstMove + ": Lanza una onda sónica");
    }

    public void secondMove_W(){
        System.out.println(secondMove + ": Coloca un escudo en un aliado");
    }

    public void thirdMove_E(){
        System.out.println(thirdMove + ": Revela enemigos en una area");
    }

    public void ultimate_R(){
        System.out.println(ultimate + ": Patea un enemigo, proyectándolo en linea recta");
    }

}


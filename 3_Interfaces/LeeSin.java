
public class LeeSin extends Champion implements Moves{
    
    public LeeSin(){
        super( "LeeSin",  "Luchador",  "Monje Ciego",  "Moderate");

        pasive = "Ráfaga";
        firstMove = "Onda Sónica";
        secondMove = "Salvaguarda";
        thirdMove = "Tempestad";
        ultimate = "Furia de Dragón";
        image = "leeSin.jpg";
    }

    public void pasive(){
        System.out.println(pasive + ": \n\n\tDespués de utlizar una habilidad, sus 2 siguientes ataques reciben velocidad");
    }

    public String firstMove_Q(){
        return firstMove + ": \n\n\tLanza una onda sónica";
    }

    public String secondMove_W(){
        return secondMove + ": \n\n\tColoca un escudo en un aliado";
    }

    public String thirdMove_E(){
        return thirdMove + ": \n\n\tRevela enemigos en una area";
    }

    public String ultimate_R(){
        return ultimate + ": \n\n\tPatea un enemigo, proyectándolo en linea recta";
    }

}


public class Ashe extends Champion implements Moves{
    
    public Ashe(){
        super( "Ashe",  "Mid",  "Frost Archer",  "Moderate");

        pasive = "Tiro Escarchado";
        firstMove = "Concentración de la Guardabosques";
        secondMove = "Descarga";
        thirdMove = "Tiro de Alcón";
        ultimate = "Flecha de Cristal";
        image = "ashe.png";
    }

    public void pasive(){
        System.out.println(pasive + ": Las flechas relentizan");
    }

    public String firstMove_Q(){
        return firstMove + ": \n\n\tAumenta la velocidad de ataque";
    }

    public String secondMove_W(){
        return secondMove + ": \n\n\tDispara un cono de flechas";
    }

    public String thirdMove_E(){
        return thirdMove + ": \n\n\tEnvia un alcón exploratorio";
    }

    public String ultimate_R(){
        return ultimate + ": \n\n\tLaza una flecha gigante que aturde";
    }

}


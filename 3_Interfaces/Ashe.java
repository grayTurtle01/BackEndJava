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

    public void firstMove_Q(){
        System.out.println(firstMove + ": Aumenta la velocidad de ataque");
    }

    public void secondMove_W(){
        System.out.println(secondMove + ": Dispara un cono de flechas");
    }

    public void thirdMove_E(){
        System.out.println(thirdMove + ": Envia un alcón exploratorio");
    }

    public void ultimate_R(){
        System.out.println(ultimate + ": Laza una flecha gigante que aturde");
    }

}


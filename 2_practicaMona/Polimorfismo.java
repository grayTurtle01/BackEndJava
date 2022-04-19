class Octocat{
    String name;
    String skin_color;
    int arms;

    public Octocat(){
        name = "Mona";
        skin_color = "black";
        arms = 5;
    }

    public void greet(){
        System.out.println("Hello my name is " + name);
    }
    
}

public class Polimorfismo{

    public static void main(String[] args){
        Octocat mona = new Octocat();
        mona.greet();
    }
}

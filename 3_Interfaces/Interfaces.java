import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Screen extends JFrame{
    Ashe ashe = new Ashe();
    LeeSin lee = new LeeSin();
    Akali akali = new Akali(); 


    public Screen(){
        super("Interfaces");
        setSize(500, 700);
        setVisible(true);

        String path = ashe.image;
        ImageIcon icon = new ImageIcon("images/"+path);    
        add( new JLabel(icon));

        show();
    }

    
} 


public class Interfaces{

    public static void main(String[] args){

        Screen s = new Screen();
    }
}

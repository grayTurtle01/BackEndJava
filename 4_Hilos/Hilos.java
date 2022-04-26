import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


class Ventana extends JFrame{
    ImageIcon icon;
    JLabel image;

    
    public Ventana(){
        super("Comic");
        setSize(500, 500);
        setVisible(true);

        icon = new ImageIcon("images_large/ashe.png");
        image = new JLabel(icon);

        add(image);

        show();
    }
}

public class Hilos{

    public static void main(String[] args){
        Ventana v = new Ventana();
    }
}

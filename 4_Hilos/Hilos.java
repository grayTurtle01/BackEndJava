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

    static ImageIcon newIcon;
    String[] fileNames = {"KhaZix.jpg", "akali.jpg"};

    public static void main(String[] args) throws InterruptedException{
        Ventana v = new Ventana();

        Thread.sleep(1000);
        newIcon = new ImageIcon("images_large/KhaZix.jpg");
        v.image.setIcon(newIcon);


        Thread.sleep(1000);
        newIcon = new ImageIcon("images_large/akali.jpg");
        v.image.setIcon(newIcon);
        
    }
}

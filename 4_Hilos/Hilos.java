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


    public static void main(String[] args) throws InterruptedException{
        Ventana v = new Ventana();
        ImageIcon newIcon;
        String[] fileNames = {"KhaZix.jpg", "akali.jpg", "leeSin.jpg", "Wukong.jpg", "Sett.jpg", "Annie.jpg"};

        for(String fileName : fileNames){
            Thread.sleep(1500);
            newIcon = new ImageIcon("images_large/"+fileName);
            v.image.setIcon(newIcon);
        }

        //~ System.exit(0);

    }
}

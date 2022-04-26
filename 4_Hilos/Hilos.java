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
        //~ String[] fileNames = {"KhaZix.jpg", "akali.jpg", "leeSin.jpg", "Wukong.jpg", "Sett.jpg", "Annie.jpg"};
        //~ String directory = "images_large/";
        String directory = "mafalda/";
        String[] fileNames = {"mafalda01.png", "mafalda02.png", "mafalda03.png", "mafalda04.png"};
        

        //~ for(String fileName : fileNames){
        String fileName = "";
        for(int i = 1; i <= 8; i++){
            fileName = "mafalda0"+i+".png";
            Thread.sleep(3000);
            newIcon = new ImageIcon(directory + fileName);
            v.image.setIcon(newIcon);
        }

        //~ System.exit(0);

    }
}

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Screen extends JFrame implements ActionListener{ 
    Ashe ashe = new Ashe();
    LeeSin leeSin = new LeeSin();
    Akali akali = new Akali(); 

    Champion[] champions = { ashe, leeSin, akali};

    int index = 0;

    JLabel image;
    JButton next, prev;
    JLabel description;
    

    public Screen(){
        super("Ashe");
        setSize(500, 700);
        setVisible(true);

        JPanel panel = new JPanel();

        JPanel upperPanel = new JPanel();

        String path = ashe.image;
        ImageIcon icon = new ImageIcon("images/"+path);
        image = new JLabel(icon);

        prev = new JButton("Prev");
        prev.addActionListener(this);

        next = new JButton("Next");
        next.addActionListener(this);

        
        panel.add(prev);
        panel.add(image);
        panel.add(next);



        description = new JLabel(ashe.description);
        panel.add(description);
        
        add( panel);
        show();
    }

    public void actionPerformed(ActionEvent e){
        if( e.getSource() == next )
            index++;

        if( e.getSource() == prev )
            index--;


        if( index >= champions.length )
            index = 0;

        if( index < 0 )
            index = champions.length - 1;

        
        Champion champ = champions[index];
        String fileName = champ.image;
        ImageIcon newIcon = new ImageIcon("images/"+fileName); 
        image.setIcon(newIcon);

        description.setText( champ.description);
        
        setTitle(champ.name);
    }
} 


public class Interfaces{

    public static void main(String[] args){

        Screen s = new Screen();
    }
}

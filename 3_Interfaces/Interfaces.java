import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

class Screen extends JFrame implements ActionListener{ 
    Ashe ashe = new Ashe();
    LeeSin leeSin = new LeeSin();
    Akali akali = new Akali(); 

    Champion[] champions = { ashe, leeSin, akali};

    int index = 0;

    JLabel image;
    JButton next, prev;
    JLabel description;

    JButton q, w, e, r;
    JTextArea move;

    public Screen(){
        super("Ashe");
        setSize(500, 550);
        setVisible(true);

        JPanel panel = new JPanel( new BorderLayout() );

        JPanel upperPanel = new JPanel();

        String path = ashe.image;
        ImageIcon icon = new ImageIcon("images/"+path);
        image = new JLabel(icon);

        prev = new JButton("Prev");
        prev.addActionListener(this);

        next = new JButton("Next");
        next.addActionListener(this);

        
        upperPanel.add(prev);
        upperPanel.add(image);
        upperPanel.add(next);
        

        panel.add( upperPanel, BorderLayout.NORTH );

        // Central Panel
        JPanel centralPanel = new JPanel( new GridLayout(2,1));
        description = new JLabel(ashe.description);
        description.setHorizontalAlignment( JLabel.CENTER );

        JLabel role = new JLabel("Role: ");
        role.setHorizontalAlignment( JLabel.CENTER );

        centralPanel.add(description);
        //~ centralPanel.add(role);
        panel.add(centralPanel);
        

        

        // bottom Panel
        JPanel bottomPanel = new JPanel();

        q = new JButton("Q");
        q.addActionListener(this);
        w = new JButton("W");
        e = new JButton("E");
        r = new JButton("R");

        bottomPanel.add(q);
        bottomPanel.add(w);
        bottomPanel.add(e);
        bottomPanel.add(r);

        move = new JTextArea("hello", 10, 40);
        bottomPanel.add(move);

        panel.add(bottomPanel, BorderLayout.SOUTH);
        
        add( panel );
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

        description.setText( champ.description );
        setTitle(champ.name);

        if( e.getSource() == q ){
            move.setText(champ.firstMove_Q());
        }
        
    }
} 


public class Interfaces{

    public static void main(String[] args){

        Screen s = new Screen();
    }
}

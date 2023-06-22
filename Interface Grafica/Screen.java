import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen extends JFrame implements ActionListener {
    
    public Screen() {
        setTitle("Maxwell Adventure");
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false); - isso impede o usurario de mudar o tamanho da janela 
        setLocationRelativeTo(null); //Centraliza a janela
        setLayout(null);
        JButton jButton = new JButton("Iniciar");
        jButton.setBounds(100,200,200,70);
        jButton.setFont(new Font("Arial",Font.BOLD, 20));;
        jButton.setBackground(new Color(240,240,230));
        add(jButton);
        jButton.addActionListener(this);









    }

    
    public void actionPerformed(ActionEvent e) {
        
    }   
}
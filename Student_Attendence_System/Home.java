import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    Home(){
        JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER,250,25));
        
        JButton b2=new JButton("Admin");
        // Increase width and height of button b2
        b2.setPreferredSize(new Dimension(150, 50));
        p1.add(b2); 
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b2) {
                    AdminLout ad=new AdminLout();
                    ad.setSize(1800,820);
                    ad.setLocationRelativeTo(null);
                    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ad.setVisible(true);
                    ad.setResizable(false);
                    dispose();
                }
            }
        });
        
        JButton b3=new JButton("Faculty");
        // Increase width and height of button b3
        b3.setPreferredSize(new Dimension(150, 50));
        p1.add(b3); 
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b3) {
                    FacLout ad=new FacLout();
                    ad.setSize(1800,820);
                    ad.setLocationRelativeTo(null);
                    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ad.setVisible(true);
                    ad.setResizable(false);
                    dispose();
                }
            }
        });
        
        JButton b4=new JButton("Student");
        // Increase width and height of button b4
        b4.setPreferredSize(new Dimension(150, 50));
        p1.add(b4); 
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b4) {
                    StudLout ad=new StudLout();
                    ad.setSize(1800,820);
                    ad.setLocationRelativeTo(null);
                    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ad.setVisible(true);
                    ad.setResizable(false);
                    dispose();
                }
            }
        });
    
        JPanel p2=new JPanel();
        p2.setLayout(null);
        ImageIcon ic=new ImageIcon("C:\\Users\\HP\\Desktop\\project\\Attendance_System\\Attendance-Management-System-master\\1\\Img.jpg");
        JLabel l1=new JLabel(ic);
        l1.setBounds(0,0,1600,800);
        p2.add(l1);
        
        
        setLayout(null);
        p1.setBounds(0,0,1600,400);
        p2.setBounds(0,0,1600,1100);
        add(p1);
        add(p2);
		p2.add(p1);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
}


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Main {
    
    public static void main(String[] args) {
        JFrame frame=new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLayout(null);
        frame.setVisible(true);
        
        JButton button=new JButton("New Game");
        button.setBounds(200,200,100,50);
        
        frame.add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new JavaApplication();
            }
        });
    }
}

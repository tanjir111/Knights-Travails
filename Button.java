
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
public class Button {
    private ImageIcon img = new ImageIcon(getClass().getResource("knight1.png"));
    private ImageIcon Start = new ImageIcon(getClass().getResource("START.png"));
    private ImageIcon End = new ImageIcon(getClass().getResource("END.png"));
    private ImageIcon Wrong = new ImageIcon(getClass().getResource("Wrong.png"));
    private int i,j,k,s,x=0,y=0,p,q;//visit;
    private int[] visit;
    public JPanel panel;
    public JButton[][] b;
    public JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    public JButton b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    public JButton b20,b21,b22,b23,b24,b25,b26,b27,b28,b29;
    public JButton b30,b31,b32,b33,b34,b35,b36,b37,b38,b39;
    public JButton b40,b41,b42,b43,b44,b45,b46,b47,b48,b49;
    public JButton b50,b51,b52,b53,b54,b55,b56,b57,b58,b59;
    public JButton b60,b61,b62,b63;
    Button(){
        Nights_Travails n1=new Nights_Travails();
        n1.NIghts_Travails();
        System.out.println("b "+n1.adj[0][0]);
        System.out.println(n1.adj[1][0]);
        System.out.println("f= "+n1.f);
        int start=n1.adj[0][0];
        int end=n1.adj[n1.f][0];
        
        b0=new JButton();
        b0.setBounds(0, 0, 50, 50);
        
        b1=new JButton();
        b1.setBounds(50, 0, 50, 50);
        
        b2=new JButton();
        b2.setBounds(100, 0, 50, 50);
        
        b3=new JButton();
        b3.setBounds(150, 0, 50, 50);
        
        b4=new JButton();
        b4.setBounds(200, 0, 50, 50);
        
        b5=new JButton();
        b5.setBounds(250, 0, 50, 50);
        
        b6=new JButton();
        b6.setBounds(300, 0, 50, 50);
        
        b7=new JButton();
        b7.setBounds(350, 0, 50, 50);
        
        b8=new JButton();
        b8.setBounds(0, 50, 50, 50);
        
        b9=new JButton();
        b9.setBounds(50, 50, 50, 50);
        
        b10=new JButton();
        b10.setBounds(100, 50, 50, 50);
        
        b11=new JButton();
        b11.setBounds(150, 50, 50, 50);
        
        b12=new JButton();
        b12.setBounds(200, 50, 50, 50);
        
        b13=new JButton();
        b13.setBounds(250, 50, 50, 50);
        
        b14=new JButton();
        b14.setBounds(300, 50, 50, 50);
        
        b15=new JButton();
        b15.setBounds(350, 50, 50, 50);
        
        b16=new JButton();
        b16.setBounds(0, 100, 50, 50);
        
        b17=new JButton();
        b17.setBounds(50, 100, 50, 50);
        
        b18=new JButton();
        b18.setBounds(100, 100, 50, 50);
        
        b19=new JButton();
        b19.setBounds(150, 100, 50, 50);
        
        b20=new JButton();
        b20.setBounds(200, 100, 50, 50);
        
        b21=new JButton();
        b21.setBounds(250, 100, 50, 50);
        
        b22=new JButton();
        b22.setBounds(300, 100, 50, 50);
        
        b23=new JButton();
        b23.setBounds(350, 100, 50, 50);
        
        b24=new JButton();
        b24.setBounds(0, 150, 50, 50);
        
        b25=new JButton();
        b25.setBounds(50, 150, 50, 50);
        
        b26=new JButton();
        b26.setBounds(100, 150, 50, 50);
        
        b27=new JButton();
        b27.setBounds(150, 150, 50, 50);
        
        b28=new JButton();
        b28.setBounds(200, 150, 50, 50);
        
        b29=new JButton();
        b29.setBounds(250, 150, 50, 50);
        
        b30=new JButton();
        b30.setBounds(300, 150, 50, 50);
        
        b31=new JButton();
        b31.setBounds(350, 150, 50, 50);
        
        b32=new JButton();
        b32.setBounds(0, 200, 50, 50);
        
        b33=new JButton();
        b33.setBounds(50, 200, 50, 50);
        
        b34=new JButton();
        b34.setBounds(100, 200, 50, 50);
        
        b35=new JButton();
        b35.setBounds(150, 200, 50, 50);
        
        b36=new JButton();
        b36.setBounds(200, 200, 50, 50);
        
        b37=new JButton();
        b37.setBounds(250, 200, 50, 50);
        
        b38=new JButton();
        b38.setBounds(300, 200, 50, 50);
        
        b39=new JButton();
        b39.setBounds(350, 200, 50, 50);
        
        b40=new JButton();
        b40.setBounds(0, 250, 50, 50);
        
        b41=new JButton();
        b41.setBounds(50, 250, 50, 50);
        
        b42=new JButton();
        b42.setBounds(100, 250, 50, 50);
        
        b43=new JButton();
        b43.setBounds(150, 250, 50, 50);
        
        b44=new JButton();
        b44.setBounds(200, 250, 50, 50);
        
        b45=new JButton();
        b45.setBounds(250, 250, 50, 50);
        
        b46=new JButton();
        b46.setBounds(300, 250, 50, 50);
        
        b47=new JButton();
        b47.setBounds(350, 250, 50, 50);
        
        b48=new JButton();
        b48.setBounds(0, 300, 50, 50);
        
        b49=new JButton();
        b49.setBounds(50, 300, 50, 50);
        
        b50=new JButton();
        b50.setBounds(100, 300, 50, 50);
        
        b51=new JButton();
        b51.setBounds(150, 300, 50, 50);
        
        b52=new JButton();
        b52.setBounds(200, 300, 50, 50);
        
        b53=new JButton();
        b53.setBounds(250, 300, 50, 50);
        
        b54=new JButton();
        b54.setBounds(300, 300, 50, 50);
        
        b55=new JButton();
        b55.setBounds(350, 300, 50, 50);
        
        b56=new JButton();
        b56.setBounds(0, 350, 50, 50);
        
        b57=new JButton();
        b57.setBounds(50, 350, 50, 50);
        
        b58=new JButton();
        b58.setBounds(100, 350, 50, 50);
        
        b59=new JButton();
        b59.setBounds(150, 350, 50, 50);
        
        b60=new JButton();
        b60.setBounds(200, 350, 50, 50);
        
        b61=new JButton();
        b61.setBounds(250,350, 50, 50);
        
        b62=new JButton();
        b62.setBounds(300, 350, 50, 50);
        
        b63=new JButton();
        b63.setBounds(350, 350, 50, 50);
              
        switch(start){
            case 0:b0.setIcon(Start);
                break;
            case 1:b1.setIcon(Start);
                break;
            case 2:b2.setIcon(Start);
                break;
            case 3:b3.setIcon(Start);
                break;
            case 4:b4.setIcon(Start);
                break;
            case 5:b5.setIcon(Start);
                break;
            case 6:b6.setIcon(Start);
                break;
            case 7:b7.setIcon(Start);
                break;
            case 8:b8.setIcon(Start);
                break;
            case 9:b9.setIcon(Start);
                break;
            case 10:b10.setIcon(Start);
                break;
            case 11:b11.setIcon(Start);
                break;
            case 12:b12.setIcon(Start);
                break;
            case 13:b13.setIcon(Start);
                break;
            case 14:b14.setIcon(Start);
                break;
            case 15:b15.setIcon(Start);
                break;
            case 16:b16.setIcon(Start);
                break;
            case 17:b17.setIcon(Start);
                break;
            case 18:b18.setIcon(Start);
                break;
            case 19:b19.setIcon(Start);
                break;
            case 20:b20.setIcon(Start);
                break;
            case 21:b21.setIcon(Start);
                break;
            case 22:b22.setIcon(Start);
                break;
            case 23:b23.setIcon(Start);
                break;
            case 24:b24.setIcon(Start);
                break;
            case 25:b25.setIcon(Start);
                break;
            case 26:b26.setIcon(Start);
                break;
            case 27:b27.setIcon(Start);
                break;
            case 28:b28.setIcon(Start);
                break;
            case 29:b29.setIcon(Start);
                break;
            case 30:b30.setIcon(Start);
                break;
            case 31:b31.setIcon(Start);
                break;
            case 32:b32.setIcon(Start);
                break;
            case 33:b33.setIcon(Start);
                break;
            case 34:b34.setIcon(Start);
                break;
            case 35:b35.setIcon(Start);
                break;
            case 36:b36.setIcon(Start);
                break;
            case 37:b37.setIcon(Start);
                break;
            case 38:b38.setIcon(Start);
                break;
            case 39:b39.setIcon(Start);
                break;
            case 40:b40.setIcon(Start);
                break;
            case 41:b41.setIcon(Start);
                break;
            case 42:b42.setIcon(Start);
                break;
            case 43:b43.setIcon(Start);
                break;
            case 44:b44.setIcon(Start);
                break;
            case 45:b45.setIcon(Start);
                break;
            case 46:b46.setIcon(Start);
                break;
            case 47:b47.setIcon(Start);
                break;
            case 48:b48.setIcon(Start);
                break;
            case 49:b49.setIcon(Start);
                break;
            case 50:b50.setIcon(Start);
                break;
            case 51:b51.setIcon(Start);
                break;
            case 52:b52.setIcon(Start);
                break;
            case 53:b53.setIcon(Start);
                break;
            case 54:b54.setIcon(Start);
                break;
            case 55:b55.setIcon(Start);
                break;
            case 56:b56.setIcon(Start);
                break;
            case 57:b57.setIcon(Start);
                break;
            case 58:b58.setIcon(Start);
                break;
            case 59:b59.setIcon(Start);
                break;
            case 60:b60.setIcon(Start);
                break;
            case 61:b61.setIcon(Start);
                break;
            case 62:b62.setIcon(Start);
                break;
            case 63:b63.setIcon(Start);
        }
        switch(end){
            case 0:b0.setIcon(End);
                break;
            case 1:b1.setIcon(End);
                break;
            case 2:b2.setIcon(End);
                break;
            case 3:b3.setIcon(End);
                break;
            case 4:b4.setIcon(End);
                break;
            case 5:b5.setIcon(End);
                break;
            case 6:b6.setIcon(End);
                break;
            case 7:b7.setIcon(End);
                break;
            case 8:b8.setIcon(End);
                break;
            case 9:b9.setIcon(End);
                break;
            case 10:b10.setIcon(End);
                break;
            case 11:b11.setIcon(End);
                break;
            case 12:b12.setIcon(End);
                break;
            case 13:b13.setIcon(End);
                break;
            case 14:b14.setIcon(End);
                break;
            case 15:b15.setIcon(End);
                break;
            case 16:b16.setIcon(End);
                break;
            case 17:b17.setIcon(End);
                break;
            case 18:b18.setIcon(End);
                break;
            case 19:b19.setIcon(End);
                break;
            case 20:b20.setIcon(End);
                break;
            case 21:b21.setIcon(End);
                break;
            case 22:b22.setIcon(End);
                break;
            case 23:b23.setIcon(End);
                break;
            case 24:b24.setIcon(End);
                break;
            case 25:b25.setIcon(End);
                break;
            case 26:b26.setIcon(End);
                break;
            case 27:b27.setIcon(End);
                break;
            case 28:b28.setIcon(End);
                break;
            case 29:b29.setIcon(End);
                break;
            case 30:b30.setIcon(End);
                break;
            case 31:b31.setIcon(End);
                break;
            case 32:b32.setIcon(End);
                break;
            case 33:b33.setIcon(End);
                break;
            case 34:b34.setIcon(End);
                break;
            case 35:b35.setIcon(End);
                break;
            case 36:b36.setIcon(End);
                break;
            case 37:b37.setIcon(End);
                break;
            case 38:b38.setIcon(End);
                break;
            case 39:b39.setIcon(End);
                break;
            case 40:b40.setIcon(End);
                break;
            case 41:b41.setIcon(End);
                break;
            case 42:b42.setIcon(End);
                break;
            case 43:b43.setIcon(End);
                break;
            case 44:b44.setIcon(End);
                break;
            case 45:b45.setIcon(End);
                break;
            case 46:b46.setIcon(End);
                break;
            case 47:b47.setIcon(End);
                break;
            case 48:b48.setIcon(End);
                break;
            case 49:b49.setIcon(End);
                break;
            case 50:b50.setIcon(End);
                break;
            case 51:b51.setIcon(End);
                break;
            case 52:b52.setIcon(End);
                break;
            case 53:b53.setIcon(End);
                break;
            case 54:b54.setIcon(End);
                break;
            case 55:b55.setIcon(End);
                break;
            case 56:b56.setIcon(End);
                break;
            case 57:b57.setIcon(End);
                break;
            case 58:b58.setIcon(End);
                break;
            case 59:b59.setIcon(End);
                break;
            case 60:b60.setIcon(End);
                break;
            case 61:b61.setIcon(End);
                break;
            case 62:b62.setIcon(End);
                break;
            case 63:b63.setIcon(End);
                break;

        }

        s=1;
        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==0){
                        b0.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b0.setIcon(Wrong);
                    }
                }
            }
        });
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==1){
                        b1.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b1.setIcon(Wrong);
                    }
                }
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==2){
                        b2.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b2.setIcon(Wrong);
                    }
                }
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==3){
                        b3.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b3.setIcon(Wrong);
                    }
                }
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==4){
                        b4.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b4.setIcon(Wrong);
                    }
                }
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==5){
                        b5.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b5.setIcon(Wrong);
                    }
                }
            }
        });
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==6){
                        b6.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b6.setIcon(Wrong);
                    }
                }
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==7){
                        b7.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b7.setIcon(Wrong);
                    }
                }
            }
        });
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==8){
                        b8.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b8.setIcon(Wrong);
                    }
                }
            }
        });
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==9){
                        b9.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b9.setIcon(Wrong);
                    }
                }
            }
        });
        b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==10){
                        b10.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b10.setIcon(Wrong);
                    }
                }
            }
        });
        b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==11){
                        b11.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b11.setIcon(Wrong);
                    }
                }
            }
        });
        b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==12){
                        b12.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b12.setIcon(Wrong);
                    }
                }
            }
        });
        b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==13){
                        b13.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b13.setIcon(Wrong);
                    }
                }
            }
        });
        b14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==14){
                        b14.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b14.setIcon(Wrong);
                    }
                }
            }
        });
        b15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==15){
                        b15.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b15.setIcon(Wrong);
                    }
                }
            }
        });
        b16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==16){
                        b16.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b16.setIcon(Wrong);
                    }
                }
            }
        });
        b17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==17){
                        b17.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b17.setIcon(Wrong);
                    }
                }
            }
        });
        b18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==18){
                        b18.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b18.setIcon(Wrong);
                    }
                }
            }
        });
        b19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==19){
                        b19.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b19.setIcon(Wrong);
                    }
                }
            }
        });
        b20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==20){
                        b20.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b20.setIcon(Wrong);
                    }
                }
            }
        });
        b21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==21){
                        b21.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b21.setIcon(Wrong);
                    }
                }
            }
        });
        b22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==22){
                        b22.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b22.setIcon(Wrong);
                    }
                }
            }
        });
        b23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==23){
                        b23.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b23.setIcon(Wrong);
                    }
                }
            }
        });
        b24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==24){
                        b24.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b24.setIcon(Wrong);
                    }
                }
            }
        });
        b25.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==25){
                        b25.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b25.setIcon(Wrong);
                    }
                }
            }
        });
        b26.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==26){
                        b26.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b26.setIcon(Wrong);
                    }
                }
            }
        });
        b27.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==27){
                        b27.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b27.setIcon(Wrong);
                    }
                }
            }
        });
        b28.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==28){
                        b28.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b28.setIcon(Wrong);
                    }
                }
            }
        });
        b29.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==29){
                        b29.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b29.setIcon(Wrong);
                    }
                }
            }
        });
        b30.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==30){
                        b30.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b30.setIcon(Wrong);
                    }
                }
            }
        });
        b31.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==31){
                        b31.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b31.setIcon(Wrong);
                    }
                }
            }
        });
        b32.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==32){
                        b32.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b32.setIcon(Wrong);
                    }
                }
            }
        });
        b33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==33){
                        b33.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b33.setIcon(Wrong);
                    }
                }
            }
        });
        b34.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==34){
                        b34.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b34.setIcon(Wrong);
                    }
                }
            }
        });
        b35.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==35){
                        b35.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b35.setIcon(Wrong);
                    }
                }
            }
        });
        b36.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==36){
                        b36.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b36.setIcon(Wrong);
                    }
                }
            }
        });
        b37.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==37){
                        b37.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b37.setIcon(Wrong);
                    }
                }
            }
        });
        b38.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==38){
                        b38.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b38.setIcon(Wrong);
                    }
                }
            }
        });
        b39.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==39){
                        b39.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b39.setIcon(Wrong);
                    }
                }
            }
        });
        b40.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==40){
                        b40.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b40.setIcon(Wrong);
                    }
                }
            }
        });
        b41.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==41){
                        b41.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b41.setIcon(Wrong);
                    }
                }
            }
        });
        b42.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==42){
                        b42.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b42.setIcon(Wrong);
                    }
                }
            }
        });
        b43.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==43){
                        b43.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b43.setIcon(Wrong);
                    }
                }
            }
        });
        b44.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==44){
                        b44.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b44.setIcon(Wrong);
                    }
                }
            }
        });
        b45.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==45){
                        b45.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b45.setIcon(Wrong);
                    }
                }
            }
        });
        b46.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==46){
                        b46.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b46.setIcon(Wrong);
                    }
                }
            }
        });
        b47.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==47){
                        b47.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b47.setIcon(Wrong);
                    }
                }
            }
        });
        b48.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==48){
                        b48.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b48.setIcon(Wrong);
                    }
                }
            }
        });
        b49.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==49){
                        b49.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b49.setIcon(Wrong);
                    }
                }
            }
        });
        b50.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==50){
                        b50.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b50.setIcon(Wrong);
                    }
                }
            }
        });
        b51.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==51){
                        b51.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b51.setIcon(Wrong);
                    }
                }
            }
        });
        b52.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==52){
                        b52.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b52.setIcon(Wrong);
                    }
                }
            }
        });
        b53.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==53){
                        b53.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b53.setIcon(Wrong);
                    }
                }
            }
        });
        b54.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==54){
                        b54.setIcon(img);
                        s+=1;
                        break;
                    }
        	else{
                        b54.setIcon(Wrong);
                    }
                }
            }
        });
        b55.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==55){
                        b55.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b55.setIcon(Wrong);
                    }
                }
            }
        });
        b56.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==56){
                        b56.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b56.setIcon(Wrong);
                    }
                }
            }
        });
        b57.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==57){
                        b57.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b57.setIcon(Wrong);
                    }
                }
            }
        });
        b58.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==58){
                        b58.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b58.setIcon(Wrong);
                    }
                }
            }
        });
        b59.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==59){
                        b59.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b59.setIcon(Wrong);
                    }
                }
            }
        });
        b60.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==60){
                        b60.setIcon(img);
                        s+=1;
                        break;
                    }
					else{
                        b60.setIcon(Wrong);
                    }
                }
            }
        });
        b61.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==61){
                        b61.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b61.setIcon(Wrong);
                    }
                }
            }
        });
        b62.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==62){
                        b62.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b62.setIcon(Wrong);
                    }
                }
            }
        });
        b63.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                for(j=0;j<10;j++){
                    if(n1.adj[s][j]==63){
                        b63.setIcon(img);
                        s+=1;
                        break;
                    }
                    else{
                        b63.setIcon(Wrong);
                    }
                }
            }
        });
        
    }
}


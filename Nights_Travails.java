import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Random;
public class Nights_Travails {
    public int[][] adj=new int[64][10];
    public int f;
    public void NIghts_Travails() {
        Random random=new Random();
        Queue<Integer> q= new LinkedList<>();
        Scanner input=new Scanner(System.in);
        int[][] board=new int[10][10];
        
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board[i][j]=99999;
            }
        }
        for(int i=0;i<64;i++){
            for(int j=0;j<10;j++){
                adj[i][j]=0;
            }
        }
        int[] xaxis={2,1,-1,-2,-2,-1,1,2};
        int[] yaxis={1,2,2,1,-1,-2,-2,-1};
        int[] Weight=new int[100];
        int x=random.nextInt(7);
        int y=random.nextInt(7);
        System.out.println("x= "+x+"y= "+y);
        int s=(x*8)+y;
        board[x][y]=0;
        q.add(s);
        Weight[s]=0;
        int n,k;
        
        while(!q.isEmpty()){
            n=q.poll();
            //k=Weight[s];
            x=n/8;
            y=n%8;
            k=board[x][y];
            for(int i=0;i<8;i++){
                if((x+xaxis[i])<8 & (x+xaxis[i])>=0 & (y+yaxis[i])<8 & (y+yaxis[i])>=0){
                    if( board[x+xaxis[i]][y+yaxis[i]]>(Weight[((x+xaxis[i])*8)+(y+yaxis[i])])+1){
                        s=((x+xaxis[i])*8)+(y+yaxis[i]);
                        Weight[s]=k+1;
                        board[x+xaxis[i]][y+yaxis[i]]=Weight[s];
                        q.add(s);  
                    }
                }
            }
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<64;i++){
            System.out.print(Weight[i]+" ");
        }
        int a=random.nextInt(7);
        int b=random.nextInt(7);
        System.out.println("a= "+a+"b= "+b);
        int w=board[a][b];
        s=(a*8)+b;
        q.add(s);
        k=0;
        f=w;
        adj[w][k]=s;
        while(!q.isEmpty()){
            n=q.poll();
            k=0;
            a=n/8;
            b=n%8;
            w=board[a][b];
            
            System.out.println(a+"-->"+b+ "  "+board[a][b]);
            for(int i=0;i<8;i++){
                if((a+xaxis[i])<8 & (a+xaxis[i])>=0 & (b+yaxis[i])<8 & (b+yaxis[i])>=0){
                    if( board[a+xaxis[i]][b+yaxis[i]]<w){
                        s=((a+xaxis[i])*8)+(b+yaxis[i]);
                        q.add(s);
                        adj[w-1][k]=s;
                        k+=1;
                    }
                }
            }
            
            
        }
        for(int i=0;i<f;i++){
            k=0;
            n=1;
            while(k<n){
                if(adj[i][k]!=0){
                    System.out.println(adj[i][k]);
                    k+=1;
                    n+=1;
                }
                else{
                    n-=1;
                }
            }
        }
        
    } 
}

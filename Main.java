import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class TicTakToe implements ActionListener
{
Random r=new Random();
JFrame frame=new JFrame();
JPanel titlepanel=new JPanel();
JPanel buttonpanel=new JPanel();
JLabel textfield=new JLabel();
JButton[] buttons=new JButton[9];
boolean gamer1;
TicTakToe()
{
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(800,800);
frame.getContentPane().setBackground(new Color(50,50,50));
frame.setLayout(new BorderLayout());
frame.setVisible(true);
textfield.setBackground(new Color(25,25,25));
textfield.setForeground(new Color(25,255,0));
textfield.setFont(new Font("Ink Free",Font.BOLD,75));
textfield.setHorizontalAlignment(JLabel.CENTER);
textfield.setText("TIK_TAK_TOE");
textfield.setOpaque(true);
titlepanel.setLayout(new BorderLayout());
titlepanel.setBounds(0,0,800,100);
buttonpanel.setLayout(new GridLayout(3,3));
buttonpanel.setBackground(new Color(150,150,150));
for(int i=0;i<9;i++)
{
buttons[i]=new JButton();
buttonpanel.add(buttons[i]);
buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
buttons[i].setFocusable(false);
buttons[i].addActionListener(this);
}
titlepanel.add(textfield);
frame.add(titlepanel,BorderLayout.NORTH);
frame.add(buttonpanel);
frame.setTitle("HARIPRIYA TIK_TAK_TOE");
titlepanel.add(textfield);
firstTurn();
}
public void actionPerformed(ActionEvent e)
{
for(int i=0;i<9;i++)
{
if(e.getSource()==buttons[i])
{
if(gamer1)
{
if(buttons[i].getText()=="")
{
buttons[i].setForeground(new Color(255,0,0));
buttons[i].setText("X");
gamer1=false;
textfield.setText("O TURN");
check();
}
}
else
{
if(buttons[i].getText()=="")
{
buttons[i].setForeground(new Color(255,0,0));
buttons[i].setText("O");
gamer1=true;
textfield.setText("X TURN");
check();
}
}
}
}
}
public void firstTurn()
{
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
//checking for randomly generated number 
}
if(r.nextInt(2)==0)
{
gamer1=true;
textfield.setText("X TURN");
}	
}
public void check()
{
    //checking the winning conditions
if((buttons[0].getText()=="X")&&(buttons[1].getText()=="X")&&(buttons[2].getText()=="X"))
{
XWins(0,1,2);
}
if((buttons[0].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[8].getText()=="X"))
{
XWins(0,4,8);
}
if((buttons[0].getText()=="X")&&(buttons[3].getText()=="X")&&(buttons[6].getText()=="X"))
{
XWins(0,3,6);
}
if((buttons[2].getText()=="X")&&(buttons[5].getText()=="X")&&(buttons[8].getText()=="X"))
{
XWins(2,5,8);
}
if((buttons[6].getText()=="X")&&(buttons[7].getText()=="X")&&(buttons[8].getText()=="X"))
{
XWins(6,7,8);
}
if((buttons[3].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[5].getText()=="X"))
{
XWins(3,4,5);
}
if((buttons[2].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[6].getText()=="X"))
{
XWins(2,4,6);
}
if((buttons[1].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[7].getText()=="X"))
{
XWins(1,4,7);
}

if((buttons[0].getText()=="O")&&(buttons[1].getText()=="O")&&(buttons[2].getText()=="O"))
{
OWins(0,1,2);
}
if((buttons[0].getText()=="O")&&(buttons[4].getText()=="O")&&(buttons[8].getText()=="O"))
{
OWins(0,4,8);
}
if((buttons[0].getText()=="O")&&(buttons[3].getText()=="O")&&(buttons[6].getText()=="O"))
{
OWins(0,3,6);
}
if((buttons[2].getText()=="O")&&(buttons[5].getText()=="O")&&(buttons[8].getText()=="O"))
{
OWins(2,5,8);
}
if((buttons[6].getText()=="O")&&(buttons[7].getText()=="O")&&(buttons[8].getText()=="O"))
{
OWins(6,7,8);
}
if((buttons[3].getText()=="O")&&(buttons[4].getText()=="O")&&(buttons[5].getText()=="O"))
{
OWins(3,4,5);
}
if((buttons[2].getText()=="O")&&(buttons[4].getText()=="O")&&(buttons[6].getText()=="O"))
{
OWins(2,4,6);
}
if((buttons[1].getText()=="O")&&(buttons[4].getText()=="O")&&(buttons[7].getText()=="O"))
{
OWins(1,4,7);
}

}
public void XWins(int a,int b,int c)
{
buttons[a].setBackground(Color.RED);
buttons[b].setBackground(Color.RED);
buttons[c].setBackground(Color.RED);
for(int i=0;i<9;i++)
{
buttons[i].setEnabled(false);
}
textfield.setText("X WINS");
}
public void OWins(int a,int b,int c)
{
buttons[a].setBackground(Color.RED);
buttons[b].setBackground(Color.RED);
buttons[c].setBackground(Color.RED);
for(int i=0;i<9;i++)
{
buttons[i].setEnabled(false);
}
textfield.setText("O WINS");
}
}

public class Main
{
public static void main(String[] args)
{
//creating an object for TicTacToe class
TicTakToe tictactoe=new TicTakToe();
}
}
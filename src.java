import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import jav.awt.Dimension;
import javax.swing.JLabel;

class Login extends Template implements ActionListener , Runnable 
{
    JButton SUBMIT ; 
    JLABEL label1 , label2 , label3 , TopLabel ; 
    final JTextFeild , text1 , text2 ;
    private static int attemp = 3 ; 

    Login()
    {
        TopLabel = new JLabel();
        TopLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
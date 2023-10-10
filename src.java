import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;

class Login extends Template implements ActionListener , Runnable 
{
    JButton SUBMIT ; 
    JLabel label1 , label2 , label3 , TopLabel ; 
    final JTextField text1 , text2 ;
    private static int attemp = 3 ; 

    Login()
    {
        TopLabel = new JLabel();
        TopLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TopLabel.setText("File Packer Unpacker : Login ");
        TopLabel.setForeground(Color.BLUE);

        Dimension topsize = TopLabel.getPreferredSize();
        TopLabel.setBounds(50 , 40 , topsize.width , topsize.height);
        _header.add(TopLabel);

        label1 = newJLabel();
        label1.setText("User Name : ");
        label1.setForeground(Color.WHITE);

        Dimension size = label1.getPreferredSize();
        text1.setBounds(200 , 135 , tsize.wifth , tsize.height);

        text1.setToolTopText("ENTER USERNAME");

        label2 = new JLabel();
        label2.setText("Password :" );
        label2.setBounds(50 , 175 , size.width , size.height);
        label2.setForeground(Color.white);
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        text2 = new JPasswordField();
        text2.setBounds( 200  , 175 ,tsize.width , tsize.height);
        text2.ToolTipText("Enter Password");

        text2.addFocusListener(new FocusListener()
        {
            public void focusGained(FocusEvent e )
            {

            }
            public void focusLost( FocusEvent e)
            {
                label3.setText("");
            }
        });

        SUBMIT = new JButton("SUBMIT");
        SUBMIT.setHorizontalAlignment(SwingConstants.CENTER);

        Dimension ssize = SUBMIT.getPreferredSize();

        SUBMIT.setBounds(50 , 220 , ssize.width , ssize.height);

        label3 = new JLabel();
        label3.setText("");
        
        Dimension l3size = label3.getPreferredSize();

        label3.setForeground(Color.RED);
        label3.setBounds(50 , 250 , l3size.width , l3size.height);

        Thread t = new Tread(this);
        t.start();

        _content.add(label1);
        _content.add(text1);

        _content.add (label2);
        _content.add(text2);

        _content.add(label3);
        _content.add(SUBMIT);

        pack();
        validate();

        ClockHome();
        setVisible(true);
        this.setsize(500 , 500);
        this.setResizble(false);
            setLocationRelativeTo(null);
            SUBMIT.addActionListener(this);
    }

    public boolean Validate(String Username , String Password)
    {
        if (Username.length() < 8 || (Password.length() < 8))
        {
            return false;
        }
        else 
        {
            return true;
        }
    }

    public void actionPerformed(ActionEvent ae)
    {
        String value1 = text1.getText();
        String value2 = text2.getText();

        if (ae.getSource() == exit)
        {
            this.setVisible(fasle);
            System.exit(0);
        }

        if (ae.getSource() == minimize)
        {
            this.setState(this.ICONIFIED);
        }
    }
}

class src
{
    public static void main(String args[])
    {
        
    }
}
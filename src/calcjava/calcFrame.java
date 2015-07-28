

package calcjava;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class calcFrame extends JFrame
{
    JTextField screen = new JTextField(10);
    private char operator;
    private int total1;
    boolean flag = true;
    
    public calcFrame()
    {    
        initComponents();    
    }

    private void initComponents()
    {
        JPanel gui = new JPanel(new BorderLayout(5,5));
        // add some padding to the main GUI
        gui.setBorder(new EmptyBorder(4,4,4,4));
        
        JPanel clear = new JPanel();
        
        
        gui.add(screen, BorderLayout.NORTH);
        
        JFrame frame = new JFrame("CALCULATOR");
        frame.setContentPane(gui);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add padding around the buttons
        JPanel panelButtons = new JPanel(new GridLayout(3,3,4,4));
        
        JButton zeroButton = new JButton("0");
        panelButtons.add(zeroButton);
        
        JButton oneButton = new JButton("1");
        panelButtons.add(oneButton);

        JButton twoButton = new JButton("2");
        panelButtons.add(twoButton);

        JButton threeButton = new JButton("3");
        panelButtons.add(threeButton);

        JButton fourButton = new JButton("4");
        panelButtons.add(fourButton);

        JButton fiveButton = new JButton("5");
        panelButtons.add(fiveButton);

        JButton sixButton = new JButton("6");
        panelButtons.add(sixButton);

        JButton sevenButton = new JButton("7");
        panelButtons.add(sevenButton);

        JButton eightButton = new JButton("8");
        panelButtons.add(eightButton);

        JButton nineButton = new JButton("9");
        panelButtons.add(nineButton);
        
        JButton plusButton = new JButton("+");
        panelButtons.add(plusButton);
        
        JButton subtractButton = new JButton("-");
        panelButtons.add(subtractButton);
        
        JButton multiButton = new JButton("*");
        panelButtons.add(multiButton);
        
        JButton divideButton = new JButton("/");
        panelButtons.add(divideButton);
        
        JButton equalButton = new JButton("=");
        panelButtons.add(equalButton);
        
        JButton clearButton = new JButton("CLEAR");
        clear.add(clearButton);
        
        gui.add(panelButtons, BorderLayout.CENTER);
        BoxLayout boxLayout1 = new BoxLayout(gui, BoxLayout.Y_AXIS);
        gui.setLayout(boxLayout1);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        
        gui.add(clear, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        frame.getRootPane().setDefaultButton(equalButton);
        
        zeroButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String Text = screen.getText() + zeroButton.getText();
                screen.setText( Text );
                
            } 
              
        }); 
        oneButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String Text = screen.getText() + oneButton.getText();
                screen.setText( Text );
                
            } 
              
        }); 
        twoButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String Text = screen.getText() + twoButton.getText();
                screen.setText( Text );
                
            } 
              
        }); 
        threeButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String Text = screen.getText() + threeButton.getText();
                screen.setText( Text );
                
            } 
              
        }); 
        fourButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String Text = screen.getText() + fourButton.getText();
                screen.setText( Text );
                
            } 
              
        }); 
        fiveButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String Text = screen.getText() + fiveButton.getText();
                screen.setText( Text );
                
            } 
              
        }); 
        sixButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String Text = screen.getText() + sixButton.getText();
                screen.setText( Text );
                
            } 
              
        }); 
        sevenButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String Text = screen.getText() + sevenButton.getText();
                screen.setText( Text );
                
            } 
              
        }); 
        eightButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String Text = screen.getText() + eightButton.getText();
                screen.setText( Text );
                
            } 
              
        }); 
        nineButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String Text = screen.getText() + nineButton.getText();
                screen.setText( Text );
                
            } 
              
        }); 
        plusButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String text = plusButton.getText();
                operator = text.charAt(0);
                
                if(flag)
                {
                    total1 = Integer.parseInt(screen.getText());
                    flag = false;
                }
                else
                {    
                    total1 = total1 + Integer.parseInt(screen.getText());
                }
                screen.setText("");
            } 
              
        }); 
        subtractButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String text = subtractButton.getText();
                operator = text.charAt(0);
                if(flag)
                {
                    total1 = Integer.parseInt(screen.getText());
                    flag = false;
                }
                else
                {    
                    total1 = total1 - Integer.parseInt(screen.getText());
                }
                screen.setText("");
                
            } 
              
        }); 
        multiButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String text = multiButton.getText();
                operator = text.charAt(0);
                
                if(flag)
                {
                    total1 = Integer.parseInt(screen.getText());
                    flag = false;
                }
                else
                {    
                    total1 = total1 * Integer.parseInt(screen.getText());
                }
                screen.setText("");
            } 
              
        }); 
        divideButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                String text = divideButton.getText();
                operator = text.charAt(0);
                
                if(flag)
                {
                    total1 = Integer.parseInt(screen.getText());
                    flag = false;
                }
                else
                { 
                    if(total1 == 0)
                    {
                        total1 = 0;
                        screen.setText("");
                        text = Integer.toString(total1);
                        screen.setText(text);
                    }
                    else
                    {    
                        total1 = total1 / Integer.parseInt(screen.getText());
                    }    
                }
                screen.setText("");
            } 
              
        });
        clearButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                total1 = 0;
                flag = true;
                screen.setText("");
                
            } 
              
        }); 
        equalButton.addActionListener(new ActionListener()     
        { 
           @Override 
            public void actionPerformed(ActionEvent event) 
            { 
                switch (operator)
                {
                    case '+':
                                total1 = total1 + Integer.parseInt(screen.getText( ) ) ;
                                screen.setText("");
                                String text = Integer.toString(total1);
                                screen.setText(text);
                                break;
                    case '-':
                                total1 = total1 - Integer.parseInt(screen.getText( ) ) ;
                                screen.setText("");
                                text = Integer.toString(total1);
                                screen.setText(text);
                                break;
                    case '/':   
                                if(total1 == 0)
                                {
                                    total1 = 0;
                                    screen.setText("");
                                    text = Integer.toString(total1);
                                    screen.setText(text);
                                }
                                else
                                    total1 = total1 / Integer.parseInt(screen.getText( ) ) ;
                                    screen.setText("");
                                    text = Integer.toString(total1);
                                    screen.setText(text);
                                break;
                    case '*':
                                total1 = total1 * Integer.parseInt(screen.getText( ) ) ;
                                screen.setText("");
                                text = Integer.toString(total1);
                                screen.setText(text);
                                break;
                    
                }    
            } 
              
        }); 
    } 
    
  
     
}
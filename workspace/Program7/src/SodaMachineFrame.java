import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

@SuppressWarnings("serial")
public class SodaMachineFrame extends JFrame
{  
   private static final int NICKEL = 5; 
   private static final int DIME = 10;
   private static final int QUARTER = 25;
   private static final int HALF_DOLLAR = 50;
   private static final int DOLLAR = 100;
   
   private JButton nickel, dime, quarter, halfDollar, dollar, coinReturn;   
   private double amountDeposited;
   private ArrayList<JButton> buttons = new ArrayList<JButton>();   
   
   public SodaMachineFrame(final SodaMachine machine)
   {
      amountDeposited = machine.getDeposits()/100;
      final NumberFormat USFormat = NumberFormat.getCurrencyInstance();
      
      //Do stuff with the soda button panel here.
      JPanel sodaButtons = new JPanel();
      sodaButtons.setLayout(new GridLayout(machine.getCount(), 1));
      for(int i = 0; i < machine.getCount(); i++)
      {
         JButton button = new JButton(machine.getSodaName(i));
         button.setEnabled(false);
         sodaButtons.add(button);
         buttons.add(button);
      }
      sodaButtons.setPreferredSize(new Dimension(150, 300));      
      sodaButtons.setBorder(new EtchedBorder());
      
      //Do stuff with the coin button panel here.
      JPanel coinButtons = new JPanel();
      coinButtons.setPreferredSize(new Dimension(150, 300));
      coinButtons.setLayout(new GridLayout(5, 1));      
      coinButtons.setBorder(new EtchedBorder());
      
      nickel = new JButton("Nickel");
      nickel.setEnabled(true);
      dime = new JButton("Dime");
      dime.setEnabled(true);
      quarter = new JButton("Quarter");
      quarter.setEnabled(true);
      halfDollar = new JButton("Half Dollar");
      halfDollar.setEnabled(true);
      dollar = new JButton("Dollar");
      dollar.setEnabled(true);
      
      coinButtons.add(nickel);
      coinButtons.add(dime);
      coinButtons.add(quarter);
      coinButtons.add(halfDollar);
      coinButtons.add(dollar);
      
      //Do stuff with the center panel here.
      JPanel numberFields = new JPanel();
      numberFields.setPreferredSize(new Dimension(150, 300));    
      numberFields.setLayout(new GridLayout(3, 1));         
      numberFields.setBorder(new EtchedBorder());
      
      //The stuff for the top panel in the center panel.
      JPanel deposit = new JPanel();
      JLabel depositLabel = new JLabel("Amount Deposited");
      
      final JTextField deposited = new JTextField(6);
      deposited.setText(USFormat.format(amountDeposited));
      deposited.setHorizontalAlignment(JLabel.RIGHT);
      deposited.setEditable(false);
      
      coinReturn = new JButton("Coin Return");
      coinReturn.setEnabled(false);
      
      deposit.add(depositLabel);
      deposit.add(deposited);
      deposit.add(coinReturn);
      deposit.setBorder(new EtchedBorder());
      
      //The stuff for the center panel in the center panel.
      JPanel changePanel = new JPanel();
      JLabel changeReturned = new JLabel("Change Returned");
      
      final JTextField changeText = new JTextField(6);
      changeText.setText(USFormat.format(amountDeposited));
      changeText.setHorizontalAlignment(JLabel.RIGHT);
      changeText.setEditable(false);
      
      changePanel.add(changeReturned);
      changePanel.add(changeText);
      changePanel.setBorder(new EtchedBorder());
      
      //The stuff for the bottom panel in the center panel.
      JPanel totalPanel = new JPanel();
      JLabel totalLabel = new JLabel("Total Sales");
      
      final JTextField totalText = new JTextField(6);
      totalText.setText(USFormat.format(amountDeposited));
      totalText.setHorizontalAlignment(JLabel.RIGHT);
      totalText.setEditable(false);
      
      totalPanel.add(totalLabel);
      totalPanel.add(totalText);
      totalPanel.setBorder(new EtchedBorder());
      
      //Adding stuff to the center panel.
      numberFields.add(deposit);
      numberFields.add(changePanel);
      numberFields.add(totalPanel);      
      
      //Adding the main content pane.
      JPanel contentPane = new JPanel();
      contentPane.setBorder(new EtchedBorder());
      contentPane.add(sodaButtons, BorderLayout.WEST);      
      contentPane.add(numberFields, BorderLayout.CENTER);
      contentPane.add(coinButtons, BorderLayout.EAST);
      
      class NickelListener implements ActionListener
      {         
         public void actionPerformed(ActionEvent event)
         {
            machine.deposit(NICKEL);
            deposited.setText(USFormat.format(((amountDeposited + machine.getDeposits())/100)));
            changeText.setText(USFormat.format(0));
            coinReturn.setEnabled(true);
            
            if(machine.sufficientFunds())
            {
               for(int i = 0; i < buttons.size(); i++)
               {
                  if(machine.getSodaCount(i) == 0)
                  {
                     buttons.get(i).setEnabled(false);
                  }
                  else
                  {
                     buttons.get(i).setEnabled(true);
                  }
               }
            }
         }        
      }
      nickel.addActionListener(new NickelListener());
      
      class DimeListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            machine.deposit(DIME);
            deposited.setText(USFormat.format((amountDeposited + machine.getDeposits())/100));
            changeText.setText(USFormat.format(0));
            coinReturn.setEnabled(true);
            
            if(machine.sufficientFunds())
            {
               for(int i = 0; i < buttons.size(); i++)
               {
                  if(machine.getSodaCount(i) == 0)
                  {
                     buttons.get(i).setEnabled(false);
                  }
                  else
                  {
                     buttons.get(i).setEnabled(true);
                  }
               }
            }
         }        
      }
      dime.addActionListener(new DimeListener());
      
      class QuarterListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            machine.deposit(QUARTER);
            deposited.setText(USFormat.format((amountDeposited + machine.getDeposits())/100));
            changeText.setText(USFormat.format(0));
            coinReturn.setEnabled(true);
            
            if(machine.sufficientFunds())
            {
               for(int i = 0; i < buttons.size(); i++)
               {
                  if(machine.getSodaCount(i) == 0)
                  {
                     buttons.get(i).setEnabled(false);
                  }
                  else
                  {
                     buttons.get(i).setEnabled(true);
                  }
               }
            }
         }        
      }
      quarter.addActionListener(new QuarterListener());
      
      class HalfDollarListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            machine.deposit(HALF_DOLLAR);
            deposited.setText(USFormat.format((amountDeposited + machine.getDeposits())/100));
            changeText.setText(USFormat.format(0));
            coinReturn.setEnabled(true);
            
            if(machine.sufficientFunds())
            {
               for(int i = 0; i < buttons.size(); i++)
               {
                  if(machine.getSodaCount(i) == 0)
                  {
                     buttons.get(i).setEnabled(false);
                  }
                  else
                  {
                     buttons.get(i).setEnabled(true);
                  }
               }
            }
         }        
      }
      halfDollar.addActionListener(new HalfDollarListener());
      
      class DollarListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            machine.deposit(DOLLAR);
            deposited.setText(USFormat.format((amountDeposited + machine.getDeposits())/100));
            changeText.setText(USFormat.format(0));
            coinReturn.setEnabled(true);
                        
            if(machine.sufficientFunds())
            {
               for(int i = 0; i < buttons.size(); i++)
               {
                  if(machine.getSodaCount(i) == 0)
                  {
                     buttons.get(i).setEnabled(false);
                  }
                  else
                  {
                     buttons.get(i).setEnabled(true);
                  }
               }
            }
         }        
      }
      dollar.addActionListener(new DollarListener());
      
      class ChangeReturnListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {  
            changeText.setText(USFormat.format((double)machine.returnDeposits()/100));
            deposited.setText(USFormat.format(0));            
            coinReturn.setEnabled(false);
            
            for(int i = 0; i < buttons.size(); i++)
            {
               buttons.get(i).setEnabled(false);
            }
         }
      }
      coinReturn.addActionListener(new ChangeReturnListener());
      
      for(int i = 0; i < buttons.size(); i++)
      {
         final int buttonCount = i;
         
         class SodaButtonListener implements ActionListener
         {            
            public void actionPerformed(ActionEvent event)
            {
               deposited.setText(USFormat.format(0));
               coinReturn.setEnabled(false);
               changeText.setText(USFormat.format((double)machine.dispenseSoda(buttonCount)/100));               
               totalText.setText(USFormat.format((double)machine.getSales()/100));
               
               for(int i = 0; i < buttons.size(); i++)
               {
                  buttons.get(i).setEnabled(false);
               }
            }
         }
         buttons.get(i).addActionListener(new SodaButtonListener());         
      }
      
      this.setContentPane(contentPane);      
      this.setResizable(false);
      this.pack();
   }
}

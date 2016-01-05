/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainForm;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author IT
 */
public class POSLogin extends javax.swing.JFrame {

  private final ImageIcon msgIcon;
  public static URL imgAdd;
  public static Color backgroundColor;
  public static String currentTill;
  public static String user = "";

  private final Map<String, String> credentials = initializeValues();
  private String validTillCodes;

  public POSLogin()
  {
    this.msgIcon = new ImageIcon(getClass().getResource("/alert.png"));

    initComponents();
    initComponents2();

    POSDatabase database = new POSDatabase();
    String colorCode = (String)database.getSettings().get("color");
    String[] RGB = colorCode.split("/");
    Color color = new Color(Integer.parseInt(RGB[0].trim()), Integer.parseInt(RGB[1].trim()), Integer.parseInt(RGB[2].trim()));
    backgroundColor = color;
    getContentPane().setBackground(color);
    setTitle(((String)database.settings.get("title")).trim());
    centerWindow(this);
    setIconImage(new ImageIcon(getClass().getResource("/frameIcon.png")).getImage());
    imgAdd = POSSplash.imgAddSplash;
    isPrintOffice = false;
    
    Action performEnter = new AbstractAction()
    {
      public void actionPerformed(ActionEvent e)
      {
        POSLogin.this.loginButton.doClick();
      }
    };
    this.loginButton.getInputMap(2).put(KeyStroke.getKeyStroke(10, 0), "keyPress");

    this.loginButton.getActionMap().put("keyPress", performEnter);
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        tillCode = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        loginLogo = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        printOfficeFlag = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, null, null), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51))));

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jLabel3.setText("Till Code:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dhtlogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        loginButton.setText("LOGIN");

        printOfficeFlag.setText("Print Office");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(printOfficeFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField)
                            .addComponent(tillCode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(usernameField)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tillCode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printOfficeFlag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponents2()
    {
      this.loginButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        POSLogin.this.loginButtonActionPerformed(evt);
      }
    });
    }

    public static boolean isPrintOffice;
    
    private void loginButtonActionPerformed(ActionEvent evt)
  {
      if (printOfficeFlag.isSelected())
          isPrintOffice = true;
      
    if ((!this.tillCode.getText().trim().isEmpty()) || (this.usernameField.getText().trim().equals("Admin")))
    {
      if ((this.tillCode.getText().trim().isEmpty()) && (this.usernameField.getText().trim().equals("Admin"))) {
        this.tillCode.setText("0");
      }

      currentTill = this.tillCode.getText().trim();

      if ((this.validTillCodes.contains(this.tillCode.getText().trim())) || (this.usernameField.getText().trim().equals("Admin")))
      {
        if (this.credentials.containsKey(this.usernameField.getText()))
        {
          String pass = new String(this.passwordField.getPassword());

          if (((String)this.credentials.get(this.usernameField.getText())).equals(pass))
          {
            user = this.usernameField.getText().trim();
            dispose();

            if (this.usernameField.getText().equals("Admin"))
            {
              int choice = JOptionPane.showConfirmDialog(null, "Do you wish to enter the settings menu?", "Admin Selection", 0, 1, this.msgIcon);
              
              if (choice == 0)
              {
                new POSLoadSettings();
              }
              else
              {
                EventQueue.invokeLater(new Runnable()
                {
                  public void run()
                  {
                    new POSMain().setVisible(true);
                  }
                });
              }

            }
            else
            {
              EventQueue.invokeLater(new Runnable()
              {
                public void run()
                {
                  new POSMain().setVisible(true);
                }

              });
            }

          }
          else
          {
            JOptionPane.showMessageDialog(null, "Your login or password is incorrect", "Invalid Login", 0, this.msgIcon);
          }
        }
        else {
          JOptionPane.showMessageDialog(null, "Your login or password is incorrect", "Invalid Login", 0, this.msgIcon);
        }
      }
      else JOptionPane.showMessageDialog(null, "That is not a valid till code", "Invalid Till Code", 0, this.msgIcon); 
    }
    else
    {
      JOptionPane.showMessageDialog(null, "Please enter a valid till code", "Invalid Till code", 0, this.msgIcon);
    }
    //dispose();
  }

  public static void centerWindow(Window frame)
  {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

    int x = (int)((dimension.getWidth() - frame.getWidth()) / 2.0D);
    int y = (int)((dimension.getHeight() - frame.getHeight()) / 2.0D);

    frame.setLocation(x, y);
  }

  private Map<String, String> initializeValues()
  {
    POSDatabase info = new POSDatabase();

    this.validTillCodes = ((String)info.getSettings().get("tillCode"));

    return info.readCredentials();
  }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox printOfficeFlag;
    private javax.swing.JTextField tillCode;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}

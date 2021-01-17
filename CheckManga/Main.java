import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
 
public class Main implements ActionListener {
 
   public Main() {
      initComponents();
   }
 
   private JFrame viewForm;
 
   private void initComponents() {
      viewForm = new JFrame("Проверка наличия новых глав");
      viewForm.setSize(235, 170);
      viewForm.setVisible(true);
      viewForm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
 
      JButton button1 = new JButton("Проверить");
      button1.setVisible(true);
      button1.setLocation(12, 12);
      button1.setSize(200, 50);
      button1.addActionListener(new ActionListener() {
 
         public void actionPerformed(ActionEvent e) {
            String msg = "Info";
            try {
				msg = FormInfo.formInfo();
			} catch (IOException e2) {
			}
			JOptionPane.showMessageDialog(viewForm, msg,
				      "Инфо", JOptionPane.WARNING_MESSAGE);
         }
 
      });
      viewForm.getContentPane().add(button1);
      viewForm.getContentPane().add(new JLabel());
      JButton button2 = new JButton("Записать новые настройки");
      button2.setVisible(true);
      button2.setLocation(12, 74);
      button2.setSize(200, 50);
      button2.addActionListener(new ActionListener() {
 
         public void actionPerformed(ActionEvent e) {
        	WriteSettings.writeSettings();
			JOptionPane.showMessageDialog(viewForm, "Настройки перезаписаны",
				      "Инфо", JOptionPane.WARNING_MESSAGE);
         }
 
      });
      viewForm.getContentPane().add(button2);
      viewForm.getContentPane().add(new JLabel());
   }
 
   public void actionPerformed(ActionEvent action) {
   }
 
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new Main();
         }
      });
   }
}
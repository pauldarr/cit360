package MVCViews;

//Call the import
import MVCControllers.*;

/**
*
* @author Paul Darr
*/
public class HelloWorldView extends javax.swing.JFrame {
 /**
	 * 
	 */
 private static final long serialVersionUID = 1L;
// Create the class for the Controller
 private HelloWorldController controller = new HelloWorldController();

 /**
  * Creates new form HelloWorldView
  */
 public HelloWorldView() {
     initComponents();
 }

 /**
  * This method is called from within the constructor to initialize the form.
  */
                        
 private void initComponents() {

     myLabel = new javax.swing.JLabel();
     loadData = new javax.swing.JButton();
     jScrollPane1 = new javax.swing.JScrollPane();
     myMessage = new javax.swing.JTextArea();
     writeData = new javax.swing.JButton();

     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
     setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
     setName("myFrame"); 

     myLabel.setText("Enter text, write data, and then load data to display here.");

     loadData.setText("Load Data");
     loadData.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
             loadDataMouseClicked(evt);
         }
     });

     myMessage.setColumns(20);
     myMessage.setRows(5);
     jScrollPane1.setViewportView(myMessage);

     writeData.setText("Write Data");
     writeData.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
             writeDataMouseClicked(evt);
         }
     });

     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addContainerGap()
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(layout.createSequentialGroup()
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(myLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                         .addComponent(jScrollPane1))
                     .addContainerGap())
                 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                     .addGap(0, 0, Short.MAX_VALUE)
                     .addComponent(loadData)
                     .addGap(158, 158, 158))))
         .addGroup(layout.createSequentialGroup()
             .addGap(154, 154, 154)
             .addComponent(writeData)
             .addGap(0, 0, Short.MAX_VALUE))
     );
     layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addContainerGap()
             .addComponent(myLabel)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(loadData)
             .addGap(39, 39, 39)
             .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(writeData)
             .addContainerGap(82, Short.MAX_VALUE))
     );

     pack();
 }// </editor-fold>                        

 private void loadDataMouseClicked(java.awt.event.MouseEvent evt) {                                      
     // TODO add your handling code here:
     try {
         String data = controller.getMessage();
         myLabel.setText(data);
         myLabel.setVisible(true);
     } catch (Exception er) {
         
     }
 }                                     

 private void writeDataMouseClicked(java.awt.event.MouseEvent evt) {                                       
     // TODO add your handling code here:
     String message = myMessage.getText();
     controller.writeMessage(message);
 }                                      

 /**
  * @param args the command line arguments
  */
 public static void main(String args[]) {
     try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
             if ("Nimbus".equals(info.getName())) {
                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
                 break;
             }
         }
     } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(HelloWorldView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(HelloWorldView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(HelloWorldView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(HelloWorldView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     //</editor-fold>

     /* Create and display the form */
     java.awt.EventQueue.invokeLater(new Runnable() {
         @Override
         public void run() {
             new HelloWorldView().setVisible(true);
         }
     });
 }

 // Variables declaration - do not modify                     
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JButton loadData;
 public javax.swing.JLabel myLabel;
 private javax.swing.JTextArea myMessage;
 private javax.swing.JButton writeData;
 // End of variables declaration                   
}
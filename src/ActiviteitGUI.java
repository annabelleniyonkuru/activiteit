import javax.swing.*;


public class ActiviteitGUI extends JFrame {
    private JPanel mainpanel;
    private JTextField activiteitTextfield;
    private JLabel naamLabel;
    private JRadioButton spelRadioButton;
    private JRadioButton uitstapRadioButton;
    private JRadioButton vrijeMomentRadioButton;
    private JFormattedTextField formattedTextField1;
    private JCheckBox checkBox1;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    private JCheckBox checkBox2;
    private JCheckBox checkBox3;





    public ActiviteitGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();
        this.setVisible(true);


    }


}

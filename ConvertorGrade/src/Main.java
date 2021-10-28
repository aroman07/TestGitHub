import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel rootPanel;
    private JTextArea txtCelsius;
    private JTextField txtInputCelsius;
    private JButton btnConvert;
    private JTextArea txtOutputFahrenheit;


    public Main() {
        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnConvert.setBackground(Color.blue);
                String grade = txtInputCelsius.getText();
                txtOutputFahrenheit.setBackground(Color.red);
                System.out.println(grade);
                if (grade.equals("")){
                    txtOutputFahrenheit.setText("Nu s-a introdus nimic");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Convertor");

        frame.setContentPane(new Main().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

	//test github
    }
}

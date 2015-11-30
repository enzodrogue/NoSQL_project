import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Pierre Marion on 30/11/2015.
 */
public class MainWindow extends JFrame{
    private JButton insert;
    private JButton delete;
    private JButton update;
    private JButton graph;
    private JButton requete;
    private JPanel panel;

    public MainWindow(){

        JFrame frame = new JFrame("ProjetNoSQL : WorldBank");
        frame.setContentPane(panel);
        //frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        requete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                requeteForm page2 = new requeteForm();

            }

        });
    }


}

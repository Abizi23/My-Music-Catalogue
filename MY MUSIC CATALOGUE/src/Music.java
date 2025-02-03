import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Music extends JFrame implements ActionListener {
    JButton S,E;
    public Music() {
        this.setTitle("My Music Catalogue");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(800, 400);
        this.setVisible(true);

        JLabel label1 = new JLabel("My Music Catalogue");
        label1.setFont(new Font("Arial", Font.BOLD, 23));
        this.add(label1, BorderLayout.NORTH);

        JPanel category = new JPanel(new GridLayout(3, 1, 0, 0));
        String categories[] = {"Rap", "Reggae", "Ballads"};
        JButton rap = new JButton("Rap");
        JButton reggae = new JButton("Reggae");
        JButton ballads = new JButton("Ballads");

        category.add(rap);
        category.add(reggae);
        category.add(ballads);

        this.add(category, BorderLayout.WEST);

        JPanel center = new JPanel(new GridLayout(4, 1, 0, 0));
        center.add(new JLabel("Artist Name:"));
        JTextField artist = new JTextField();
        center.add(artist);

        center.add(new JLabel("Recording Studio:"));
        JTextField studio = new JTextField();
        center.add(studio);

        center.add(new JLabel("Available:"));
        JCheckBox checkbox = new JCheckBox();
        center.add(checkbox);
        this.add(center, BorderLayout.CENTER);

        S = new JButton("SUBMIT");
        E = new JButton("Exit");
        E.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(S);
        panel.add(E);
        add(panel, BorderLayout.SOUTH);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == E) {
            System.exit(0);
        }
    }

}










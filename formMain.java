import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formMain extends JFrame{
    private JPanel panelMain;
    private JTextField textValueReturn;
    private JButton buttonD4;
    private JButton buttonD8;
    private JButton buttonD6;
    private JButton buttonD10;
    private JButton buttonD12;
    private JButton buttonD20;

    public formMain() {
        super("D&D Dice Roller");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        buttonD4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d4 = (int) (Math.random() * 5);
                if (d4 == 0) { textValueReturn.setText("1");
                } else {
                    textValueReturn.setText(Integer.toString(d4));
                }
            }

        });
        buttonD6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d6 = (int) (Math.random() * 7);
                if (d6 == 0) { textValueReturn.setText("1");
                } else {
                    textValueReturn.setText(Integer.toString(d6));
                }            }
        });
        buttonD8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d8 = (int) (Math.random() * 9);
                if (d8 == 0) { textValueReturn.setText("1");
                } else {
                    textValueReturn.setText(Integer.toString(d8));
                }            }
        });
        buttonD10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d10 = (int) (Math.random() * 11);
                if (d10 == 0) { textValueReturn.setText("1");
                } else {
                    textValueReturn.setText(Integer.toString(d10));
                }            }
        });
        buttonD12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d12 = (int) (Math.random() * 13);
                if (d12 == 0) { textValueReturn.setText("1");
                } else {
                    textValueReturn.setText(Integer.toString(d12));
                }            }
        });
        buttonD20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d20 = (int) (Math.random() * 21);
                if (d20 == 0) { textValueReturn.setText("1");
                } else {
                    textValueReturn.setText(Integer.toString(d20));
                }        }
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.put("nimbusBase", new Color(0, 0, 0));
        UIManager.put("nimbusBlueGrey", new Color(30, 28, 35));
        UIManager.put("control", new Color(0, 0, 0, 255));

        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        formMain screen = new formMain();
        screen.setVisible(true);
    }
}

package Control;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control_UI {
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel vol_text;


    public int vol = 0;

    public Control_UI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                vol = vol - 1;
                vol_text.setText(String.valueOf(vol));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vol = vol + 1;
                vol_text.setText(String.valueOf(vol));
            }
        });
    }
        public JPanel getMainPanel()
        {
            return mainPanel;
        }
    }




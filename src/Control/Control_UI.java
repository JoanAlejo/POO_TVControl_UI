package Control;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control_UI {
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel vol_text;
    private JComboBox<InputSourceTV> comboBoxInput;
    private JLabel inputSource;
    private JLabel canales;

    public int vol = 0;
    public int i=0;
    public String[] chanel = {"Hbo","Disney","Fox","Señal Colombia","Cartoon Network","Venus","Comedy Central","Mtv","Disney XD","Canal uno"};

    public Control_UI() {

        comboBoxInput.setModel(new DefaultComboBoxModel<>(InputSourceTV.values()));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (vol>0&&vol<=10) {
                    vol = vol - 1;
                    vol_text.setText(String.valueOf(vol));
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vol>=0&&vol<10) {
                    vol = vol + 1;
                    vol_text.setText(String.valueOf(vol));
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (i>0&&i<=9) {
                    i-=1;
                    canales.setText(String.valueOf(chanel[i]));
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i>=0&&i<9) {
                    i+=1;
                    canales.setText(String.valueOf(chanel[i]));
                }
            }
        });
        comboBoxInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputSourceTV selected = (InputSourceTV) comboBoxInput.getSelectedItem();
                inputSource.setText(selected.name());

                switch (selected)
                {
                    case AV -> inputSource.setForeground(Color.BLACK);
                    case Netflix -> inputSource.setForeground(Color.BLUE);
                    case HBO -> inputSource.setForeground(Color.RED);
                    case Youtube -> inputSource.setForeground(Color.GREEN);
                    case RTVC -> inputSource.setForeground(Color.YELLOW);
                    case HDMI -> inputSource.setForeground(Color.CYAN);
                    case WIFI -> inputSource.setForeground(Color.PINK);
                }

            }
        });
    }
        public JPanel getMainPanel()
        {
            return mainPanel;
        }


}




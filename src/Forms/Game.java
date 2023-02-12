/*
 * Created by JFormDesigner on Thu Jul 08 21:45:19 IRDT 2021
 */

package Forms;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Fateme
 */
public class Game extends JFrame {
    public Game() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panelTeam1 = new JPanel();
        lblTeam1 = new JLabel();
        panelTeam2 = new JPanel();
        lblTeam2 = new JLabel();
        btnSave = new JButton();
        btnExit = new JButton();
        panelGame = new JPanel();

        //======== this ========
        setTitle("Game");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panelTeam1 ========
        {

            //---- lblTeam1 ----
            lblTeam1.setText("First Team :");
            lblTeam1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

            GroupLayout panelTeam1Layout = new GroupLayout(panelTeam1);
            panelTeam1.setLayout(panelTeam1Layout);
            panelTeam1Layout.setHorizontalGroup(
                panelTeam1Layout.createParallelGroup()
                    .addGroup(panelTeam1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblTeam1)
                        .addContainerGap())
            );
            panelTeam1Layout.setVerticalGroup(
                panelTeam1Layout.createParallelGroup()
                    .addGroup(panelTeam1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblTeam1)
                        .addGap(30, 30, 30))
            );
        }
        contentPane.add(panelTeam1, BorderLayout.NORTH);

        //======== panelTeam2 ========
        {

            //---- lblTeam2 ----
            lblTeam2.setText("Second Team :");
            lblTeam2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

            //---- btnSave ----
            btnSave.setText("Save");
            btnSave.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

            //---- btnExit ----
            btnExit.setText("Exit");
            btnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

            GroupLayout panelTeam2Layout = new GroupLayout(panelTeam2);
            panelTeam2.setLayout(panelTeam2Layout);
            panelTeam2Layout.setHorizontalGroup(
                panelTeam2Layout.createParallelGroup()
                    .addGroup(panelTeam2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblTeam2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                        .addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
            );
            panelTeam2Layout.setVerticalGroup(
                panelTeam2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelTeam2Layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addGroup(panelTeam2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTeam2)
                            .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
            );
        }
        contentPane.add(panelTeam2, BorderLayout.SOUTH);

        //======== panelGame ========
        {
            panelGame.setLayout(new GridLayout(10, 10));
        }
        contentPane.add(panelGame, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panelTeam1;
    private JLabel lblTeam1;
    private JPanel panelTeam2;
    private JLabel lblTeam2;
    private JButton btnSave;
    private JButton btnExit;
    private JPanel panelGame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

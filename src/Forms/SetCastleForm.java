/*
 * Created by JFormDesigner on Thu Jul 08 17:47:01 IRDT 2021
 */

package Forms;

import Main.Battle;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Fateme
 */
public class SetCastleForm extends JFrame {
    JFrame previousFrame;
    private static final Battle BATTLE = Battle.battle;
    SpinnerNumberModel spinnerNumberModel;

    public SetCastleForm(JFrame previousFrame) {
        initComponents();
        this.previousFrame = previousFrame;

        ButtonGroup group = new ButtonGroup();
        group.add(rdbTeam1);
        group.add(rdbTeam2);

        spinnerNumberModel = (SpinnerNumberModel) spnColumn.getModel();
        spinnerNumberModel.setMaximum(BATTLE.field.getColumns());
    }

    private void btnBackActionPerformed(ActionEvent e) {
        this.dispose();
        previousFrame.setVisible(true);
    }

    private void btnSetActionPerformed(ActionEvent e) {
        if (rdbTeam1.isSelected()) {
            BATTLE.setTeam1(Integer.parseInt(String.valueOf(spnRow.getValue())), Integer.parseInt(String.valueOf(spnColumn.getValue())));
        }
        else if (rdbTeam2.isSelected()) {
            BATTLE.setTeam2(Integer.parseInt(String.valueOf(spnRow.getValue())), Integer.parseInt(String.valueOf(spnColumn.getValue())));
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        rdbTeam1 = new JRadioButton();
        rdbTeam2 = new JRadioButton();
        lblRow = new JLabel();
        spnRow = new JSpinner();
        lblColumn = new JLabel();
        spnColumn = new JSpinner();
        btnSet = new JButton();
        btnBack = new JButton();

        //======== this ========
        setTitle("Set Castle");
        Container contentPane = getContentPane();

        //---- rdbTeam1 ----
        rdbTeam1.setText("First Team");
        rdbTeam1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        rdbTeam1.setSelected(true);

        //---- rdbTeam2 ----
        rdbTeam2.setText("Second Team");
        rdbTeam2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- lblRow ----
        lblRow.setText("Row :");
        lblRow.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- spnRow ----
        spnRow.setModel(new SpinnerNumberModel(1, 1, 1, 1));
        spnRow.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- lblColumn ----
        lblColumn.setText("Column :");
        lblColumn.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- spnColumn ----
        spnColumn.setModel(new SpinnerNumberModel(1, 1, 1, 1));
        spnColumn.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- btnSet ----
        btnSet.setText("Set");
        btnSet.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btnSet.addActionListener(e -> btnSetActionPerformed(e));

        //---- btnBack ----
        btnBack.setText("Back");
        btnBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btnBack.addActionListener(e -> btnBackActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(rdbTeam2)
                                .addComponent(rdbTeam1)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                    .addGap(27, 27, 27)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnSet, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(lblColumn)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnColumn, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(lblRow)
                                .addGap(57, 57, 57)
                                .addComponent(spnRow, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(27, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbTeam1)
                        .addComponent(lblRow, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnRow, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbTeam2)
                        .addComponent(lblColumn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnColumn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSet, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(28, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JRadioButton rdbTeam1;
    private JRadioButton rdbTeam2;
    private JLabel lblRow;
    private JSpinner spnRow;
    private JLabel lblColumn;
    private JSpinner spnColumn;
    private JButton btnSet;
    private JButton btnBack;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

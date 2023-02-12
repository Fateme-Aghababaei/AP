/*
 * Created by JFormDesigner on Thu Jul 08 12:21:50 IRDT 2021
 */

package Forms;

import java.awt.event.*;

import Main.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Fateme
 */
public class CreateHeroForm extends JFrame {
    JFrame previousFrame;
    SpinnerNumberModel spinnerNumberModel;
    private static final Battle BATTLE = Battle.battle;

    public CreateHeroForm(JFrame previousFrame) {
        initComponents();
        this.previousFrame = previousFrame;

        ButtonGroup teamGroup = new ButtonGroup();
        teamGroup.add(rdbTeam1);
        teamGroup.add(rdbTeam2);

        ButtonGroup heroGroup = new ButtonGroup();
        heroGroup.add(rdbIce);
        heroGroup.add(rdbFire);
        heroGroup.add(rdbWind);
        heroGroup.add(rdbSoil);

        spinnerNumberModel = (SpinnerNumberModel) spnColumn.getModel();
        spinnerNumberModel.setMaximum(BATTLE.field.getColumns());
    }

    private void btnBackActionPerformed(ActionEvent e) {
        this.dispose();
        previousFrame.setVisible(true);
    }

    private void btnCreateActionPerformed(ActionEvent e) {
        int r = Integer.parseInt(String.valueOf(spnRow.getValue())) - 1;
        int c = Integer.parseInt(String.valueOf(spnColumn.getValue())) - 1;
        if (rdbTeam1.isSelected()) {
            if (BATTLE.team1 == null) {
                JOptionPane.showMessageDialog(null, "Please create your castle first.");
                return;
            }
            if (rdbIce.isSelected()) {
                Ice hero = new Ice(BATTLE.team1, r, c);
            }
            else if (rdbFire.isSelected()) {
                Fire hero = new Fire(BATTLE.team1, r, c);
            }
            else if (rdbWind.isSelected()) {
                Wind hero = new Wind(BATTLE.team1, r, c);
            }
            else if (rdbSoil.isSelected()) {
                Soil hero = new Soil(BATTLE.team1, r, c);
            }
        }
        else if (rdbTeam2.isSelected()) {
            if (BATTLE.team2 == null) {
                JOptionPane.showMessageDialog(null, "Please create your castle first.");
                return;
            }
            if (rdbIce.isSelected()) {
                Ice hero = new Ice(BATTLE.team2, r, c, Battle.REVERSE_INDEX);
            }
            else if (rdbFire.isSelected()) {
                Fire hero = new Fire(BATTLE.team2, r, c, Battle.REVERSE_INDEX);
            }
            else if (rdbWind.isSelected()) {
                Wind hero = new Wind(BATTLE.team2, r, c, Battle.REVERSE_INDEX);
            }
            else if (rdbSoil.isSelected()) {
                Soil hero = new Soil(BATTLE.team2, r, c, Battle.REVERSE_INDEX);
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        rdbTeam1 = new JRadioButton();
        rdbTeam2 = new JRadioButton();
        rdbIce = new JRadioButton();
        rdbFire = new JRadioButton();
        rdbWind = new JRadioButton();
        rdbSoil = new JRadioButton();
        lblRow = new JLabel();
        lblColumn = new JLabel();
        spnRow = new JSpinner();
        spnColumn = new JSpinner();
        btnCreate = new JButton();
        btnBack = new JButton();

        //======== this ========
        setTitle("Create Hero");
        Container contentPane = getContentPane();

        //---- rdbTeam1 ----
        rdbTeam1.setText("First Team");
        rdbTeam1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        rdbTeam1.setSelected(true);

        //---- rdbTeam2 ----
        rdbTeam2.setText("Second Team");
        rdbTeam2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- rdbIce ----
        rdbIce.setText("Ice");
        rdbIce.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        rdbIce.setSelected(true);

        //---- rdbFire ----
        rdbFire.setText("Fire");
        rdbFire.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- rdbWind ----
        rdbWind.setText("Wind");
        rdbWind.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- rdbSoil ----
        rdbSoil.setText("Soil");
        rdbSoil.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- lblRow ----
        lblRow.setText("Row :");
        lblRow.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- lblColumn ----
        lblColumn.setText("Column :");
        lblColumn.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- spnRow ----
        spnRow.setModel(new SpinnerNumberModel(1, 1, 2, 1));
        spnRow.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- spnColumn ----
        spnColumn.setModel(new SpinnerNumberModel(1, 1, 1, 1));
        spnColumn.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- btnCreate ----
        btnCreate.setText("Create");
        btnCreate.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btnCreate.addActionListener(e -> btnCreateActionPerformed(e));

        //---- btnBack ----
        btnBack.setText("Back");
        btnBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btnBack.addActionListener(e -> btnBackActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(rdbFire)
                                .addComponent(rdbSoil)
                                .addComponent(rdbIce)
                                .addComponent(rdbWind))
                            .addContainerGap(223, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(rdbTeam1)
                                .addComponent(btnBack, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(rdbTeam2)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(lblRow)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spnRow, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                        .addComponent(lblColumn)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnColumn, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 40, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbTeam1)
                        .addComponent(rdbTeam2))
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRow, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addComponent(spnRow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblColumn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addComponent(spnColumn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(rdbIce)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdbFire)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdbWind)
                            .addGap(4, 4, 4)
                            .addComponent(rdbSoil)))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JRadioButton rdbTeam1;
    private JRadioButton rdbTeam2;
    private JRadioButton rdbIce;
    private JRadioButton rdbFire;
    private JRadioButton rdbWind;
    private JRadioButton rdbSoil;
    private JLabel lblRow;
    private JLabel lblColumn;
    private JSpinner spnRow;
    private JSpinner spnColumn;
    private JButton btnCreate;
    private JButton btnBack;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

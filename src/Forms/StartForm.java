/*
 * Created by JFormDesigner on Thu Jul 08 09:50:56 IRDT 2021
 */

package Forms;

import javax.swing.event.*;
import Main.Battle;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Fateme
 */
public class StartForm extends JFrame {
    File file;
    private static final Battle BATTLE = Battle.battle;

    public StartForm() {
        initComponents();
        ButtonGroup group = new ButtonGroup();
        group.add(rdbCreateNewGame);
        group.add(rdbReadFromFile);
        rdbReadFromFile.setSelected(true);
        rdbCreateNewGame.setSelected(false);
        rdbReadFromFileItemStateChanged(null);
        rdbCreateNewGameItemStateChanged(null);
        BATTLE.setField(10, 10);
    }

    private void rdbCreateNewGameItemStateChanged(ItemEvent e) {
        btnHero.setEnabled(rdbCreateNewGame.isSelected());
        lblRows.setEnabled(rdbCreateNewGame.isSelected());
        lblColumns.setEnabled(rdbCreateNewGame.isSelected());
        btnCastle.setEnabled(rdbCreateNewGame.isSelected());
        spnRows.setEnabled(rdbCreateNewGame.isSelected());
        spnColumns.setEnabled(rdbCreateNewGame.isSelected());
    }

    private void rdbReadFromFileItemStateChanged(ItemEvent e) {
        btnBrowse.setEnabled(rdbReadFromFile.isSelected());
        lblFile.setEnabled(rdbReadFromFile.isSelected());
    }

    private void btnExitActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void btnBrowseActionPerformed(ActionEvent e) {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new File("."));
        jFileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Text File (*.txt)", "txt"));
        jFileChooser.setDialogTitle("Open...");
        jFileChooser.setAcceptAllFileFilterUsed(false);
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = jFileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                file = jFileChooser.getSelectedFile();
                lblFile.setText("File : " + file.getName());
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(null, "File doesn't exist.");
            }
        }
    }

    private void btnHeroActionPerformed(ActionEvent e) {
        CreateHeroForm createHeroForm = new CreateHeroForm(this);
        createHeroForm.setVisible(true);
        this.setVisible(false);
    }

    private void btnCastleActionPerformed(ActionEvent e) {
        SetCastleForm setCastleForm = new SetCastleForm(this);
        setCastleForm.setVisible(true);
        this.setVisible(false);
    }

    private void spnRowsStateChanged(ChangeEvent e) {
        BATTLE.setField(Integer.parseInt(String.valueOf(spnRows.getValue())), Integer.parseInt(String.valueOf(spnColumns.getValue())));
    }

    private void spnColumnsStateChanged(ChangeEvent e) {
        BATTLE.setField(Integer.parseInt(String.valueOf(spnRows.getValue())), Integer.parseInt(String.valueOf(spnColumns.getValue())));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        btnBrowse = new JButton();
        lblTitle = new JLabel();
        btnHero = new JButton();
        lblRows = new JLabel();
        lblColumns = new JLabel();
        btnStart = new JButton();
        btnExit = new JButton();
        btnScores = new JButton();
        lblFile = new JLabel();
        rdbReadFromFile = new JRadioButton();
        rdbCreateNewGame = new JRadioButton();
        btnCastle = new JButton();
        spnRows = new JSpinner();
        spnColumns = new JSpinner();

        //======== this ========
        setTitle("Start");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- btnBrowse ----
        btnBrowse.setText("Browse");
        btnBrowse.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btnBrowse.addActionListener(e -> btnBrowseActionPerformed(e));

        //---- lblTitle ----
        lblTitle.setText("BATTLE OF HEROES");
        lblTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);

        //---- btnHero ----
        btnHero.setText("Create Hero");
        btnHero.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btnHero.addActionListener(e -> btnHeroActionPerformed(e));

        //---- lblRows ----
        lblRows.setText("Rows :");
        lblRows.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        lblRows.setHorizontalAlignment(SwingConstants.CENTER);

        //---- lblColumns ----
        lblColumns.setText("Columns :");
        lblColumns.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        lblColumns.setHorizontalAlignment(SwingConstants.CENTER);

        //---- btnStart ----
        btnStart.setText("Start");
        btnStart.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- btnExit ----
        btnExit.setText("Exit");
        btnExit.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btnExit.addActionListener(e -> btnExitActionPerformed(e));

        //---- btnScores ----
        btnScores.setText("Score Board");
        btnScores.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        //---- lblFile ----
        lblFile.setText("File : ");
        lblFile.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        lblFile.setHorizontalAlignment(SwingConstants.LEFT);

        //---- rdbReadFromFile ----
        rdbReadFromFile.setText("Read From File");
        rdbReadFromFile.setHorizontalAlignment(SwingConstants.CENTER);
        rdbReadFromFile.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        rdbReadFromFile.addItemListener(e -> rdbReadFromFileItemStateChanged(e));

        //---- rdbCreateNewGame ----
        rdbCreateNewGame.setText("Create New Game");
        rdbCreateNewGame.setHorizontalAlignment(SwingConstants.CENTER);
        rdbCreateNewGame.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        rdbCreateNewGame.addItemListener(e -> rdbCreateNewGameItemStateChanged(e));

        //---- btnCastle ----
        btnCastle.setText("Set Castle");
        btnCastle.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btnCastle.addActionListener(e -> btnCastleActionPerformed(e));

        //---- spnRows ----
        spnRows.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        spnRows.setModel(new SpinnerNumberModel(10, 1, null, 1));
        spnRows.addChangeListener(e -> spnRowsStateChanged(e));

        //---- spnColumns ----
        spnColumns.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        spnColumns.setModel(new SpinnerNumberModel(10, 1, null, 1));
        spnColumns.addChangeListener(e -> spnColumnsStateChanged(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(197, 197, 197)
                    .addComponent(lblTitle)
                    .addContainerGap(205, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(rdbReadFromFile)
                                .addComponent(rdbCreateNewGame))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(lblColumns)
                                .addComponent(lblRows)
                                .addComponent(lblFile, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                    .addComponent(btnScores, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(0, 317, Short.MAX_VALUE)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spnRows, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                        .addComponent(spnColumns, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))))
                            .addGap(45, 45, 45)))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnHero, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBrowse, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCastle, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(lblTitle)
                    .addGap(36, 36, 36)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBrowse, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdbReadFromFile)
                        .addComponent(lblFile))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHero, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdbCreateNewGame)
                        .addComponent(lblRows)
                        .addComponent(spnRows, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColumns)
                        .addComponent(btnCastle, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnColumns, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnScores, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton btnBrowse;
    private JLabel lblTitle;
    private JButton btnHero;
    private JLabel lblRows;
    private JLabel lblColumns;
    private JButton btnStart;
    private JButton btnExit;
    private JButton btnScores;
    private JLabel lblFile;
    private JRadioButton rdbReadFromFile;
    private JRadioButton rdbCreateNewGame;
    private JButton btnCastle;
    private JSpinner spnRows;
    private JSpinner spnColumns;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

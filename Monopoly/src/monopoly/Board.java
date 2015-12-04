/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author lo_856348
 */
public class Board extends javax.swing.JFrame {

    /**
     * Creates new form Board
     */
    Data data;
    int playerNum;
    private File location;
    public Board() {
        initComponents();
        data = new Data();
        playerNum = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Game = new javax.swing.JPanel();
        Board = new javax.swing.JLabel();
        Player1 = new javax.swing.JPanel();
        player1_name = new javax.swing.JLabel();
        player1_cashLabel = new javax.swing.JLabel();
        player1_cash = new javax.swing.JLabel();
        player1_properties = new javax.swing.JScrollPane();
        player1_propertiesTable = new javax.swing.JTable();
        player1_jailCard = new javax.swing.JButton();
        Player2 = new javax.swing.JPanel();
        player2_name = new javax.swing.JLabel();
        player2_cashLabel = new javax.swing.JLabel();
        player2_cash = new javax.swing.JLabel();
        player2_properties = new javax.swing.JScrollPane();
        player2_propertiesTable = new javax.swing.JTable();
        player2_jailCard = new javax.swing.JButton();
        Player3 = new javax.swing.JPanel();
        player3_name = new javax.swing.JLabel();
        player3_cashLabel = new javax.swing.JLabel();
        player3_cash = new javax.swing.JLabel();
        player3_properties = new javax.swing.JScrollPane();
        player3_propertiesTable = new javax.swing.JTable();
        player3_jailCard = new javax.swing.JButton();
        Player4 = new javax.swing.JPanel();
        player4_name = new javax.swing.JLabel();
        player4_cashLabel = new javax.swing.JLabel();
        player4_cash = new javax.swing.JLabel();
        player4_properties = new javax.swing.JScrollPane();
        player4_propertiesTable = new javax.swing.JTable();
        player4_jailCard = new javax.swing.JButton();
        board = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rollDice = new javax.swing.JButton();
        trade = new javax.swing.JButton();
        manage = new javax.swing.JButton();
        endTurn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        file_newGame = new javax.swing.JMenuItem();
        file_openGame = new javax.swing.JMenuItem();
        file_save = new javax.swing.JMenuItem();
        file_saveAs = new javax.swing.JMenuItem();
        file_close = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setResizable(false);

        Player1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Player1.setPreferredSize(new java.awt.Dimension(258, 200));

        player1_name.setText("Name:");

        player1_cashLabel.setText("Cash: $");

        player1_cash.setText("1500");

        player1_propertiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Properties"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        player1_properties.setViewportView(player1_propertiesTable);
        if (player1_propertiesTable.getColumnModel().getColumnCount() > 0) {
            player1_propertiesTable.getColumnModel().getColumn(0).setResizable(false);
        }

        player1_jailCard.setText("No Get Out Of Jail Free Card");

        javax.swing.GroupLayout Player1Layout = new javax.swing.GroupLayout(Player1);
        Player1.setLayout(Player1Layout);
        Player1Layout.setHorizontalGroup(
            Player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player1Layout.createSequentialGroup()
                        .addComponent(player1_cashLabel)
                        .addGap(0, 0, 0)
                        .addComponent(player1_cash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(player1_jailCard))
                    .addGroup(Player1Layout.createSequentialGroup()
                        .addGroup(Player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player1_name)
                            .addComponent(player1_properties, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Player1Layout.setVerticalGroup(
            Player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player1_name)
                .addGroup(Player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(Player1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(player1_cashLabel)
                            .addComponent(player1_cash))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(player1_properties, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Player1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(player1_jailCard)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Player2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        player2_name.setText("Name:");

        player2_cashLabel.setText("Cash: $");

        player2_cash.setText("1500");

        player2_propertiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Properties"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        player2_properties.setViewportView(player2_propertiesTable);
        if (player2_propertiesTable.getColumnModel().getColumnCount() > 0) {
            player2_propertiesTable.getColumnModel().getColumn(0).setResizable(false);
        }

        player2_jailCard.setText("No Get Out Of Jail Free Card");

        javax.swing.GroupLayout Player2Layout = new javax.swing.GroupLayout(Player2);
        Player2.setLayout(Player2Layout);
        Player2Layout.setHorizontalGroup(
            Player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player2Layout.createSequentialGroup()
                        .addComponent(player2_cashLabel)
                        .addGap(0, 0, 0)
                        .addComponent(player2_cash))
                    .addComponent(player2_name)
                    .addComponent(player2_properties, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(player2_jailCard)
                .addContainerGap())
        );
        Player2Layout.setVerticalGroup(
            Player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player2_name)
                .addGap(18, 18, 18)
                .addGroup(Player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player2Layout.createSequentialGroup()
                        .addGroup(Player2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(player2_cashLabel)
                            .addComponent(player2_cash))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player2Layout.createSequentialGroup()
                        .addComponent(player2_jailCard, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(player2_properties, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        Player3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        player3_name.setText("Name:");

        player3_cashLabel.setText("Cash: $");

        player3_cash.setText("1500");

        player3_propertiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Properties"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        player3_properties.setViewportView(player3_propertiesTable);
        if (player3_propertiesTable.getColumnModel().getColumnCount() > 0) {
            player3_propertiesTable.getColumnModel().getColumn(0).setResizable(false);
        }

        player3_jailCard.setText("No Get Out Of Jail Free Card");

        javax.swing.GroupLayout Player3Layout = new javax.swing.GroupLayout(Player3);
        Player3.setLayout(Player3Layout);
        Player3Layout.setHorizontalGroup(
            Player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player3Layout.createSequentialGroup()
                        .addComponent(player3_properties, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Player3Layout.createSequentialGroup()
                        .addGroup(Player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Player3Layout.createSequentialGroup()
                                .addComponent(player3_cashLabel)
                                .addGap(0, 0, 0)
                                .addComponent(player3_cash))
                            .addComponent(player3_name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(player3_jailCard)))
                .addContainerGap())
        );
        Player3Layout.setVerticalGroup(
            Player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player3Layout.createSequentialGroup()
                        .addComponent(player3_name)
                        .addGap(18, 18, 18)
                        .addGroup(Player3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(player3_cashLabel)
                            .addComponent(player3_cash))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player3Layout.createSequentialGroup()
                        .addComponent(player3_jailCard, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(player3_properties, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        Player4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        player4_name.setText("Name:");

        player4_cashLabel.setText("Cash: $");

        player4_cash.setText("1500");

        player4_propertiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Properties"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        player4_properties.setViewportView(player4_propertiesTable);
        if (player4_propertiesTable.getColumnModel().getColumnCount() > 0) {
            player4_propertiesTable.getColumnModel().getColumn(0).setResizable(false);
        }

        player4_jailCard.setText("No Get Out Of Jail Free Card");

        javax.swing.GroupLayout Player4Layout = new javax.swing.GroupLayout(Player4);
        Player4.setLayout(Player4Layout);
        Player4Layout.setHorizontalGroup(
            Player4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player4Layout.createSequentialGroup()
                        .addComponent(player4_properties, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(Player4Layout.createSequentialGroup()
                        .addGroup(Player4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player4_name)
                            .addGroup(Player4Layout.createSequentialGroup()
                                .addComponent(player4_cashLabel)
                                .addGap(0, 0, 0)
                                .addComponent(player4_cash)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(player4_jailCard)))
                .addContainerGap())
        );
        Player4Layout.setVerticalGroup(
            Player4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player4Layout.createSequentialGroup()
                        .addComponent(player4_name)
                        .addGap(18, 18, 18)
                        .addGroup(Player4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(player4_cashLabel)
                            .addComponent(player4_cash))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player4Layout.createSequentialGroup()
                        .addComponent(player4_jailCard)
                        .addGap(6, 6, 6)))
                .addComponent(player4_properties, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Images/MonopolyBoard.jpg"))); // NOI18N

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GameLayout = new javax.swing.GroupLayout(Game);
        Game.setLayout(GameLayout);
        GameLayout.setHorizontalGroup(
            GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Board)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Player2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Player3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Player4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Player1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                .addContainerGap())
        );
        GameLayout.setVerticalGroup(
            GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Board, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(GameLayout.createSequentialGroup()
                        .addComponent(Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Player3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Player4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );

        rollDice.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        rollDice.setText("Roll Dice");
        rollDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollDiceActionPerformed(evt);
            }
        });

        trade.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        trade.setText("Trade");
        trade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tradeActionPerformed(evt);
            }
        });

        manage.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        manage.setText("Manage");
        manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageActionPerformed(evt);
            }
        });

        endTurn.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        endTurn.setText("End Turn");
        endTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTurnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rollDice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(trade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(manage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(endTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rollDice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(trade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(endTurn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        file_newGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        file_newGame.setText("New Game...");
        file_newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_newGameActionPerformed(evt);
            }
        });
        jMenu1.add(file_newGame);

        file_openGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        file_openGame.setText("Open Game...");
        file_openGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_openGameActionPerformed(evt);
            }
        });
        jMenu1.add(file_openGame);

        file_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        file_save.setText("Save");
        file_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_saveActionPerformed(evt);
            }
        });
        jMenu1.add(file_save);

        file_saveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        file_saveAs.setText("Save As...");
        file_saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_saveAsActionPerformed(evt);
            }
        });
        jMenu1.add(file_saveAs);

        file_close.setText("Close");
        file_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_closeActionPerformed(evt);
            }
        });
        jMenu1.add(file_close);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Game, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Game, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void file_newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_newGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_file_newGameActionPerformed

    private void file_openGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_openGameActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = jfc.getSelectedFile();
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                location = file;
                try {
                    //DO THIS LATER**************
                    
                } catch (ClassNotFoundException es) {
                    JOptionPane.showMessageDialog(this, es);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
    }//GEN-LAST:event_file_openGameActionPerformed

    private void file_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_saveActionPerformed
        // TODO add your handling code here:
        if (location != null) {
            try {
                FileOutputStream fos = new FileOutputStream(location);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(players);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
        else {
            file_saveAsActionPerformed(evt);
        }
    }//GEN-LAST:event_file_saveActionPerformed

    private void file_saveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_saveAsActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        
        if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = jfc.getSelectedFile();
                location = jfc.getSelectedFile();
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject("COME BACK TO THIS");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
    }//GEN-LAST:event_file_saveAsActionPerformed

    private void file_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_closeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_file_closeActionPerformed

    private void rollDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollDiceActionPerformed
        // TODO add your handling code here:
        data.players.get(playerNum).roll();
        
    }//GEN-LAST:event_rollDiceActionPerformed

    private void tradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tradeActionPerformed

    private void manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageActionPerformed

    private void endTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTurnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endTurnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Board;
    private javax.swing.JPanel Game;
    private javax.swing.JPanel Player1;
    private javax.swing.JPanel Player2;
    private javax.swing.JPanel Player3;
    private javax.swing.JPanel Player4;
    private javax.swing.JPanel board;
    private javax.swing.JButton endTurn;
    private javax.swing.JMenuItem file_close;
    private javax.swing.JMenuItem file_newGame;
    private javax.swing.JMenuItem file_openGame;
    private javax.swing.JMenuItem file_save;
    private javax.swing.JMenuItem file_saveAs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton manage;
    private javax.swing.JLabel player1_cash;
    private javax.swing.JLabel player1_cashLabel;
    private javax.swing.JButton player1_jailCard;
    private javax.swing.JLabel player1_name;
    private javax.swing.JScrollPane player1_properties;
    private javax.swing.JTable player1_propertiesTable;
    private javax.swing.JLabel player2_cash;
    private javax.swing.JLabel player2_cashLabel;
    private javax.swing.JButton player2_jailCard;
    private javax.swing.JLabel player2_name;
    private javax.swing.JScrollPane player2_properties;
    private javax.swing.JTable player2_propertiesTable;
    private javax.swing.JLabel player3_cash;
    private javax.swing.JLabel player3_cashLabel;
    private javax.swing.JButton player3_jailCard;
    private javax.swing.JLabel player3_name;
    private javax.swing.JScrollPane player3_properties;
    private javax.swing.JTable player3_propertiesTable;
    private javax.swing.JLabel player4_cash;
    private javax.swing.JLabel player4_cashLabel;
    private javax.swing.JButton player4_jailCard;
    private javax.swing.JLabel player4_name;
    private javax.swing.JScrollPane player4_properties;
    private javax.swing.JTable player4_propertiesTable;
    private javax.swing.JButton rollDice;
    private javax.swing.JButton trade;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author dell
 */
public class kalkulator extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form kalkulator
     */
    int cK = 0;
    double num, ans;
    int calculation;
    int hour, second, minute;
    String timestr;
    int kind;
    boolean k1 = true;
    boolean k2 = false;

    public kalkulator() {
        initComponents();
        jRadioButton1.setEnabled(false);

    }

    public void clock() {
        switch (kind) {

            case 1:
                Thread t = new Thread() {
                    public void run() {
                        while (true) {
                            DateFormat date = new SimpleDateFormat("hh : mm : ss  ");
                            String datestring = date.format(new Date()).toString();
                            jLabel2.setText(datestring);
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {

                            }
                        }
                    }
                };
                t.start();
            case 2:
                while (true) {
                    DateFormat dat = new SimpleDateFormat("hh : mm : ss aa ");
                    String datestring = dat.format(new Date()).toString();
                    jLabel2.setText(datestring);
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }
                }

        }
    }


    public void arithmetic_operation() {
        switch (calculation) {
            case 1://add
                ans = num + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;

            case 2:
                ans = num - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
            case 3:
                ans = num * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
            case 4:
                ans = num / Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
        }
    }

    public void ziel() {
        jRadioButton1.setBackground(Color.green);
        jRadioButton3.setBackground(Color.green);
        jTextField1.setBackground(Color.green);
        jButton1.setBackground(Color.green);
        jButton2.setBackground(Color.green);
        jButton3.setBackground(Color.green);
        jButton4.setBackground(Color.green);
        jButton5.setBackground(Color.green);
        jButton6.setBackground(Color.green);
        jButton7.setBackground(Color.green);
        jButton8.setBackground(Color.green);
        jButton9.setBackground(Color.green);
        ;
        jButton10.setBackground(Color.green);
        jButton11.setBackground(Color.green);
        jButton12.setBackground(Color.green);
        jButton13.setBackground(Color.green);
        jButton14.setBackground(Color.green);
        jButton15.setBackground(Color.green);
        jButton16.setBackground(Color.green);
        jButton17.setBackground(Color.green);
        jButton19.setBackground(Color.green);
    }

    public void niebieski() {
        jRadioButton1.setBackground(Color.blue);
        jRadioButton3.setBackground(Color.blue);
        jTextField1.setBackground(Color.blue);
        jButton1.setBackground(Color.blue);
        jButton2.setBackground(Color.blue);
        jButton3.setBackground(Color.blue);
        jButton4.setBackground(Color.blue);
        jButton5.setBackground(Color.blue);
        jButton6.setBackground(Color.blue);
        jButton7.setBackground(Color.blue);
        jButton8.setBackground(Color.blue);
        jButton9.setBackground(Color.blue);
        ;
        jButton10.setBackground(Color.blue);
        jButton11.setBackground(Color.blue);
        jButton12.setBackground(Color.blue);
        jButton13.setBackground(Color.blue);
        jButton14.setBackground(Color.blue);
        jButton15.setBackground(Color.blue);
        jButton16.setBackground(Color.blue);
        jButton17.setBackground(Color.blue);
        jButton19.setBackground(Color.blue);
    }

    public void enable() {
        jRadioButton1.setEnabled(false);
        jRadioButton3.setEnabled(true);
        jTextField1.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton19.setEnabled(true);
    }

    public void disable() {
        jTextField1.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton19.setEnabled(false);
        jRadioButton1.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton2 = new javax.swing.JRadioButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("kalkulator");
        setBackground(new java.awt.Color(204, 0, 153));
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton3.setText("OFF");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("<--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("C");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setText("7");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton5.setText("8");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton6.setText("9");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton8.setText("4");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton9.setText("5");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton10.setText("6");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton11.setText("*");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton12.setText("1");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton13.setText("2");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton14.setText("3");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton15.setText("/");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton16.setText("0");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton17.setText(".");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton19.setText("=");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel2.setText("Zegar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Wybirz zegar", "12h", "24h"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Zielony");
        jRadioButton4.setActionCommand("");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Niebieski");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jButton13)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jButton14)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jButton15))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jButton17)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton5)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton6)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton9)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton10)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton11))))
                                                        .addGap(11, 11, 11))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jRadioButton3)
                                                                .addComponent(jRadioButton1))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(12, 12, 12))
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(jRadioButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jRadioButton4)
                                                        .addComponent(jRadioButton5))
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jRadioButton1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jRadioButton3))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        enable();        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int length = jTextField1.getText().length();
        int number = jTextField1.getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextField1.setText(store);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 1;
        jTextField1.setText("");
        jLabel1.setText(num + "+");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 2;
        jTextField1.setText("");
        jLabel1.setText(num + "-");       // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextField1.setText(jTextField1.getText() + "4");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTextField1.setText(jTextField1.getText() + "6");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 3;
        jTextField1.setText("");
        jLabel1.setText(num + "*");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");  // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
        calculation = 4;
        jTextField1.setText("");
        jLabel1.setText(num + "/");     // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jTextField1.setText(jTextField1.getText() + "0");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        arithmetic_operation();
        jLabel1.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        disable();        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        cK = jComboBox1.getSelectedIndex();
        System.out.println(cK);
        Thread t = new Thread() {
            public void run() {
                while (k1 = true) {
                    if (cK == 1) {
                        DateFormat date = new SimpleDateFormat("hh:mm:ss aa");
                        String datestring = date.format(new Date()).toString();
                        jLabel2.setText(datestring);
                    } else if (cK == 2) {
                        DateFormat date = new SimpleDateFormat("HH : mm : ss");
                        String datestring = date.format(new Date()).toString();
                        jLabel2.setText(datestring);
                    } else if (cK == 0) {

                        jLabel2.setText("zegar wylaczony");
                    }


                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }
                }
            }
        };
        t.start();


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed

        ziel();
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        niebieski();
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

    }

    private void clock(int cK) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Color RGBtoHSB(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

 

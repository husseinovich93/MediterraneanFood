
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Alapaca extends javax.swing.JFrame {
    int lambNum, chiNum, burNum, shawNum , falNum;
    public static int waterNum, sodaNum ;
     public static double DrinkPrice;
    double LambPrice, ChiPrice, BurPrice, FalPrice, ShawPrice;
    final double Lamb_Cost = 10.00, Chi_Cost = 10.00, Fal_Cost = 6.00, Shaw_Cost= 12.00, Bur_Cost = 8.00, Drink_Cost = 1.00 ;
    double SubTotal , Tax ,Total ;
    int guestNum;
    PrintWriter output;
    
    public Alapaca() {
        initComponents();
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lambCounter = new javax.swing.JSpinner();
        xMeatCounter = new javax.swing.JCheckBox();
        lambPrice = new javax.swing.JLabel();
        chNPrice = new javax.swing.JLabel();
        xMeatCounter2 = new javax.swing.JCheckBox();
        chNCounter = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        falCounter = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        saladCounter = new javax.swing.JCheckBox();
        falPrice = new javax.swing.JLabel();
        burCounter = new javax.swing.JSpinner();
        burPrice = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        friesCounter = new javax.swing.JCheckBox();
        shwCounter = new javax.swing.JSpinner();
        shawPrice = new javax.swing.JLabel();
        riceCounter = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        waterCounter = new javax.swing.JSpinner();
        drinkPrice = new javax.swing.JLabel();
        sodaCounter = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        subTotal = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        calculate = new javax.swing.JButton();
        saveBill = new javax.swing.JButton();
        newBill = new javax.swing.JButton();
        guestNo = new javax.swing.JLabel();
        exitApp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lithos Pro", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POS System");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 10, 280, 43);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Menu", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Lamb Gyro    ");
        jLabel3.setToolTipText("");

        lambCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        lambCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lambCounterStateChanged(evt);
            }
        });

        xMeatCounter.setText("XMeat");
        xMeatCounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xMeatCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                xMeatCounterStateChanged(evt);
            }
        });
        xMeatCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMeatCounterActionPerformed(evt);
            }
        });

        lambPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lambPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lambPrice.setText("$0.00");
        lambPrice.setToolTipText("");

        chNPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        chNPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chNPrice.setText("$0.00");
        chNPrice.setToolTipText("");

        xMeatCounter2.setText("XMeat");
        xMeatCounter2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xMeatCounter2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                xMeatCounter2StateChanged(evt);
            }
        });
        xMeatCounter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMeatCounter2ActionPerformed(evt);
            }
        });

        chNCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        chNCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chNCounterStateChanged(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Chicken Gyro");
        jLabel22.setToolTipText("");

        falCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        falCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                falCounterStateChanged(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Falafel");
        jLabel23.setToolTipText("");

        saladCounter.setText(" Salad");
        saladCounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        saladCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                saladCounterStateChanged(evt);
            }
        });
        saladCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saladCounterActionPerformed(evt);
            }
        });

        falPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        falPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        falPrice.setText("$0.00");
        falPrice.setToolTipText("");

        burCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        burCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                burCounterStateChanged(evt);
            }
        });

        burPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        burPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burPrice.setText("$0.00");
        burPrice.setToolTipText("");

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Burger    ");
        jLabel26.setToolTipText("");

        friesCounter.setText("Fries  ");
        friesCounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        friesCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                friesCounterStateChanged(evt);
            }
        });
        friesCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friesCounterActionPerformed(evt);
            }
        });

        shwCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        shwCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                shwCounterStateChanged(evt);
            }
        });

        shawPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        shawPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shawPrice.setText("$0.00");
        shawPrice.setToolTipText("");

        riceCounter.setText("Rice   ");
        riceCounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        riceCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                riceCounterStateChanged(evt);
            }
        });
        riceCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riceCounterActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Shawerma");
        jLabel28.setToolTipText("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drinks", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
        jPanel2.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Water");
        jLabel7.setToolTipText("");

        waterCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        waterCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                waterCounterStateChanged(evt);
            }
        });

        drinkPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        drinkPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drinkPrice.setText("$0.00");
        drinkPrice.setToolTipText("");

        sodaCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        sodaCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sodaCounterStateChanged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Soda");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(drinkPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(waterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sodaCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(drinkPrice)
                .addGap(50, 50, 50))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(waterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sodaCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Apple Chancery", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Halal Food");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel9.setFont(new java.awt.Font("Apple Chancery", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("    THANKS FOR DINING IN");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chNPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(xMeatCounter2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chNCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lambPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(xMeatCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lambCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(falPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saladCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(falCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(burPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(friesCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(burCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(shawPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(riceCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shwCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lambCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xMeatCounter)
                    .addComponent(lambPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(chNCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xMeatCounter2)
                    .addComponent(chNPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(falCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saladCounter)
                    .addComponent(falPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(burCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(friesCounter)
                    .addComponent(burPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(shwCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(riceCounter)
                    .addComponent(shawPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 110, 420, 480);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Balance", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
        jPanel3.setToolTipText("");

        subTotal.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        subTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTotal.setText("Sub Total :        S0.00");
        subTotal.setToolTipText("");

        tax.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        tax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tax.setText("              Tax :        $0.0 0    ");
        tax.setToolTipText("");

        total.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("       Total :        S0.00");
        total.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tax, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(subTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 110, 240, 150);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receipt", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N
        jPanel4.setToolTipText("");

        calculate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        calculate.setText("Print Bill");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        saveBill.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        saveBill.setText("Save Bill");
        saveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBillActionPerformed(evt);
            }
        });

        newBill.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        newBill.setText("New Bill");
        newBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBillActionPerformed(evt);
            }
        });

        guestNo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        guestNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guestNo.setText("GuestNo :  0 ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBill, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guestNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(guestNo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBill)
                    .addComponent(newBill))
                .addGap(39, 39, 39)
                .addComponent(calculate)
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 260, 240, 330);

        exitApp.setText("Exit");
        exitApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAppActionPerformed(evt);
            }
        });
        getContentPane().add(exitApp);
        exitApp.setBounds(0, 0, 75, 29);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/husseinovich/Desktop/javaProjects/MediterraneanFood/src/main/java/41010967-vegetables-and-spices-on-wood-word-mediterranean.jpg")); // NOI18N
        jLabel4.setText("ffffffff");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 660, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xMeatCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMeatCounterActionPerformed
        if(xMeatCounter.isSelected())
        {
            LambPrice += lambNum;
        }
        else
        {
            LambPrice -= lambNum;
        }
        lambPrice.setText(LambPrice + "$");
    }//GEN-LAST:event_xMeatCounterActionPerformed

    private void xMeatCounter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMeatCounter2ActionPerformed
        if(xMeatCounter2.isSelected())
        {
            ChiPrice += chiNum;
        }
        else
        {
            ChiPrice -= chiNum;
        }
        chNPrice.setText(ChiPrice + "$");
    }//GEN-LAST:event_xMeatCounter2ActionPerformed

    private void saladCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saladCounterActionPerformed
        if(saladCounter.isSelected())
        {
            FalPrice += falNum;
        }
        else
        {
            FalPrice -= falNum;
        }
        falPrice.setText(FalPrice + "$");
    }//GEN-LAST:event_saladCounterActionPerformed

    private void friesCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friesCounterActionPerformed
        if(friesCounter.isSelected())
        {
            BurPrice += burNum;
        }
        else
        {
            BurPrice -= burNum;
        }
        burPrice.setText(BurPrice + "$");
    }//GEN-LAST:event_friesCounterActionPerformed

    private void riceCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riceCounterActionPerformed
        if(riceCounter.isSelected())
        {
            ShawPrice += shawNum;
        }
        else
        {
            ShawPrice -= shawNum;
        }
        shawPrice.setText(ShawPrice + "$");
    }//GEN-LAST:event_riceCounterActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        SubTotal= LambPrice + ChiPrice + BurPrice + FalPrice + ShawPrice + DrinkPrice;
        SubTotal= Math.round(SubTotal * 100.00)/100.00;
        subTotal.setText("Sub Total: $"+ SubTotal);
        
        Tax = SubTotal * 0.0875;
        Tax = Math.round(Tax * 100.00)/100.00;
        tax.setText("Tax: $"+Tax);
        
        Total = SubTotal + Tax ; 
        Total = Math.round(Total * 100.00)/100.00;
        total.setText("Total: $"+Total);
    }//GEN-LAST:event_calculateActionPerformed

    private void saveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBillActionPerformed
        try {
            if(Total != 0)
            {
                output = new PrintWriter("BillNo."+guestNum+".txt");
                output.println("BillNo."+guestNum);
                output.println("***********");
                
                if(lambNum != 0)
                {
                    output.print(lambNum+" Lamb Gyro");
                    if(xMeatCounter.isSelected())
                    {
                        output.println(" Extra Meat");
                    }
                    else
                    {
                        output.println();
                    }
                }
                
                if(chiNum != 0)
                {
                    output.print(chiNum+" Chicken Gyro");
                    if(xMeatCounter2.isSelected())
                    {
                        output.println(" Extra Meat");
                    }
                    else
                    {
                        output.println();
                    }
                }
                
                if(falNum != 0)
                {
                    output.print(falNum+" Falafel");
                    if(saladCounter.isSelected())
                    {
                        output.println("With Salad");
                    }
                    else
                    {
                        output.println();
                    }
                }
                
                if(burNum != 0)
                {
                    output.print(burNum+" Classic Burger");
                    if(friesCounter.isSelected())
                    {
                        output.println("With Fries");
                    }
                    else
                    {
                        output.println();
                    }
                }
                
                if(shawNum != 0)
                {
                    output.print(shawNum+" Classic Burger");
                    if(riceCounter.isSelected())
                    {
                        output.println("With Rice");
                    }
                    else
                    {
                        output.println();
                    }
                }
                
                if(waterNum != 0)
                {
                    output.println(waterNum+" Water");
                }
                
                if(sodaNum != 0)
                {
                    output.println(sodaNum+" Soda");
                }
                
                output.println("----------------");
                output.println("Sub Total : $"+SubTotal);
                output.println("Tax       : $"+Tax);
                output.println("Total     : $"+Total);
                output.println();
                output.println("Report Of The Day");
                
                output.close();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Alapaca.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveBillActionPerformed

    private void newBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBillActionPerformed
        if(Total != 0)
        {
            lambCounter.setValue(0);
            xMeatCounter.setSelected(false);
            lambPrice.setText("$0.00");
            chNCounter.setValue(0);
            xMeatCounter2.setSelected(false);
            chNPrice.setText("$0.00");
            falCounter.setValue(0);
            saladCounter.setSelected(false);
            falPrice.setText("$0.00");
            burCounter.setValue(0);
            friesCounter.setSelected(false);
            burPrice.setText("$0.00");
            shwCounter.setValue(0);
            riceCounter.setSelected(false);
            shawPrice.setText("$0.00");
            waterCounter.setValue(0);
            sodaCounter.setValue(0);
            drinkPrice.setText("$0.00");
            
            subTotal.setText("Sub Total :        $0.00");
            tax.setText("           Tax :        $0.00");
            total.setText("Total :        $0.00");
            
            SubTotal = 0.00;
            Tax = 0.00;
            Total = 0.00;
            
            guestNum++;
            guestNo.setText("GuestNo : "+guestNum);
            
        }
    }//GEN-LAST:event_newBillActionPerformed

    private void exitAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAppActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitAppActionPerformed

    private void lambCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lambCounterStateChanged
        lambNum = (Integer)lambCounter.getValue();
        LambPrice = lambNum * Lamb_Cost ;
        lambPrice.setText(LambPrice + "$");
    }//GEN-LAST:event_lambCounterStateChanged

    private void chNCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chNCounterStateChanged
        chiNum = (Integer)chNCounter.getValue();
        ChiPrice = chiNum * Chi_Cost ;
        chNPrice.setText(ChiPrice + "$");
    }//GEN-LAST:event_chNCounterStateChanged

    private void falCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_falCounterStateChanged
        falNum = (Integer)falCounter.getValue();
        FalPrice = falNum * Fal_Cost ;
        falPrice.setText(FalPrice + "$");
    }//GEN-LAST:event_falCounterStateChanged

    private void burCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_burCounterStateChanged
        burNum = (Integer)burCounter.getValue();
        BurPrice = burNum * Bur_Cost ;
        burPrice.setText(BurPrice + "$");
    }//GEN-LAST:event_burCounterStateChanged

    private void shwCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_shwCounterStateChanged
        shawNum = (Integer)shwCounter.getValue();
        ShawPrice = shawNum * Shaw_Cost ;
        shawPrice.setText(ShawPrice + "$");
    }//GEN-LAST:event_shwCounterStateChanged

    private void waterCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_waterCounterStateChanged
        waterNum = (Integer)waterCounter.getValue();
        DrinkPrice = (waterNum * Drink_Cost) + (sodaNum * Drink_Cost) ;
        drinkPrice.setText(DrinkPrice + "$");
    }//GEN-LAST:event_waterCounterStateChanged

    private void sodaCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sodaCounterStateChanged
        sodaNum = (Integer)sodaCounter.getValue();
        DrinkPrice = (waterNum * Drink_Cost) + (sodaNum * Drink_Cost) ;
        drinkPrice.setText(DrinkPrice + "$");
    }//GEN-LAST:event_sodaCounterStateChanged

    private void xMeatCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_xMeatCounterStateChanged
    // Nothing
    }//GEN-LAST:event_xMeatCounterStateChanged

    private void xMeatCounter2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_xMeatCounter2StateChanged
        //Nothing
    }//GEN-LAST:event_xMeatCounter2StateChanged

    private void saladCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_saladCounterStateChanged
        //Nothing
    }//GEN-LAST:event_saladCounterStateChanged

    private void friesCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_friesCounterStateChanged
        //Nothing
    }//GEN-LAST:event_friesCounterStateChanged

    private void riceCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_riceCounterStateChanged
        //Nothing
    }//GEN-LAST:event_riceCounterStateChanged

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
            java.util.logging.Logger.getLogger(Alapaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alapaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alapaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alapaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alapaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner burCounter;
    private javax.swing.JLabel burPrice;
    private javax.swing.JButton calculate;
    private javax.swing.JSpinner chNCounter;
    private javax.swing.JLabel chNPrice;
    private javax.swing.JLabel drinkPrice;
    private javax.swing.JButton exitApp;
    private javax.swing.JSpinner falCounter;
    private javax.swing.JLabel falPrice;
    private javax.swing.JCheckBox friesCounter;
    private javax.swing.JLabel guestNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner lambCounter;
    private javax.swing.JLabel lambPrice;
    private javax.swing.JButton newBill;
    private javax.swing.JCheckBox riceCounter;
    private javax.swing.JCheckBox saladCounter;
    private javax.swing.JButton saveBill;
    private javax.swing.JLabel shawPrice;
    private javax.swing.JSpinner shwCounter;
    private javax.swing.JSpinner sodaCounter;
    private javax.swing.JLabel subTotal;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel total;
    private javax.swing.JSpinner waterCounter;
    private javax.swing.JCheckBox xMeatCounter;
    private javax.swing.JCheckBox xMeatCounter2;
    // End of variables declaration//GEN-END:variables
}

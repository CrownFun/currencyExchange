package main;

import configuration.DriverManager;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrencyExchangeGui extends javax.swing.JFrame {

    public CurrencyExchangeGui() {
        initComponents();
        setScreen();
    }

    private static WebElement euroCurrency;
    private static WebElement usdCurrency;
    private static WebElement canadianCurrency;
    private static WebElement gbpCurrency;
    private static WebElement hkdCurrency;
    private static WebElement rubCurrency;
    private static WebElement nokCurrency;
    private static WebElement sekCurrency;
    private static WebElement dkkCurrency;
    private static WebElement hrkCurrency;
    private static WebElement jpyCurrency;
    private static WebElement info;

    private void setScreen() {
        labelEuro.setText(euroCurrency.getText());
        labelUSD.setText(usdCurrency.getText());
        labelCAD.setText(canadianCurrency.getText());
        labelGBP.setText(gbpCurrency.getText());
        labelHKD.setText(hkdCurrency.getText());
        labelRUB.setText(rubCurrency.getText());
        labelNOK.setText(nokCurrency.getText());
        labelSEK.setText(sekCurrency.getText());
        labelDKK.setText(dkkCurrency.getText());
        labelHRK.setText(hrkCurrency.getText());
        labelJPY.setText(jpyCurrency.getText());
        labelInfo.setText(info.getText().substring(32, 42));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelJPY = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        labelEuro = new javax.swing.JLabel();
        labelUSD = new javax.swing.JLabel();
        labelCAD = new javax.swing.JLabel();
        labelGBP = new javax.swing.JLabel();
        labelHKD = new javax.swing.JLabel();
        labelRUB = new javax.swing.JLabel();
        labelNOK = new javax.swing.JLabel();
        labelSEK = new javax.swing.JLabel();
        labelDKK = new javax.swing.JLabel();
        labelHRK = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        labelForeignCurrency = new javax.swing.JTextField();
        Combo = new javax.swing.JComboBox<>();
        labelPln = new javax.swing.JTextField();
        buttonExecute = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kursy Walut");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/euro.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 100, 50, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usa.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 140, 50, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canada.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 180, 50, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gb.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 220, 50, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swiss.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 260, 50, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/norway.jpg"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(20, 340, 50, 33);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/russia.jpg"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(20, 300, 50, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\GRZEŚ\\Documents\\NetBeansProjects\\KantorWalutowy\\norway.jpg")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 340, 50, 33);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sweden.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 380, 50, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dennmark.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 420, 50, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/croatia.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 460, 50, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japan.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 500, 50, 30);

        labelJPY.setBackground(new java.awt.Color(0, 0, 0));
        labelJPY.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelJPY.setForeground(new java.awt.Color(204, 0, 0));
        labelJPY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelJPY);
        labelJPY.setBounds(280, 500, 60, 30);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("JPY  -  jen japoński");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(80, 500, 190, 30);

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("EUR  -  euro");
        jLabel24.setToolTipText("");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(80, 100, 190, 30);

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("USD  -  dolar amerykański");
        jLabel23.setToolTipText("");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(80, 140, 190, 30);

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("CAD  -  dolar kanadyjski");
        jLabel25.setToolTipText("");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(80, 180, 190, 30);

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("GBP  -  funt brytyjski");
        jLabel26.setToolTipText("");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(80, 220, 190, 30);

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("HKD  -  frank szwajcarski");
        jLabel27.setToolTipText("");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(80, 260, 190, 30);

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("RUB  -  rubel rosyjski");
        jLabel28.setToolTipText("");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(80, 300, 190, 30);

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("NOK  -  korona norweska");
        jLabel29.setToolTipText("");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(80, 340, 190, 30);

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("SEK  -  korona szwedzka");
        jLabel30.setToolTipText("");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(80, 380, 190, 30);

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("DKK -   korona duńska");
        jLabel31.setToolTipText("");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(80, 420, 190, 30);

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("HRK  -  kuna chorwacka");
        jLabel32.setToolTipText("");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(80, 460, 190, 30);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(270, 100, 10, 430);

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSeparator2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(20, 130, 330, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(20, 170, 330, 2);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(20, 210, 330, 2);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(20, 250, 330, 10);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(20, 290, 330, 2);
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(20, 330, 330, 2);
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(20, 370, 330, 10);
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(20, 410, 330, 10);
        jPanel1.add(jSeparator10);
        jSeparator10.setBounds(20, 450, 330, 10);
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(20, 490, 330, 2);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(20, 530, 330, 10);

        labelEuro.setBackground(new java.awt.Color(0, 0, 0));
        labelEuro.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelEuro.setForeground(new java.awt.Color(204, 0, 0));
        labelEuro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelEuro);
        labelEuro.setBounds(280, 100, 60, 30);

        labelUSD.setBackground(new java.awt.Color(0, 0, 0));
        labelUSD.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelUSD.setForeground(new java.awt.Color(204, 0, 0));
        labelUSD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelUSD);
        labelUSD.setBounds(280, 140, 60, 30);

        labelCAD.setBackground(new java.awt.Color(0, 0, 0));
        labelCAD.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelCAD.setForeground(new java.awt.Color(204, 0, 0));
        labelCAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelCAD);
        labelCAD.setBounds(280, 180, 60, 30);

        labelGBP.setBackground(new java.awt.Color(0, 0, 0));
        labelGBP.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelGBP.setForeground(new java.awt.Color(204, 0, 0));
        labelGBP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelGBP);
        labelGBP.setBounds(280, 220, 60, 30);

        labelHKD.setBackground(new java.awt.Color(0, 0, 0));
        labelHKD.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelHKD.setForeground(new java.awt.Color(204, 0, 0));
        labelHKD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelHKD);
        labelHKD.setBounds(280, 260, 60, 30);

        labelRUB.setBackground(new java.awt.Color(0, 0, 0));
        labelRUB.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelRUB.setForeground(new java.awt.Color(204, 0, 0));
        labelRUB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelRUB);
        labelRUB.setBounds(280, 300, 60, 30);

        labelNOK.setBackground(new java.awt.Color(0, 0, 0));
        labelNOK.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelNOK.setForeground(new java.awt.Color(204, 0, 0));
        labelNOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelNOK);
        labelNOK.setBounds(280, 340, 60, 30);

        labelSEK.setBackground(new java.awt.Color(0, 0, 0));
        labelSEK.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelSEK.setForeground(new java.awt.Color(204, 0, 0));
        labelSEK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelSEK);
        labelSEK.setBounds(280, 380, 60, 30);

        labelDKK.setBackground(new java.awt.Color(0, 0, 0));
        labelDKK.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelDKK.setForeground(new java.awt.Color(204, 0, 0));
        labelDKK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelDKK);
        labelDKK.setBounds(280, 420, 60, 30);

        labelHRK.setBackground(new java.awt.Color(0, 0, 0));
        labelHRK.setFont(new java.awt.Font("DS-Digital", 1, 18)); // NOI18N
        labelHRK.setForeground(new java.awt.Color(204, 0, 0));
        labelHRK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelHRK);
        labelHRK.setBounds(280, 460, 60, 30);

        buttonExit.setBackground(new java.awt.Color(204, 0, 0));
        buttonExit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(0, 0, 0));
        buttonExit.setText("Wyjście");
        buttonExit.setBorder(null);
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExit);
        buttonExit.setBounds(520, 650, 80, 40);

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tabela kursów średnich walut obcych z dnia :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(20, 30, 340, 30);

        labelInfo.setBackground(new java.awt.Color(0, 0, 0));
        labelInfo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelInfo);
        labelInfo.setBounds(360, 30, 90, 30);

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Calibri", 3, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("<HTML>Powyższe dane pochodzą ze strony Narodowego Banku Polskiego i są aktualizowane w każdy dzień roboczy między godziną 11:45 a 12:15</HTML>");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(20, 550, 550, 40);

        labelForeignCurrency.setBackground(new java.awt.Color(255, 255, 255));
        labelForeignCurrency.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        labelForeignCurrency.setForeground(new java.awt.Color(0, 0, 0));
        labelForeignCurrency.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelForeignCurrency.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(labelForeignCurrency);
        labelForeignCurrency.setBounds(400, 110, 100, 30);

        Combo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Combo.setForeground(new java.awt.Color(0, 0, 0));
        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "USD", "CAD", "GBP", "HKD", "RUB", "NOK", "SEK", "DKK", "HRK", "JPY" }));
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });
        jPanel1.add(Combo);
        Combo.setBounds(510, 110, 60, 30);

        labelPln.setBackground(new java.awt.Color(255, 255, 255));
        labelPln.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        labelPln.setForeground(new java.awt.Color(0, 0, 0));
        labelPln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelPln.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(labelPln);
        labelPln.setBounds(400, 290, 100, 30);

        buttonExecute.setBackground(new java.awt.Color(204, 0, 0));
        buttonExecute.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        buttonExecute.setForeground(new java.awt.Color(0, 0, 0));
        buttonExecute.setText("Oblicz");
        buttonExecute.setBorder(null);
        buttonExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExecuteActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExecute);
        buttonExecute.setBounds(400, 200, 140, 40);

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("ZŁ");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(510, 290, 30, 30);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("O Programie");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 632, 80, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void aboutProgram() throws HeadlessException {
        JOptionPane.showMessageDialog(null,
                "Program \"Kantor Walutowy\" służy pobierania aktulnych kursów walut ze strony Narodowego Banku Polskiego \"http://www.nbp.pl\"\n"
                + "Dodatkowo program przelicza kwotę obcej waluty na PLN przy aktulanym kursie.\n\n"
                + "Autor:  Grzegorz Filewicz\n"
                + "Lublin, Marzec 2018.",
                "INFO", JOptionPane.INFORMATION_MESSAGE);
    }

    private void exitProgram() throws HeadlessException {
        int exit = JOptionPane.showConfirmDialog(rootPane, "Czy napewno chcesz wyjść?", "Notatnik", JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            this.dispose();
            DriverManager.disposeDriver();
        } else if (exit == JOptionPane.NO_OPTION) {
        }
    }

    private static void findWebElements(WebDriver driver) {
        euroCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(9) > td:nth-child(3)"));
        usdCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(3) > td:nth-child(3)"));
        canadianCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(6) > td:nth-child(3)"));
        gbpCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(12) > td:nth-child(3)"));
        hkdCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(11) > td:nth-child(3)"));
        rubCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(31) > td:nth-child(3)"));
        nokCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(18) > td:nth-child(3)"));
        sekCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(19) > td:nth-child(3)"));
        dkkCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(16) > td:nth-child(3)"));
        hrkCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(20) > td:nth-child(3)"));
        jpyCurrency = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > table.pad5 > tbody > tr:nth-child(14) > td:nth-child(3)"));
        info = driver.findElement(By.cssSelector("#article > table > tbody > tr > td > center > p"));
    }

    private void calculateMoney() {

        String ForeignCurrencyText = labelForeignCurrency.getText();

        if (ForeignCurrencyText.contains(".")) {
            ForeignCurrencyText = ForeignCurrencyText.replace(".", ",");
        } else if (ForeignCurrencyText.contains(",")) {
            ForeignCurrencyText = ForeignCurrencyText.replace(",", ".");
        }

        double ForeingCurrency = 0;

        try {
            ForeingCurrency = Double.parseDouble(ForeignCurrencyText);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Podaj kwotę - bez liter i znaków specjalnych", "Błąd", JOptionPane.ERROR_MESSAGE);
        }

        if (ForeingCurrency <= 1000000 && ForeingCurrency >= 0) {
            if ("EUR".equals(Combo.getSelectedItem())) {
                String euroFactor = labelEuro.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(euroFactor) * ForeingCurrency));
            } else if ("USD".equals(Combo.getSelectedItem())) {
                String usdFactor = labelUSD.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(usdFactor) * ForeingCurrency));
            } else if ("CAD".equals(Combo.getSelectedItem())) {
                String cadFactor = labelCAD.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(cadFactor) * ForeingCurrency));
            } else if ("GBP".equals(Combo.getSelectedItem())) {
                String gbpFactor = labelGBP.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(gbpFactor) * ForeingCurrency));
            } else if ("HKD".equals(Combo.getSelectedItem())) {
                String hkdFactor = labelHKD.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(hkdFactor) * ForeingCurrency));
            } else if ("RUB".equals(Combo.getSelectedItem())) {
                String rubFactor = labelRUB.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(rubFactor) * ForeingCurrency));
            } else if ("NOK".equals(Combo.getSelectedItem())) {
                String nokFactor = labelNOK.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(nokFactor) * ForeingCurrency));
            } else if ("SEK".equals(Combo.getSelectedItem())) {
                String sekFactor = labelSEK.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(sekFactor) * ForeingCurrency));
            } else if ("DKK".equals(Combo.getSelectedItem())) {
                String dkkFactor = labelDKK.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(dkkFactor) * ForeingCurrency));
            } else if ("HRK".equals(Combo.getSelectedItem())) {
                String hrkFactor = labelHRK.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(hrkFactor) * ForeingCurrency));
            } else if ("JPY".equals(Combo.getSelectedItem())) {
                String jpyFactor = labelJPY.getText().replace(",", ".");
                labelPln.setText(String.format("%.2f", Double.parseDouble(jpyFactor) * ForeingCurrency));
            } else {
                JOptionPane.showMessageDialog(null, "Podaj poprawną wartość", "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        exitProgram();
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExecuteActionPerformed
        calculateMoney();
    }//GEN-LAST:event_buttonExecuteActionPerformed

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed

    }//GEN-LAST:event_ComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        aboutProgram();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyExchangeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        DriverManager.configureAndNavigate();
        findWebElements(DriverManager.getWebDriver());

        java.awt.EventQueue.invokeLater(() -> {
            new CurrencyExchangeGui().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JButton buttonExecute;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelCAD;
    private javax.swing.JLabel labelDKK;
    private javax.swing.JLabel labelEuro;
    private javax.swing.JTextField labelForeignCurrency;
    private javax.swing.JLabel labelGBP;
    private javax.swing.JLabel labelHKD;
    private javax.swing.JLabel labelHRK;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelJPY;
    private javax.swing.JLabel labelNOK;
    private javax.swing.JTextField labelPln;
    private javax.swing.JLabel labelRUB;
    private javax.swing.JLabel labelSEK;
    private javax.swing.JLabel labelUSD;
    // End of variables declaration//GEN-END:variables
}

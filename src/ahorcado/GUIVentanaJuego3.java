/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;
import javax.swing.JOptionPane;
/**
 *
 * 
 */
public class GUIVentanaJuego3 extends javax.swing.JFrame implements Runnable{
    Juego j = new Juego();
    private int seg=40;
    private Thread t;
    /**
     * Creates new form GUIVentanaJuego3
     */
    public GUIVentanaJuego3() {
        initComponents();
        this.setLocationRelativeTo(null);
        bloquear();
        j = new Juego();
        t = new Thread(this);
        mono.setVisible(true);
        mono1.setVisible(false);
        mono2.setVisible(false);
        mono3.setVisible(false);
        mono4.setVisible(false);
        mono5.setVisible(false);
    }
    
    public void run()
    {
        try
        {
            for(;;)
            {
                if(j.aciertos==j.palabra.length())
                {
                    ganar();
                    t.stop();
                }
                if(seg==0)
                {
                    if(j.aciertos != j.palabra.length())
                    {
                        j.Vidas=5;
                        t.stop();
                        error();
                    }
                }
                seg--;
                S.setText(""+seg);
                t.sleep(1000);
            }
        }catch(InterruptedException e)
        {
        }
    }
    
    public void checar()
    {
        j.correcto=false;
        j.verificar();
        if(j.correcto==false)
        {
            j.Vidas++;
            error();
        }
        Adivinar.setText("");
        for(int i=0;i<j.respuesta.length;i++)
        {
            Adivinar.setText(Adivinar.getText()+j.respuesta[i]+" ");
        }
    }
    
    public void ganar()
    {
        GUIGanar v = new GUIGanar();
        if(j.aciertos==j.palabra.length())
        {
            v.setVisible(true);
            this.setVisible(false);
        }
    }
    public void error()
    {
        GUIPerder v = new GUIPerder();
        if(j.Vidas==1)
        {
            mono.setVisible(false);
            mono1.setVisible(true);
            mono2.setVisible(false);
            mono3.setVisible(false);
            mono4.setVisible(false);
            mono5.setVisible(false);
        }
        if(j.Vidas==2)
        {
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(true);
            mono3.setVisible(false);
            mono4.setVisible(false);
            mono5.setVisible(false);
        } 
        if(j.Vidas==3)
        {
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(false);
            mono3.setVisible(true);
            mono4.setVisible(false);
            mono5.setVisible(false);
        }
        if(j.Vidas==4)
        {
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(false);
            mono3.setVisible(false);
            mono4.setVisible(true);
            mono5.setVisible(false);
        }
        if(j.Vidas==5)
        {
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(false);
            mono3.setVisible(false);
            mono4.setVisible(false);
            mono5.setVisible(true);
            JOptionPane.showMessageDialog(null,"Haz perdido la respuesta era: "+j.palabra,"AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            v.setVisible(true);
            this.setVisible(false);
        }
        
    }
    
    public void bloquear()
    {
        BA.setEnabled(false);
        BB.setEnabled(false);
        BC.setEnabled(false);
        BD.setEnabled(false);
        BE.setEnabled(false);
        BF.setEnabled(false);
        BG.setEnabled(false);
        BH.setEnabled(false);
        BI.setEnabled(false);
        BJ.setEnabled(false);
        BK.setEnabled(false);
        BL.setEnabled(false);
        BM.setEnabled(false);
        BN.setEnabled(false);
        BO.setEnabled(false);
        BP.setEnabled(false);
        BQ.setEnabled(false);
        BR.setEnabled(false);
        BS.setEnabled(false);
        BT.setEnabled(false);
        BU.setEnabled(false);
        BV.setEnabled(false);
        BW.setEnabled(false);
        BX.setEnabled(false);
        BY.setEnabled(false);
        BZ.setEnabled(false);
        NUE.setEnabled(false);
    }
    
    public void desbloquear()
    {
        BA.setEnabled(true);
        BB.setEnabled(true);
        BC.setEnabled(true);
        BD.setEnabled(true);
        BE.setEnabled(true);
        BF.setEnabled(true);
        BG.setEnabled(true);
        BH.setEnabled(true);
        BI.setEnabled(true);
        BJ.setEnabled(true);
        BK.setEnabled(true);
        BL.setEnabled(true);
        BM.setEnabled(true);
        BN.setEnabled(true);
        BO.setEnabled(true);
        BP.setEnabled(true);
        BQ.setEnabled(true);
        BR.setEnabled(true);
        BS.setEnabled(true);
        BT.setEnabled(true);
        BU.setEnabled(true);
        BV.setEnabled(true);
        BW.setEnabled(true);
        BX.setEnabled(true);
        BY.setEnabled(true);
        BZ.setEnabled(true);
        NUE.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        BF = new javax.swing.JButton();
        BT = new javax.swing.JButton();
        BZ = new javax.swing.JButton();
        BY = new javax.swing.JButton();
        BJ = new javax.swing.JButton();
        BR = new javax.swing.JButton();
        BD = new javax.swing.JButton();
        BL = new javax.swing.JButton();
        BN = new javax.swing.JButton();
        BU = new javax.swing.JButton();
        BB = new javax.swing.JButton();
        BI = new javax.swing.JButton();
        BS = new javax.swing.JButton();
        BG = new javax.swing.JButton();
        BV = new javax.swing.JButton();
        BA = new javax.swing.JButton();
        BX = new javax.swing.JButton();
        BK = new javax.swing.JButton();
        BW = new javax.swing.JButton();
        BO = new javax.swing.JButton();
        BP = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BM = new javax.swing.JButton();
        BH = new javax.swing.JButton();
        BQ = new javax.swing.JButton();
        BC = new javax.swing.JButton();
        BE = new javax.swing.JButton();
        NUE = new javax.swing.JButton();
        Tipo = new javax.swing.JComboBox<>();
        Adivinar = new javax.swing.JLabel();
        mono = new javax.swing.JLabel();
        mono1 = new javax.swing.JLabel();
        mono2 = new javax.swing.JLabel();
        mono3 = new javax.swing.JLabel();
        mono4 = new javax.swing.JLabel();
        mono5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(250, 41, 8));
        jButton1.setFont(new java.awt.Font("NanumMyeongjo", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(41, 41, 41));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 70, 40));

        BF.setBackground(new java.awt.Color(142, 142, 89));
        BF.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BF.setText("F");
        BF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFActionPerformed(evt);
            }
        });
        getContentPane().add(BF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 50, 40));

        BT.setBackground(new java.awt.Color(142, 142, 89));
        BT.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BT.setText("T");
        BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTActionPerformed(evt);
            }
        });
        getContentPane().add(BT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 50, 40));

        BZ.setBackground(new java.awt.Color(142, 142, 89));
        BZ.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BZ.setText("Z");
        BZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BZActionPerformed(evt);
            }
        });
        getContentPane().add(BZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 50, 40));

        BY.setBackground(new java.awt.Color(142, 142, 89));
        BY.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BY.setText("Y");
        BY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BYActionPerformed(evt);
            }
        });
        getContentPane().add(BY, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 60, 40));

        BJ.setBackground(new java.awt.Color(142, 142, 89));
        BJ.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BJ.setText("J");
        BJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJActionPerformed(evt);
            }
        });
        getContentPane().add(BJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 50, 40));

        BR.setBackground(new java.awt.Color(142, 142, 89));
        BR.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BR.setText("R");
        BR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRActionPerformed(evt);
            }
        });
        getContentPane().add(BR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 50, 40));

        BD.setBackground(new java.awt.Color(142, 142, 89));
        BD.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BD.setText("D");
        BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDActionPerformed(evt);
            }
        });
        getContentPane().add(BD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 50, 40));

        BL.setBackground(new java.awt.Color(142, 142, 89));
        BL.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BL.setText("L");
        BL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLActionPerformed(evt);
            }
        });
        getContentPane().add(BL, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 50, 40));

        BN.setBackground(new java.awt.Color(142, 142, 89));
        BN.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BN.setText("N");
        BN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNActionPerformed(evt);
            }
        });
        getContentPane().add(BN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 50, 40));

        BU.setBackground(new java.awt.Color(142, 142, 89));
        BU.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BU.setText("U");
        BU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUActionPerformed(evt);
            }
        });
        getContentPane().add(BU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 50, 40));

        BB.setBackground(new java.awt.Color(142, 142, 89));
        BB.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BB.setText("B");
        BB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBActionPerformed(evt);
            }
        });
        getContentPane().add(BB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 50, 40));

        BI.setBackground(new java.awt.Color(142, 142, 89));
        BI.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BI.setText("I");
        BI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIActionPerformed(evt);
            }
        });
        getContentPane().add(BI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 50, 40));

        BS.setBackground(new java.awt.Color(142, 142, 89));
        BS.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BS.setText("S");
        BS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSActionPerformed(evt);
            }
        });
        getContentPane().add(BS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 50, 40));

        BG.setBackground(new java.awt.Color(142, 142, 89));
        BG.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BG.setText("G");
        BG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGActionPerformed(evt);
            }
        });
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 50, 40));

        BV.setBackground(new java.awt.Color(142, 142, 89));
        BV.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BV.setText("V");
        BV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVActionPerformed(evt);
            }
        });
        getContentPane().add(BV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 50, 40));

        BA.setBackground(new java.awt.Color(142, 142, 89));
        BA.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BA.setText("A");
        BA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAActionPerformed(evt);
            }
        });
        getContentPane().add(BA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, 40));

        BX.setBackground(new java.awt.Color(142, 142, 89));
        BX.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BX.setText("X");
        BX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BXActionPerformed(evt);
            }
        });
        getContentPane().add(BX, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 50, 40));

        BK.setBackground(new java.awt.Color(142, 142, 89));
        BK.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BK.setText("K");
        BK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKActionPerformed(evt);
            }
        });
        getContentPane().add(BK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 50, 40));

        BW.setBackground(new java.awt.Color(142, 142, 89));
        BW.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BW.setText("W");
        BW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BWActionPerformed(evt);
            }
        });
        getContentPane().add(BW, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 50, 40));

        BO.setBackground(new java.awt.Color(142, 142, 89));
        BO.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BO.setText("O");
        BO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOActionPerformed(evt);
            }
        });
        getContentPane().add(BO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 50, 40));

        BP.setBackground(new java.awt.Color(142, 142, 89));
        BP.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BP.setText("P");
        BP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPActionPerformed(evt);
            }
        });
        getContentPane().add(BP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 50, 40));

        jButton3.setBackground(new java.awt.Color(250, 41, 8));
        jButton3.setFont(new java.awt.Font("NanumMyeongjo", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(41, 41, 41));
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 70, 40));

        BM.setBackground(new java.awt.Color(142, 142, 89));
        BM.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BM.setText("M");
        BM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMActionPerformed(evt);
            }
        });
        getContentPane().add(BM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 50, 40));

        BH.setBackground(new java.awt.Color(142, 142, 89));
        BH.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BH.setText("H");
        BH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHActionPerformed(evt);
            }
        });
        getContentPane().add(BH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 40));

        BQ.setBackground(new java.awt.Color(142, 142, 89));
        BQ.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BQ.setText("Q");
        BQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQActionPerformed(evt);
            }
        });
        getContentPane().add(BQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 50, 40));

        BC.setBackground(new java.awt.Color(142, 142, 89));
        BC.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BC.setText("C");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });
        getContentPane().add(BC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 50, 40));

        BE.setBackground(new java.awt.Color(142, 142, 89));
        BE.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BE.setText("E");
        BE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEActionPerformed(evt);
            }
        });
        getContentPane().add(BE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 50, 40));

        NUE.setBackground(new java.awt.Color(153, 0, 0));
        NUE.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        NUE.setText("Nuevo");
        NUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEActionPerformed(evt);
            }
        });
        getContentPane().add(NUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        Tipo.setBackground(new java.awt.Color(153, 0, 0));
        Tipo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "File", "Pais", "Comida", "Nombre" }));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });
        getContentPane().add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        Adivinar.setBackground(new java.awt.Color(142, 142, 89));
        Adivinar.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        Adivinar.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Adivinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 400, 40));
        getContentPane().add(mono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 320, 350));

        mono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/base.png"))); // NOI18N
        getContentPane().add(mono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 320, 350));

        mono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AhorcadoCabeza.png"))); // NOI18N
        getContentPane().add(mono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 320, 350));

        mono3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AhorcadoCuerpo.png"))); // NOI18N
        getContentPane().add(mono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 320, 350));

        mono4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AhorcadoUnPie.png"))); // NOI18N
        getContentPane().add(mono4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 320, 350));

        mono5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AhorcadoCompleto.png"))); // NOI18N
        getContentPane().add(mono5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 320, 350));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Tiempo: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("segundos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 90, 30));

        S.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        S.setText("00");
        getContentPane().add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 30));

        Regresar.setBackground(new java.awt.Color(201, 13, 13));
        Regresar.setFont(new java.awt.Font("NanumMyeongjo", 1, 15)); // NOI18N
        Regresar.setForeground(new java.awt.Color(41, 41, 41));
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reserbado.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GUIGracias g = new GUIGracias();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Salir
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAActionPerformed
        // TODO add your handling code here:
        j.letra='A';
        BA.setEnabled(false);
        checar();
    }//GEN-LAST:event_BAActionPerformed

    private void BBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBActionPerformed
        // TODO add your handling code here:
        j.letra='B';
        BB.setEnabled(false);
        checar();
    }//GEN-LAST:event_BBActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        // TODO add your handling code here:
        j.letra='C';
        BC.setEnabled(false);
        checar();
    }//GEN-LAST:event_BCActionPerformed

    private void BDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDActionPerformed
        // TODO add your handling code here:
        j.letra='D';
        BD.setEnabled(false);
        checar();
    }//GEN-LAST:event_BDActionPerformed

    private void BEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEActionPerformed
        // TODO add your handling code here:
        j.letra='E';
        BE.setEnabled(false);
        checar();
    }//GEN-LAST:event_BEActionPerformed

    private void BFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFActionPerformed
        // TODO add your handling code here:
        j.letra='F';
        BF.setEnabled(false);
        checar();
    }//GEN-LAST:event_BFActionPerformed

    private void BGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGActionPerformed
        // TODO add your handling code here:
        j.letra='G';
        BG.setEnabled(false);
        checar();
    }//GEN-LAST:event_BGActionPerformed

    private void BHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHActionPerformed
        // TODO add your handling code here:
        j.letra='H';
        BH.setEnabled(false);
        checar();
    }//GEN-LAST:event_BHActionPerformed

    private void BIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIActionPerformed
        // TODO add your handling code here:
        j.letra='I';
        BI.setEnabled(false);
        checar();
    }//GEN-LAST:event_BIActionPerformed

    private void BJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJActionPerformed
        // TODO add your handling code here:
        j.letra='J';
        BJ.setEnabled(false);
        checar();
    }//GEN-LAST:event_BJActionPerformed

    private void BKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKActionPerformed
        // TODO add your handling code here:
        j.letra='K';
        BK.setEnabled(false);
        checar();
    }//GEN-LAST:event_BKActionPerformed

    private void BLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLActionPerformed
        // TODO add your handling code here:
        j.letra='L';
        BL.setEnabled(false);
        checar();
    }//GEN-LAST:event_BLActionPerformed

    private void BMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMActionPerformed
        // TODO add your handling code here:
        j.letra='M';
        BM.setEnabled(false);
        checar();
    }//GEN-LAST:event_BMActionPerformed

    private void BNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNActionPerformed
        // TODO add your handling code here:
        j.letra='N';
        BN.setEnabled(false);
        checar();
    }//GEN-LAST:event_BNActionPerformed

    private void BOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOActionPerformed
        // TODO add your handling code here:
        j.letra='O';
        BO.setEnabled(false);
        checar();
    }//GEN-LAST:event_BOActionPerformed

    private void BPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPActionPerformed
        // TODO add your handling code here:
        j.letra='P';
        BP.setEnabled(false);
        checar();
    }//GEN-LAST:event_BPActionPerformed

    private void BQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQActionPerformed
        // TODO add your handling code here:
        j.letra='Q';
        BQ.setEnabled(false);
        checar();
    }//GEN-LAST:event_BQActionPerformed

    private void BRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRActionPerformed
        // TODO add your handling code here:
        j.letra='R';
        BR.setEnabled(false);
        checar();
    }//GEN-LAST:event_BRActionPerformed

    private void BSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSActionPerformed
        // TODO add your handling code here:
        j.letra='S';
        BS.setEnabled(false);
        checar();
    }//GEN-LAST:event_BSActionPerformed

    private void BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTActionPerformed
        // TODO add your handling code here:
        j.letra='T';
        BT.setEnabled(false);
        checar();
    }//GEN-LAST:event_BTActionPerformed

    private void BUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUActionPerformed
        // TODO add your handling code here:
        j.letra='U';
        BU.setEnabled(false);
        checar();
    }//GEN-LAST:event_BUActionPerformed

    private void BVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVActionPerformed
        // TODO add your handling code here:
        j.letra='V';
        BV.setEnabled(false);
        checar();
    }//GEN-LAST:event_BVActionPerformed

    private void BWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BWActionPerformed
        // TODO add your handling code here:
        j.letra='W';
        BW.setEnabled(false);
        checar();
    }//GEN-LAST:event_BWActionPerformed

    private void BXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BXActionPerformed
        // TODO add your handling code here:
        j.letra='X';
        BX.setEnabled(false);
        checar();
    }//GEN-LAST:event_BXActionPerformed

    private void BYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BYActionPerformed
        // TODO add your handling code here:
        j.letra='Y';
        BY.setEnabled(false);
        checar();
    }//GEN-LAST:event_BYActionPerformed

    private void BZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BZActionPerformed
        // TODO add your handling code here:
        j.letra='Z';
        BZ.setEnabled(false);
        checar();
    }//GEN-LAST:event_BZActionPerformed

    private void NUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEActionPerformed
        // TODO add your handling code here:
//        desbloquearTipo();
        Tipo.setEnabled(true);
        bloquear();
        Adivinar.setText("");
        j.Vidas=0;
        j.aciertos=0;
        mono.setVisible(true);
        mono1.setVisible(false);
        mono2.setVisible(false);
        mono3.setVisible(false);
        mono4.setVisible(false);
        mono5.setVisible(false);
        t.stop();
    }//GEN-LAST:event_NUEActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
        if((String)Tipo.getSelectedItem()=="Pais")
        {
            Pais p = new Pais();
            j.palabra = p.escogerPalabra();
            t.start();
        }
        if((String)Tipo.getSelectedItem()=="Comida")
        {
            Comida c= new Comida();
            j.palabra= c.escogerPalabra();
            t.start();
        }
        if((String)Tipo.getSelectedItem()=="Nombre")
        {
            Nombre n = new Nombre();
            j.palabra = n.escogerPalabra();
            t.start();
        }
        Adivinar.setText("");
        desbloquear();
        Tipo.setEnabled(false);
        j.resp();
        for(int i=0;i<j.palabra.length();i++)
        {
            Adivinar.setText(Adivinar.getText()+j.respuesta[i]+" ");
        }
    }//GEN-LAST:event_TipoActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // Regresar al inicio.
        GuiInicio a=new GuiInicio();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIVentanaJuego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIVentanaJuego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIVentanaJuego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIVentanaJuego3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIVentanaJuego3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adivinar;
    private javax.swing.JButton BA;
    private javax.swing.JButton BB;
    private javax.swing.JButton BC;
    private javax.swing.JButton BD;
    private javax.swing.JButton BE;
    private javax.swing.JButton BF;
    private javax.swing.JButton BG;
    private javax.swing.JButton BH;
    private javax.swing.JButton BI;
    private javax.swing.JButton BJ;
    private javax.swing.JButton BK;
    private javax.swing.JButton BL;
    private javax.swing.JButton BM;
    private javax.swing.JButton BN;
    private javax.swing.JButton BO;
    private javax.swing.JButton BP;
    private javax.swing.JButton BQ;
    private javax.swing.JButton BR;
    private javax.swing.JButton BS;
    private javax.swing.JButton BT;
    private javax.swing.JButton BU;
    private javax.swing.JButton BV;
    private javax.swing.JButton BW;
    private javax.swing.JButton BX;
    private javax.swing.JButton BY;
    private javax.swing.JButton BZ;
    private javax.swing.JButton NUE;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel S;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mono;
    private javax.swing.JLabel mono1;
    private javax.swing.JLabel mono2;
    private javax.swing.JLabel mono3;
    private javax.swing.JLabel mono4;
    private javax.swing.JLabel mono5;
    // End of variables declaration//GEN-END:variables
}

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
public class GUIVentanaJuego2 extends javax.swing.JFrame {
    DosJugadores d = new DosJugadores();
    private boolean juega1=false;
    private int vida1=0,vida2=0,cont1=0, cont2=0;
    /**
     * Creates new form GUIVentanaJuego2
     */
    public GUIVentanaJuego2() {
        initComponents();
        this.setLocationRelativeTo(null);
        d = new DosJugadores();
        A1.setVisible(true);
        P1.setVisible(true);
        G1.setVisible(true);
        A2.setVisible(false);
        P2.setVisible(false);
        G2.setVisible(false);
        mono.setVisible(true);
        mono1.setVisible(false);
        mono2.setVisible(false);
        mono3.setVisible(false);
        mono4.setVisible(false);
        mono5.setVisible(false);
        olcultar();
    }
    
    public void jugador()
    {
        Adivinar.setText("");
        desbloquear();
        d.resp1();
        for(int i=0;i<d.p.length();i++)
        {
            Adivinar.setText(Adivinar.getText()+d.respuesta[i]+" ");
        }
    }
    public void checar()
    {
        d.correcto=false;
        d.verificar(d.letra);
        if(d.correcto==false)
        {
            d.Vidas++;
            error();
        }
        Adivinar.setText("");
        for(int i=0;i<d.respuesta.length;i++)
        {
            Adivinar.setText(Adivinar.getText()+d.respuesta[i]+" ");
        }
        ganar();
    }
    public void ganar()
    {
        GUITipoJuego v = new GUITipoJuego();
        if(d.aciertos==d.p.length())
        {
            cont2=1;
            JOptionPane.showMessageDialog(null,"¡¡Haz adivinado la palabra"
                    + "\nAhora el Ahorcadonito1 taratara de adivinar la palabra del Ahorcadonito2","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            Adivinar.setText("");
            juega1=true;
            jugador2();
        }
    }
    public void error()
    {
        GUITipoJuego v = new GUITipoJuego();
        if(d.Vidas==0)
        {
            vida1=d.Vidas;
            mono.setVisible(true);
            mono1.setVisible(false);
            mono2.setVisible(false);
            mono3.setVisible(false);
            mono4.setVisible(false);
            mono5.setVisible(false); 
        }
        if(d.Vidas==1)
        {
            vida1=d.Vidas;
            mono.setVisible(false);
            mono1.setVisible(true);
            mono2.setVisible(false);
            mono3.setVisible(false);
            mono4.setVisible(false);
            mono5.setVisible(false);
        }
        if(d.Vidas==2)
        {
            vida1=d.Vidas;
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(true);
            mono3.setVisible(false);
            mono4.setVisible(false);
            mono5.setVisible(false);
        } 
        if(d.Vidas==3)
        {
            vida1=d.Vidas;
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(false);
            mono3.setVisible(true);
            mono4.setVisible(false);
            mono5.setVisible(false);
        }
        if(d.Vidas==4)
        {
            vida1=d.Vidas;
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(false);
            mono3.setVisible(false);
            mono4.setVisible(true);
            mono5.setVisible(false);
        }
        if(d.Vidas==5)
        {
            vida1=d.Vidas;
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(false);
            mono3.setVisible(false);
            mono4.setVisible(false);
            mono5.setVisible(true);
            JOptionPane.showMessageDialog(null,"No haz adivinado, la respuesta era: "+d.p+
                    "\nAhora el Ahorcadonito1 taratara de adivinar la palabra del Ahorcadonito2","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            Adivinar.setText("");
            juega1=true;
            jugador2();
        }
    }
    
    public void jugador2()
    {
        Adivinar.setText("");
        desbloquear();
        d.respuesta= new char[d.p2.length()];
        d.Vidas=0;
        d.aciertos=0;
        mono.setVisible(true);
        mono1.setVisible(false);
        mono2.setVisible(false);
        mono3.setVisible(false);
        mono4.setVisible(false);
        mono5.setVisible(false);
        d.resp2();
        for(int i=0;i<d.p2.length();i++)
        {
            Adivinar.setText(Adivinar.getText()+d.respuesta[i]+" ");
        }
    }
    public void checar2()
    {
        d.correcto=false;
        d.verificar2();
        if(d.correcto==false)
        {
            d.Vidas++;
            error2();
        }
        Adivinar.setText("");
        for(int i=0;i<d.respuesta.length;i++)
        {
            Adivinar.setText(Adivinar.getText()+d.respuesta[i]+" ");
        }
        ganar2();
    }
    public void ganar2()
    {
        GUITipoJuego v = new GUITipoJuego();
        if(d.aciertos==d.p2.length())
        {
            cont1=1;
            JOptionPane.showMessageDialog(null,"¡¡Haz adivinado la palabra!!","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            decirGanador();
        }
    }
    public void error2()
    {
        if(d.Vidas==1)
        {
            vida2=d.Vidas;
            mono.setVisible(false);
            mono1.setVisible(true);
            mono2.setVisible(false);
            mono3.setVisible(false);
            mono4.setVisible(false);
            mono5.setVisible(false);
        }
        if(d.Vidas==2)
        {
            vida2=d.Vidas;
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(true);
            mono3.setVisible(false);
            mono4.setVisible(false);
            mono5.setVisible(false);
        } 
        if(d.Vidas==3)
        {
            vida2=d.Vidas;
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(false);
            mono3.setVisible(true);
            mono4.setVisible(false);
            mono5.setVisible(false);
        }
        if(d.Vidas==4)
        {
            vida2=d.Vidas;
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(false);
            mono3.setVisible(false);
            mono4.setVisible(true);
            mono5.setVisible(false);
        }
        if(d.Vidas==5)
        {
            vida2=d.Vidas;
            mono.setVisible(false);
            mono1.setVisible(false);
            mono2.setVisible(false);
            mono3.setVisible(false);
            mono4.setVisible(false);
            mono5.setVisible(true);
            JOptionPane.showMessageDialog(null,"No haz adivinado, respuesta era: "+d.p2,"AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            decirGanador();
        }
    }
    
    public void decirGanador()
    {
        GUIGanar v = new GUIGanar();
        GUIPerder v2 = new GUIPerder();
        if(cont1 == 1 && cont2 == 0)
        {
            v.setVisible(true);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"EL ganador es el Ahorcadonito1","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
        }
        if(cont1 == 0 && cont2 == 1)
        {
            v.setVisible(true);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"EL ganador es el Ahorcadonito2","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
        }
        if(cont1 == 1 && cont2 == 1)
        {
            if(vida1<vida2)
            {
                v.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"EL ganador es el Ahorcadonito2","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            }
            if(vida1>vida2)
            {
                v.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"EL ganador es el Ahorcadonito1","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            }
            if(vida1==vida2)
            {
                v.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Ambos ganaron","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(cont1 == 0 && cont2 == 0)
        {
            if(vida1<vida2)
            {
                v.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"EL ganador es el Ahorcadonito2","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            }
            if(vida1>vida2)
            {
                v.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"EL ganador es el Ahorcadonito1","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            }
            if(vida1==vida2)
            {
                v2.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Ninguno es el ganador","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            }
        }
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
    }
    public void olcultar()
    {
        BA.setVisible(false);
        BB.setVisible(false);
        BC.setVisible(false);
        BD.setVisible(false);
        BE.setVisible(false);
        BF.setVisible(false);
        BG.setVisible(false);
        BH.setVisible(false);
        BI.setVisible(false);
        BJ.setVisible(false);
        BK.setVisible(false);
        BL.setVisible(false);
        BM.setVisible(false);
        BN.setVisible(false);
        BO.setVisible(false);
        BP.setVisible(false);
        BQ.setVisible(false);
        BR.setVisible(false);
        BS.setVisible(false);
        BT.setVisible(false);
        BU.setVisible(false);
        BV.setVisible(false);
        BW.setVisible(false);
        BX.setVisible(false);
        BY.setVisible(false);
        BZ.setVisible(false);
    }
    public void mostrar()
    {
        BA.setVisible(true);
        BB.setVisible(true);
        BC.setVisible(true);
        BD.setVisible(true);
        BE.setVisible(true);
        BF.setVisible(true);
        BG.setVisible(true);
        BH.setVisible(true);
        BI.setVisible(true);
        BJ.setVisible(true);
        BK.setVisible(true);
        BL.setVisible(true);
        BM.setVisible(true);
        BN.setVisible(true);
        BO.setVisible(true);
        BP.setVisible(true);
        BQ.setVisible(true);
        BR.setVisible(true);
        BS.setVisible(true);
        BT.setVisible(true);
        BU.setVisible(true);
        BV.setVisible(true);
        BW.setVisible(true);
        BX.setVisible(true);
        BY.setVisible(true);
        BZ.setVisible(true);
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
        Adivinar = new javax.swing.JLabel();
        BA = new javax.swing.JButton();
        BB = new javax.swing.JButton();
        BC = new javax.swing.JButton();
        BD = new javax.swing.JButton();
        BE = new javax.swing.JButton();
        BF = new javax.swing.JButton();
        BG = new javax.swing.JButton();
        BH = new javax.swing.JButton();
        BI = new javax.swing.JButton();
        BJ = new javax.swing.JButton();
        BK = new javax.swing.JButton();
        BL = new javax.swing.JButton();
        BM = new javax.swing.JButton();
        BN = new javax.swing.JButton();
        BO = new javax.swing.JButton();
        BP = new javax.swing.JButton();
        BQ = new javax.swing.JButton();
        BR = new javax.swing.JButton();
        BS = new javax.swing.JButton();
        BT = new javax.swing.JButton();
        BU = new javax.swing.JButton();
        BV = new javax.swing.JButton();
        BW = new javax.swing.JButton();
        BX = new javax.swing.JButton();
        BY = new javax.swing.JButton();
        BZ = new javax.swing.JButton();
        mono = new javax.swing.JLabel();
        mono1 = new javax.swing.JLabel();
        mono2 = new javax.swing.JLabel();
        mono3 = new javax.swing.JLabel();
        mono4 = new javax.swing.JLabel();
        mono5 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ahorcado = new javax.swing.JLabel();
        P1 = new javax.swing.JTextField();
        P2 = new javax.swing.JTextField();
        G1 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
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

        Adivinar.setBackground(new java.awt.Color(142, 142, 89));
        Adivinar.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        Adivinar.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Adivinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 40));

        BA.setBackground(new java.awt.Color(142, 142, 89));
        BA.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BA.setText("A");
        BA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAActionPerformed(evt);
            }
        });
        getContentPane().add(BA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, 40));

        BB.setBackground(new java.awt.Color(142, 142, 89));
        BB.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BB.setText("B");
        BB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBActionPerformed(evt);
            }
        });
        getContentPane().add(BB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 50, 40));

        BC.setBackground(new java.awt.Color(142, 142, 89));
        BC.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BC.setText("C");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });
        getContentPane().add(BC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 50, 40));

        BD.setBackground(new java.awt.Color(142, 142, 89));
        BD.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BD.setText("D");
        BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDActionPerformed(evt);
            }
        });
        getContentPane().add(BD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 50, 40));

        BE.setBackground(new java.awt.Color(142, 142, 89));
        BE.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BE.setText("E");
        BE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEActionPerformed(evt);
            }
        });
        getContentPane().add(BE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 50, 40));

        BF.setBackground(new java.awt.Color(142, 142, 89));
        BF.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BF.setText("F");
        BF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFActionPerformed(evt);
            }
        });
        getContentPane().add(BF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 50, 40));

        BG.setBackground(new java.awt.Color(142, 142, 89));
        BG.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BG.setText("G");
        BG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGActionPerformed(evt);
            }
        });
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 50, 40));

        BH.setBackground(new java.awt.Color(142, 142, 89));
        BH.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BH.setText("H");
        BH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHActionPerformed(evt);
            }
        });
        getContentPane().add(BH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 40));

        BI.setBackground(new java.awt.Color(142, 142, 89));
        BI.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BI.setText("I");
        BI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIActionPerformed(evt);
            }
        });
        getContentPane().add(BI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 50, 40));

        BJ.setBackground(new java.awt.Color(142, 142, 89));
        BJ.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BJ.setText("J");
        BJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJActionPerformed(evt);
            }
        });
        getContentPane().add(BJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 50, 40));

        BK.setBackground(new java.awt.Color(142, 142, 89));
        BK.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BK.setText("K");
        BK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKActionPerformed(evt);
            }
        });
        getContentPane().add(BK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 50, 40));

        BL.setBackground(new java.awt.Color(142, 142, 89));
        BL.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BL.setText("L");
        BL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLActionPerformed(evt);
            }
        });
        getContentPane().add(BL, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 50, 40));

        BM.setBackground(new java.awt.Color(142, 142, 89));
        BM.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BM.setText("M");
        BM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMActionPerformed(evt);
            }
        });
        getContentPane().add(BM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 50, 40));

        BN.setBackground(new java.awt.Color(142, 142, 89));
        BN.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BN.setText("N");
        BN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNActionPerformed(evt);
            }
        });
        getContentPane().add(BN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 50, 40));

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

        BQ.setBackground(new java.awt.Color(142, 142, 89));
        BQ.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BQ.setText("Q");
        BQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQActionPerformed(evt);
            }
        });
        getContentPane().add(BQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 50, 40));

        BR.setBackground(new java.awt.Color(142, 142, 89));
        BR.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BR.setText("R");
        BR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRActionPerformed(evt);
            }
        });
        getContentPane().add(BR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 50, 40));

        BS.setBackground(new java.awt.Color(142, 142, 89));
        BS.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BS.setText("S");
        BS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSActionPerformed(evt);
            }
        });
        getContentPane().add(BS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 50, 40));

        BT.setBackground(new java.awt.Color(142, 142, 89));
        BT.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BT.setText("T");
        BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTActionPerformed(evt);
            }
        });
        getContentPane().add(BT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 50, 40));

        BU.setBackground(new java.awt.Color(142, 142, 89));
        BU.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BU.setText("U");
        BU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUActionPerformed(evt);
            }
        });
        getContentPane().add(BU, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 50, 40));

        BV.setBackground(new java.awt.Color(142, 142, 89));
        BV.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BV.setText("V");
        BV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVActionPerformed(evt);
            }
        });
        getContentPane().add(BV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 50, 40));

        BW.setBackground(new java.awt.Color(142, 142, 89));
        BW.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BW.setText("W");
        BW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BWActionPerformed(evt);
            }
        });
        getContentPane().add(BW, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 50, 40));

        BX.setBackground(new java.awt.Color(142, 142, 89));
        BX.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BX.setText("X");
        BX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BXActionPerformed(evt);
            }
        });
        getContentPane().add(BX, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 50, 40));

        BY.setBackground(new java.awt.Color(142, 142, 89));
        BY.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BY.setText("Y");
        BY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BYActionPerformed(evt);
            }
        });
        getContentPane().add(BY, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 60, 40));

        BZ.setBackground(new java.awt.Color(142, 142, 89));
        BZ.setFont(new java.awt.Font("NanumMyeongjo", 1, 18)); // NOI18N
        BZ.setText("Z");
        BZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BZActionPerformed(evt);
            }
        });
        getContentPane().add(BZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 50, 40));
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

        A1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        A1.setText("AHORCADONS 1:");
        getContentPane().add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        A2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        A2.setText("AHORCADONS 2:");
        getContentPane().add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("INGRESA LA PALABREA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, 30));

        Ahorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ahorcadito.png"))); // NOI18N
        getContentPane().add(Ahorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 290));
        getContentPane().add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 250, -1));
        getContentPane().add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 250, -1));

        G1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        G1.setText("Guardar");
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });
        getContentPane().add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        G2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        G2.setText("Guardar");
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });
        getContentPane().add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reserbado.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GUIGracias g = new GUIGracias();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAActionPerformed
        // TODO add your handling code here:
        d.letra='A';
        BA.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
        
    }//GEN-LAST:event_BAActionPerformed

    private void BBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBActionPerformed
        // TODO add your handling code here:
        d.letra='B';
        BB.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BBActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        // TODO add your handling code here:
        d.letra='C';
        BC.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BCActionPerformed

    private void BDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDActionPerformed
        // TODO add your handling code here:
        d.letra='D';
        BD.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BDActionPerformed

    private void BEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEActionPerformed
        // TODO add your handling code here:
        d.letra='E';
        BE.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BEActionPerformed

    private void BFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFActionPerformed
        // TODO add your handling code here:
        d.letra='F';
        BF.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BFActionPerformed

    private void BGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGActionPerformed
        // TODO add your handling code here:
        d.letra='G';
        BG.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BGActionPerformed

    private void BHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHActionPerformed
        // TODO add your handling code here:
        d.letra='H';
        BH.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BHActionPerformed

    private void BIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIActionPerformed
        // TODO add your handling code here:
        d.letra='I';
        BI.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BIActionPerformed

    private void BJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJActionPerformed
        // TODO add your handling code here:
        d.letra='J';
        BJ.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BJActionPerformed

    private void BKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKActionPerformed
        // TODO add your handling code here:
        d.letra='K';
        BK.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BKActionPerformed

    private void BLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLActionPerformed
        // TODO add your handling code here:
        d.letra='L';
        BL.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BLActionPerformed

    private void BMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMActionPerformed
        // TODO add your handling code here:
        d.letra='M';
        BM.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BMActionPerformed

    private void BNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNActionPerformed
        // TODO add your handling code here:
        d.letra='N';
        BN.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BNActionPerformed

    private void BOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOActionPerformed
        // TODO add your handling code here:
        d.letra='O';
        BO.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BOActionPerformed

    private void BPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPActionPerformed
        // TODO add your handling code here:
        d.letra='P';
        BP.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BPActionPerformed

    private void BQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQActionPerformed
        // TODO add your handling code here:
        d.letra='Q';
        BQ.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BQActionPerformed

    private void BRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRActionPerformed
        // TODO add your handling code here:
        d.letra='R';
        BR.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BRActionPerformed

    private void BSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSActionPerformed
        // TODO add your handling code here:
        d.letra='S';
        BS.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BSActionPerformed

    private void BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTActionPerformed
        // TODO add your handling code here:
        d.letra='T';
        BT.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BTActionPerformed

    private void BUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUActionPerformed
        // TODO add your handling code here:
        d.letra='U';
        BU.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BUActionPerformed

    private void BVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVActionPerformed
        // TODO add your handling code here:
        d.letra='V';
        BV.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BVActionPerformed

    private void BWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BWActionPerformed
        // TODO add your handling code here:
        d.letra='W';
        BW.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BWActionPerformed

    private void BXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BXActionPerformed
        // TODO add your handling code here:
        d.letra='X';
        BX.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BXActionPerformed

    private void BYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BYActionPerformed
        // TODO add your handling code here:
        d.letra='Y';
        BY.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BYActionPerformed

    private void BZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BZActionPerformed
        // TODO add your handling code here:
        d.letra='Z';
        BZ.setEnabled(false);
        if(juega1==false)
        {
            checar();
        }
        else
        {
            checar2();
        }
    }//GEN-LAST:event_BZActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        // TODO add your handling code here:
        if(P1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Poner una palabra","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            d.p=d.evaluarPalabra(P1.getText());
            A1.setVisible(false);
            P1.setVisible(false);
            G1.setVisible(false);
            A2.setVisible(true);
            P2.setVisible(true);
            G2.setVisible(true);
        }
    }//GEN-LAST:event_G1ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        // TODO add your handling code here:
        if(P2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Poner una palabra","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            d.p2=d.evaluarPalabra(P2.getText());
            A1.setVisible(false);
            P1.setVisible(false);
            G1.setVisible(false);
            A2.setVisible(false);
            P2.setVisible(false);
            G2.setVisible(false);
            Ahorcado.setVisible(false);
            jLabel4.setVisible(false);
            mostrar();
            JOptionPane.showMessageDialog(null,"Ahorcadonito2 tratara de adivinar la palabra del Ahorcadonito1","AhorcaDons",JOptionPane.INFORMATION_MESSAGE);
            jugador();
        }
    }//GEN-LAST:event_G2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIVentanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIVentanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIVentanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIVentanaJuego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIVentanaJuego2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel Adivinar;
    private javax.swing.JLabel Ahorcado;
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
    private javax.swing.JButton G1;
    private javax.swing.JButton G2;
    private javax.swing.JTextField P1;
    private javax.swing.JTextField P2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mono;
    private javax.swing.JLabel mono1;
    private javax.swing.JLabel mono2;
    private javax.swing.JLabel mono3;
    private javax.swing.JLabel mono4;
    private javax.swing.JLabel mono5;
    // End of variables declaration//GEN-END:variables
}

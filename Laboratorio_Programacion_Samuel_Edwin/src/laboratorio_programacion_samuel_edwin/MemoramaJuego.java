/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio_programacion_samuel_edwin;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.JOptionPane;
/**
 *
 * @author unwir
 */
public class MemoramaJuego extends javax.swing.JFrame {
    int intentosNum;
    
    private JButton primeraSeleccion = null;
    private JButton segundaSeleccion = null;
    private boolean bloqueado = false;
    
    private int parejasEncontradas = 0;
    private int parejasTotales = 18;
    
    
    public MemoramaJuego() {
        initComponents();
        asignarImagenes();
        intentosNum = 10;
        intentos.setText("NUMERO DE INTENTOS " + 10);

    }
    
        private void resetSeleccion() {
        primeraSeleccion = null;
        segundaSeleccion = null;
        bloqueado = false;
    }

    
    private void asignarImagenes(){
        JButton[] botones = {
            btnCarta, btnCarta1, btnCarta2, btnCarta3, btnCarta4, btnCarta5,
            btnCarta6, btnCarta7, btnCarta8, btnCarta9, btnCarta10, btnCarta11,
            btnCarta12, btnCarta13, btnCarta14, btnCarta15, btnCarta16, btnCarta17,
            btnCarta18, btnCarta19, btnCarta20, btnCarta21, btnCarta22, btnCarta23,
            btnCarta24, btnCarta25, btnCarta26, btnCarta27, btnCarta28, btnCarta29,
            btnCarta30, btnCarta31, btnCarta32, btnCarta33, btnCarta34, btnCarta35
        };

        String imagenesOriginales[] = {"Baseball_card.png", "blueprint.png", "Canio.png", "Card_sharp.png", "Chicot.png",
            "Fibonacci.png", "Gros_Michel.png", "Hack.png", "joker.png", "mime.png", "Perxeo.png", "Smiley_face.png",
            "sock_and_buskin.png", "supernova.png", "Triboulet.png", "vagabond.png", "Vampire.png", "yorick.png"};

        Tablero tablero = new Tablero();
        String imagenesDuplicadas[] = tablero.imagenesDuplicadas(imagenesOriginales);
        String imagenesMezcladas[] = tablero.imagenesMezcladas(imagenesDuplicadas);

        ImageIcon reverso = new ImageIcon(getClass().getResource("/cartas/cartaOculta.png"));

        for (int i = 0; i < botones.length; i++) {
            botones[i].setIcon(reverso);
            botones[i].putClientProperty("imagen", imagenesMezcladas[i]);
        }

for (JButton boton : botones) {
    boton.addActionListener(e -> {
        intentos.setText("NUMERO DE INTENTOS " + intentosNum);
        verificarVictoria();
        if (bloqueado) return;

        Object estado = boton.getClientProperty("descubierto");
        boolean yaDescubierto = estado != null && (boolean) estado;

        if (yaDescubierto || boton == primeraSeleccion){ 
           
            
            return;
        }

        String nombreImagen = (String) boton.getClientProperty("imagen");
        ImageIcon iconoReal = new ImageIcon(getClass().getResource("/cartas/" + nombreImagen));
        boton.setIcon(iconoReal);

        if (primeraSeleccion == null) {
            primeraSeleccion = boton;
        } else {
            segundaSeleccion = boton;
            bloqueado = true;

            String img1 = (String) primeraSeleccion.getClientProperty("imagen");
            String img2 = (String) segundaSeleccion.getClientProperty("imagen");

            if (img1.equals(img2)) {
                parejasEncontradas++;
                primeraSeleccion.putClientProperty("descubierto", true);
                segundaSeleccion.putClientProperty("descubierto", true);
                resetSeleccion();
            } else {
                intentosNum--;
                Timer timer = new Timer(1000, evt -> {
                    primeraSeleccion.setIcon(reverso);
                    segundaSeleccion.setIcon(reverso);
                    resetSeleccion();
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    });
}
    }
    
    
        private void bloquearTablero(JButton[] botones) {
        for (JButton boton : botones) {
            boton.setEnabled(false);
        }
    }
        
        
        private void verificarVictoria(){
            if(parejasEncontradas == parejasTotales){
                JOptionPane.showMessageDialog(this, "GANASTE!!!!");
                this.dispose();
                MemoramaJuego jogo = new MemoramaJuego();
                jogo.setVisible(true);
                
            }else if (intentosNum == 0) {
                JOptionPane.showMessageDialog(this, "PERDISTE!!!!");
                    this.dispose();
                    MemoramaJuego jogo = new MemoramaJuego();
                    jogo.setVisible(true);
            }
                
        }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        intentos = new javax.swing.JLabel();
        reintentar = new javax.swing.JButton();
        btnCarta = new javax.swing.JButton();
        btnCarta1 = new javax.swing.JButton();
        btnCarta2 = new javax.swing.JButton();
        btnCarta3 = new javax.swing.JButton();
        btnCarta4 = new javax.swing.JButton();
        btnCarta5 = new javax.swing.JButton();
        btnCarta6 = new javax.swing.JButton();
        btnCarta7 = new javax.swing.JButton();
        btnCarta8 = new javax.swing.JButton();
        btnCarta9 = new javax.swing.JButton();
        btnCarta10 = new javax.swing.JButton();
        btnCarta11 = new javax.swing.JButton();
        btnCarta12 = new javax.swing.JButton();
        btnCarta13 = new javax.swing.JButton();
        btnCarta14 = new javax.swing.JButton();
        btnCarta15 = new javax.swing.JButton();
        btnCarta16 = new javax.swing.JButton();
        btnCarta17 = new javax.swing.JButton();
        btnCarta18 = new javax.swing.JButton();
        btnCarta19 = new javax.swing.JButton();
        btnCarta20 = new javax.swing.JButton();
        btnCarta21 = new javax.swing.JButton();
        btnCarta22 = new javax.swing.JButton();
        btnCarta23 = new javax.swing.JButton();
        btnCarta24 = new javax.swing.JButton();
        btnCarta25 = new javax.swing.JButton();
        btnCarta26 = new javax.swing.JButton();
        btnCarta27 = new javax.swing.JButton();
        btnCarta28 = new javax.swing.JButton();
        btnCarta29 = new javax.swing.JButton();
        btnCarta30 = new javax.swing.JButton();
        btnCarta31 = new javax.swing.JButton();
        btnCarta32 = new javax.swing.JButton();
        btnCarta33 = new javax.swing.JButton();
        btnCarta34 = new javax.swing.JButton();
        btnCarta35 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        intentos.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N

        reintentar.setBackground(new java.awt.Color(0, 153, 153));
        reintentar.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        reintentar.setText("Reiniciar Partida");
        reintentar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reintentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reintentarActionPerformed(evt);
            }
        });

        btnCarta.setIconTextGap(0);

        btnCarta1.setIconTextGap(0);

        btnCarta2.setIconTextGap(0);

        btnCarta3.setIconTextGap(0);

        btnCarta4.setIconTextGap(0);

        btnCarta5.setIconTextGap(0);

        btnCarta6.setIconTextGap(0);

        btnCarta7.setIconTextGap(0);

        btnCarta8.setIconTextGap(0);

        btnCarta9.setIconTextGap(0);

        btnCarta10.setIconTextGap(0);

        btnCarta11.setIconTextGap(0);

        btnCarta12.setIconTextGap(0);

        btnCarta13.setIconTextGap(0);

        btnCarta14.setIconTextGap(0);

        btnCarta15.setIconTextGap(0);

        btnCarta16.setIconTextGap(0);

        btnCarta17.setIconTextGap(0);

        btnCarta18.setIconTextGap(0);

        btnCarta19.setIconTextGap(0);

        btnCarta20.setIconTextGap(0);

        btnCarta21.setIconTextGap(0);

        btnCarta22.setIconTextGap(0);

        btnCarta23.setIconTextGap(0);

        btnCarta24.setIconTextGap(0);

        btnCarta25.setIconTextGap(0);

        btnCarta26.setIconTextGap(0);

        btnCarta27.setIconTextGap(0);

        btnCarta28.setIconTextGap(0);

        btnCarta29.setIconTextGap(0);

        btnCarta30.setIconTextGap(0);

        btnCarta31.setIconTextGap(0);

        btnCarta32.setIconTextGap(0);

        btnCarta33.setIconTextGap(0);

        btnCarta34.setIconTextGap(0);

        btnCarta35.setIconTextGap(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(reintentar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCarta28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCarta34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCarta18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCarta22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCarta12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarta16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCarta6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCarta7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCarta8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCarta9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCarta10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCarta11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reintentar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCarta10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCarta13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCarta20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCarta35, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta34, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCarta30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarta29, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reintentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reintentarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MemoramaJuego jogo = new MemoramaJuego();
        jogo.setVisible(true);
    }//GEN-LAST:event_reintentarActionPerformed

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
            java.util.logging.Logger.getLogger(MemoramaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoramaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoramaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoramaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoramaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarta;
    private javax.swing.JButton btnCarta1;
    private javax.swing.JButton btnCarta10;
    private javax.swing.JButton btnCarta11;
    private javax.swing.JButton btnCarta12;
    private javax.swing.JButton btnCarta13;
    private javax.swing.JButton btnCarta14;
    private javax.swing.JButton btnCarta15;
    private javax.swing.JButton btnCarta16;
    private javax.swing.JButton btnCarta17;
    private javax.swing.JButton btnCarta18;
    private javax.swing.JButton btnCarta19;
    private javax.swing.JButton btnCarta2;
    private javax.swing.JButton btnCarta20;
    private javax.swing.JButton btnCarta21;
    private javax.swing.JButton btnCarta22;
    private javax.swing.JButton btnCarta23;
    private javax.swing.JButton btnCarta24;
    private javax.swing.JButton btnCarta25;
    private javax.swing.JButton btnCarta26;
    private javax.swing.JButton btnCarta27;
    private javax.swing.JButton btnCarta28;
    private javax.swing.JButton btnCarta29;
    private javax.swing.JButton btnCarta3;
    private javax.swing.JButton btnCarta30;
    private javax.swing.JButton btnCarta31;
    private javax.swing.JButton btnCarta32;
    private javax.swing.JButton btnCarta33;
    private javax.swing.JButton btnCarta34;
    private javax.swing.JButton btnCarta35;
    private javax.swing.JButton btnCarta4;
    private javax.swing.JButton btnCarta5;
    private javax.swing.JButton btnCarta6;
    private javax.swing.JButton btnCarta7;
    private javax.swing.JButton btnCarta8;
    private javax.swing.JButton btnCarta9;
    private javax.swing.JLabel intentos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton reintentar;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocodenotas;

/**
 *
 * @author shander.andrade
 */
public class BlocoDeNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BlocoDeNotasGUI bloco = new BlocoDeNotasGUI();
        bloco.setBounds(0, 0, 700, 700);   //Define o tamanho da tela.
        bloco.setTitle("Notepad");
        bloco.setResizable(true);
        bloco.setVisible(true);   //vai aparecer na tela. Não sei pra quê isso. 
     //   bloco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); dando erro de não achar no GUi

    }

}

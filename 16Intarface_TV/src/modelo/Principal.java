/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TV_sharp objTV_sharp = new TV_sharp(14);
        TV_philips objTV_philips = new TV_philips(32);
        TV_tcl objTV_tcl = new TV_tcl(60);
        objTV_philips.ligar();
        //objTV_sharp.ligar()
        
        System.out.print("TV_philips - modelo " + objTV_philips.MODELO +
                " está ");
        
       // : e igual a else
        System.out.println(objTV_philips.isLigada() ? "ligada" : "desligada");
        
        objTV_tcl.ligar();
        System.out.print("TV_tcl - modelo" + objTV_tcl.modelo +
                " está ");
        System.out.println(objTV_tcl.isLigada() ? "ligada " : "desligada ");
        
        objTV_tcl.desligar();
        System.out.print("TV_tcl - modelo" + objTV_tcl.modelo +
                " está ");
        System.out.println(objTV_tcl.isLigada() ? "ligada " : "desligada ");
    }
    
}

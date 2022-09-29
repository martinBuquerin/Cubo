/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo;

import dominio.Cubo;

/**
 *
 * @author Martín
 */
public class Principal {

    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(2,2,2);
      
        float res = cubo1.calculo(cubo1.getAlto(),cubo1.getAncho(),cubo1.getProfundo());
        
        
        System.out.println("El volumen del cubo es = " + res);
    }
    
}

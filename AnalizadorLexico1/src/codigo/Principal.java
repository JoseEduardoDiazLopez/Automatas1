/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;

/**
 *
 * @author Eduardo
 *////
public class Principal {
    public static void main(String[] args) {
        String ruta="C:/Users/Eduardo/Documents/NetBeansProjects/AnalizadorLexico1/src/codigo/Lexer.flex";
        generarLexer(ruta);
        
    }
    public static void generarLexer(String ruta){
        File archivo=new File(ruta);
        JFlex.Main.generate(archivo);
        
    }
    
    public static void generarLexer2(String ruta2){
        File archivo2=new File(ruta2);
        JFlex.Main.generate(archivo2);
        
    }
}

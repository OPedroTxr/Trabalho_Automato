/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho1;

import com.mycompany.trabalho1.Classes.FilePersistence;
import com.mycompany.trabalho1.Classes.Serializador;
import com.mycompany.trabalho1.Classes.Transicao;
import java.io.FileNotFoundException;

/**
 *
 * @author Gabeews
 */
public class Trabalho1 {

      public static void main(String[] args) throws FileNotFoundException {
        
          
        FilePersistence file = new FilePersistence();

        // Lê o conteúdo do arquivo
        String conteudo = file.LoadFromFile("C:\\Users\\Gabeews\\Desktop\\Trabalho Java zé rui\\Teste.txt");

        // Exibe o conteúdo no terminal
        System.out.println(conteudo);
        
        
        //Onde são os finais dos automatos
        Integer [] finais;
        Serializador s = new Serializador();
        finais = s.fromCSVFinaly(conteudo);
        
        Transicao [] body = s.fromCSVBody(conteudo);
        
        
          
          
          
    }
}

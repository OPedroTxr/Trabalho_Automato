/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gabeews
 */
public class FilePersistence {
    
    public String LoadFromFile(String filePath) throws FileNotFoundException{
        
        String conteudo = "";
        
        //Cria o objeto arquivo
        File f = new File(filePath);
        
        //Cria o Scanner
        Scanner scanner = new Scanner(f);
        
        //Lendo linha por linha.
        scanner.useDelimiter("\\Z");
        
        while(scanner.hasNext()){
            
            conteudo += scanner.next();
            
        }
        
        scanner.close();
        
        return conteudo;
        
    }
}

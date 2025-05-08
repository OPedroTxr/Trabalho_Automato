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
        File f = new File(filePath); //Cria o objeto arquivo
        Scanner scanner = new Scanner(f); //Cria o Scanner com o caminho do arquivo
        scanner.useDelimiter("\\Z"); //Lê linha por linha.
        
        while(scanner.hasNext()){
            conteudo += scanner.next();
        }
        
        scanner.close();
        return conteudo;
        
    }
}

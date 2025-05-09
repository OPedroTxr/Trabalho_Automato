package com.mycompany.trabalho1.Classes;

import java.util.ArrayList;

/**
 *
 * @author Gabeews
 */
public class Serializador {
    
    public ArrayList<Integer> fromCSVFinaly(String conteudo){
        
        String linhas[] = conteudo.split("\n");
        String[] pre_final = linhas[0].split(";");
        ArrayList<Integer> finais = new ArrayList<>();
        
        for (int i = 1; i < pre_final.length; i++) {
            finais.add(Integer.valueOf(pre_final[i].trim()));
        }
        return finais;
    }
    
    public ArrayList<Transicao> fromCSVBody(String conteudo){
        
        String linhas[] = conteudo.split("\n");
        ArrayList<Transicao> body = new ArrayList<>();
        
        for (int i = 1; i < linhas.length; i++) {
            String [] Pre_Body = linhas[i].split(";");
            
            body.add(new Transicao(Integer.parseInt(Pre_Body[0].trim()), Pre_Body[1].trim().charAt(0),Integer.parseInt(Pre_Body[2].trim())));
        }
        return body;
    }
    
}

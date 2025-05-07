/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1.Classes;

import java.io.Console;
import com.mycompany.trabalho1.Classes.Transicao;

/**
 *
 * @author Gabeews
 */
public class Serializador {
    
    public Integer[] fromCSVFinaly(String Conteudo){
        
        String Linhas[] = Conteudo.split("\n");
        String[] Pre_final = Linhas[0].split(";");
        Integer [] finais = new Integer[Pre_final.length - 1];
        
        for (int i = 1; i < Pre_final.length; i++) {
            finais[i-1] = Integer.parseInt(Pre_final[i].trim());
        }
        
        return finais;
    }
    
    public Transicao[] fromCSVBody(String Conteudo){
        
        String Linhas[] = Conteudo.split("\n");
        Transicao [] body = new Transicao[Linhas.length - 1];
        
        for (int i = 1; i < Linhas.length; i++) {
            
            String [] Pre_Body = Linhas[i].split(";");
            
             body[i - 1] = new Transicao();
            
            //Pega primeiro a origem
            body[i-1].setOrigem(Integer.parseInt(Pre_Body[0].trim()));
            
            //Depois pega a letras, esta usando um charAt para converter de string para char se não, não tinha como colocar dento da variavel
            body[i-1].setLetra(Pre_Body[1].trim().charAt(0));
            
            //Pega o destino
            body[i-1].setDestino(Integer.parseInt(Pre_Body[2].trim()));
        }
        
        return body;
    }
    
}

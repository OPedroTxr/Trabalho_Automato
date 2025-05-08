package com.mycompany.trabalho1;

import com.mycompany.trabalho1.Classes.AutomatoVerify;
import com.mycompany.trabalho1.Classes.FilePersistence;
import com.mycompany.trabalho1.Classes.Serializador;
import com.mycompany.trabalho1.Classes.Transicao;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gabeews
 */
public class Trabalho1 {

    public static void main(String[] args) throws FileNotFoundException {

        FilePersistence file = new FilePersistence();
        Serializador s = new Serializador();
        // Lê o conteúdo do arquivo
        String conteudo = file.LoadFromFile("C:\\Users\\PedroTxr\\Documents\\Trabalho - Automatos\\Trabalho_Automato\\trabalho1\\src\\main\\sources\\Teste.txt");

        Integer[] finais = s.fromCSVFinaly(conteudo);
        Transicao[] body = s.fromCSVBody(conteudo);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sequencia deseja testar?");
        String entrada = scanner.nextLine();

        AutomatoVerify executor = new AutomatoVerify(body, finais);
        executor.executar(entrada);
    }
}

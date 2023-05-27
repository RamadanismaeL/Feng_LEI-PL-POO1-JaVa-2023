/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author ramadan
 */
public class Tarefa {
    public static void main(String[] args) {
        /*  TESTANDO....
        BeijaFlor bf = new BeijaFlor("Tomm", 58, "Preto", 17, 89, 3, "Selvagem", "Verde");
        System.out.println(bf.toStringBF());
        bf.Voar();
        bf.BalancarAsas();
        bf.Brigar();
        System.out.println();
        Cachorro c = new Cachorro("Jerry", 42, "Branco", 9.2, 75.9, 4, "Terra");
        System.out.println(c.toStringC());
        c.Rastejar();
        c.Trabalhar();
        Homem h = new Homem("Txâvass", 26, "Preto", 10.1, 65.4, 2, "Selvagem!");
        System.out.println(h.toStringH());
        h.Brigar();*/
        
        String linha;
        //Lendo informação do ficheiro
        //LER BEIJA-FLOR
        String caminhoArquivoBF = "/home/ramadan/Documentos/Trabalho2/Actividade3/beijaflor.txt";
        try (BufferedReader bj = new BufferedReader(new FileReader(caminhoArquivoBF))) {            
            while((linha = bj.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //LER CACHORRO
        String caminhoArquivoC = "/home/ramadan/Documentos/Trabalho2/Actividade3/cachorro.txt";
        try (BufferedReader c = new BufferedReader(new FileReader(caminhoArquivoC))) {
            while((linha = c.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //LER HOMEM
        String caminhoArquivoH = "/home/ramadan/Documentos/Trabalho2/Actividade3/homem.txt";
        try(BufferedReader h = new BufferedReader(new FileReader(caminhoArquivoH))) {
            while((linha = h.readLine()) != null) {
                System.out.println(linha);
            }
        } catch(IOException e) {
                    e.printStackTrace();
                    }
    }
    
}
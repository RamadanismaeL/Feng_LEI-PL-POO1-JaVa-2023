/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade2;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author ramadan
 */
public class Tarefa {
    public static void main(String[] args) throws IOException {
        //ADCIONEI OUTRAS TAREFAS
        BufferedReader ram = new
            BufferedReader(new InputStreamReader(System.in));
        
        String nome, ambiente, caract, cor;
        int patas; byte op;
        
        System.out.println("O que pretende realizar?");
        System.out.println(" 1. Registrar Dados;");
        System.out.println(" 2. Visualizar Dados;");
        System.out.println(" 3. Sair do Programa;");
        System.out.print("Digite   :   ");
        op = Byte.parseByte(ram.readLine());
        while(op <= 0 || op > 3) {
            System.out.println("[ERRO] - TENTE NOVAMENTE!");
            System.out.println("O que pretende realizar?");
            System.out.println(" 1. Registrar Dados;");
            System.out.println(" 2. Visualizar Dados;");
            System.out.println(" 3. Sair do Programa;");
            System.out.print("Digite   :  ");
            op = Byte.parseByte(ram.readLine());
        }
        System.out.println();
            switch(op) {
                case 1 : {
                    System.out.println("Qual animal pretende armazenar os dados?");
                    System.out.println(" 1. Mamifero;");
                    System.out.println(" 2. Peixe;");
                    System.out.print("Digite   :  ");
                    op = Byte.parseByte(ram.readLine());
                    while(op <= 0 || op >= 3) {
                    System.out.println("[ERRO] - TENTE NOVAMENTE!");
                    System.out.println("Qual animal pretende armazenar os dados?");
                    System.out.println(" 1. Mamifero;");
                    System.out.println(" 2. Peixe;");
                    System.out.print("Digite   :  ");
                    op = Byte.parseByte(ram.readLine());
                    }
                        switch(op) {
                            case 1 : {
                                System.out.println("===============================");
                                System.out.println("- - - - M A M Í F E R O - - - -");
                                System.out.println("-------------------------------");
                                System.out.print(" Digite o nome    : ");
                                nome = ram.readLine();
                                System.out.print(" Digite a cor     : ");
                                cor = ram.readLine();
                                System.out.print(" Digite nr. patas : ");
                                patas = Integer.parseInt(ram.readLine());
                                Mamifero mf = new Mamifero(nome, cor, patas);
                                try (ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream("mamifero.txt"))) {
                                arquivo.writeObject(mf.toStringM());
                                System.out.println();
                                System.out.println("=================================");
                                System.out.println("|   DADOS SALVOS COM SUCESSO!   |");
                                System.out.println("=================================");
                                System.out.println();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            break;}
                            case 2 : {
                                System.out.println("=================================");
                                System.out.println("- - - - - - P E I X E - - - - - -");
                                System.out.println("---------------------------------");
                                System.out.print(" Digite o nome          : ");
                                nome = ram.readLine();
                                System.out.print("Digite a caracteristica : ");
                                caract = ram.readLine();
                                Peixe p = new Peixe(nome, caract);
                                try (ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream("peixe.txt"))) {
                                    arquivo.writeObject(p.toStringP());
                                    System.out.println();
                                System.out.println("=================================");
                                System.out.println("|   DADOS SALVOS COM SUCESSO!   |");
                                System.out.println("=================================");
                                System.out.println();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            break;}
                        }
                break;}
                case 2 : {
                    System.out.println("Qual animal pretende visualizar?");
                    System.out.println(" 1. Mamifero;");
                    System.out.println(" 2. Peixe;");
                    System.out.print("Digite   :  ");
                    op = Byte.parseByte(ram.readLine());
                    while(op <= 0 || op >= 3) {
                    System.out.println("[ERRO] - TENTE NOVAMENTE!");
                    System.out.println("Qual animal pretende visualizar?");
                    System.out.println(" 1. Mamifero;");
                    System.out.println(" 2. Peixe;");
                    System.out.print("Digite   :  ");
                    op = Byte.parseByte(ram.readLine());
                    }
                        switch(op) {
                            case 1 : {
                                String caminhoArquivo = "/home/ramadan/Documentos/Trabalho2/Actividade2/mamifero.txt";

                                try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
                                 String linha;

                                while ((linha = br.readLine()) != null) {
                                System.out.println(linha);
                                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            break;}
                            case 2 : {
                                String caminhoArquivo = "/home/ramadan/Documentos/Trabalho2/Actividade2/peixe.txt";
                                try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
                                    String linha;
                                    while((linha = br.readLine()) != null) {
                                        System.out.println(linha); }
                                    } catch (IOException e) {
                                            e.printStackTrace();
                                            }
                            }
                        }
                break;}
                case 3 : {
                    System.out.println();
                    System.out.println();
                    System.out.println("=================================");
                    System.out.println("|-|  * PROGRAMA ENCERRADO! *  |-|");
                    System.out.println("=================================");
                break;}
            }
        
    }
}
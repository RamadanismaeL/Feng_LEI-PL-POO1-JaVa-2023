/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade_1;

/**
 *
 * @author ramadan
 */
public class Main {
    public static void main(String[] args) {
        /*Estudante est = new Estudante("28/05/2021", "215RAM", "Ramadan", "Ismael", 2001, "Masculino", "Viúvo", "Moçambiano", "Machava", "10015234111B", 849626719, "ramadan.ismael02@gmail.com", "UEM", "Eng. Informática");
        System.out.println(est.toStringE());
        Graduado grad = new Graduado("28/05/2021", "215RAM", "Ramadan", "Ismael", 2001, "Masculino", "Viúvo", "Moçambiano", "Machava", "10015234111B", 849626719, "ramadan.ismael02@gmail.com", "UEM", "Eng. Informática", 2026);
        grad.setRealizarPesquisa(true);
        System.out.println(grad.toString());*/
        Funcionario func = new Funcionario("05/02/2015", "125RAM", "Txâvass", "IsmaeL", 2001, "Maculino", "Solteiro", "Moçambicana", "Machava", "1001400125R", 849626719, "ramadan.ismael02@gmail.com", "Nível 4", "UEM", "Eng. Informática", "Especialista em segurança", 8.5, 350, false, 4.5, 550, 250, 36526657, 24589616, "Hacker");
        System.out.println(func.toStringF());

    }
}

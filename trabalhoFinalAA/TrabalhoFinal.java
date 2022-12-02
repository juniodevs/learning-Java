package com.mycompany.trabalhofinal;

import com.mycompany.trabalhofinal.models.Agenda;
import com.mycompany.trabalhofinal.models.Contato;
public class TrabalhoFinal {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Contato c1 = new Contato("João", "123456789", "Nenhum", null, "");

        agenda.adicionarContato(c1);
        agenda.buscarContato("João");
        


    //     boolean status = true;
    //     int acao;
    //     Agenda agenda = new Agenda();
        
    //     while(status){
    //     System.out.println("Menu de Ações!");
    //     System.out.println("1- Cadastrar Contato");
    //     System.out.println("2- Mostrar Contatos");
    //     System.out.println("3- Editar Contato");
    //     System.out.println("4- Remover Contato");
    //     System.out.println("5- Sair do Sistema");      
    //     acao = 1;
    //     switch(acao){
    //         case 1: 
    //             System.out.println("1");
    //             break;
    //         case 2:
    //             System.out.println("1");
    //             break;
    //         case 3:
    //             System.out.println("1");
    //             break;
    //         case 4: 
    //             System.out.println("1");
    //             break;
    //         case 5:
    //             status = false;
    //             System.out.println("1");
    //             break;
        
    //     }
    // }
    }
}
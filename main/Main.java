package main;

import com.sun.org.glassfish.gmbal.Description;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Método de ler arquivo é invocado no incio da execução
     //   EntradaSaidaDados.lerArquivo();

        //Menu
        String entrada;

        
        
        boolean continuar = true;

        while (continuar) {

            
            entrada = JOptionPane.showInputDialog(null, "1- Cadastrar funcionário \n 2- Acesso Gerente\n 3- Acesso Supervisor \n 4- Acesso Dev. Pleno \n 5- Acesso Dev. Jr.\n 6- SAIR \n\n", "Menu", JOptionPane.QUESTION_MESSAGE);


            if (entrada != null) {
                switch (entrada) {
                    case "1": {

                    	String cadastrotipo = JOptionPane.showInputDialog(null,"\n 1- Cadastrar Gerente\n 2- Cadastrar Supervisor\n 3- Cadastrar Dev. Pleno\n 4- Cadastrar Dev. Jr.\n", "Cadastro", JOptionPane.QUESTION_MESSAGE);
                    		switch (cadastrotipo) {
                    		case "1":
                    			Controller.cadastrar(1);
                    			break;
                    			
                    		case "2":
                    			Controller.cadastrar(2);
                    			break;
                    			
                    		case "3":
                    			Controller.cadastrar(3);
                    			break;
                    			
                    		case "4":
                    			Controller.cadastrar(4);
                    			break;
                    	}
                    
                    }   	
                    break;
                    
            


                    case "2":
                    	String portalGerente = JOptionPane.showInputDialog(null, "Bem-Vindo Gerente\n\n\n 1- Procurar Funcionário\n 2- Listar TODOS funcionários\n 3- Alterar dados de funcionários\n 4 - Voltar\n");
                    	if (portalGerente != null) {
                    		switch (portalGerente) {
                    		case "1":
                    			Controller.consultar();
                    			break;
                    		case "2":
                    			Controller.listar();
                    			break;
                    		case "3":
                    			Controller.alterar();
                    			break;
                    		case "4":
                    			break;
                    		}
                    	}
                    	
                    	break;
                    		
                    
                    case "3":
                    	String portalSupervisor = JOptionPane.showInputDialog(null, "Bem-vindo Supervisor\n Você deve Supervisionar os Devs.\n\n 1 - Listar Dev's");
                    	if (portalSupervisor != null) {
                    		switch (portalSupervisor) {
                    		case "1":
                    			Controller.listar();
                    		}
                    	}
                    	
                     
                        break;
                        
                    case "4":
                    	String portalDevPl = JOptionPane.showInputDialog(null, "Bem-vindo Dev. Pleno\nVocê deve auxiliar um Dev. Jr.\n 1 - Listar Dev. Jr.");
                    	if (portalDevPl != null) {
                    		switch (portalDevPl) {
                    		case "1":
                    			Controller.listar();
                    		}
                    	}

                        break;
                        
                    case "5":
                    	String portalDevJr = JOptionPane.showInputDialog(null, "Bem-vindo Dev. Jr\nEm caso de duvida, peça ajuda aos Dev. Pleno\n 1 - Listar Dev. Pleno");
                    	if (portalDevJr != null) {
                    		switch (portalDevJr) {
                    		case "1":
                    			Controller.listarDev();
                    		}
                    	}
                    	

                        break;
                    case "6":
                        System.exit(1);
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!", "", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                continuar = false;
            }
        }


    }
}

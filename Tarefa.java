
package Projeto_Agenda_De_Eventos;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.ArrayList;


public class Tarefa {  
    private String tituloTarefa;
    private String descriçao;
    private String dataLimite;
    private int prioridade ;
    private int id ;
    private int contadorTarefas;
    Scanner teclado = new Scanner (System.in);
    Scanner teclado1 = new Scanner (System.in);
    ArrayList <Tarefa> tarefas = new ArrayList<>();
    LocalDateTime now = LocalDateTime.now();	
    int pergTarefa;
    int dataMes = now.getDayOfMonth();
    Month mes = now.getMonth();
    int ano = now.getYear();
    int s = 0;

    

    
    // Getters e Setters
    
    
    public String getTituloTarefa() {
    	return this.tituloTarefa;
    }
    
    public void setTituloTarefa(String t) {
    	this.tituloTarefa = t;
    }
    
    public String getDescriçao() {
    	return this.descriçao;
    }
    
    public void setDescriçao(String d) {
    	this.descriçao = d ;
    }
    

    
    public String getDataLimite() {
    	return this.dataLimite;
    }
    
    public void setDataLimite(String dataL) {
    	this.dataLimite = dataL;
    }
    

    
    public int getPrioridade() {
    	return this.prioridade; 
    }
    
    public void setPrioridade(int prio) {
    	this.prioridade = prio ;
    }
    
    public int getId() {
    	return this.id; 
    }
    
    public void setId(int i) {
    	this.id = i ;
    }
    
    public int getContadorTarefas() {
    	return this.contadorTarefas;
    }

	public void setContadorTarefas(int q) {
		this.contadorTarefas = q ;
	}
 
    	
    
    public void perguntaTarefa() {
    	try {
    		System.out.println();
        	System.out.println("             📙 O que você deseja fazer ? 📙 ");
        	System.out.println("=========================================================");
        	System.out.println("[1] - Cadastrar uma nova tarefa "
        			+ "\n[2] - Listar todas as tarefas cadastradas " + 
        			"\n[3] - Listar tarefas de id especifico " + 
        			"\n[4] - Editar as informaçoes de uma tarefa " + 
        			"\n[5] - Excluir tarefas \n[6] - Sair");
        	System.out.println("=========================================================");
        	System.out.println();
        	System.out.print("Digite aqui : ");
        	pergTarefa = teclado.nextInt();
        	switch(pergTarefa) {
        	case 1 :
        		this.cadastrarTarefa();
        		break;
        	case 2 :
        		this.listarTarefas();
        		break;
        	case 3 :
        		System.out.println("Digite o id da tarefa que deseja ver");
        		int procId = teclado.nextInt();
        		this.procurarPorId(procId);
        		break;
        	case 4 :
        		System.out.println("Digite o id da tarefa que deseja editar");
        		int editTarefa = teclado.nextInt();
        		this.editarTarefas(editTarefa);
        		break;
        	case 5 :
        		System.out.println("Digite o id da tarefa que deseja excluir");
        		int exTarefa = teclado.nextInt();
        		this.excluirTarefa(exTarefa);
        		break;
        	case 6 :
        		System.out.println();
        		System.out.println("        📚 SAINDO DA AGENDA DE TAREFAS 📚 ...");
        		break;
    		default :
    			System.out.println();
    			System.out.println("Numero Inválido");
    			System.out.println("Digite novamente");
    			System.out.println();
    			this.perguntaTarefa();
    			break;
        	}
        	
    	}
    	
    	catch(Exception e1) {
    			System.out.println("Ops, Ocorreu um error na digitação");
    			System.out.println("Renicie o seu programa e tente novamente");			
		}


    	
    	
    	
    	

    	
    	
    	
	}
    	
    	
    
    	
    
    
    
    public void cadastrarTarefa() {
    	try {
    		while (true) {	
    			Tarefa tarefa = new Tarefa();
				System.out.println();
            	System.out.println("           📙  Cadastrando Nova Tarefa no Sistema 📙   ");
            	System.out.println("=========================================================");
            	System.out.println();        	
            	System.out.println("=========================================================");
            	System.out.println("            Informe agora o título da sua tarefa ");
            	System.out.println("=========================================================");
            	String titu = teclado1.nextLine();
            	tarefa.setTituloTarefa(titu);
            	System.out.println();
            	System.out.println("=========================================================");
            	System.out.println("            Agora informe a descrição do titulo  ");
            	System.out.println("=========================================================");
            	String desc = teclado1.nextLine();
            	tarefa.setDescriçao(desc);
            	System.out.println();
            	System.out.println("=========================================================");
            	System.out.println(" Defina agora uma data limite para você realizar a tarefa");
            	System.out.println("=========================================================");
            	String dataLim = teclado1.nextLine();
            	tarefa.setDataLimite(dataLim);
            	System.out.println();
            	System.out.println("=========================================================");
            	System.out.println("          Com base nas suas informações ");
            	System.out.println("          Informe agora a prioridade dessa tarefa ");
            	System.out.println("=========================================================");
            	System.out.println("[1] - Não importante \n[2] - Razoável \n[3] - Importante " +
            	" \n[4] - Muito importante \n[5] - Tarefa urgente");	
            	int prio = teclado.nextInt(); 
            	switch (prio) {
            	case 1 :
            		tarefa.setPrioridade(prio);
            		break;
            	case 2 : 
            		tarefa.setPrioridade(prio);
            		break;
            	case 3 :
            		tarefa.setPrioridade(prio);
            		break;
            	case 4 :
            		tarefa.setPrioridade(prio);
            		break;
            	case 5 :
            		tarefa.setPrioridade(prio);
            		break;
        		default :
                	System.out.println("          ❌ ESSE NÚMERO É INVÁLIDO ❌");
        			break;
            	} 
            	if (prio == 1 || prio == 2 || prio == 3 || prio == 4 || prio == 5) {
            		System.out.println("Deseja sair ? [S] - Sim ou [N] - Não ? ");
                	char perg = teclado.next().charAt(0);
                	if (perg == 'S') {
                		s += 1 ;
        				tarefa.setContadorTarefas(s);
        				tarefa.setId(s);      		
                		tarefas.add(tarefa); 
                		System.out.println("          🔄 CADASTRANDO SUAS INFORMAÇÕES 🔄");
                    	System.out.println("          ✔ CADASTRO REALIZADO COM SUCESSO ✔");
                  		System.out.println();
                		break;      		
                	}
                	
                	else if (perg == 'N') {
                		s += 1 ;
        				tarefa.setContadorTarefas(s);
        				tarefa.setId(s);     
        				tarefas.add(tarefa);
                	}
                	
                	else if (perg != 'N' && perg != 'S') {
                		System.out.println("ERROR NA DIGITAÇÃO");
                	}
            		
            	}
            	
            	
    		}
    		
    		this.perguntaTarefa();
    	}
    	 	
    	catch (Exception e) {
    		System.out.println("Ocorreu um erro ao cadastrar a tarefa");
    		System.out.println("Renicie o seu programa e tente novamente");

    	}
    	
    	
    	
    	
    
    	
    	
    	
 	
    	
    	
    	
	  		
	  		
        	

          	       
}
    
    
    
    public void listarTarefas () {
    	try {
    		if (tarefas.size() == 0 ) {
        		System.out.println();
        		System.out.println("        ⚠ NÃO EXISTEM TAREFAS CADASTRADAS AINDA ⚠");
        		System.out.println("               REALIZE AGORA O SEU CADASTRO");
        		this.perguntaTarefa();
        	}
        	else {
        			System.out.println("=========================================================");
        			System.out.println("              📚 LISTA DE TAREFAS CADASTRADAS 📚             ");
        			System.out.println("=========================================================");
        		for (Tarefa t: tarefas) {
        			System.out.println();
        			System.out.println("Tarefa = " + (t.getContadorTarefas()));
        			System.out.println();
        			System.out.println("Id = " + (t.getId()));
        			System.out.println("Titulo da tarefa = " + t.getTituloTarefa());
        			System.out.println("Descricao da tarefa = " + t.getDescriçao());
        			System.out.println("Data de cadastro = " + dataMes + " / " + mes + " / " + ano);
        			System.out.println("Data limite da tarefa = " + t.getDataLimite());
        			System.out.println("Prioridade = " + t.getPrioridade());
        			System.out.println();
        			
        		}	
    			System.out.println("=========================================================");
    			System.out.println();
    			System.out.println("=========================================================");
        		this.perguntaTarefa();
        	}
    	}
    	
    	catch(Exception e ) {
    		System.out.println("Ops, ocorreu um erro ao mostrar a lista de tarefas cadastradas");
    	}
    	

    	
		
    }
    
    public void procurarPorId(int i) {
    	try {
    		int valorId = i - 1;
    		Tarefa tarefa = new Tarefa();
    		Tarefa elemento = tarefas.get(valorId);
        	for (Tarefa t : tarefas) {
        		if (tarefas.contains(elemento) == true && t.getId() == i) {
         			System.out.println();
        			System.out.println("Tarefa = " + (t.getContadorTarefas()));
        			System.out.println();
        			System.out.println("Id = " + (t.getId()));
        			System.out.println("Titulo da tarefa = " + t.getTituloTarefa());
        			System.out.println("Descricao da tarefa = " + t.getDescriçao());
        			System.out.println("Data de cadastro = " + dataMes + " / " + mes + " / " + ano);
        			System.out.println("Data limite da tarefa = " + t.getDataLimite());
        			System.out.println("Prioridade = " + t.getPrioridade());
        			System.out.println();
    			
        			
        			
        		}
        		
        		else if (i == 0 || elemento.getId() == 0){
        			System.out.println("Ops, ocorreu um erro na procura do Id");
            		System.out.println("Id inexistente no nosso banco de tarefas");
        			break;
        		}
        		
        
        	}
        	
        	
    	}
    	

    	
    	catch(Exception e) {
    		System.out.println("Ops, ocorreu um erro na procura do Id");
    		System.out.println("Id inexistente no nosso banco de tarefas");
    		
    	}
    	
    	
    	finally {
    		this.perguntaTarefa();
    	}
    		
    
    	
    	
    			
    		}
    
    public void editarTarefas(int t) {
    	try {
    		Tarefa tarefa = new Tarefa();
    		int indice = t - 1 ;
    		Tarefa element = tarefas.get(indice);
    		for (Tarefa v : tarefas) {
    			if (tarefas.contains(element) == true && v.getId() == t && v.getId() != 0){
         			System.out.println();
        			System.out.println("Tarefa = " + (v.getContadorTarefas()));
        			System.out.println();
        			System.out.println("Id = " + (v.getId()));
        			System.out.println("Titulo da tarefa = " + v.getTituloTarefa());
        			System.out.println("Descricao da tarefa = " + v.getDescriçao());
        			System.out.println("Data de cadastro = " + dataMes + " / " + mes + " / " + ano);
        			System.out.println("Data limite da tarefa = " + v.getDataLimite());
        			System.out.println("Prioridade = " + v.getPrioridade());
        			System.out.println();
    				
    				
    			}
    			
    			
    		}
    		
    			if (element.getId() != 0 && element.getPrioridade() != 0 && element.getTituloTarefa() != " TAREFA EXCLUÍDA ") {
    				
    				System.out.println();
                	System.out.println("           📙  Cadastrando Nova Tarefa no Sistema 📙   ");
                	System.out.println("=========================================================");
                	System.out.println();        	
                	System.out.println("=========================================================");
                	System.out.println("            Informe agora o título da sua tarefa ");
                	System.out.println("=========================================================");
                	String titu = teclado1.nextLine();
                	tarefa.setTituloTarefa(titu);
                	System.out.println();
                	System.out.println("=========================================================");
                	System.out.println("            Agora informe a descrição do titulo  ");
                	System.out.println("=========================================================");
                	String desc = teclado1.nextLine();
                	tarefa.setDescriçao(desc);
                	System.out.println();
                	System.out.println("=========================================================");
                	System.out.println(" Defina agora uma data limite para você realizar a tarefa");
                	System.out.println("=========================================================");
                	String dataLim = teclado1.nextLine();
                	tarefa.setDataLimite(dataLim);
                	System.out.println();
                	System.out.println("=========================================================");
                	System.out.println("          Com base nas suas informações ");
                	System.out.println("          Informe agora a prioridade dessa tarefa ");
                	System.out.println("=========================================================");
                	System.out.println("[1] - Não importante \n[2] - Razoável \n[3] - Importante " +
                	" \n[4] - Muito importante \n[5] - Tarefa urgente");	
                	int prio = teclado.nextInt(); 
                	switch (prio) {
                	case 1 :
                		tarefa.setPrioridade(prio);
                		break;
                	case 2 : 
                		tarefa.setPrioridade(prio);
                		break;
                	case 3 :
                		tarefa.setPrioridade(prio);
                		break;
                	case 4 :
                		tarefa.setPrioridade(prio);
                		break;
                	case 5 :
                		tarefa.setPrioridade(prio);
                		break;
            		default :
                    	System.out.println("          ❌ ESSE NUMERO É INVÁLIDO ❌");
            			break;
                	} 
                	if (prio == 1 || prio == 2 || prio == 3 || prio == 4 || prio == 5 || prio != 0) {
                    	tarefa.setId(t);
                    	tarefa.setContadorTarefas(t);
                    	tarefas.set(indice, tarefa);
                    	System.out.println();
                    	System.out.println("          ✔ ALTERAÇÃO REALIZADA COM SUCESSO ✔");
                    	System.out.println();     		
                	}
                	
                	
                	else {
                		System.out.println("          ❌ NÃO POSSO REALIZAR A ALTERAÇÃO ❌");
                	}

        		

            	
        	}
    			
    			else {
    				System.out.println("          ❌ NÃO POSSO REALIZAR A ALTERAÇÃO ❌");
    			}
    			
				
    	}
    	
    	catch(Exception e) {
    		System.out.println("Ops, ocorreu um erro ao editar a tarefa selecionada");
    	}
    	
    	finally {
    		this.perguntaTarefa();
    	}
    	
    	

    	
    }
    
    public void excluirTarefa(int i) {
    	try {
    		Tarefa tarefa = new Tarefa();
    		int indice = i - 1 ;
    		Tarefa elemento = tarefas.get(indice);
    		for (Tarefa e : tarefas) {
    			if (tarefas.contains(elemento) == true && e.getId() == i) {
    				System.out.println("Removendo sua tarefa da lista de cadastros");
    				System.out.println();
        			System.out.println("Tarefa = " + (e.getContadorTarefas()));
        			System.out.println();
        			System.out.println("Id = " + (e.getId()));
        			System.out.println("Titulo da tarefa = " + e.getTituloTarefa());
        			System.out.println("Descricao da tarefa = " + e.getDescriçao());
        			System.out.println("Data de cadastro = " + dataMes + " / " + mes + " / " + ano);
        			System.out.println("Data limite da tarefa = " + e.getDataLimite());
        			System.out.println("Prioridade = " + e.getPrioridade());
        			System.out.println();         		

    			}

    		}
    		
    		
    		tarefa.setId(0);
    		tarefa.setContadorTarefas(0);
    		tarefa.setDataLimite("00/00/00");
    		tarefa.setTituloTarefa(" TAREFA EXCLUÍDA ");
    		tarefa.setPrioridade(0);
    		tarefa.setDescriçao(" ");
    		tarefas.set(indice, tarefa);
    		
    		if (tarefa.getId() == 0) {
    			System.out.println("TAREFA JÁ EXCLUIDA");
    		}
    		
    		else {
    			System.out.println("INFORME NOVAMENTE AS INFORMAÇÕES");
    		}
    		
    		

    		

    		
    			

    		
    		

    		
    	}
    	catch(Exception e) {
    		System.out.println("Ops, ocorreu um erro ao excluir a tarefa selecionada");
    	}
    	
    	finally {
    		this.perguntaTarefa();
    	}
    	
    }
  
    
    
    		
    	}

    	
    		   			
    			
    	
    	
    
    	

			
		
    	
    	
    
    	
    
    


    


        	
    


    
    	
    
    	

    


    
    
    
    
    
    
    
    


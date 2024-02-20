

package Projeto_Agenda_De_Eventos;


public class Usuário extends Tarefa {
    private String nomeUsuario ;
    private String email;

    
    
    public Usuário() {
        System.out.println("============ 📚 AGENDA DE TAREFAS E EVENTOS 📚 ================");
        System.out.println("Para prosseguir no sistema, Realize o cadastro do usuário");
        System.out.println("==============================================================");
        System.out.println();
        System.out.println("==============================================================");
        System.out.println("                 📚 CADASTRO DE USUÁRIO 📚        ");
        System.out.println();
        System.out.println("        📚 Requisitos abaixo para cadastrar seu nome 📚");
        System.out.println("==============================================================");
        System.out.println("          ⚠ O NOME DEVE TER ENTRE 15 A 30 LETRAS ⚠  ");
        System.out.println("==============================================================");
       

    }
    
    public String getNomeUsuario() {
        return this.nomeUsuario;
    }
    
    public void setNomeUsuario(String n) {
        this.nomeUsuario = n ;
    }
    
    public String getEmail() {
        return this.email; 
    }
    
    public void setEmail(String e) {
        this.email = e ;
        
    }
    
    public void cadastrarNome() {
    	
    	try {
    		System.out.print("Informe seu nome completo aqui : 🖊 ");
            String perg = teclado.nextLine();
            int tam = perg.length();
            if (tam < 15 || tam > 30 ) {
                while (tam < 15 || tam > 30 ) {
                	System.out.println();
                    System.out.println("❌ Quantidade de letras não permitida ❌");
                    System.out.println("Insira seu nome novamente");
                    perg = teclado.nextLine();
                    tam = perg.length();
                }            
                System.out.println();
                System.out.println("🔄 Cadastrando novo usuario 🔄");
                this.setNomeUsuario(perg);
                System.out.println("✔ Cadastrando usuario de nome " + this.getNomeUsuario() + " ✔ ");
                System.out.println();
                
            }
            else {
            	System.out.println();
                System.out.println("🔄 Cadastrando novo usuario 🔄 ");
                this.setNomeUsuario(perg);
                System.out.println("✔ Cadastrando usuario de nome " + this.getNomeUsuario() + " ✔ ");
                System.out.println();
                        }
    	}
    	catch(Exception e) {
    		System.out.println("Ops, ocorreu um erro");
    	}
        

   
       
    }
    
    public void cadastrarEmail() {
    	try {
            System.out.println("       📧 Requisitos abaixo para cadastrar seu email 📧");
            System.out.println("==============================================================");
            System.out.println("⚠ EMAIL SÓ É VALIDO COM gmail, hotmail ou outlook ⚠");
            System.out.println("Informe seu email válido aqui : 📧 ");
            String email = teclado.nextLine();
            if (email.contains("@gmail.com") || email.contains("@outlook.com") || email.contains("@hotmail.com")) {
            	if (!email.contains(" ")) {
            		System.out.println();
            		System.out.println("🔄 Cadastrando novo usuario 🔄");
                    this.setEmail(email);
                    System.out.println("✔ Cadastrando o usuario de email " + this.getEmail() + " ✔ ");    		
            	}
            	else {
            		while (true) {
            			System.out.println();
                        System.out.println("❌ Email Inválido ❌");
                        System.out.println("Digite novamente seu email : 📧 ");
                        email = teclado.nextLine();
                        if (email.contains("@gmail.com") || email.contains("@outlook.com") || email.contains("@hotmail.com")) {
                        	if (!email.contains(" ")) {
                        		System.out.println();
                                System.out.println("🔄 Cadastrando novo usuario 🔄");
                                this.setEmail(email);
                                System.out.println("✔ Cadastrando o usuario de email " + this.getEmail() + " ✔ ");
                                break;                  		
                        	}
       
                        }
                    }
            	}
                
            }
            else {
                while (true) {
                	System.out.println();
                    System.out.println("❌ Email Inválido ❌");
                    System.out.println("Digite novamente seu email : 📧 ");
                    email = teclado.nextLine();
                    if (email.contains("@gmail.com") || email.contains("@outlook.com") || email.contains("@hotmail.com")) {
                    	if (!email.contains(" ")) {
                           	System.out.println();
                            System.out.println("🔄 Cadastrando novo usuario 🔄");
                            this.setEmail(email);
                            System.out.println("✔ Cadastrando o usuario de email " + this.getEmail() + " ✔ ");
                            break;               		
                    	}
     
                    }
                }

                
            
    		
    	}
            }
            catch(Exception e) {
            	System.out.println("Ops, ocorre um erro no cadastro do email");
            	
            }

    }

  
  
    
    
    
    
    
}

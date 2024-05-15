/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Rogerio Barboza
 */
public class ClassLogin {
    
    //Paramentros que recebem dados de entrada
    private String userLogin;
    private String senhaLogin;
    //Parametros que verificam dados recebidos
    private String user;
    private String senha;
    
    
    public ClassLogin(String userLogin, String senhaLogin, String user, String senha){ 
    //Recebe dados login
    this.userLogin = userLogin;
    this.senhaLogin = senhaLogin;
    //Verifica dados login
    this.user = user;
    this.senha = senha;
    }
    
    public String login(String userLogin, String senhaLogin, String user, String senha){

            for (int cont=3; cont >0 && cont <4; cont--) {
            String inputUser = JOptionPane.showInputDialog("Digite o usuário:");
            userLogin = inputUser;
            String inputSenha = JOptionPane.showInputDialog("Digite a senha:");
            senhaLogin = inputSenha;

            if (userLogin.equals("Java")&& senhaLogin.equals("abc@123")){
                cont = 0;
                user = userLogin;
                //JOptionPane.showMessageDialog(null, "Seja bem vindo "+user+"!");
                    		
                }else if (userLogin.equals("Java2")&& senhaLogin.equals("abc@123j2")){
                    cont = 0;
                    user = userLogin;
                    //JOptionPane.showMessageDialog(null, "Seja bem vindo "+user+"!");
		
                        }else {
                            user = "Inválido";
                            JOptionPane.showMessageDialog(null, "Usuário inválido. Restão "+(cont-1)+" tentativas.");
                        }
            }
                
    return user; 
    }//Fim Método

    
}

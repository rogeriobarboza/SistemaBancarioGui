/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import javax.swing.*;

/**
 *
 * @author Aluno
 */
public class ClassOperations implements Interface{
    private double saldo;
    private double debito;
    private double depos;
    private double empre;
    private double saque;
    private double trans;
    private String user;
    private double saldoUser;
    private String userBen;
    private double saldoUserBen;
    
    public ClassOperations(double saldo, double debito, double depos, double empre, double saque, double trans,String user,double saldoUser,String userBen,double saldoUserBen){
	this.saldo = saldo;
        this.debito = debito;
	this.depos = depos;
	this.empre = empre;
	this.saque = saque;
        this.trans = trans;
        this.user = user;
        this.saldoUser = saldoUser;
        this.userBen =userBen;
        this.saldoUserBen = saldoUserBen;
        
    }//Fim Metodo Construtor
    
public double saldo(double saldo){
    JOptionPane.showMessageDialog(null, "Seu saldo é de R$ "+saldo);
    return saldo;
}

public double debito(double debito){
    JOptionPane.showMessageDialog(null, "Seu debito é de R$ "+debito);
    return debito;
}

public double depos(){
    try{
    String input = JOptionPane.showInputDialog("Digite o valor do deposito: R$ ");
    depos = Double.parseDouble(input);
    if (depos >0){
        JOptionPane.showMessageDialog(null, "Depósito de R$ "+depos+" realizado com sucesso!");
    }else{
        depos = 0;
        JOptionPane.showMessageDialog(null, "Depósito não realizado! Valor inválido.");
    }
    }catch(NumberFormatException erro){
        JOptionPane.showMessageDialog(null, "Digite apenas números válidos!");
    }
    
    return depos;
}

public double empre(double saldo, double empre){
    try{
    String input = JOptionPane.showInputDialog("Digite o valor do emprestimo: R$ ");
    empre = Double.parseDouble(input);
    if (empre>0 && empre <= saldo*2) {
        JOptionPane.showMessageDialog(null, "Emprestimo de R$ "+empre+" realizado com sucesso!");
        } else {
            empre = 0;
            JOptionPane.showMessageDialog(null,"Limite ecedido.");
          }
    }catch(NumberFormatException erro){
        JOptionPane.showMessageDialog(null, "Digite apenas números válidos!");
    }
    return empre;
}

public double saque(){
    try{
    String input = JOptionPane.showInputDialog("Digite o valor do saque: R$ ");
    saque = Double.parseDouble(input);
    if (saque>0){
        saque = saque;
    }else{
        saque = 0;
        JOptionPane.showMessageDialog(null, "Saque não realizado! Valor inválido.");
    }
    }catch(NumberFormatException erro){
        JOptionPane.showMessageDialog(null, "Digite apenas números válidos!");
    }
    return saque;
}






}//Fim Class



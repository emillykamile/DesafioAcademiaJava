package Desafios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioSenhaSegura {
	
	public static boolean validaSenha(String senha) {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";

        Pattern p = Pattern.compile(regex);

        if (senha == null) {
            return false;
        }
        
        if(senha.length() < 6) {

	        int sum = 6 - senha.length();
	
	        System.out.println( "A senha não tem a quantidade mínima de caracteres que é 6. Faltam " + sum + " caracteres");

        }

        Matcher m = p.matcher(senha);
        boolean resultMatch = m.matches();
        
        if (resultMatch) {
        	System.out.println("Senha forte");
        }

        return resultMatch;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome");
        String nome = scanner.next();
        System.out.println("Senha");
        String senha = scanner.next();

        scanner.close();

        validaSenha(senha);
    }
}
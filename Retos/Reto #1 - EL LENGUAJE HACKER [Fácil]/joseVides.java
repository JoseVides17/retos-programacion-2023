import java.util.Scanner;


public class LenguajeHacker {

    public static void main(String[] args) {
        StringBuilder newString = new StringBuilder();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un texto");
        String texto = teclado.nextLine();
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == 'a'){
                newString.append('4');
            }else if(texto.charAt(i) == 'b'){
                newString.append("I3");
            }else if(texto.charAt(i) == 'c'){
                newString.append('[');
            }else if(texto.charAt(i) == 'd'){
                newString.append(')');
            }else if(texto.charAt(i) == 'e'){
                newString.append('3');
            }else if(texto.charAt(i) == 'f'){
                newString.append("|=");
            }else if(texto.charAt(i) == 'g'){
                newString.append('&');
            }else if(texto.charAt(i) == 'h'){
                newString.append('#');
            }else if(texto.charAt(i) == 'i'){
                newString.append('1');
            }else if(texto.charAt(i) == 'j'){
                newString.append(",_|");
            }else if(texto.charAt(i) == 'k'){
                newString.append(">|");
            }else if(texto.charAt(i) == 'l'){
                newString.append('£');
            }else if(texto.charAt(i) == 'm'){
                newString.append("/\\/\\");
            }else if(texto.charAt(i) == 'n'){
                newString.append("^/");
            }else if(texto.charAt(i) == 'ñ'){
                newString.append("[\\]");
            }else if(texto.charAt(i) == 'o'){
                newString.append('0');
            }else if(texto.charAt(i) == 'p'){
                newString.append("|*");
            }else if(texto.charAt(i) == 'q'){
                newString.append("(_,)");
            }else if(texto.charAt(i) == 'r'){
                newString.append("I2");
            }else if(texto.charAt(i) == 's'){
                newString.append('5');
            }else if(texto.charAt(i) == 't'){
                newString.append('7');
            }else if(texto.charAt(i) == 'u'){
                newString.append("(_)");
            }else if(texto.charAt(i) == 'v'){
                newString.append("\\/");
            }else if(texto.charAt(i) == 'w'){
                newString.append("\\/\\/");
            }else if(texto.charAt(i) == 'x'){
                newString.append("><");
            }else if(texto.charAt(i) == 'y'){
                newString.append('j');
            }else if(texto.charAt(i) == 'z'){
                newString.append('2');
            }else if(texto.charAt(i) == ' '){
                newString.append(' ');
            }
        }
        System.out.println(""+newString);
    }
    
}


package analizador_java;




/**
 *
 * @author pc
 */
import java.util.Scanner;
import javax.swing.JPanel;
public class Analizador {


 

	public static void main(String carls[])
        {
            Scanner end = new Scanner (System.in);   	
            int op;
            do{
		Character in[];
		Lexer prueba=new Lexer();
		prueba.instrucciones();
		in=prueba.leer();
		prueba.esIdentificador(in);
		prueba.esToken(in);
		prueba.esDigito(in);
                
                System.out.print("\nDesea ingresar otra orden 1.Si 2.No : ");
                op=end.nextInt();
            }while(op==1);
            
            System.out.print(" \nUniversidad mariano galvez de Guatemala");
	}

    
}


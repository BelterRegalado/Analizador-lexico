
package analizador_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pc
 */
public class Lexer {
    
  

	
// los tokens que voy a evaluar
	private Character tokens[]=  
		{
		'=','(',')','+','-','*','/',';','<','>'
		};
	
	private	Character au='x';

	
	public void instrucciones()
	{	
		
		System.out.print( "                  Bienvenido           \n");
		System.out.print("Por favor Introduce las Expresiones que desees          *\n");
		System.out.print("Cuando Termines Pulsa Barra Espaciadora y  el boton Enter         *\n");
		System.out.println();
	}

	public Character[] leer()
	{
		String res="";
		int longitud=0;
		Character ch[];
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("Introduce la Expresion: ");
			do{
			res+=in.readLine();
			}while(!res.endsWith(" "));
		}catch(IOException ioe)
		{
			System.out.println("Ocurrio la Sig. Excepcion " +ioe);
		}
		longitud=res.length();
		ch=new Character[longitud];
		for(int i=0;i<longitud;i++)
		{
			ch[i]=res.charAt(i);
		}
	return ch;
	}

	// comprobamos los digitos

	public void esDigito(Character ch[])
	{
		int cont=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			if(au.isDigit(ch[i]))
			{
				cont++;
				cualesSon+=ch[i].toString() + " ";
			}
		}
	tipos out=new tipos(cont,"Digitos",cualesSon);
	out.verTipos();
	}

//comprobamos la expresion
	public void esToken(Character ch[])
	{
		int ope=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<tokens.length;j++)
			{
				if(ch[i].equals(tokens[j]))
				{
					ope++;
					cualesSon+=ch[i].toString() + " ";	
				}			
			}
		}
	tipos out=new tipos(ope,"Tokens",cualesSon);
	out.verTipos();
	}

	// verificamos si es un verificador

	public void esIdentificador(Character ch[])
	{
		int Id=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			if(au.isJavaIdentifierStart(ch[i]))
			{
				Id++;
				cualesSon+=ch[i].toString() + " ";
			}
		}
	tipos out=new tipos(Id,"Identificadores",cualesSon);
	out.verTipos();	
	}

	
	
}



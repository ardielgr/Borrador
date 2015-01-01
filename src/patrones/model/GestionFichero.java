package patrones.model;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class GestionFichero {
	
	String variable_;
	ArrayList<String> var;
	static RandomAccessFile fichero_;
	static ArrayList<String> buffer = new ArrayList<String>();
	static ArrayList<String> buffer2 = new ArrayList<String>();
	
	
	public GestionFichero(){}
	
	public ArrayList<String> abrirFichero(ArrayList<String> listaPath) throws IOException {
		String line = "";
		

//		for (int i = 0; i < listaPath.size(); i++){
	
			variable_ = listaPath.get(0);
			System.out.println("EL VALOR DE VARIABLE_ es --> "+variable_);
			fichero_ = new RandomAccessFile(variable_, "rw");
//			buffer2 = OpenFile(fichero_);
//			System.out.println("Estoy leyendo buffer2");
			while( line != null )
			{
				
				line = fichero_.readLine();
				buffer.add(line);
				System.out.println(line);
				System.out.println("----------");
			
			}

			buffer.remove(buffer.size()-1);
		
//		}
		return buffer;
		//fichero_ = new RandomAccessFile(variable_, "rw");
	}
	
	public void eliminarFichero(){
		System.out.println("Ahora elimino fichero");
		System.out.println(variable_);
		
	}
	
	
	public void escribirFichero( ArrayList<String> buffer ){
		String line= "";
		Integer line_length = 0;
		String cadena = "";
		String line2;
	
		
		//System.out.println("XXXXXXXXXXXXXXXXXXXXXXX"+buffer);
		
		try {
			fichero_.seek(0);
			
			for (int i = 0; i < buffer.size(); i++){
				cadena = buffer.get(i);
				fichero_.writeBytes(cadena);
				cadena = "";
			}
			
//			fichero_.writeUTF( buffer.toString() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
//	public void Lectura(ArrayList<String> listaPath) throws IOException {
//		for (int i = 0; i < listaPath.size(); i++){
//			variable_ = listaPath.get(i);
//			fichero_ = new RandomAccessFile(variable_, "rw");
//			OpenFile(fichero_);
//		}
//		//fichero_ = new RandomAccessFile(variable_, "rw");
//	}
	
	public ArrayList<String> OpenFile(RandomAccessFile fichero_) throws IOException{
		
		String line;
		line = fichero_.readLine();
		System.out.println("Estoy en OpenFile");
		
		while( line != null )
		{
			System.out.println(line);
			System.out.println("----------");
			buffer.add(line);
			line = fichero_.readLine();
		}
		
		for(int i = 0; i < buffer.size(); i++){
			System.out.println("--->");
			System.out.println(buffer.get(i));
		}
		
		return buffer;
	
	}
	
//	public boolean Guardar(ArrayList<String>)
//	
}

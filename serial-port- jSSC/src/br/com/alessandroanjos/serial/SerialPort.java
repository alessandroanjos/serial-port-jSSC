package br.com.alessandroanjos.serial;

import jssc.SerialPortList;

/**
 * Como utilizar java com portas seriais utilizando a lib jSSC-0.7.
 * <a href="https://code.google.com/archive/p/java-simple-serial-connector"> https://code.google.com/archive/p/java-simple-serial-connector</a>
 * @author Allessandro
 */
public class SerialPort {

	public static void main(String[] args) {
		new SerialPort().listPortSerial();
	}

	/**
	 * Lista todas as portas COM disponiveis.
	 */
	public void listPortSerial(){
		String[] portNames = SerialPortList.getPortNames();
	    for(int i = 0; i < portNames.length; i++){
	        System.out.println(portNames[i]);
	    }
	}
}

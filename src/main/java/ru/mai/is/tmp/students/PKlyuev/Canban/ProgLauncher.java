package ru.mai.is.tmp.students.PKlyuev.Canban;
import java.io.IOException;


public class ProgLauncher {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Canban is starting..");
		System.out.println();
		
		Canban prog = new Canban();
		prog.startProg();

	}

}

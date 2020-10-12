package de.nordakademie.primes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class PrimeTester {
	
	public static void main(String[] args) {
		try (	OutputStream os = new FileOutputStream("out.txt");
				Writer w = new OutputStreamWriter(os, StandardCharsets.UTF_8.name());
				BufferedWriter bw = new BufferedWriter(w)) {
				bw.write("hallo welt");
				bw.write("\n");
			} catch (Exception e) {
				System.err.println("Fehler beim Schreiben der Datei out.txt");
			}
		} 
	public boolean  isPrime(int n) {
		if (n<=1) {
			return false;
		}
		for (int i=2;i<=n/2;i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

}

package test_bank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class BankIO {
	public static void readFile(String filename,Bank bank) {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename));
			while(in.hasNextLine()) {
				bank.add(BankIO.readAccount(in));
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public static BankAccount readAccount(Scanner in) {
		
			String line = in.nextLine();
			String [] tokens = line.split(" ");
			int accno = Integer.parseInt(tokens[0]);
			double amt = Double.parseDouble(tokens[1]);
			BankAccount acc = new BankAccount(amt,accno);
			return acc;
	}
	public static void writeFile(Bank bank,String filename) {
		PrintWriter out;
		try {
			out = new PrintWriter(filename);
		} 
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Bank bank = new Bank(7);
		BankIO.readFile("accounts.txt", bank);
		System.out.println(bank);
//		File file = new File(".");
//		for(String fileNames : file.list()) System.out.println(fileNames); Keep a check of files in the current directory
//		BankAccount acc = BankIO.readAccount(in);
	}
}

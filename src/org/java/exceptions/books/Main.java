package org.java.exceptions.books;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	// costants
	static final int BOOKS_COUNT = 5;
	static final File booksFile = new File("./file.txt");

	public static void main(String[] args) {

		int indexBooks = 0;

		Book[] books = new Book[BOOKS_COUNT];

		Scanner in = null;

		try {

			// open Scanner
			in = new Scanner(System.in);

			for (int x = 0; x < books.length; x++) {

				Book b = null;

				System.out.println("Titolo: ");
				String title = in.nextLine();

				System.out.println("Pagine: ");
				String strPages = in.nextLine();
				int pages = Integer.valueOf(strPages);

				System.out.println("Autore: ");
				String author = in.nextLine();

				System.out.println("Editore: ");
				String editor = in.nextLine();

				b = new Book(title, pages, author, editor);

				books[indexBooks++] = b;
			}

		} catch (Exception e) {

			System.out.println("Error: " + e.getMessage());
		} finally {

			// close scanner if it was opened
			if (in != null)
				in.close();
		}

		for (int x = 0; x < books.length; x++) {

			System.out.println(books[x] + "\n-------------------------------------------\n");
		}

		// write books in external file
		FileWriter myWriter = null;

		try {

			myWriter = new FileWriter(booksFile);

			for (int x = 0; x < books.length; x++) {

				Book b = books[x];

				myWriter.write(b.toString());
			}
		} catch (IOException e) {

			System.out.println("Error writing file: " + e.getMessage());
		} finally {

			if (myWriter != null)
				try {
					myWriter.close();
				} catch (IOException e) { }
		}
		
		//read the external file
		Scanner reader = null;
		
		try {
			reader = new Scanner(booksFile);
			
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				
				System.out.println(data);
				}
			
		}catch(FileNotFoundException e) {
			
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			
			if (reader != null)
				reader.close();
		}
		
	}
}

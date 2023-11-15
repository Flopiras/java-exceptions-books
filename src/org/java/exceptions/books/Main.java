package org.java.exceptions.books;

import java.util.Scanner;

public class Main {
	
	static final int BOOKS_COUNT = 5;

	public static void main(String[] args) {
		
		int indexBooks = 0;
		
		Book[] books = new Book[BOOKS_COUNT];
		
		Scanner in = null;
		
		try {
			
			//open Scanner
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
			
			//close scanner if it was opened
			if (in != null)
				in.close();
		}
		
		
		for (int x = 0; x < books.length; x++) {
			
			System.out.println(books[x]);
		}

	}

}

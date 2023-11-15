package org.java.exceptions.books;

public class Book {
	
	private String title;
	private int pages;
	private String author;
	private String editor;
	
	public Book(String title, int pages, String author, String editor) throws Exception {
		
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setEditor(editor);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {

		//raising exceptions
		if(title == null || title.length() < 3 || title.isEmpty())
			throw new Exception("The title must be longer than 2 characters");
		
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) throws Exception {
		
		//raising exceptions
				if(pages <= 0)
					throw new Exception("The pages cannot be less than 0");
				
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		
		//raising exceptions
				if(author == null || author.length() < 3 || author.isEmpty())
					throw new Exception("The author's name must be longer than 2 characters");
				
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) throws Exception {
		
		//raising exceptions
				if(editor == null || editor.length() < 3 || editor.isEmpty())
					throw new Exception("The editor must be longer than 2 characters");
				
		this.editor = editor;
	}
}

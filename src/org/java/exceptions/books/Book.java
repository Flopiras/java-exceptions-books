package org.java.exceptions.books;

public class Book {
	
	private String title;
	private int pages;
	private String autor;
	private String editor;
	
	public Book(String title, int pages, String autor, String editor) {
		
		setTitle(title);
		setPages(pages);
		setAutor(autor);
		setEditor(editor);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
}

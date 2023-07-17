package com.kh.practice.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.kh.practice.model.Book;

public class BookController {
//	List<Book> books = new ArrayList<>();

	// src/books.obj 파일에 저장
	public void fileSave(Book book) {

//		books.add(book);
//		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/books.obj"))){
//			for(Book book2:books) {
//				oos.writeObject(book2);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/books.obj", true))) {
			oos.writeObject(book);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// src/books.obj 파일에서 데이터 가져오기
	public List<Book> fileRead() {
//		List<Book> outBooks = new ArrayList<>();
//		
//		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/books.obj"))){
//			while(true) {
//				outBooks.add((Book)ois.readObject());
//			}
//			
//		} catch (EOFException e) {
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		return outBooks;
//	}

		List<Book> books = new ArrayList<>();
		ObjectInputStream ois = null;
		try (FileInputStream fis = new FileInputStream("src/books.obj")){
			while(true) {
				ois = new ObjectInputStream(fis);
				books.add((Book) ois.readObject());
			}
		} catch (EOFException e) {
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return books;

	}
}
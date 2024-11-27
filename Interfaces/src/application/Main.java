package application;

import java.util.ArrayList;

import entities.Ebook;
import entities.ReadingList;
import entities.TextMessage;

public class Main {

	public static void main(String[] args) {
		TextMessage message = new TextMessage("ope", "It's going great!");
		System.out.println(message.read());

		ArrayList<TextMessage> textMessage = new ArrayList<>();
		textMessage.add(new TextMessage("private number", "I hid the body."));
		
		ArrayList<String> pages = new ArrayList<>();
		pages.add("Split your method into short, readable entities.");
		pages.add("Separate the user-interface logic from the application logic.");
		pages.add("Always program a small part initially that solves a part of the problem.");
		pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

		Ebook book = new Ebook("Tips for programming.", pages);

		int page = 0;
		while (page < book.pages()) {
		    System.out.println(book.read());
		    page = page + 1;
		}
		
		ReadingList jonisList = new ReadingList();
		jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
		jonisList.add(new TextMessage("arto", "have you checked the submissions yet?"));

		System.out.println("Joni's to-read: " + jonisList.toRead());		
		
		int i = 0;
		while (i < 1000) {
		    jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
		    i = i + 1;
		}

		System.out.println("Joni's to-read: " + jonisList.toRead());
		System.out.println("Delegating the reading to Verna");

		ReadingList vernasList = new ReadingList();
		vernasList.add(jonisList);
		vernasList.read();

		System.out.println();
		System.out.println("Joni's to-read: " + jonisList.toRead());
	}

}

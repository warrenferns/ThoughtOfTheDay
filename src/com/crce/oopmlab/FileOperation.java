package com.crce.oopmlab;
import java.util.*;
import edu.duke.*;
public class FileOperation {
	public static ArrayList<Quote> fetchQuote(){
		FileResource fileResource = new FileResource("data/quotes.txt");
		ArrayList<Quote> quoteList = new ArrayList<Quote>();
		for(String line:fileResource.lines()) {
			String[] tokens = line.split(":");
			Quote q = new Quote();
			q.setQuoteId(Integer.parseInt(tokens[0]));
			q.setQuoteValue(tokens[1]);
			q.setQuoteAuthor(tokens[2]);
			q.setQuoteType(tokens[3]);
			quoteList.add(q);
		}
		return quoteList;
	}
}

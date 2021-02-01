package com.crce.oopmlab;
import java.text.SimpleDateFormat;
import java.util.*;

public class Quotes {
	private static ArrayList<Quote> myQuotes = FileOperation.fetchQuote();// Array for Storing 10 Quote Objects.
	private static Scanner scan = new Scanner(System.in);

	// This method display Thought Of The Day randomly
	public static void printQuoteRandom() {
		Random rand = new Random();
		//By this we will be generating random integers of the size of the arrayList
		int index = rand.nextInt(myQuotes.size());
		//System.out.println(index+1);
		for(Quote quote:myQuotes) {
			
			if(quote.getQuoteId() == index+1) {
				System.out.println();
				System.out.println("Todays Quote is ");
				//System.out.println(quote.getQuoteId());
				System.out.println(quote.getQuoteValue());
				System.out.println("---By " + quote.getQuoteAuthor());
				System.out.println("The Quote is " + quote.getQuoteType());
			}
		}

	}

	// This method display date in customized format
	public static void printDate() {
		Date date = new Date();
		//select the format of the date
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		//storing the date in string
		String strDate = formatter.format(date);
		System.out.println("Today's date is " + strDate);
		//select the weekday
		formatter = new SimpleDateFormat("EEEE");
		//storing the weekday in string
		strDate = formatter.format(date);
		System.out.println("Today is " + strDate);

	}

	// This method display Thought Of The Day randomly based on input quoteType
	public static void printQuote(String quoteType) {
		int count=0;
		System.out.println();
		
		ArrayList<Quote> quoteTypes = new ArrayList<Quote>();
		for(Quote quote:myQuotes) {
			if(quote.getQuoteType().startsWith(quoteType)) {
				count++;
				quote.setQuoteId(count);
				quoteTypes.add(quote);
			}
		}
		System.out.println("Total type of "+quoteType+" messages are "+count);
		Random rand = new Random();
		//By this we will be generating random integers of the size of the arrayList
		int index = rand.nextInt(count);
		for(Quote quote:quoteTypes) {
			
			if(quote.getQuoteId() == index+1) {
				System.out.println();
				System.out.println("Todays Quote is ");
				//System.out.println(quote.getQuoteId());
				System.out.println(quote.getQuoteValue());
				System.out.println("---By " + quote.getQuoteAuthor());
				System.out.println("The Quote is " + quote.getQuoteType());
			}
		}
	}
	
	//Q1
	//This method takes a input Quote from the user and then prints all the Quotes
	public static void printAllByAdding() {
		Quote q = new Quote();
		q.setQuoteId(myQuotes.size()+1);
		System.out.print("\n Enter the Quote: ");
		q.setQuoteValue(scan.nextLine());
		System.out.print("Enter the Author: ");
		q.setQuoteAuthor(scan.nextLine());
		System.out.print("Enter the Quote type: ");
		q.setQuoteType(scan.nextLine());
		myQuotes.add(q);
		
		for(Quote quote:myQuotes) {
			System.out.println(quote.toString());
		}	
	}
	
	//Q2
	
	//This method counts the quotes written by and author and then prints it
	public static void countAuthorsQuotes() {
		ArrayList<String> authors = new ArrayList<>();
		for(Quote quote:myQuotes) {
			authors.add(quote.getQuoteAuthor());
		}
		
		LinkedHashSet<String> hashSet = new LinkedHashSet<>(authors);
		ArrayList<String> newAuthors = new ArrayList<>(hashSet);
		
		for(String author:newAuthors) {
			int count = 0;
			for(Quote quote:myQuotes) {
				if(quote.getQuoteAuthor().startsWith(author)) {
					count += 1;
				}
			}
			System.out.println(author+": "+count);
		}
	}
	
	//Q3
	//This method counts the types of Quotes and then prints it
	public static void countQuotesTypes() {
		ArrayList<String> types = new ArrayList<>();
		for(Quote quote:myQuotes) {
			types.add(quote.getQuoteType());
		}
		
		LinkedHashSet<String> hashSet = new LinkedHashSet<>(types);
		ArrayList<String> newTypes = new ArrayList<>(hashSet);
		
		for(String type:newTypes) {
			int count = 0;
			for(Quote quote:myQuotes) {
				if(quote.getQuoteType().startsWith(type)) {
					count += 1;
				}
			}
			System.out.println(type+": "+count);
		}
	}
	
	//Q4
	/*Array -> Basic functionality provided by Java
	 * Array is a fixed size data structure while ArrayList is not. 
	 * One need not to mention the size of Arraylist while creating its object. 
	 * Even if we specify some initial capacity, we can add more elements
	 *  eg. int[] arr
	 * ArrayList -> Part of collection framework in Java
	 * In ArrayList the actual objects are never stored at contiguous locations. 
	 * References of the actual objects are stored at contiguous locations
	 *  eg. ArrayList<> arr = new ArrayList<>();
	 */
	
	//Q5
	/*
	 * Class, object, data members, member functions
	Constructors, types, static members and functions
	Input and output functions in Java, encapsulation
	Array,Arraylist
	 */
}

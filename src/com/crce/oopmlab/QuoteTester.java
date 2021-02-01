package com.crce.oopmlab;

public class QuoteTester {
	public static void main(String[] args) {
		// Test methods are made static so can be directly used in the static main()
		// method.
		testAll();
	}

	public static void testAll() {

		testPrintDate(); //prints date
		testPrintQuoteRandom(); //prints random quote
		testPrintQuote(); //prints quote
		testPrintAllByAdding(); //adds quote to the list
		testCountAuthorsQuotes(); //counts the quotes by each author
		testCountQuoteTypes(); //counts the quote types

	}

	//This method tests  customizable datePrint feature
	public static void testPrintDate() {
		Quotes.printDate(); 
	}

	//This method tests the printQuote method
	public static void testPrintQuote() {
		// Quotes.printQuote();
		// Quotes.printQuote("Inspirational");
		// Quotes.printQuote("Motivational");
	}

	//This method tests the printQuoteRando method
	public static void testPrintQuoteRandom() {
		Quotes.printQuoteRandom();
	}
	
	//This method tests the printAllByAdding method
	public static void testPrintAllByAdding() {
		Quotes.printAllByAdding();
	}
	
	//This method tests the countAuthoesQuotes method
	public static void testCountAuthorsQuotes() {
		Quotes.countAuthorsQuotes();
	}
	
	//This method tests the countQuoteTypes method
	public static void testCountQuoteTypes() {
		Quotes.countQuotesTypes();
	}
}

package com.crce.oopmlab;

public class Quote {
	// please encapsulate the data members to hide from other classes 
	//please follow java naming conventions while declaring variables,declaring  methods and declaring classes
		private int quoteId;
		private String quoteValue;
		private String quoteAuthor;
		private String quoteType;

		//Gets the quote ID 
		public int getQuoteId() {
			return quoteId;
		}

		//Sets the Quote ID to the given Quote ID
		public void setQuoteId(int quoteId) {
			this.quoteId = quoteId;
		}

		//Gets the Quote value
		public String getQuoteValue() {
			return quoteValue;
		}

		//Sets the Quote value to the given Quote value
		public void setQuoteValue(String quoteValue) {
			this.quoteValue = quoteValue;
		}

		//Gets the Quote Author 
		public String getQuoteAuthor() {
			return quoteAuthor;
		}

		//Sets the quote Author to the given Author
		public void setQuoteAuthor(String quoteAuthor) {
			this.quoteAuthor = quoteAuthor;
		}

		//Gets the Quote Type
		public String getQuoteType() {
			return quoteType;
		}

		//Sets the Quote Type to the given Quote Type
		public void setQuoteType(String quoteType) {
			this.quoteType = quoteType;
		}
		
		//Constructor overloaded with having different parameters
		//Creates a constructor with no parameters
		public Quote() {
			
		}
		
		//Creates a constructor with the given parameters
		public Quote(int quoteId, String quoteValue, String quoteAuthor, String quoteType) {
			super();
			this.quoteId = quoteId;
			this.quoteValue = quoteValue;
			this.quoteAuthor = quoteAuthor;
			this.quoteType = quoteType;
		}

		//Generates a toStirng
		public String toString() {
			return "Quote [quoteId=" + quoteId + ", quoteValue=" + quoteValue + ", quoteAuthor=" + quoteAuthor
					+ ", quoteType=" + quoteType + "]";
		}
}

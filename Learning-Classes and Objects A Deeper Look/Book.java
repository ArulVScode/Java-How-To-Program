/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAM
 *
 *Declaring an enum type with constructor and explicit instance fields and accessors for these fields
 *User: Muh. Asrul Mulis
 *Date: 31/Maret/2023
 *
 *Version(1.05)
 */
 
public enum Book {
     // declare constants of enum type
	JHTP("Java HOW To Program", "2012"), 
	CHTP("C How TO Program", "2007"), 
	IW3HTP("Internet & World Wide Web How To Program", "2008"), 
	CPPHTP("C++ How To Program", "2012"), 
	VBHTP("Visual Basic 2010 How To Program", "2011"), 
	CSHARPHTP("Visual C# 2010 How To Program", "2011");
	 // instance fields
	private final String title; // Book title
	private final String copyrightYear; // copyright year
	 // enum constructor
	Book (String bookTitle, String year) {
	     
		title = bookTitle;
		copyrightYear = year;
	} // end enum Book constructor
	// accessor for field title
	public String getTitle() {
	     
		return title;
	} // end method getTitle
	// accessor for field copyrightYear
	public String getCopyrightYear() {
	     
		return copyrightYear;
	} // end method getCopyrightYear
} // end enum Book
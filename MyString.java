public class MyString
{
	final int NOT_FOUND = -1; // USE THIS IN PLACE OF LITERAL -1

	private char[] letters;
	
	// DO NOT MODIFY THESE TWO CONTRUCTORS IN ANY WAY. USE AS GIVEN!
	public MyString( String other )
	{	
		letters = other.toCharArray(); // DO NOT CHANGE/ADD/MODIFY IN ANY WAY
	}
	public MyString( MyString other )
	{		
		this( other.toString() ); // DO NOT CHANGE/ADD/MOFIDY IN ANY WAY
	}
	public int length()
	{
		return letters.length; // JUST TO MAKE IT COMPILE. REPLACE WITH YOUR CODE AND RETURN VALUE
	}
	public char charAt(int index) // IF INDEX OUT OF BOUNDS. EXIT PROGRAM! (dont return anything)
	{

		if(index>letters.length-1)
		{
			System.out.println("\nFATAL ERROR: charAt() given invalid index\n");
			System.exit(0);
		}
		return letters[index]; // JUST TO MAKE IT COMPILE. REPLACE WITH YOUR CODE AND RETURN VALUE
	}
	public int compareTo(MyString other)
	{
		if(letters.length > other.letters.length)
		{
			for(int i=0; i<other.letters.length; i++)
		{
			if(letters[i]>other.letters[i])
			{
				return 1;
			}
			if(letters[i]<other.letters[i])
			{
				return -1;
			}
		}
			return 1;
		}
		else
		{
			for(int i=0; i<letters.length; i++)
			{
				if(letters[i]>other.letters[i])
			{
				return 1;
			}
			if(letters[i]<other.letters[i])
			{
				return -1;
			}
			}

			if(letters.length == other.letters.length)
			{
				return 0;
			}
			return -1;
		}
		 // JUST TO MAKE IT COMPILE. REPLACE WITH YOUR CODE AND RETURN VALUE
	}	
	public boolean equals(MyString other)
	{
		if(compareTo(other)==0)
		{
			return true;
		}
		return false; // JUST TO MAKE IT COMPILE. YOU REPLACE WITH YOUR CODE AND RETURN VALUE
	}
	// LOOKING for c but starting at [startIndex],  not at [0]
	// You should use this in your other Indexof Method
	public int indexOf(int startIndex, char ch)	
	{
//		if ( REQUESTED INDEX OUT OF BOUNDS PHYSICALLY || LOGICALLY )
//		{
//			System.out.println("\nFATAL ERROR: indexOf() given invalid startIndex\n");
//			System.exit(0);
//		}
		return NOT_FOUND; // JUST TO MAKE IT COMPILE. YOU REPLACE WITH YOUR CODE AND RETURN VALUE
	}
	
	// IN THIS METHOD BELOW YOU MUST RE-USE indexOf( int startIndex, char ch) METHOD ABOVE
	public int indexOf(MyString key)
	{	
		return -999; // JUST TO MAKE IT COMPILE. YOU REPLACE WITH YOUR CODE AND RETURN VALUE
	}
	public String toString()
	{
		String a = new String(letters);
		return a; // JUST TO MAKE IT COMPILE. YOU REPLACE WITH YOUR CODE AND RETURN VALUE
	}
} // END MYSTRING CLASS

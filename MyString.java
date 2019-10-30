public class MyString
{
	final int NOT_FOUND = -1; 

	private char[] letters;
	
	
	public MyString( String other )
	{	
		letters = other.toCharArray(); 
	}
	public MyString( MyString other )
	{		
		this( other.toString() ); 
	}
	public int length()
	{
		return letters.length; 
	}
	public char charAt(int index) 
	{

		if(index>letters.length-1)
		{
			System.out.println("\nFATAL ERROR: charAt() given invalid index\n");
			System.exit(0);
		}
		return letters[index];
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
		 
	}	
	public boolean equals(MyString other)
	{
		if(compareTo(other)==0)
		{
			return true;
		}
		return false; 
	}
	
	public int indexOf(int startIndex, char ch)	
	{
		if(startIndex>letters.length-1)
		{
			System.out.println("\nFATAL ERROR: indexOf() given invalid startIndex\n");
			System.exit(0);
		}

		int indOf1stKeyLetter;
		for(int i=startIndex; i<letters.length; i++)
		{
			if(letters[i] == ch)
			{
				indOf1stKeyLetter = i;
				return indOf1stKeyLetter;
			}
		}

		return NOT_FOUND;
	}
	
	
	public int indexOf(MyString key)
	{	
		if(key.letters.length > letters.length)
		{
			return NOT_FOUND;
		}

		int indOf1stKeyLetter = indexOf(0, key.letters[0]);

		while(indOf1stKeyLetter != NOT_FOUND)
		{
			if(keyFound(indOf1stKeyLetter, key) == true)
			{
				return indOf1stKeyLetter;
			}
			else
			{
				indOf1stKeyLetter = indexOf(indOf1stKeyLetter+key.letters.length, key.letters[0]);
			}
		}
		return NOT_FOUND; 
	}
	public String toString()
	{
		String a = new String(letters);
		return a; 
	}

	public boolean keyFound(int ind, MyString key)
	{
		for(int i=0; i<key.letters.length; i++)
		{
			if(letters[ind+i] != key.letters[i])
			{
				return false;
			}
		}
		return true;
	}
} 

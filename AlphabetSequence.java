package practicing;

public class AlphabetSequence {

	public static void main(String[] args) {


		alphabetSequence('e','k');

	}

	private static char alphabetSequence (char firstLetter, char lastLetter) 
	{

        char c;
        
        for(c = firstLetter; c <= lastLetter; ++c)
            System.out.print(c + " ");
        
        return (c) ;
	}
	

}

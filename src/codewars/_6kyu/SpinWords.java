package codewars._6kyu;
//Stop gninnipS My sdroW!
//Write a function that takes in a string of one or more words, and returns the same string,
//but with all five or more letter words reversed (Just like the name of this Kata).
//Strings passed in will consist of only letters and spaces.
//Spaces will be included only when more than one word is present.
//
//Examples:
//spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//spinWords( "This is a test") => returns "This is a test"
//spinWords( "This is another test" )=> returns "This is rehtona test"

public class SpinWords {
    public String spinWords(String sentence) {
        String[] sentArr = sentence.split(" ");

        StringBuilder result = new StringBuilder();
        for(String str : sentArr) {
            if(str.length() > 4)
                result.append((new StringBuilder(str)).reverse()).append(" ");
            else result.append(str).append(" ");
        }
        return result.toString().trim();
    }
}


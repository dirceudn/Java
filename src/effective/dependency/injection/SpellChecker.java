package effective.dependency.injection;

import java.util.List;

//Inappropriate use of static utility - inflexible and untestable!
public class SpellChecker {

	private static final Lexicon dictionary = null;
	
	private SpellChecker() {} //Noninstantiable
	
	public static boolean isValid(String word ) {return false;}
	public static List<String> suggestions(String type){return null;}
	
	
	
}

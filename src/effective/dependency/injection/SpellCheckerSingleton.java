package effective.dependency.injection;

import java.util.List;

//Inappropriate use of singleton - inflexible and untestable!
public class SpellCheckerSingleton {

private static final Lexicon dictionary = null;
	
	private SpellCheckerSingleton() {} //Noninstantiable
	
//	public static INSTANCE = new SpellCheckerSingleton();
	
	public static boolean isValid(String word ) {return false;}
	public static List<String> suggestions(String type){return null;}
	
}

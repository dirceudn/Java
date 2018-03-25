package effective.dependency.injection;

import java.util.List;
import java.util.Objects;

//Dependency injection provides flexibility and testability.
public class SpellCheckerDepedency {
	
	private Lexicon dictionary = null;
	
	public SpellCheckerDepedency(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
		
	}
	
	public static boolean isValid(String word ) {return false;}
	public static List<String> suggestions(String type){return null;}

}

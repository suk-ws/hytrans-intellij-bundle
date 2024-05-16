package cc.sukazyo.hytrans_intellij.language;

import com.intellij.lang.Language;

public class HytLanguageTreeLanguage extends Language {
	
	private HytLanguageTreeLanguage () { super("HyLangs"); }
	public static final HytLanguageTreeLanguage INSTANCE = new HytLanguageTreeLanguage();
	
}

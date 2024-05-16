package cc.sukazyo.hytrans_intellij.language;

import com.intellij.lang.Language;

public class HytTranslationsLanguage extends Language {
	
	private HytTranslationsLanguage() { super("HyTrans"); }
	public static final HytTranslationsLanguage INSTANCE = new HytTranslationsLanguage();
	
}

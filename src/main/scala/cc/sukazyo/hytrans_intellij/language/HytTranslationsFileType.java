package cc.sukazyo.hytrans_intellij.language;

import cc.sukazyo.hytrans_intellij.Resources$;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class HytTranslationsFileType extends LanguageFileType {
	
	private HytTranslationsFileType() { super(HytTranslationsLanguage.INSTANCE); }
	public static final HytTranslationsFileType INSTANCE = new HytTranslationsFileType();
	
	@Override public @NonNls @NotNull String getName () { return "HyTrans Translation File"; }
	@Override public @NlsContexts.Label @NotNull String getDescription () { return "HyTrans translation file contains key-value pairs translation definition."; }
	@Override public @NonNls @NotNull String getDefaultExtension () { return "hytrans"; }
	@Override public @NonNls Icon getIcon () { return Resources$.MODULE$.ICON_HYTRANS_FILE(); }
	
}

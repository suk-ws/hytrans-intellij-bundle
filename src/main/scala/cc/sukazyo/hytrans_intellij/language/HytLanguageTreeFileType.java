package cc.sukazyo.hytrans_intellij.language;

import cc.sukazyo.hytrans_intellij.Resources$;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class HytLanguageTreeFileType extends LanguageFileType {
	
	private HytLanguageTreeFileType() { super(HytLanguageTreeLanguage.INSTANCE); }
	public static final HytLanguageTreeFileType INSTANCE = new HytLanguageTreeFileType();
	
	@Override public @NonNls @NotNull String getName () { return "HyTrans Language Tree"; }
	@Override public @NlsContexts.Label @NotNull String getDescription () { return "HyTrans language tree file that determines the relationship between languages."; }
	@Override public @NonNls @NotNull String getDefaultExtension () { return "hylangs"; }
	@Override public @NonNls Icon getIcon () { return Resources$.MODULE$.ICON_HYLANGS_FILE(); }
	
}

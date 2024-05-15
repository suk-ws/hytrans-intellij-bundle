package cc.sukazyo.hytrans_intellij.language

import cc.sukazyo.hytrans_intellij.Resources
import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.annotations.NotNull

import javax.swing.Icon

class HytLanguageTreeFileType private extends LanguageFileType (HytLanguageTreeLanguage.INSTANCE) {
	
	
	@NotNull override def getName: String = "HyTrans Language Tree"
	@NotNull override def getDescription: String = "HyTrans language tree file that determines the relationship between languages."
	@NotNull override def getDefaultExtension: String = "hylangs"
	@NotNull override def getIcon: Icon = Resources.ICON_HYLANGS_FILE
	
}

object HytLanguageTreeFileType {
	val INSTANCE = new HytLanguageTreeFileType
}

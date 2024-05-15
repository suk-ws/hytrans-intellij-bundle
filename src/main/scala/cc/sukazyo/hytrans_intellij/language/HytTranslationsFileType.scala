package cc.sukazyo.hytrans_intellij.language

import cc.sukazyo.hytrans_intellij.Resources
import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.annotations.NotNull

import javax.swing.Icon

class HytTranslationsFileType private extends LanguageFileType (HytTranslationsLanguage.INSTANCE) {
	
	@NotNull override def getName: String = "HyTrans Translation File"
	@NotNull override def getDescription: String = "HyTrans translation file contains key-value pairs translation definition."
	@NotNull override def getDefaultExtension: String = "hytrans"
	@NotNull override def getIcon: Icon = Resources.ICON_HYTRANS_FILE
	
}

object HytTranslationsFileType {
	val INSTANCE = new HytTranslationsFileType
}

package cc.sukazyo.hytrans_intellij.language

import com.intellij.lang.Language

class HytTranslationsLanguage private extends Language ("hytrans")

object HytTranslationsLanguage {
	val INSTANCE = new HytTranslationsLanguage
}

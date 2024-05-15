package cc.sukazyo.hytrans_intellij.language

import com.intellij.lang.Language

class HytLanguageTreeLanguage private extends Language ("hylangs")

object HytLanguageTreeLanguage {
	val INSTANCE = new HytLanguageTreeLanguage
}

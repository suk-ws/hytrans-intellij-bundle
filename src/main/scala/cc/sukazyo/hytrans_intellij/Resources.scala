package cc.sukazyo.hytrans_intellij

import com.intellij.openapi.util.IconLoader

import javax.swing.Icon

object Resources extends Resources

trait Resources {
	
	val ICON_HYTRANS_FILE: Icon = IconLoader.getIcon("/icons/hytrans-file-icon.png", this.getClass)
	val ICON_HYLANGS_FILE: Icon = IconLoader.getIcon("/icons/hylangs-file-icon.png", this.getClass)
	
}

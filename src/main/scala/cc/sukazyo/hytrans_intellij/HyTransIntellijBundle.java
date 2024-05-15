package cc.sukazyo.hytrans_intellij;

import com.intellij.DynamicBundle;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;

public class HyTransIntellijBundle extends DynamicBundle {
	
	@NonNls
	private static final String BUNDLE = "messages.HyTransIntellijBundle";
	
	private static final HyTransIntellijBundle INSTANCE = new HyTransIntellijBundle();
	
	private HyTransIntellijBundle() {
		super(BUNDLE);
	}
	
	@Nls
	public static String message(@NotNull @PropertyKey(resourceBundle = BUNDLE) String key, @NotNull Object... params) {
		return INSTANCE.getMessage(key, params);
	}
	
}

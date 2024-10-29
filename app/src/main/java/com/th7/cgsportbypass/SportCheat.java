package com.th7.cgsportbypass;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

public class SportCheat {
    public static void hook_2_9_8(ClassLoader classLoader) throws Throwable {
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.彐叐凴瀱砰漆摯.嵋鵹躐使骩.憹釠輂鯺秋綍筴寸銧", classLoader, "櫼螉彬彆", int.class, int.class, double.class, String.class, int.class, long.class, long.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(1);
            }
        });
    }
}

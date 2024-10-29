package com.th7.cgsportbypass;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

public class SportCheat {
    public static void hook_2_9_8(ClassLoader classLoader) throws Throwable {
        //是否合格
        XposedHelpers.findAndHookMethod("net.crigh.cgsport.model.SportBean", classLoader, "getResult", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(1);
            }
        });
    }
}

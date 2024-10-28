package com.th7.cgsportbypass;

import android.content.Context;

import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;

public class CGSportsHook {
    public static void hook(ClassLoader classLoader) throws Throwable {
        //Xposed
        XposedHelpers.findAndHookMethod("縰丒鰬湓篚爀槽蟡塱溹斠.熏燵婨左崘畱噛淜.櫼螉彬彆.阙蔬", classLoader, "帋岫", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });

        //Frida
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.伎险射筡蚓", classLoader, "蔪繥棺虗沕灀誣梊誎礋", Context.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });

        //Fake Location
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.伎险射筡蚓", classLoader, "惬曨陶溶砇丼戯袛", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });

        //Virtual Environments
        XposedHelpers.findAndHookMethod("net.crigh.library.base.BaseActivity", classLoader, "isOpenMore", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });

        //Trace
        XposedHelpers.findAndHookMethod("縰丒鰬湓篚爀槽蟡塱溹斠.熏燵婨左崘畱噛淜.櫼螉彬彆.阙蔬", classLoader, "翪闆粍礄襸朶杗篃交", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });
    }
}

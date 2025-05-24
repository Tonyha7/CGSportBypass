package com.th7.cgsportbypass;

import android.content.Context;

import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.XC_MethodHook;

public class BypassDetectors {
    public static void hook_2_9_8(ClassLoader classLoader) throws Throwable {
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

    public static void hook_3_0_0(ClassLoader classLoader) throws Throwable {
        //Xposed
        XposedHelpers.findAndHookMethod("縰丒鰬湓篚爀槽蟡塱溹斠.熏燵婨左崘畱噛淜.櫼螉彬彆.阙蔬", classLoader, "崛蟧瓒茎侦痉夫洹", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });

        //Frida
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.伎险射筡蚓", classLoader, "嫹欼榱殸緁鎣鰡典", android.content.Context.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });

        //Fake Location
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.伎险射筡蚓", classLoader, "濚麄弫呂訦忾拃", new XC_MethodHook() {
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
        XposedHelpers.findAndHookMethod("縰丒鰬湓篚爀槽蟡塱溹斠.熏燵婨左崘畱噛淜.櫼螉彬彆.阙蔬", classLoader, "錸头钓", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });

    }
    public static void hook_3_0_1(ClassLoader classLoader) throws Throwable {
        //Xposed
        XposedHelpers.findAndHookMethod("縰丒鰬湓篚爀槽蟡塱溹斠.熏燵婨左崘畱噛淜.櫼螉彬彆.阙蔬", classLoader, "猱繮滤冕", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }

        });
        //enter check Fake Location
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.伎险射筡蚓", classLoader, "躽羦鶽挴毋惛", int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(true);
            }
        });

        //Fake Location
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.伎险射筡蚓", classLoader, "虂紆肯趝噐鱔湹", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });


    }
    public static void hook_3_0_2(ClassLoader classLoader) {
        //Xposed
        XposedHelpers.findAndHookMethod("縰丒鰬湓篚爀槽蟡塱溹斠.熏燵婨左崘畱噛淜.櫼螉彬彆.阙蔬", classLoader, "緻抭擔暓劕倰鋏矛", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });

        //Frida
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.伎险射筡蚓", classLoader, "躽羦鶽挴毋惛", int.class, new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                super.afterHookedMethod(param);
                int input = (int) param.args[0];
                if (input == 27042 || input == 27047){
                    param.setResult(true);
                }
            }
        });

        //Fake Location
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.伎险射筡蚓", classLoader, "敫髄耎", new XC_MethodHook() {
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
        XposedHelpers.findAndHookMethod("縰丒鰬湓篚爀槽蟡塱溹斠.熏燵婨左崘畱噛淜.櫼螉彬彆.阙蔬", classLoader, "踔珆曱声蓊磗畚獵攩帗筕弌", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });
    }
}

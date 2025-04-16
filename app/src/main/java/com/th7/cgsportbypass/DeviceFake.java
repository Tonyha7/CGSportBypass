package com.th7.cgsportbypass;

import java.util.Random;
import java.util.UUID;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

public class DeviceFake {
    static String android_id = genAndroidId();
    static String imei = genImei();

    public static void hook_2_9_8(ClassLoader classLoader) throws Throwable {
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.熏燵婨左崘畱噛淜", classLoader, "卋箐茺", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(android_id);
            }
        });
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.熏燵婨左崘畱噛淜", classLoader, "线渠恮櫤陷樆撤扠歼蝚僛旴", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(imei);
            }
        });
    }

    public static void hook_3_0_0(ClassLoader classLoader) throws Throwable {
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.熏燵婨左崘畱噛淜", classLoader, "墓侎擠嗙擱欖鎘徺", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(android_id);
            }
        });
    }

    public static void hook_3_0_2(ClassLoader classLoader) {
        XposedHelpers.findAndHookMethod("珂函筙.櫼螉彬彆.亏雄開邠煱嘂咔娡葘戭.阙蔬.熏燵婨左崘畱噛淜", classLoader, "嬫鳚埑鵵嬴瞥湦", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(android_id);
            }
        });
    }

    private static String genAndroidId() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 16);
    }

    private static String genImei() {
        StringBuilder imei = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            imei.append(random.nextInt(10));
        }

        for (int i = 0; i < 8; i++) {
            imei.append(random.nextInt(10));
        }

        int sum = 0;
        boolean isDouble = false;
        for (int i = imei.length() - 1; i >= 0; i--) {
            int digit = imei.charAt(i) - '0';
            if (isDouble) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
            isDouble = !isDouble;
        }

        int checkDigit = (10 - (sum % 10)) % 10;
        imei.append(checkDigit);

        return imei.toString();
    }
}

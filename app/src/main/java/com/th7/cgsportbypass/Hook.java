package com.th7.cgsportbypass;

import android.content.Context;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class Hook implements IXposedHookLoadPackage {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        if (loadPackageParam.packageName.equals("net.crigh.cgsport")) {
            dingXiangAttach(loadPackageParam);
        }
    }

    public static void dingXiangAttach(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        try {
            XposedHelpers.findAndHookMethod("com.security.shell.AppStub1", loadPackageParam.classLoader,
                    "_attachBaseContext", Context.class, new XC_MethodHook() {
                        @Override
                        protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                            super.afterHookedMethod(param);
                            Context context = (Context) param.args[0];
                            String version = AppInfo.getAppVersionCode(context);
                            ClassLoader classLoader = context.getClassLoader();
                            XposedBridge.log("CGSportsBypass: Got Application Version Code: " + version);
                            startHook(classLoader, version);
                        }
                    });
        } catch (XposedHelpers.ClassNotFoundError | NoSuchMethodError e) {
            try {
                XposedBridge.log("CGSportsBypass: AppStub1 not found, trying V5App instead");
                XposedHelpers.findAndHookMethod("com.security.shell.V5App", loadPackageParam.classLoader,
                        "_attachBaseContext", Context.class, new XC_MethodHook() {
                            @Override
                            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                                super.afterHookedMethod(param);
                                Context context = (Context) param.args[0];
                                String version = AppInfo.getAppVersionCode(context);
                                ClassLoader classLoader = context.getClassLoader();
                                XposedBridge.log("CGSportsBypass: Got Application Version Code: " + version);
                                startHook(classLoader, version);
                            }
                        });
            } catch (XposedHelpers.ClassNotFoundError | NoSuchMethodError e2) {
                XposedBridge.log("CGSportsBypass: Failed to hook both AppStub1 and V5App: " + e2.getMessage());
            }
        }
    }

    public static void startHook(ClassLoader classLoader, String version) throws Throwable {
        switch (version){
            case "2.9.8":
                BypassDetectors.hook_2_9_8(classLoader);
                DeviceFake.hook_2_9_8(classLoader);
                break;
            case "3.0.0":
                BypassDetectors.hook_3_0_0(classLoader);
                DeviceFake.hook_3_0_0(classLoader);
                break;
            case "3.0.1":
                BypassDetectors.hook_3_0_1(classLoader);
                DeviceFake.hook_3_0_1(classLoader);
                break;
            case "3.0.2":
                BypassDetectors.hook_3_0_2(classLoader);
                DeviceFake.hook_3_0_2(classLoader);
                break;
            default:
                XposedBridge.log("CGSportsBypass: Not Supporting Your Version Now... Just Give A Star to https://github.com/Tonyha7/CGSportBypass And Wait ;)");
                break;
        }
        //SharedPreferencesListener.hook(classLoader);
    }
}
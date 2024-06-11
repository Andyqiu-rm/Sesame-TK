package pansong291.xposed.quickenergy.util;

import android.content.Context;
import android.content.res.Configuration;

import java.util.Locale;


public class LanguageUtil {
    public static void setLocale(Context context) {
        if (Config.INSTANCE.isLanguageSimplifiedChinese()) {
            // 忽略系统语言，强制使用简体中文
            Locale locale = new Locale("zh", "CN"); // 简体中文的区域代码
            Locale.setDefault(locale);
            Configuration config = new Configuration();
            config.locale = locale;
            context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());
        }
    }
}

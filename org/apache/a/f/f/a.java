/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.f;

import java.util.regex.Pattern;

public class a {
    private static final String a = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";
    private static final Pattern b = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    private static final Pattern c = Pattern.compile("^::[fF]{4}:(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    private static final Pattern d = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
    private static final Pattern e = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");
    private static final char f = ':';
    private static final int g = 7;

    private a() {
    }

    public static boolean a(String string) {
        return b.matcher(string).matches();
    }

    public static boolean b(String string) {
        return c.matcher(string).matches();
    }

    public static boolean c(String string) {
        return d.matcher(string).matches();
    }

    public static boolean d(String string) {
        int n2 = 0;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (string.charAt(i2) != ':') continue;
            ++n2;
        }
        return n2 <= 7 && e.matcher(string).matches();
    }

    public static boolean e(String string) {
        return org.apache.a.f.f.a.c(string) || org.apache.a.f.f.a.d(string);
    }
}


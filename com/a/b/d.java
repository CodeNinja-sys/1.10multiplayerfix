/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.e;
import com.a.b.f;
import com.a.b.g;
import com.a.b.h;
import com.a.b.i;
import com.a.b.j;

public abstract class d
extends Enum
implements j {
    public static final /* enum */ d a = new e();
    public static final /* enum */ d b = new f();
    public static final /* enum */ d c = new g();
    public static final /* enum */ d d = new h();
    public static final /* enum */ d e = new i();
    private static final /* synthetic */ d[] f;

    public static d[] values() {
        return (d[])f.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var2_-1;
        void var1_-1;
    }

    private static String b(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (Character.isUpperCase(c2) && stringBuilder.length() != 0) {
                stringBuilder.append(string2);
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    private static String b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        char c2 = string.charAt(n2);
        while (n2 < string.length() - 1 && !Character.isLetter(c2)) {
            stringBuilder.append(c2);
            c2 = string.charAt(++n2);
        }
        if (n2 == string.length()) {
            return stringBuilder.toString();
        }
        if (!Character.isUpperCase(c2)) {
            String string2 = com.a.b.d.a(Character.toUpperCase(c2), string, ++n2);
            return stringBuilder.append(string2).toString();
        }
        return string;
    }

    private static String a(char c2, String string, int n2) {
        return n2 < string.length() ? c2 + string.substring(n2) : String.valueOf(c2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ d(e e2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static /* synthetic */ String a(String string) {
        return com.a.b.d.b(string);
    }

    static /* synthetic */ String a(String string, String string2) {
        return com.a.b.d.b(string, string2);
    }

    static {
        f = new d[]{a, b, c, d, e};
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ak;
import com.a.a.b.cl;
import com.a.a.b.e;
import com.a.a.b.g;
import com.a.a.b.h;
import com.a.a.b.i;
import com.a.a.b.j;
import com.a.a.b.k;
import com.a.a.b.l;
import com.a.a.b.m;

public abstract class f
extends Enum {
    public static final /* enum */ f a = new g(m.a('-'), "-");
    public static final /* enum */ f b = new h(m.a('_'), "_");
    public static final /* enum */ f c = new i(m.a('A', 'Z'), "");
    public static final /* enum */ f d = new j(m.a('A', 'Z'), "");
    public static final /* enum */ f e = new k(m.a('_'), "_");
    private final m f;
    private final String g;
    private static final /* synthetic */ f[] h;

    public static f[] values() {
        return (f[])h.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private f() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.f = var3_1;
        this.g = var4_2;
    }

    public final String a(f f2, String string) {
        cl.a((Object)f2);
        cl.a(string);
        return f2 == this ? string : this.b(f2, string);
    }

    String b(f f2, String string) {
        StringBuilder stringBuilder = null;
        int n2 = 0;
        int n3 = -1;
        while (true) {
            ++n3;
            if ((n3 = this.f.a((CharSequence)string, n3)) == -1) break;
            if (n2 == 0) {
                stringBuilder = new StringBuilder(string.length() + 4 * this.g.length());
                stringBuilder.append(f2.c(string.substring(n2, n3)));
            } else {
                stringBuilder.append(f2.a(string.substring(n2, n3)));
            }
            stringBuilder.append(f2.g);
            n2 = n3 + this.g.length();
        }
        return n2 == 0 ? f2.c(string) : stringBuilder.append(f2.a(string.substring(n2))).toString();
    }

    public ak a(f f2) {
        return new l(this, f2);
    }

    abstract String a(String var1);

    private String c(String string) {
        return this == c ? com.a.a.b.e.a(string) : this.a(string);
    }

    private static String d(String string) {
        return string.isEmpty() ? string : new StringBuilder(string.length()).append(com.a.a.b.e.b(string.charAt(0))).append(com.a.a.b.e.a(string.substring(1))).toString();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ f(m m2, String string, g g2) {
        this((String)var1_-1, (int)string, (m)((Object)g2), (String)var4_3);
        void var4_3;
        void var1_-1;
    }

    static /* synthetic */ String b(String string) {
        return com.a.a.b.f.d(string);
    }

    static {
        h = new f[]{a, b, c, d, e};
    }
}


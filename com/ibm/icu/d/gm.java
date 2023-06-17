/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.di;
import com.ibm.icu.d.gk;
import com.ibm.icu.d.go;
import java.io.InputStream;

public abstract class gm {
    public static gm a() {
        return di.a().b;
    }

    public static gm b() {
        return di.a().c;
    }

    public static gm c() {
        return di.b().b;
    }

    public static gm d() {
        return di.b().c;
    }

    public static gm e() {
        return di.c().b;
    }

    public static gm a(InputStream inputStream, String string, go go2) {
        di di2 = di.a(inputStream, string);
        switch (go2) {
            case a: {
                return di2.b;
            }
            case b: {
                return di2.c;
            }
            case c: {
                return di2.d;
            }
            case d: {
                return di2.e;
            }
        }
        return null;
    }

    public String d(CharSequence charSequence) {
        if (charSequence instanceof String) {
            int n2 = this.c(charSequence);
            if (n2 == charSequence.length()) {
                return (String)charSequence;
            }
            StringBuilder stringBuilder = new StringBuilder(charSequence.length()).append(charSequence, 0, n2);
            return this.a(stringBuilder, charSequence.subSequence(n2, charSequence.length())).toString();
        }
        return this.a(charSequence, new StringBuilder(charSequence.length())).toString();
    }

    public abstract StringBuilder a(CharSequence var1, StringBuilder var2);

    public abstract Appendable a(CharSequence var1, Appendable var2);

    public abstract StringBuilder a(StringBuilder var1, CharSequence var2);

    public abstract StringBuilder b(StringBuilder var1, CharSequence var2);

    public abstract String d_(int var1);

    public String e(int n2) {
        return null;
    }

    public int a(int n2, int n3) {
        return -1;
    }

    public int f(int n2) {
        return 0;
    }

    public abstract boolean a(CharSequence var1);

    public abstract gk b(CharSequence var1);

    public abstract int c(CharSequence var1);

    public abstract boolean b(int var1);

    public abstract boolean c(int var1);

    public abstract boolean d(int var1);

    protected gm() {
    }
}


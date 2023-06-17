/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cd;
import com.a.a.b.cf;
import com.a.a.b.cl;

public final class ce {
    private final String a;
    private cf b;
    private cf c;
    private boolean d;

    private ce(String string) {
        this.c = this.b = new cf(null);
        this.d = false;
        this.a = (String)cl.a(string);
    }

    public ce a() {
        this.d = true;
        return this;
    }

    public ce a(String string, Object object) {
        return this.b(string, object);
    }

    public ce a(String string, boolean bl2) {
        return this.b(string, String.valueOf(bl2));
    }

    public ce a(String string, char c2) {
        return this.b(string, String.valueOf(c2));
    }

    public ce a(String string, double d2) {
        return this.b(string, String.valueOf(d2));
    }

    public ce a(String string, float f2) {
        return this.b(string, String.valueOf(f2));
    }

    public ce a(String string, int n2) {
        return this.b(string, String.valueOf(n2));
    }

    public ce a(String string, long l2) {
        return this.b(string, String.valueOf(l2));
    }

    public ce a(Object object) {
        return this.b(object);
    }

    public ce a(boolean bl2) {
        return this.b(String.valueOf(bl2));
    }

    public ce a(char c2) {
        return this.b(String.valueOf(c2));
    }

    public ce a(double d2) {
        return this.b(String.valueOf(d2));
    }

    public ce a(float f2) {
        return this.b(String.valueOf(f2));
    }

    public ce a(int n2) {
        return this.b(String.valueOf(n2));
    }

    public ce a(long l2) {
        return this.b(String.valueOf(l2));
    }

    public String toString() {
        boolean bl2 = this.d;
        String string = "";
        StringBuilder stringBuilder = new StringBuilder(32).append(this.a).append('{');
        cf cf2 = this.b.c;
        while (cf2 != null) {
            if (!bl2 || cf2.b != null) {
                stringBuilder.append(string);
                string = ", ";
                if (cf2.a != null) {
                    stringBuilder.append(cf2.a).append('=');
                }
                stringBuilder.append(cf2.b);
            }
            cf2 = cf2.c;
        }
        return stringBuilder.append('}').toString();
    }

    private cf b() {
        cf cf2;
        this.c = this.c.c = (cf2 = new cf(null));
        return cf2;
    }

    private ce b(Object object) {
        cf cf2 = this.b();
        cf2.b = object;
        return this;
    }

    private ce b(String string, Object object) {
        cf cf2 = this.b();
        cf2.b = object;
        cf2.a = (String)cl.a(string);
        return this;
    }

    /* synthetic */ ce(String string, cd cd2) {
        this(string);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.util.af;

public class h {
    protected static final af a = af.a(h.class.getName() + ".UNFINISHED");
    protected static final af b = af.a(h.class.getName() + ".SUCCESS");
    public static final h c = new h(a);
    public static final h d = new h(b);
    private final Throwable e;

    public static h a(Throwable throwable) {
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        return new h(throwable);
    }

    protected h(Throwable throwable) {
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        this.e = throwable;
    }

    public boolean a() {
        return this.e != a;
    }

    public boolean b() {
        return this.e == b;
    }

    public boolean c() {
        return this.e != b && this.e != a;
    }

    public Throwable d() {
        if (this.c()) {
            return this.e;
        }
        return null;
    }

    public String toString() {
        if (this.a()) {
            if (this.b()) {
                return "success";
            }
            String string = this.d().toString();
            StringBuilder stringBuilder = new StringBuilder(string.length() + 17);
            stringBuilder.append("failure(");
            stringBuilder.append(string);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
        return "unfinished";
    }
}


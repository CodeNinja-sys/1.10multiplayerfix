/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

public class bj
implements Comparable {
    public static final bj a = new bj(0, "OK");
    public static final bj b = new bj(1, "PROTOCOL_ERROR");
    public static final bj c = new bj(2, "INTERNAL_ERROR");
    private final int d;
    private final String e;

    public static bj a(int n2) {
        switch (n2) {
            case 0: {
                return a;
            }
            case 1: {
                return b;
            }
            case 2: {
                return c;
            }
        }
        return new bj(n2, "UNKNOWN (" + n2 + ')');
    }

    public bj(int n2, String string) {
        if (string == null) {
            throw new NullPointerException("statusPhrase");
        }
        this.d = n2;
        this.e = string;
    }

    public int a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public int hashCode() {
        return this.a();
    }

    public boolean equals(Object object) {
        if (!(object instanceof bj)) {
            return false;
        }
        return this.a() == ((bj)object).a();
    }

    public String toString() {
        return this.b();
    }

    public int a(bj bj2) {
        return this.a() - bj2.a();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((bj)object);
    }
}


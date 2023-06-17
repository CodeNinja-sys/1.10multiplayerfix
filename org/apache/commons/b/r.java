/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.Serializable;
import org.apache.commons.b.p;

public final class r
implements Serializable {
    public static final r a = new r("Sensitive", true);
    public static final r b = new r("Insensitive", false);
    public static final r c = new r("System", !p.a());
    private static final long d = -6343169151696340687L;
    private final String e;
    private final transient boolean f;

    public static r a(String string) {
        if (r.a.e.equals(string)) {
            return a;
        }
        if (r.b.e.equals(string)) {
            return b;
        }
        if (r.c.e.equals(string)) {
            return c;
        }
        throw new IllegalArgumentException("Invalid IOCase name: " + string);
    }

    private r(String string, boolean bl2) {
        this.e = string;
        this.f = bl2;
    }

    private Object c() {
        return r.a(this.e);
    }

    public String a() {
        return this.e;
    }

    public boolean b() {
        return this.f;
    }

    public int a(String string, String string2) {
        if (string == null || string2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f ? string.compareTo(string2) : string.compareToIgnoreCase(string2);
    }

    public boolean b(String string, String string2) {
        if (string == null || string2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f ? string.equals(string2) : string.equalsIgnoreCase(string2);
    }

    public boolean c(String string, String string2) {
        return string.regionMatches(!this.f, 0, string2, 0, string2.length());
    }

    public boolean d(String string, String string2) {
        int n2 = string2.length();
        return string.regionMatches(!this.f, string.length() - n2, string2, 0, n2);
    }

    public int a(String string, int n2, String string2) {
        int n3 = string.length() - string2.length();
        if (n3 >= n2) {
            for (int i2 = n2; i2 <= n3; ++i2) {
                if (!this.b(string, i2, string2)) continue;
                return i2;
            }
        }
        return -1;
    }

    public boolean b(String string, int n2, String string2) {
        return string.regionMatches(!this.f, n2, string2, 0, string2.length());
    }

    public String toString() {
        return this.e;
    }
}


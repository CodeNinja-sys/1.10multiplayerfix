/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.g;

import java.util.Locale;
import org.apache.a.o.a;

public final class e {
    private final String a;
    private final int b;
    private final String c;
    private final boolean d;

    public e(String string, int n2, String string2, boolean bl2) {
        org.apache.a.o.a.b(string, "Host");
        org.apache.a.o.a.b(n2, "Port");
        org.apache.a.o.a.a((Object)string2, "Path");
        this.a = string.toLowerCase(Locale.ENGLISH);
        this.b = n2;
        this.c = string2.trim().length() != 0 ? string2 : "/";
        this.d = bl2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        if (this.d) {
            stringBuilder.append("(secure)");
        }
        stringBuilder.append(this.a);
        stringBuilder.append(':');
        stringBuilder.append(Integer.toString(this.b));
        stringBuilder.append(this.c);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}


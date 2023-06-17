/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.k;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.b.dw;
import java.io.Serializable;

public final class a
implements Serializable {
    private static final int a = -1;
    private final String b;
    private final int c;
    private final boolean d;
    private static final long e = 0L;

    private a(String string, int n2, boolean bl2) {
        this.b = string;
        this.c = n2;
        this.d = bl2;
    }

    public String a() {
        return this.b;
    }

    public boolean b() {
        return this.c >= 0;
    }

    public int c() {
        cl.b(this.b());
        return this.c;
    }

    public int a(int n2) {
        return this.b() ? this.c : n2;
    }

    public static a a(String string, int n2) {
        cl.a(com.a.a.k.a.c(n2), "Port out of range: %s", new Object[]{n2});
        a a2 = com.a.a.k.a.b(string);
        cl.a(!a2.b(), "Host has a port: %s", new Object[]{string});
        return new a(a2.b, n2, a2.d);
    }

    public static a a(String string) {
        a a2 = com.a.a.k.a.b(string);
        cl.a(!a2.b(), "Host has a port: %s", new Object[]{string});
        return a2;
    }

    public static a b(String string) {
        String string2;
        cl.a(string);
        String string3 = null;
        boolean bl2 = false;
        if (string.startsWith("[")) {
            String[] arrstring = com.a.a.k.a.c(string);
            string2 = arrstring[0];
            string3 = arrstring[1];
        } else {
            int n2 = string.indexOf(58);
            if (n2 >= 0 && string.indexOf(58, n2 + 1) == -1) {
                string2 = string.substring(0, n2);
                string3 = string.substring(n2 + 1);
            } else {
                string2 = string;
                bl2 = n2 >= 0;
            }
        }
        int n3 = -1;
        if (!dw.c(string3)) {
            cl.a(!string3.startsWith("+"), "Unparseable port number: %s", new Object[]{string});
            try {
                n3 = Integer.parseInt(string3);
            }
            catch (NumberFormatException numberFormatException) {
                throw new IllegalArgumentException("Unparseable port number: " + string);
            }
            cl.a(com.a.a.k.a.c(n3), "Port number out of range: %s", new Object[]{string});
        }
        return new a(string2, n3, bl2);
    }

    private static String[] c(String string) {
        int n2 = 0;
        int n3 = 0;
        boolean bl2 = false;
        cl.a(string.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", new Object[]{string});
        n2 = string.indexOf(58);
        n3 = string.lastIndexOf(93);
        cl.a(n2 > -1 && n3 > n2, "Invalid bracketed host/port: %s", new Object[]{string});
        String string2 = string.substring(1, n3);
        if (n3 + 1 == string.length()) {
            return new String[]{string2, ""};
        }
        cl.a(string.charAt(n3 + 1) == ':', "Only a colon may follow a close bracket: %s", new Object[]{string});
        for (int i2 = n3 + 2; i2 < string.length(); ++i2) {
            cl.a(Character.isDigit(string.charAt(i2)), "Port must be numeric: %s", new Object[]{string});
        }
        return new String[]{string2, string.substring(n3 + 2)};
    }

    public a b(int n2) {
        cl.a(com.a.a.k.a.c(n2));
        if (this.b() || this.c == n2) {
            return this;
        }
        return new a(this.b, n2, this.d);
    }

    public a d() {
        cl.a(!this.d, "Possible bracketless IPv6 literal: %s", new Object[]{this.b});
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof a) {
            a a2 = (a)object;
            return cc.a((Object)this.b, (Object)a2.b) && this.c == a2.c && this.d == a2.d;
        }
        return false;
    }

    public int hashCode() {
        return cc.a(this.b, this.c, this.d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.b.length() + 8);
        if (this.b.indexOf(58) >= 0) {
            stringBuilder.append('[').append(this.b).append(']');
        } else {
            stringBuilder.append(this.b);
        }
        if (this.b()) {
            stringBuilder.append(':').append(this.c);
        }
        return stringBuilder.toString();
    }

    private static boolean c(int n2) {
        return n2 >= 0 && n2 <= 65535;
    }
}


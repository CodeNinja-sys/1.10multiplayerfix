/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.e;

import com.a.a.b.cl;
import com.a.a.e.b;
import com.a.a.e.d;
import java.util.Map;

public abstract class a
extends d {
    private final char[][] a;
    private final int b;
    private final char c;
    private final char d;

    protected a(Map map, char c2, char c3) {
        this(com.a.a.e.b.a(map), c2, c3);
    }

    protected a(b b2, char c2, char c3) {
        cl.a(b2);
        this.a = b2.a();
        this.b = this.a.length;
        if (c3 < c2) {
            c3 = '\u0000';
            c2 = (char)65535;
        }
        this.c = c2;
        this.d = c3;
    }

    @Override
    public final String a(String string) {
        cl.a(string);
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if ((c2 >= this.b || this.a[c2] == null) && c2 <= this.d && c2 >= this.c) continue;
            return this.a(string, i2);
        }
        return string;
    }

    @Override
    protected final char[] a(char c2) {
        char[] arrc;
        if (c2 < this.b && (arrc = this.a[c2]) != null) {
            return arrc;
        }
        if (c2 >= this.c && c2 <= this.d) {
            return null;
        }
        return this.b(c2);
    }

    protected abstract char[] b(char var1);
}


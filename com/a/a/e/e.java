/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.e;

import com.a.a.b.cl;
import com.a.a.e.f;
import com.a.a.e.g;
import java.util.HashMap;
import java.util.Map;

public final class e {
    private final Map a = new HashMap();
    private int b = -1;

    public e a(char c2, String string) {
        this.a.put(Character.valueOf(c2), cl.a(string));
        if (c2 > this.b) {
            this.b = c2;
        }
        return this;
    }

    public e a(char[] arrc, String string) {
        cl.a(string);
        for (char c2 : arrc) {
            this.a(c2, string);
        }
        return this;
    }

    public char[][] a() {
        char[][] arrarrc = new char[this.b + 1][];
        for (Map.Entry entry : this.a.entrySet()) {
            arrarrc[((Character)entry.getKey()).charValue()] = ((String)entry.getValue()).toCharArray();
        }
        return arrarrc;
    }

    public g b() {
        return new f(this.a());
    }
}


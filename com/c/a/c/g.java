/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.c;

import com.c.a.c.h;
import java.util.Map;
import org.apache.commons.b.p;
import org.apache.commons.c.a.ae;

public class g {
    public static final int a = h.values().length;
    private final String b;
    private final Map c;

    public g(String string, Map map) {
        this.b = string;
        this.c = map;
    }

    public String a() {
        return this.b;
    }

    public String a(String string) {
        if (this.c == null) {
            return null;
        }
        return (String)this.c.get(string);
    }

    public String b() {
        return p.o(this.b);
    }

    public String toString() {
        return new ae(this).a("url", this.b).a("hash", this.b()).toString();
    }
}


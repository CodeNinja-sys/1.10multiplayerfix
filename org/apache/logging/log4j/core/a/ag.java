/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.util.HashMap;
import org.apache.logging.log4j.core.a.c.c;
import org.apache.logging.log4j.core.a.c.k;
import org.apache.logging.log4j.core.a.c.s;
import org.apache.logging.log4j.core.a.c.v;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.g.g;
import org.apache.logging.log4j.core.h;

public final class ag
extends org.apache.logging.log4j.core.a.c {
    private final String b;
    private final String c;
    private Object d;
    private final org.apache.logging.log4j.core.net.d e;

    private ag(String string, f f2, d d2, org.apache.logging.log4j.core.a.c.f f3, String string2, String string3, boolean bl2, boolean bl3, org.apache.logging.log4j.core.net.d d3) {
        super(string, f2, d2, bl2, bl3, f3);
        if (d3 != null) {
            HashMap<String, String> hashMap = new HashMap<String, String>(f2.d());
            hashMap.put("contentType", f2.c());
            hashMap.put("name", string);
            this.d = d3.a(hashMap);
        }
        this.b = string2;
        this.c = string3;
        this.e = d3;
    }

    @Override
    public void f() {
        super.f();
        if (this.e != null) {
            this.e.a(this.d);
        }
    }

    @Override
    public void a(h h2) {
        k k2 = (k)this.h();
        k2.a(h2);
        k2.a(h2.m());
        super.a(h2);
    }

    public String i() {
        return this.b;
    }

    public String j() {
        return this.c;
    }

    public static ag a(String string, String string2, String string3, String string4, String string5, v v2, s s2, f f2, d d2, String string6, String string7, String string8, org.apache.logging.log4j.core.config.d d3) {
        k k2;
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string3, true);
        boolean bl3 = org.apache.logging.log4j.core.d.b.a(string6, true);
        boolean bl4 = org.apache.logging.log4j.core.d.b.a(string5, true);
        boolean bl5 = Boolean.parseBoolean(string7);
        if (string4 == null) {
            h.b("No name provided for FileAppender");
            return null;
        }
        if (string == null) {
            h.b("No filename was provided for FileAppender with name " + string4);
            return null;
        }
        if (string2 == null) {
            h.b("No filename pattern provided for FileAppender with name " + string4);
            return null;
        }
        if (v2 == null) {
            h.b("A TriggeringPolicy must be provided");
            return null;
        }
        if (s2 == null) {
            s2 = org.apache.logging.log4j.core.a.c.c.a(null, null, null, String.valueOf(-1), d3);
        }
        if (f2 == null) {
            f2 = g.a(null, null, null, null, null);
        }
        if ((k2 = k.b(string, string2, bl2, bl4, v2, s2, string8, f2)) == null) {
            return null;
        }
        return new ag(string4, f2, d2, k2, string, string2, bl3, bl4, bl5 ? d3.n() : null);
    }
}


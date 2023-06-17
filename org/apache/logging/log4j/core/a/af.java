/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.util.HashMap;
import org.apache.logging.log4j.core.a.c.c;
import org.apache.logging.log4j.core.a.c.s;
import org.apache.logging.log4j.core.a.c.v;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.g.g;
import org.apache.logging.log4j.core.h;

public final class af
extends org.apache.logging.log4j.core.a.c {
    private final String b;
    private final String c;
    private Object d;
    private final org.apache.logging.log4j.core.net.d e;

    private af(String string, f f2, d d2, org.apache.logging.log4j.core.a.c.f f3, String string2, String string3, boolean bl2, boolean bl3, org.apache.logging.log4j.core.net.d d3) {
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
        ((org.apache.logging.log4j.core.a.c.f)this.h()).a(h2);
        super.a(h2);
    }

    public String i() {
        return this.b;
    }

    public String j() {
        return this.c;
    }

    public static af a(String string, String string2, String string3, String string4, String string5, String string6, v v2, s s2, f f2, d d2, String string7, String string8, String string9, org.apache.logging.log4j.core.config.d d3) {
        org.apache.logging.log4j.core.a.c.f f3;
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string3, true);
        boolean bl3 = org.apache.logging.log4j.core.d.b.a(string7, true);
        boolean bl4 = org.apache.logging.log4j.core.d.b.a(string5, true);
        boolean bl5 = org.apache.logging.log4j.core.d.b.a(string6, true);
        boolean bl6 = Boolean.parseBoolean(string8);
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
        if ((f3 = org.apache.logging.log4j.core.a.c.f.a(string, string2, bl2, bl4, v2, s2, string9, f2)) == null) {
            return null;
        }
        return new af(string4, f2, d2, f3, string, string2, bl3, bl5, bl6 ? d3.n() : null);
    }
}


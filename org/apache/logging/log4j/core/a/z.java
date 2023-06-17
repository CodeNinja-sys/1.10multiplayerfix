/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.util.HashMap;
import org.apache.logging.log4j.core.a.aa;
import org.apache.logging.log4j.core.a.c;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.g.g;
import org.apache.logging.log4j.core.h;

public final class z
extends c {
    private final String b;
    private Object c;
    private final org.apache.logging.log4j.core.net.d d;

    private z(String string, f f2, d d2, aa aa2, String string2, boolean bl2, boolean bl3, org.apache.logging.log4j.core.net.d d3) {
        super(string, f2, d2, bl2, bl3, aa2);
        if (d3 != null) {
            HashMap<String, String> hashMap = new HashMap<String, String>(f2.d());
            hashMap.putAll(aa2.e());
            hashMap.put("contentType", f2.c());
            hashMap.put("name", string);
            this.c = d3.a(hashMap);
        }
        this.b = string2;
        this.d = d3;
    }

    @Override
    public void f() {
        super.f();
        if (this.d != null) {
            this.d.a(this.c);
        }
    }

    @Override
    public void a(h h2) {
        ((aa)this.h()).a(h2.m());
        super.a(h2);
    }

    public String i() {
        return this.b;
    }

    public static z a(String string, String string2, String string3, String string4, String string5, f f2, d d2, String string6, String string7, org.apache.logging.log4j.core.config.d d3) {
        aa aa2;
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string2, true);
        boolean bl3 = org.apache.logging.log4j.core.d.b.a(string4, true);
        boolean bl4 = org.apache.logging.log4j.core.d.b.a(string5, true);
        boolean bl5 = Boolean.parseBoolean(string6);
        if (string3 == null) {
            h.b("No name provided for FileAppender");
            return null;
        }
        if (string == null) {
            h.b("No filename provided for FileAppender with name " + string3);
            return null;
        }
        if (f2 == null) {
            f2 = g.a(null, null, null, null, null);
        }
        if ((aa2 = aa.a(string, bl2, bl3, string7, f2)) == null) {
            return null;
        }
        return new z(string3, f2, d2, aa2, string, bl4, bl3, bl5 ? d3.n() : null);
    }
}


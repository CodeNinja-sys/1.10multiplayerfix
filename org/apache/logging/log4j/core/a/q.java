/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.util.HashMap;
import org.apache.logging.log4j.core.a.c;
import org.apache.logging.log4j.core.a.r;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.g.g;

public final class q
extends c {
    private final String b;
    private final org.apache.logging.log4j.core.net.d c;
    private Object d;

    private q(String string, f f2, d d2, r r2, String string2, boolean bl2, boolean bl3, org.apache.logging.log4j.core.net.d d3) {
        super(string, f2, d2, bl2, bl3, r2);
        if (d3 != null) {
            HashMap<String, String> hashMap = new HashMap<String, String>(f2.d());
            hashMap.putAll(r2.e());
            hashMap.put("contentType", f2.c());
            hashMap.put("name", string);
            this.d = d3.a(hashMap);
        }
        this.b = string2;
        this.c = d3;
    }

    @Override
    public void f() {
        super.f();
        if (this.c != null) {
            this.c.a(this.d);
        }
    }

    public String i() {
        return this.b;
    }

    public static q a(String string, String string2, String string3, String string4, String string5, String string6, String string7, f f2, d d2, String string8, String string9, org.apache.logging.log4j.core.config.d d3) {
        r r2;
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string2, true);
        boolean bl3 = Boolean.parseBoolean(string3);
        boolean bl4 = org.apache.logging.log4j.core.d.b.a(string7, true);
        boolean bl5 = Boolean.parseBoolean(string8);
        if (bl3 && bl4) {
            if (string7 != null) {
                h.f("Locking and buffering are mutually exclusive. No buffering will occur for " + string);
            }
            bl4 = false;
        }
        boolean bl6 = org.apache.logging.log4j.core.d.b.a(string5, true);
        boolean bl7 = org.apache.logging.log4j.core.d.b.a(string6, true);
        if (string4 == null) {
            h.b("No name provided for FileAppender");
            return null;
        }
        if (string == null) {
            h.b("No filename provided for FileAppender with name " + string4);
            return null;
        }
        if (f2 == null) {
            f2 = g.a(null, null, null, null, null);
        }
        if ((r2 = r.a(string, bl2, bl3, bl4, string9, f2)) == null) {
            return null;
        }
        return new q(string4, f2, d2, r2, string, bl7, bl6, bl5 ? d3.n() : null);
    }
}


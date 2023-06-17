/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.util.HashMap;
import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.a.c;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.g.p;
import org.apache.logging.log4j.core.net.ah;
import org.apache.logging.log4j.core.net.x;

public class ai
extends c {
    private Object b;
    private final org.apache.logging.log4j.core.net.d c;

    protected ai(String string, f f2, d d2, org.apache.logging.log4j.core.net.c c2, boolean bl2, boolean bl3, org.apache.logging.log4j.core.net.d d3) {
        super(string, f2, d2, bl2, bl3, c2);
        if (d3 != null) {
            HashMap<String, String> hashMap = new HashMap<String, String>(f2.d());
            hashMap.putAll(c2.e());
            hashMap.put("contentType", f2.c());
            hashMap.put("name", string);
            this.b = d3.a(hashMap);
        }
        this.c = d3;
    }

    @Override
    public void f() {
        super.f();
        if (this.c != null) {
            this.c.a(this.b);
        }
    }

    public static ai a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, f f2, d d2, String string9, org.apache.logging.log4j.core.config.d d3) {
        org.apache.logging.log4j.core.net.c c2;
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string7, true);
        boolean bl3 = Boolean.parseBoolean(string9);
        boolean bl4 = org.apache.logging.log4j.core.d.b.a(string8, true);
        boolean bl5 = org.apache.logging.log4j.core.d.b.a(string5, true);
        int n2 = org.apache.logging.log4j.core.a.a.a(string4, 0);
        int n3 = org.apache.logging.log4j.core.a.a.a(string2, 0);
        if (f2 == null) {
            f2 = p.e();
        }
        if (string6 == null) {
            h.b("No name provided for SocketAppender");
            return null;
        }
        x x2 = (x)org.apache.logging.log4j.e.a.a(x.class, string3 != null ? string3 : x.a.name());
        if (x2.equals((Object)x.b)) {
            bl2 = true;
        }
        if ((c2 = ai.a(x2, string, n3, n2, bl5, f2)) == null) {
            return null;
        }
        return new ai(string6, f2, d2, c2, bl4, bl2, bl3 ? d3.n() : null);
    }

    protected static org.apache.logging.log4j.core.net.c a(x x2, String string, int n2, int n3, boolean bl2, f f2) {
        switch (x2) {
            case a: {
                return ah.a(string, n2, n3, bl2, f2);
            }
            case b: {
                return org.apache.logging.log4j.core.net.f.a(string, n2, f2);
            }
        }
        return null;
    }
}


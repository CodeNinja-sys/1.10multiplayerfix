/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.b;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.a.b.f;
import org.apache.logging.log4j.core.b;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.h;

public final class e
extends a {
    private final org.apache.logging.log4j.core.config.d a;
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final f c;
    private final org.apache.logging.log4j.core.config.b[] d;

    private e(String string, d d2, boolean bl2, org.apache.logging.log4j.core.config.b[] arrb, f f2, org.apache.logging.log4j.core.config.d d3) {
        super(string, d2, null, bl2);
        this.a = d3;
        this.c = f2;
        this.d = arrb;
    }

    @Override
    public void e() {
        Map map = this.a.k();
        for (org.apache.logging.log4j.core.config.b b2 : this.d) {
            String string = b2.a();
            b b3 = (b)map.get(string);
            if (b3 != null) {
                d d2 = b3 instanceof a ? ((a)b3).aY_() : null;
                this.b.put(string, new org.apache.logging.log4j.core.config.a(b3, b2.b(), d2));
                continue;
            }
            h.b("Appender " + b2 + " cannot be located. Reference ignored");
        }
        super.e();
    }

    @Override
    public void f() {
        super.f();
    }

    @Override
    public void a(h h2) {
        if (this.c != null) {
            h2 = this.c.a(h2);
        }
        for (org.apache.logging.log4j.core.config.a a2 : this.b.values()) {
            a2.a(h2);
        }
    }

    public static e a(String string, String string2, org.apache.logging.log4j.core.config.b[] arrb, org.apache.logging.log4j.core.config.d d2, f f2, d d3) {
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string2, true);
        if (string == null) {
            h.b("No name provided for RewriteAppender");
            return null;
        }
        if (arrb == null) {
            h.b("No appender references defined for RewriteAppender");
            return null;
        }
        return new e(string, d3, bl2, arrb, f2, d2);
    }
}


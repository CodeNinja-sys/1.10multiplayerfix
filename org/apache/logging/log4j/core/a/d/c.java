/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.d;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.a.b.f;
import org.apache.logging.log4j.core.a.d.b;
import org.apache.logging.log4j.core.config.y;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.h;

public final class c
extends a {
    private static final String a = "ROUTING_APPENDER_DEFAULT";
    private final b b;
    private final org.apache.logging.log4j.core.a.d.a c;
    private final org.apache.logging.log4j.core.config.d d;
    private final ConcurrentMap e = new ConcurrentHashMap();
    private final f f;

    private c(String string, d d2, boolean bl2, b b2, f f2, org.apache.logging.log4j.core.config.d d3) {
        super(string, d2, null, bl2);
        this.b = b2;
        this.d = d3;
        this.f = f2;
        org.apache.logging.log4j.core.a.d.a a2 = null;
        for (org.apache.logging.log4j.core.a.d.a a3 : b2.b()) {
            if (a3.c() != null) continue;
            if (a2 == null) {
                a2 = a3;
                continue;
            }
            this.b("Multiple default routes. Route " + a3.toString() + " will be ignored");
        }
        this.c = a2;
    }

    @Override
    public void e() {
        Map map = this.d.k();
        for (org.apache.logging.log4j.core.a.d.a a2 : this.b.b()) {
            if (a2.b() == null) continue;
            org.apache.logging.log4j.core.b b2 = (org.apache.logging.log4j.core.b)map.get(a2.b());
            if (b2 != null) {
                String string = a2 == this.c ? a : a2.c();
                this.e.put(string, new org.apache.logging.log4j.core.config.a(b2, null, null));
                continue;
            }
            h.b("Appender " + a2.b() + " cannot be located. Route ignored");
        }
        super.e();
    }

    @Override
    public void f() {
        super.f();
        Map map = this.d.k();
        for (Map.Entry entry : this.e.entrySet()) {
            String string = ((org.apache.logging.log4j.core.config.a)entry.getValue()).c().a();
            if (map.containsKey(string)) continue;
            ((org.apache.logging.log4j.core.config.a)entry.getValue()).c().f();
        }
    }

    @Override
    public void a(h h2) {
        String string;
        org.apache.logging.log4j.core.config.a a2;
        if (this.f != null) {
            h2 = this.f.a(h2);
        }
        if ((a2 = this.a(string = this.d.l().a(h2, this.b.a()), h2)) != null) {
            a2.a(h2);
        }
    }

    private synchronized org.apache.logging.log4j.core.config.a a(String string, h h2) {
        org.apache.logging.log4j.core.config.a a2 = (org.apache.logging.log4j.core.config.a)this.e.get(string);
        if (a2 != null) {
            return a2;
        }
        org.apache.logging.log4j.core.a.d.a a3 = null;
        for (org.apache.logging.log4j.core.a.d.a a4 : this.b.b()) {
            if (a4.b() != null || !string.equals(a4.c())) continue;
            a3 = a4;
            break;
        }
        if (a3 == null) {
            a3 = this.c;
            a2 = (org.apache.logging.log4j.core.config.a)this.e.get(a);
            if (a2 != null) {
                return a2;
            }
        }
        if (a3 != null) {
            org.apache.logging.log4j.core.b b2 = this.a(a3, h2);
            if (b2 == null) {
                return null;
            }
            a2 = new org.apache.logging.log4j.core.config.a(b2, null, null);
            this.e.put(string, a2);
        }
        return a2;
    }

    private org.apache.logging.log4j.core.b a(org.apache.logging.log4j.core.a.d.a a2, h h2) {
        y y2 = a2.a();
        for (y y3 : y2.b()) {
            if (!y3.i().b().equals("appender")) continue;
            y y4 = new y(y3);
            this.d.a(y4, h2);
            if (y4.h() instanceof org.apache.logging.log4j.core.b) {
                org.apache.logging.log4j.core.b b2 = (org.apache.logging.log4j.core.b)y4.h();
                b2.e();
                return b2;
            }
            h.b("Unable to create Appender of type " + y3.f());
            return null;
        }
        h.b("No Appender was configured for route " + a2.c());
        return null;
    }

    public static c a(String string, String string2, b b2, org.apache.logging.log4j.core.config.d d2, f f2, d d3) {
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string2, true);
        if (string == null) {
            h.b("No name provided for RoutingAppender");
            return null;
        }
        if (b2 == null) {
            h.b("No routes defined for RoutingAppender");
            return null;
        }
        return new c(string, d3, bl2, b2, f2, d2);
    }
}


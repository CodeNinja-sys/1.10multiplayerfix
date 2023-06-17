/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import java.util.List;
import org.apache.a.b.f;
import org.apache.a.b.j;
import org.apache.a.c.a;
import org.apache.a.c.h;
import org.apache.a.c.i;
import org.apache.a.f.b.b;
import org.apache.a.f.b.e;
import org.apache.a.n.g;

public class c
extends org.apache.a.n.h {
    public static final String a = "http.route";
    public static final String b = "http.protocol.redirect-locations";
    public static final String c = "http.cookiespec-registry";
    public static final String d = "http.cookie-spec";
    public static final String e = "http.cookie-origin";
    public static final String f = "http.cookie-store";
    public static final String g = "http.auth.credentials-provider";
    public static final String h = "http.auth.auth-cache";
    public static final String i = "http.auth.target-scope";
    public static final String j = "http.auth.proxy-scope";
    public static final String k = "http.user-token";
    public static final String l = "http.authscheme-registry";
    public static final String m = "http.request-config";

    public static c a(g g2) {
        if (g2 instanceof c) {
            return (c)g2;
        }
        return new c(g2);
    }

    public static c a() {
        return new c(new org.apache.a.n.a());
    }

    public c(g g2) {
        super(g2);
    }

    public c() {
    }

    public e b() {
        return (e)this.a(a, b.class);
    }

    public List c() {
        return (List)this.a(b, List.class);
    }

    public h d() {
        return (h)this.a(f, h.class);
    }

    public void a(h h2) {
        this.a(f, h2);
    }

    public org.apache.a.g.h e() {
        return (org.apache.a.g.h)this.a(d, org.apache.a.g.h.class);
    }

    public org.apache.a.g.e f() {
        return (org.apache.a.g.e)this.a(e, org.apache.a.g.e.class);
    }

    private org.apache.a.e.c b(String string, Class class_) {
        return (org.apache.a.e.c)this.a(string, org.apache.a.e.c.class);
    }

    public org.apache.a.e.c g() {
        return this.b(c, org.apache.a.g.j.class);
    }

    public void a(org.apache.a.e.c c2) {
        this.a(c, c2);
    }

    public org.apache.a.e.c h() {
        return this.b(l, f.class);
    }

    public void b(org.apache.a.e.c c2) {
        this.a(l, c2);
    }

    public i i() {
        return (i)this.a(g, i.class);
    }

    public void a(i i2) {
        this.a(g, i2);
    }

    public a j() {
        return (a)this.a(h, a.class);
    }

    public void a(a a2) {
        this.a(h, a2);
    }

    public j k() {
        return (j)this.a(i, j.class);
    }

    public j l() {
        return (j)this.a(j, j.class);
    }

    public Object a(Class class_) {
        return this.a(k, class_);
    }

    public Object m() {
        return this.a(k);
    }

    public void a(Object object) {
        this.a(k, object);
    }

    public org.apache.a.c.a.c n() {
        org.apache.a.c.a.c c2 = (org.apache.a.c.a.c)this.a(m, org.apache.a.c.a.c.class);
        return c2 != null ? c2 : org.apache.a.c.a.c.a;
    }

    public void a(org.apache.a.c.a.c c2) {
        this.a(m, c2);
    }
}


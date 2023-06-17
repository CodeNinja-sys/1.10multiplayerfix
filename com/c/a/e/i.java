/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.e;

import com.c.a.a;
import com.c.a.b;
import com.c.a.e;
import com.c.a.e.a.d;
import com.c.a.e.c;
import com.c.a.g;
import com.c.a.h;
import com.c.a.k;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import org.apache.commons.c.am;

public class i
extends h {
    private static final org.apache.logging.log4j.d g = org.apache.logging.log4j.c.c();
    private static final String h = "https://authserver.mojang.com/";
    private static final URL i = com.c.a.g.a("https://authserver.mojang.com/authenticate");
    private static final URL j = com.c.a.g.a("https://authserver.mojang.com/refresh");
    private static final URL k = com.c.a.g.a("https://authserver.mojang.com/validate");
    private static final URL l = com.c.a.g.a("https://authserver.mojang.com/invalidate");
    private static final URL m = com.c.a.g.a("https://authserver.mojang.com/signout");
    private static final String n = "accessToken";
    private final a o;
    private e[] p;
    private String q;
    private boolean r;

    public i(c c2, a a2) {
        super(c2);
        this.o = a2;
    }

    @Override
    public boolean a() {
        return !this.o() && am.d((CharSequence)this.d()) && (am.d((CharSequence)this.e()) || am.d((CharSequence)this.q()));
    }

    @Override
    public void n() {
        if (am.c((CharSequence)this.d())) {
            throw new com.c.a.a.c("Invalid username");
        }
        if (am.d((CharSequence)this.q())) {
            this.s();
        } else if (am.d((CharSequence)this.e())) {
            this.r();
        } else {
            throw new com.c.a.a.c("Invalid password");
        }
    }

    protected void r() {
        if (am.c((CharSequence)this.d())) {
            throw new com.c.a.a.c("Invalid username");
        }
        if (am.c((CharSequence)this.e())) {
            throw new com.c.a.a.c("Invalid password");
        }
        g.d("Logging in with username & password");
        com.c.a.e.a.a a2 = new com.c.a.e.a.a(this, this.d(), this.e());
        com.c.a.e.b.a a3 = (com.c.a.e.b.a)this.w().a(i, a2, com.c.a.e.b.a.class);
        if (!a3.b().equals(this.w().d())) {
            throw new com.c.a.a.a("Server requested we change our client token. Don't know how to handle this!");
        }
        if (a3.d() != null) {
            this.a(a3.d().e() ? com.c.a.k.a : com.c.a.k.b);
        } else if (org.apache.commons.c.c.g(a3.c())) {
            this.a(a3.c()[0].e() ? com.c.a.k.a : com.c.a.k.b);
        }
        com.c.a.e.b.i i2 = a3.e();
        if (i2 != null && i2.a() != null) {
            this.c(i2.a());
        } else {
            this.c(this.d());
        }
        this.r = true;
        this.q = a3.a();
        this.p = a3.c();
        this.a(a3.d());
        this.k().h();
        this.a(i2);
    }

    protected void a(com.c.a.e.b.i i2) {
        if (i2 == null) {
            return;
        }
        if (i2.b() != null) {
            this.k().a(i2.b());
        }
    }

    protected void s() {
        if (am.c((CharSequence)this.i())) {
            if (am.c((CharSequence)this.d())) {
                this.c(this.d());
            } else {
                throw new com.c.a.a.c("Invalid uuid & username");
            }
        }
        if (am.c((CharSequence)this.q())) {
            throw new com.c.a.a.c("Invalid access token");
        }
        g.d("Logging in with access token");
        if (this.t()) {
            g.a("Skipping refresh call as we're safely logged in.");
            this.r = true;
            return;
        }
        d d2 = new d(this);
        com.c.a.e.b.g g2 = (com.c.a.e.b.g)this.w().a(j, d2, com.c.a.e.b.g.class);
        if (!g2.b().equals(this.w().d())) {
            throw new com.c.a.a.a("Server requested we change our client token. Don't know how to handle this!");
        }
        if (g2.d() != null) {
            this.a(g2.d().e() ? com.c.a.k.a : com.c.a.k.b);
        } else if (org.apache.commons.c.c.g(g2.c())) {
            this.a(g2.c()[0].e() ? com.c.a.k.a : com.c.a.k.b);
        }
        if (g2.e() != null && g2.e().a() != null) {
            this.c(g2.e().a());
        } else {
            this.c(this.d());
        }
        this.r = true;
        this.q = g2.a();
        this.p = g2.c();
        this.a(g2.d());
        this.k().h();
        this.a(g2.e());
    }

    protected boolean t() {
        com.c.a.e.a.e e2 = new com.c.a.e.a.e(this);
        try {
            this.w().a(k, e2, com.c.a.e.b.h.class);
            return true;
        }
        catch (com.c.a.a.a a2) {
            return false;
        }
    }

    @Override
    public void b() {
        super.b();
        this.q = null;
        this.p = null;
        this.r = false;
    }

    @Override
    public e[] p() {
        return this.p;
    }

    @Override
    public boolean c() {
        return am.d((CharSequence)this.q);
    }

    @Override
    public boolean o() {
        return this.c() && this.g() != null && this.r;
    }

    @Override
    public void b(e e2) {
        if (!this.c()) {
            throw new com.c.a.a.a("Cannot change game profile whilst not logged in");
        }
        if (this.g() != null) {
            throw new com.c.a.a.a("Cannot change game profile. You must log out and back in.");
        }
        if (e2 == null || !org.apache.commons.c.c.c((Object[])this.p, (Object)e2)) {
            throw new IllegalArgumentException("Invalid profile '" + e2 + "'");
        }
        d d2 = new d(this, e2);
        com.c.a.e.b.g g2 = (com.c.a.e.b.g)this.w().a(j, d2, com.c.a.e.b.g.class);
        if (!g2.b().equals(this.w().d())) {
            throw new com.c.a.a.a("Server requested we change our client token. Don't know how to handle this!");
        }
        this.r = true;
        this.q = g2.a();
        this.a(g2.d());
    }

    @Override
    public void a(Map map) {
        super.a(map);
        this.q = String.valueOf(map.get(n));
    }

    @Override
    public Map f() {
        Map map = super.f();
        if (am.d((CharSequence)this.q())) {
            map.put(n, this.q());
        }
        return map;
    }

    public String u() {
        if (this.c() && this.g() != null && this.o()) {
            return String.format("token:%s:%s", this.q(), this.g().a());
        }
        return null;
    }

    @Override
    public String q() {
        return this.q;
    }

    public a v() {
        return this.o;
    }

    @Override
    public String toString() {
        return "YggdrasilAuthenticationService{agent=" + this.o + ", profiles=" + Arrays.toString(this.p) + ", selectedProfile=" + this.g() + ", username='" + this.d() + '\'' + ", isLoggedIn=" + this.c() + ", userType=" + (Object)((Object)this.l()) + ", canPlayOnline=" + this.o() + ", accessToken='" + this.q + '\'' + ", clientToken='" + this.w().d() + '\'' + '}';
    }

    public c w() {
        return (c)super.m();
    }

    @Override
    public /* synthetic */ g m() {
        return this.w();
    }

    @Override
    public /* synthetic */ b h() {
        return this.w();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.net.Socket;
import org.apache.a.ac;
import org.apache.a.b;
import org.apache.a.e.a;
import org.apache.a.f.b.f;
import org.apache.a.i.a.ae;
import org.apache.a.i.a.c;
import org.apache.a.i.a.e;
import org.apache.a.i.a.z;
import org.apache.a.i.b.at;
import org.apache.a.i.c.ai;
import org.apache.a.i.f.o;
import org.apache.a.i.i;
import org.apache.a.l.j;
import org.apache.a.n;
import org.apache.a.n.aa;
import org.apache.a.n.ab;
import org.apache.a.n.g;
import org.apache.a.n.k;
import org.apache.a.n.m;
import org.apache.a.n.v;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;

public class au {
    private final org.apache.a.f.p a;
    private final a b;
    private final org.apache.a.c.a.c c;
    private final k d;
    private final m e;
    private final at f;
    private final org.apache.a.i.a.i g;
    private final org.apache.a.b.j h;
    private final org.apache.a.b.g i;
    private final b j;

    public au(org.apache.a.f.p p2, a a2, org.apache.a.c.a.c c2) {
        this.a = p2 != null ? p2 : ai.a;
        this.b = a2 != null ? a2 : org.apache.a.e.a.a;
        this.c = c2 != null ? c2 : org.apache.a.c.a.c.a;
        this.d = new v(new aa(), new org.apache.a.c.e.i(), new ab());
        this.e = new m();
        this.f = new at();
        this.g = new org.apache.a.i.a.i();
        this.h = new org.apache.a.b.j();
        this.i = new org.apache.a.b.g();
        this.i.a("Basic", new c());
        this.i.a("Digest", new e());
        this.i.a("NTLM", new z());
        this.i.a("negotiate", new ae());
        this.i.a("Kerberos", new org.apache.a.i.a.m());
        this.j = new i();
    }

    public au(j j2) {
        this(null, org.apache.a.l.i.c(j2), org.apache.a.c.d.f.a(j2));
    }

    public au(org.apache.a.c.a.c c2) {
        this(null, null, c2);
    }

    public au() {
        this(null, null, null);
    }

    public j a() {
        return new org.apache.a.l.b();
    }

    public org.apache.a.b.g b() {
        return this.i;
    }

    public Socket a(r r2, r r3, org.apache.a.b.o o2) {
        n n2;
        int n3;
        x x2;
        org.apache.a.o.a.a(r2, "Proxy host");
        org.apache.a.o.a.a(r3, "Target host");
        org.apache.a.o.a.a(o2, "Credentials");
        r r4 = r3;
        if (r4.b() <= 0) {
            r4 = new r(r4.a(), 80, r4.c());
        }
        org.apache.a.f.b.b b2 = new org.apache.a.f.b.b(r4, this.c.c(), r2, false, org.apache.a.f.b.g.b, org.apache.a.f.b.f.a);
        org.apache.a.f.u u2 = (org.apache.a.f.u)this.a.a(b2, this.b);
        org.apache.a.n.a a2 = new org.apache.a.n.a();
        org.apache.a.k.i i2 = new org.apache.a.k.i("CONNECT", r4.f(), ac.d);
        org.apache.a.i.b.i i3 = new org.apache.a.i.b.i();
        i3.a(new org.apache.a.b.i(r2), o2);
        a2.a("http.target_host", r3);
        a2.a("http.connection", u2);
        a2.a("http.request", i2);
        a2.a("http.route", b2);
        a2.a("http.auth.proxy-scope", this.h);
        a2.a("http.auth.credentials-provider", i3);
        a2.a("http.authscheme-registry", this.i);
        a2.a("http.request-config", this.c);
        this.e.a((u)i2, this.d, (g)a2);
        while (true) {
            if (!u2.c()) {
                Socket socket = new Socket(r2.a(), r2.b());
                u2.a(socket);
            }
            this.g.a(i2, this.h, a2);
            x2 = this.e.a((u)i2, u2, (g)a2);
            n3 = x2.a().b();
            if (n3 < 200) {
                throw new p("Unexpected response to CONNECT request: " + x2.a());
            }
            if (!this.g.a(r2, x2, this.f, this.h, a2) || !this.g.b(r2, x2, this.f, this.h, a2)) break;
            if (this.j.a(x2, a2)) {
                n2 = x2.b();
                org.apache.a.o.g.b(n2);
            } else {
                u2.close();
            }
            i2.e("Proxy-Authorization");
        }
        n3 = x2.a().b();
        if (n3 > 299) {
            n2 = x2.b();
            if (n2 != null) {
                x2.a(new org.apache.a.h.c(n2));
            }
            u2.close();
            throw new o("CONNECT refused by proxy: " + x2.a(), x2);
        }
        return u2.t();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.a.ag;
import org.apache.a.ak;
import org.apache.a.c.a.c;
import org.apache.a.c.c.p;
import org.apache.a.c.c.w;
import org.apache.a.c.c.x;
import org.apache.a.c.f.j;
import org.apache.a.f;
import org.apache.a.i;
import org.apache.a.k.b;
import org.apache.a.k.s;
import org.apache.a.n;
import org.apache.a.o;
import org.apache.a.o.a;
import org.apache.a.u;

public class v {
    private String a;
    private ak b;
    private URI c;
    private s d;
    private n e;
    private LinkedList f;
    private c g;

    v(String string) {
        this.a = string;
    }

    v() {
        this(null);
    }

    public static v a(String string) {
        org.apache.a.o.a.b(string, "HTTP method");
        return new v(string);
    }

    public static v a() {
        return new v("GET");
    }

    public static v b() {
        return new v("HEAD");
    }

    public static v c() {
        return new v("POST");
    }

    public static v d() {
        return new v("PUT");
    }

    public static v e() {
        return new v("DELETE");
    }

    public static v f() {
        return new v("TRACE");
    }

    public static v g() {
        return new v("OPTIONS");
    }

    public static v a(u u2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        return new v().b(u2);
    }

    private v b(u u2) {
        if (u2 == null) {
            return this;
        }
        this.a = u2.g().a();
        this.b = u2.g().b();
        this.c = u2 instanceof org.apache.a.c.c.u ? ((org.apache.a.c.c.u)u2).k() : URI.create(u2.g().a());
        if (this.d == null) {
            this.d = new s();
        }
        this.d.a();
        this.d.a(u2.cJ_());
        this.e = u2 instanceof o ? ((o)u2).b() : null;
        this.g = u2 instanceof org.apache.a.c.c.f ? ((org.apache.a.c.c.f)((Object)u2)).d() : null;
        this.f = null;
        return this;
    }

    public String h() {
        return this.a;
    }

    public ak i() {
        return this.b;
    }

    public v a(ak ak2) {
        this.b = ak2;
        return this;
    }

    public URI j() {
        return this.c;
    }

    public v a(URI uRI) {
        this.c = uRI;
        return this;
    }

    public v b(String string) {
        this.c = string != null ? URI.create(string) : null;
        return this;
    }

    public f c(String string) {
        return this.d != null ? this.d.c(string) : null;
    }

    public f d(String string) {
        return this.d != null ? this.d.d(string) : null;
    }

    public f[] e(String string) {
        return this.d != null ? this.d.b(string) : null;
    }

    public v a(f f2) {
        if (this.d == null) {
            this.d = new s();
        }
        this.d.a(f2);
        return this;
    }

    public v a(String string, String string2) {
        if (this.d == null) {
            this.d = new s();
        }
        this.d.a(new b(string, string2));
        return this;
    }

    public v b(f f2) {
        if (this.d == null) {
            this.d = new s();
        }
        this.d.b(f2);
        return this;
    }

    public v f(String string) {
        if (string == null || this.d == null) {
            return this;
        }
        i i2 = this.d.c();
        while (i2.hasNext()) {
            f f2 = i2.a();
            if (!string.equalsIgnoreCase(f2.c())) continue;
            i2.remove();
        }
        return this;
    }

    public v c(f f2) {
        if (this.d == null) {
            this.d = new s();
        }
        this.d.c(f2);
        return this;
    }

    public v b(String string, String string2) {
        if (this.d == null) {
            this.d = new s();
        }
        this.d.c(new b(string, string2));
        return this;
    }

    public n k() {
        return this.e;
    }

    public v a(n n2) {
        this.e = n2;
        return this;
    }

    public List l() {
        return this.f != null ? new ArrayList(this.f) : new ArrayList();
    }

    public v a(ag ag2) {
        org.apache.a.o.a.a(ag2, "Name value pair");
        if (this.f == null) {
            this.f = new LinkedList();
        }
        this.f.add(ag2);
        return this;
    }

    public v c(String string, String string2) {
        return this.a((ag)new org.apache.a.k.n(string, string2));
    }

    public v a(ag ... arrag) {
        for (ag ag2 : arrag) {
            this.a(ag2);
        }
        return this;
    }

    public c m() {
        return this.g;
    }

    public v a(c c2) {
        this.g = c2;
        return this;
    }

    public org.apache.a.c.c.u n() {
        p p2;
        URI uRI = this.c != null ? this.c : URI.create("/");
        n n2 = this.e;
        if (this.f != null && !this.f.isEmpty()) {
            if (n2 == null && ("POST".equalsIgnoreCase(this.a) || "PUT".equalsIgnoreCase(this.a))) {
                n2 = new org.apache.a.c.b.i((Iterable)this.f, org.apache.a.n.f.t);
            } else {
                try {
                    uRI = new j(uRI).b(this.f).a();
                }
                catch (URISyntaxException uRISyntaxException) {
                    // empty catch block
                }
            }
        }
        if (n2 == null) {
            p2 = new x(this.a);
        } else {
            w w2 = new w(this.a);
            w2.a(n2);
            p2 = w2;
        }
        p2.a(this.b);
        p2.a(uRI);
        if (this.d != null) {
            p2.a(this.d.b());
        }
        p2.a(this.g);
        return p2;
    }
}


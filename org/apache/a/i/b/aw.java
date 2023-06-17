/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.a.aj;
import org.apache.a.ak;
import org.apache.a.am;
import org.apache.a.k.a;
import org.apache.a.k.o;
import org.apache.a.l.m;
import org.apache.a.u;

public class aw
extends a
implements org.apache.a.c.c.u {
    private final u a;
    private URI d;
    private String e;
    private ak f;
    private int g;

    public aw(u u2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        this.a = u2;
        this.a(u2.f());
        this.a(u2.cJ_());
        if (u2 instanceof org.apache.a.c.c.u) {
            this.d = ((org.apache.a.c.c.u)u2).k();
            this.e = ((org.apache.a.c.c.u)u2).cL_();
            this.f = null;
        } else {
            am am2 = u2.g();
            try {
                this.d = new URI(am2.c());
            }
            catch (URISyntaxException uRISyntaxException) {
                throw new aj("Invalid request URI: " + am2.c(), uRISyntaxException);
            }
            this.e = am2.a();
            this.f = u2.c();
        }
        this.g = 0;
    }

    public void j() {
        this.b.a();
        this.a(this.a.cJ_());
    }

    public String cL_() {
        return this.e;
    }

    public void g(String string) {
        org.apache.a.o.a.a((Object)string, "Method name");
        this.e = string;
    }

    public ak c() {
        if (this.f == null) {
            this.f = m.c(this.f());
        }
        return this.f;
    }

    public void a(ak ak2) {
        this.f = ak2;
    }

    public URI k() {
        return this.d;
    }

    public void a(URI uRI) {
        this.d = uRI;
    }

    public am g() {
        String string = this.cL_();
        ak ak2 = this.c();
        String string2 = null;
        if (this.d != null) {
            string2 = this.d.toASCIIString();
        }
        if (string2 == null || string2.length() == 0) {
            string2 = "/";
        }
        return new o(string, string2, ak2);
    }

    public void cK_() {
        throw new UnsupportedOperationException();
    }

    public boolean h() {
        return false;
    }

    public u l() {
        return this.a;
    }

    public boolean i() {
        return true;
    }

    public int m() {
        return this.g;
    }

    public void n() {
        ++this.g;
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import org.apache.a.ak;
import org.apache.a.am;
import org.apache.a.c.a.c;
import org.apache.a.c.c.b;
import org.apache.a.c.c.f;
import org.apache.a.c.c.u;
import org.apache.a.k.o;
import org.apache.a.l.m;

public abstract class p
extends b
implements f,
u {
    private ak a;
    private URI d;
    private c e;

    public abstract String cL_();

    public void a(ak ak2) {
        this.a = ak2;
    }

    public ak c() {
        return this.a != null ? this.a : m.c(this.f());
    }

    public URI k() {
        return this.d;
    }

    public am g() {
        String string = this.cL_();
        ak ak2 = this.c();
        URI uRI = this.k();
        String string2 = null;
        if (uRI != null) {
            string2 = uRI.toASCIIString();
        }
        if (string2 == null || string2.length() == 0) {
            string2 = "/";
        }
        return new o(string, string2, ak2);
    }

    public c d() {
        return this.e;
    }

    public void a(c c2) {
        this.e = c2;
    }

    public void a(URI uRI) {
        this.d = uRI;
    }

    public void l() {
    }

    public void m() {
        this.j();
    }

    public String toString() {
        return this.cL_() + " " + this.k() + " " + this.c();
    }
}


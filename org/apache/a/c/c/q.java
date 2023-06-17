/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import org.apache.a.ak;
import org.apache.a.am;
import org.apache.a.c.c.r;
import org.apache.a.c.c.s;
import org.apache.a.k.a;
import org.apache.a.l.j;
import org.apache.a.o;
import org.apache.a.u;

public class q
extends a
implements org.apache.a.c.c.u {
    private final u a;
    private final String d;
    private ak e;
    private URI f;

    private q(u u2) {
        this.a = u2;
        this.e = this.a.g().b();
        this.d = this.a.g().a();
        this.f = u2 instanceof org.apache.a.c.c.u ? ((org.apache.a.c.c.u)u2).k() : null;
        this.a(u2.cJ_());
    }

    public ak c() {
        return this.e != null ? this.e : this.a.c();
    }

    public void a(ak ak2) {
        this.e = ak2;
    }

    public URI k() {
        return this.f;
    }

    public void a(URI uRI) {
        this.f = uRI;
    }

    public String cL_() {
        return this.d;
    }

    public void cK_() {
        throw new UnsupportedOperationException();
    }

    public boolean h() {
        return false;
    }

    public am g() {
        String string = null;
        string = this.f != null ? this.f.toASCIIString() : this.a.g().c();
        if (string == null || string.length() == 0) {
            string = "/";
        }
        return new org.apache.a.k.o(this.d, string, this.c());
    }

    public u i() {
        return this.a;
    }

    public String toString() {
        return this.g() + " " + this.b;
    }

    public static q a(u u2) {
        if (u2 == null) {
            return null;
        }
        if (u2 instanceof o) {
            return new s((o)u2);
        }
        return new q(u2);
    }

    public j f() {
        if (this.c == null) {
            this.c = this.a.f().e();
        }
        return this.c;
    }

    /* synthetic */ q(u u2, r r2) {
        this(u2);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import org.apache.a.b.k;
import org.apache.a.b.o;
import org.apache.a.b.q;
import org.apache.a.b.r;
import org.apache.a.f;
import org.apache.a.i.a.a;
import org.apache.a.i.a.n;
import org.apache.a.i.a.p;
import org.apache.a.i.a.y;
import org.apache.a.o.d;
import org.apache.a.u;

public class x
extends a {
    private final n a;
    private y b;
    private String c;

    public x(n n2) {
        org.apache.a.o.a.a(n2, "NTLM engine");
        this.a = n2;
        this.b = y.a;
        this.c = null;
    }

    public x() {
        this(new p());
    }

    public String a() {
        return "ntlm";
    }

    public String a(String string) {
        return null;
    }

    public String b() {
        return null;
    }

    public boolean c() {
        return true;
    }

    protected void a(d d2, int n2, int n3) {
        this.c = d2.b(n2, n3);
        if (this.c.length() == 0) {
            this.b = this.b == y.a ? y.b : y.f;
        } else {
            if (this.b.compareTo(y.c) < 0) {
                this.b = y.f;
                throw new q("Out of sequence NTLM response message");
            }
            if (this.b == y.c) {
                this.b = y.d;
            }
        }
    }

    public f a(o o2, u u2) {
        r r2 = null;
        try {
            r2 = (r)o2;
        }
        catch (ClassCastException classCastException) {
            throw new org.apache.a.b.p("Credentials cannot be used for NTLM authentication: " + o2.getClass().getName());
        }
        String string = null;
        if (this.b == y.f) {
            throw new k("NTLM authentication failed");
        }
        if (this.b == y.b) {
            string = this.a.a(r2.d(), r2.e());
            this.b = y.c;
        } else if (this.b == y.d) {
            string = this.a.a(r2.c(), r2.b(), r2.d(), r2.e(), this.c);
            this.b = y.e;
        } else {
            throw new k("Unexpected state: " + (Object)((Object)this.b));
        }
        d d2 = new d(32);
        if (this.e()) {
            d2.a("Proxy-Authorization");
        } else {
            d2.a("Authorization");
        }
        d2.a(": NTLM ");
        d2.a(string);
        return new org.apache.a.k.r(d2);
    }

    public boolean d() {
        return this.b == y.e || this.b == y.f;
    }
}


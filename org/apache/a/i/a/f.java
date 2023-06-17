/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.io.Serializable;
import org.apache.a.b.k;
import org.apache.a.b.o;
import org.apache.a.b.p;
import org.apache.a.f.b.b;
import org.apache.a.i.a.a;
import org.apache.a.i.a.h;
import org.apache.a.n.g;
import org.apache.a.o.d;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.commons.d.c;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

public abstract class f
extends a {
    private final org.apache.commons.d.a a = org.apache.commons.d.c.b(this.getClass());
    private final org.apache.commons.a.a.d b = new org.apache.commons.a.a.d(0);
    private final boolean c;
    private h d;
    private byte[] e;

    f(boolean bl2) {
        this.c = bl2;
        this.d = h.a;
    }

    f() {
        this(false);
    }

    protected GSSManager g() {
        return GSSManager.getInstance();
    }

    protected byte[] a(byte[] arrby, Oid oid, String string) {
        byte[] arrby2 = arrby;
        if (arrby2 == null) {
            arrby2 = new byte[]{};
        }
        GSSManager gSSManager = this.g();
        GSSName gSSName = gSSManager.createName("HTTP@" + string, GSSName.NT_HOSTBASED_SERVICE);
        GSSContext gSSContext = gSSManager.createContext(gSSName.canonicalize(oid), oid, null, 0);
        gSSContext.requestMutualAuth(true);
        gSSContext.requestCredDeleg(true);
        return gSSContext.initSecContext(arrby2, 0, arrby2.length);
    }

    protected abstract byte[] a(byte[] var1, String var2);

    public boolean d() {
        return this.d == h.c || this.d == h.d;
    }

    public org.apache.a.f a(o o2, u u2) {
        return this.a(o2, u2, null);
    }

    public org.apache.a.f a(o o2, u u2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        switch (this.d) {
            case a: {
                throw new k(this.a() + " authentication has not been initiated");
            }
            case d: {
                throw new k(this.a() + " authentication has failed");
            }
            case b: {
                Serializable serializable;
                Object object;
                try {
                    object = (b)g2.a("http.route");
                    if (object == null) {
                        throw new k("Connection route is not available");
                    }
                    if (this.e()) {
                        serializable = ((b)object).e();
                        if (serializable == null) {
                            serializable = ((b)object).a();
                        }
                    } else {
                        serializable = ((b)object).a();
                    }
                    String string = !this.c && ((r)serializable).b() > 0 ? ((r)serializable).f() : ((r)serializable).a();
                    if (this.a.a()) {
                        this.a.b("init " + string);
                    }
                    this.e = this.a(this.e, string);
                    this.d = h.c;
                }
                catch (GSSException gSSException) {
                    this.d = h.d;
                    if (gSSException.getMajor() == 9 || gSSException.getMajor() == 8) {
                        throw new p(gSSException.getMessage(), gSSException);
                    }
                    if (gSSException.getMajor() == 13) {
                        throw new p(gSSException.getMessage(), gSSException);
                    }
                    if (gSSException.getMajor() == 10 || gSSException.getMajor() == 19 || gSSException.getMajor() == 20) {
                        throw new k(gSSException.getMessage(), gSSException);
                    }
                    throw new k(gSSException.getMessage());
                }
            }
            case c: {
                Object object = new String(this.b.b(this.e));
                if (this.a.a()) {
                    this.a.b("Sending response '" + (String)object + "' back to the auth server");
                }
                Serializable serializable = new d(32);
                if (this.e()) {
                    ((d)serializable).a("Proxy-Authorization");
                } else {
                    ((d)serializable).a("Authorization");
                }
                ((d)serializable).a(": Negotiate ");
                ((d)serializable).a((String)object);
                return new org.apache.a.k.r((d)serializable);
            }
        }
        throw new IllegalStateException("Illegal state: " + (Object)((Object)this.d));
    }

    protected void a(d d2, int n2, int n3) {
        String string = d2.b(n2, n3);
        if (this.a.a()) {
            this.a.b("Received challenge '" + string + "' from the auth server");
        }
        if (this.d == h.a) {
            this.e = org.apache.commons.a.a.d.j(string.getBytes());
            this.d = h.b;
        } else {
            this.a.b("Authentication already attempted");
            this.d = h.d;
        }
    }
}


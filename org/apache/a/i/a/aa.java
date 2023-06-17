/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.io.IOException;
import org.apache.a.b.o;
import org.apache.a.f;
import org.apache.a.i.a.af;
import org.apache.a.n.g;
import org.apache.a.u;
import org.apache.commons.d.a;
import org.apache.commons.d.c;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

public class aa
extends org.apache.a.i.a.f {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private static final String b = "1.3.6.1.5.5.2";
    private static final String c = "1.2.840.113554.1.2.2";
    private final af d;

    public aa(af af2, boolean bl2) {
        super(bl2);
        this.d = af2;
    }

    public aa(af af2) {
        this(af2, false);
    }

    public aa() {
        this(null, false);
    }

    public String a() {
        return "Negotiate";
    }

    public f a(o o2, u u2) {
        return this.a(o2, u2, null);
    }

    public f a(o o2, u u2, g g2) {
        return super.a(o2, u2, g2);
    }

    protected byte[] a(byte[] arrby, String string) {
        Oid oid = new Oid(b);
        byte[] arrby2 = arrby;
        boolean bl2 = false;
        try {
            arrby2 = this.a(arrby2, oid, string);
        }
        catch (GSSException gSSException) {
            if (gSSException.getMajor() == 2) {
                this.a.b("GSSException BAD_MECH, retry with Kerberos MECH");
                bl2 = true;
            }
            throw gSSException;
        }
        if (bl2) {
            this.a.b("Using Kerberos MECH 1.2.840.113554.1.2.2");
            oid = new Oid(c);
            arrby2 = this.a(arrby2, oid, string);
            if (arrby2 != null && this.d != null) {
                try {
                    arrby2 = this.d.a(arrby2);
                }
                catch (IOException iOException) {
                    this.a.e(iOException.getMessage(), iOException);
                }
            }
        }
        return arrby2;
    }

    public String a(String string) {
        org.apache.a.o.a.a((Object)string, "Parameter name");
        return null;
    }

    public String b() {
        return null;
    }

    public boolean c() {
        return true;
    }
}


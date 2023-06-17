/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import org.apache.a.b.o;
import org.apache.a.f;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.u;
import org.ietf.jgss.Oid;

public class ad
extends org.apache.a.i.a.f {
    private static final String a = "1.3.6.1.5.5.2";

    public ad(boolean bl2) {
        super(bl2);
    }

    public ad() {
        super(false);
    }

    public String a() {
        return "Negotiate";
    }

    public f a(o o2, u u2, g g2) {
        return super.a(o2, u2, g2);
    }

    protected byte[] a(byte[] arrby, String string) {
        return this.a(arrby, new Oid(a), string);
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


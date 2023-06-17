/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.bi;
import io.netty.b.i;
import io.netty.c.a.d.b.a;
import io.netty.c.a.d.b.ac;
import io.netty.c.a.d.b.ad;
import io.netty.c.a.d.b.d;
import io.netty.c.a.d.b.j;
import io.netty.channel.ar;
import io.netty.util.z;
import java.io.IOException;

public class g
extends a
implements d {
    public static String g;
    public static boolean h;
    public static final String i = "Attr_";
    public static final String j = ".att";

    public g(String string) {
        super(string, io.netty.c.a.d.ac.j, 0L);
    }

    public g(String string, String string2) {
        super(string, io.netty.c.a.d.ac.j, 0L);
        this.a(string2);
    }

    @Override
    public ad y() {
        return ad.a;
    }

    @Override
    public String u() {
        byte[] arrby = this.k();
        return new String(arrby, this.e.name());
    }

    @Override
    public void a(String string) {
        if (string == null) {
            throw new NullPointerException("value");
        }
        byte[] arrby = string.getBytes(this.e.name());
        io.netty.b.g g2 = bi.a(arrby);
        if (this.c > 0L) {
            this.c = g2.r();
        }
        this.a(g2);
    }

    @Override
    public void a(io.netty.b.g g2, boolean bl2) {
        int n2 = g2.r();
        if (this.c > 0L && this.c < this.d + (long)n2) {
            this.c = this.d + (long)n2;
        }
        super.a(g2, bl2);
    }

    public int hashCode() {
        return this.p().hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof d)) {
            return false;
        }
        d d2 = (d)object;
        return this.p().equalsIgnoreCase(d2.p());
    }

    public int a(ac ac2) {
        if (!(ac2 instanceof d)) {
            throw new ClassCastException("Cannot compare " + (Object)((Object)this.y()) + " with " + (Object)((Object)ac2.y()));
        }
        return this.a((d)ac2);
    }

    public int a(d d2) {
        return this.p().compareToIgnoreCase(d2.p());
    }

    public String toString() {
        try {
            return this.p() + '=' + this.u();
        }
        catch (IOException iOException) {
            return this.p() + "=IoException";
        }
    }

    @Override
    protected boolean i() {
        return h;
    }

    @Override
    protected String g() {
        return g;
    }

    @Override
    protected String e() {
        return this.p() + j;
    }

    @Override
    protected String h() {
        return j;
    }

    @Override
    protected String f() {
        return i;
    }

    @Override
    public d v() {
        g g2 = new g(this.p());
        g2.b(this.r());
        io.netty.b.g g3 = this.a();
        if (g3 != null) {
            try {
                g2.a(g3.Q());
            }
            catch (IOException iOException) {
                throw new ar(iOException);
            }
        }
        return g2;
    }

    @Override
    public d w() {
        g g2 = new g(this.p());
        g2.b(this.r());
        io.netty.b.g g3 = this.a();
        if (g3 != null) {
            try {
                g2.a(g3.S());
            }
            catch (IOException iOException) {
                throw new ar(iOException);
            }
        }
        return g2;
    }

    @Override
    public d d(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public d x() {
        super.t();
        return this;
    }

    @Override
    public /* synthetic */ j c(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ j t() {
        return this.x();
    }

    @Override
    public /* synthetic */ j z() {
        return this.w();
    }

    @Override
    public /* synthetic */ j A() {
        return this.v();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((ac)object);
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.x();
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.x();
    }

    @Override
    public /* synthetic */ i c() {
        return this.w();
    }

    @Override
    public /* synthetic */ i b() {
        return this.v();
    }

    static {
        h = true;
    }
}


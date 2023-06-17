/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.g;
import io.netty.c.a.d.b.ac;
import io.netty.c.a.d.b.ad;
import io.netty.c.a.d.b.c;
import io.netty.c.a.d.b.d;
import io.netty.c.a.d.b.i;
import io.netty.c.a.d.b.j;
import io.netty.channel.ar;
import io.netty.util.z;
import java.io.IOException;
import java.nio.charset.Charset;

public class ag
extends c
implements i {
    private String g;
    private String h;
    private String i;

    public ag(String string, String string2, String string3, String string4, Charset charset, long l2) {
        super(string, charset, l2);
        this.a(string2);
        this.b(string3);
        this.c(string4);
    }

    @Override
    public ad y() {
        return ad.b;
    }

    @Override
    public String u() {
        return this.g;
    }

    @Override
    public void a(String string) {
        if (string == null) {
            throw new NullPointerException("filename");
        }
        this.g = string;
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
        if (!(ac2 instanceof i)) {
            throw new ClassCastException("Cannot compare " + (Object)((Object)this.y()) + " with " + (Object)((Object)ac2.y()));
        }
        return this.a((i)ac2);
    }

    public int a(i i2) {
        int n2 = this.p().compareToIgnoreCase(i2.p());
        if (n2 != 0) {
            return n2;
        }
        return n2;
    }

    @Override
    public void b(String string) {
        if (string == null) {
            throw new NullPointerException("contentType");
        }
        this.h = string;
    }

    @Override
    public String v() {
        return this.h;
    }

    @Override
    public String w() {
        return this.i;
    }

    @Override
    public void c(String string) {
        this.i = string;
    }

    public String toString() {
        return "Content-Disposition: form-data; name=\"" + this.p() + "\"; " + "filename" + "=\"" + this.g + "\"\r\n" + "Content-Type" + ": " + this.h + (this.e != null ? "; charset=" + this.e + "\r\n" : "\r\n") + "Content-Length" + ": " + this.s() + "\r\n" + "Completed: " + this.q() + "\r\nIsInMemory: " + this.n();
    }

    @Override
    public i x() {
        ag ag2 = new ag(this.p(), this.u(), this.v(), this.w(), this.r(), this.d);
        g g2 = this.a();
        if (g2 != null) {
            try {
                ag2.a(g2.Q());
                return ag2;
            }
            catch (IOException iOException) {
                throw new ar(iOException);
            }
        }
        return ag2;
    }

    @Override
    public i B() {
        ag ag2 = new ag(this.p(), this.u(), this.v(), this.w(), this.r(), this.d);
        g g2 = this.a();
        if (g2 != null) {
            try {
                ag2.a(g2.S());
                return ag2;
            }
            catch (IOException iOException) {
                throw new ar(iOException);
            }
        }
        return ag2;
    }

    @Override
    public i C() {
        super.t();
        return this;
    }

    @Override
    public i d(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public /* synthetic */ j c(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ j t() {
        return this.C();
    }

    @Override
    public /* synthetic */ j z() {
        return this.B();
    }

    @Override
    public /* synthetic */ j A() {
        return this.x();
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
        return this.C();
    }

    @Override
    public /* synthetic */ io.netty.b.i a(int n2) {
        return this.d(n2);
    }

    @Override
    public /* synthetic */ io.netty.b.i bC_() {
        return this.C();
    }

    @Override
    public /* synthetic */ io.netty.b.i c() {
        return this.B();
    }

    @Override
    public /* synthetic */ io.netty.b.i b() {
        return this.x();
    }
}


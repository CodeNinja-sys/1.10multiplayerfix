/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.i;
import io.netty.c.a.d.b.ac;
import io.netty.c.a.d.b.ad;
import io.netty.c.a.d.b.af;
import io.netty.c.a.d.b.d;
import io.netty.c.a.d.b.g;
import io.netty.c.a.d.b.j;
import io.netty.util.z;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ah
implements d {
    private d a;
    private final long b;

    public ah(String string, long l2) {
        this.b = l2;
        this.a = new af(string);
    }

    public ah(String string, String string2, long l2) {
        this.b = l2;
        if ((long)string2.length() > this.b) {
            try {
                this.a = new g(string, string2);
            }
            catch (IOException iOException) {
                try {
                    this.a = new af(string, string2);
                }
                catch (IOException iOException2) {
                    throw new IllegalArgumentException(iOException);
                }
            }
        } else {
            try {
                this.a = new af(string, string2);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(iOException);
            }
        }
    }

    @Override
    public void a(io.netty.b.g g2, boolean bl2) {
        if (this.a instanceof af && this.a.s() + (long)g2.r() > this.b) {
            g g3 = new g(this.a.p());
            if (((af)this.a).l() != null) {
                g3.a(((af)this.a).l(), false);
            }
            this.a = g3;
        }
        this.a.a(g2, bl2);
    }

    @Override
    public void j() {
        this.a.j();
    }

    @Override
    public byte[] k() {
        return this.a.k();
    }

    @Override
    public io.netty.b.g l() {
        return this.a.l();
    }

    @Override
    public Charset r() {
        return this.a.r();
    }

    @Override
    public String m() {
        return this.a.m();
    }

    @Override
    public String a(Charset charset) {
        return this.a.a(charset);
    }

    @Override
    public boolean q() {
        return this.a.q();
    }

    @Override
    public boolean n() {
        return this.a.n();
    }

    @Override
    public long s() {
        return this.a.s();
    }

    @Override
    public boolean b(File file) {
        return this.a.b(file);
    }

    @Override
    public void b(Charset charset) {
        this.a.b(charset);
    }

    @Override
    public void a(io.netty.b.g g2) {
        if ((long)g2.r() > this.b && this.a instanceof af) {
            this.a = new g(this.a.p());
        }
        this.a.a(g2);
    }

    @Override
    public void a(File file) {
        if (file.length() > this.b && this.a instanceof af) {
            this.a = new g(this.a.p());
        }
        this.a.a(file);
    }

    @Override
    public void a(InputStream inputStream) {
        if (this.a instanceof af) {
            this.a = new g(this.a.p());
        }
        this.a.a(inputStream);
    }

    @Override
    public ad y() {
        return this.a.y();
    }

    @Override
    public String p() {
        return this.a.p();
    }

    public int a(ac ac2) {
        return this.a.compareTo(ac2);
    }

    public String toString() {
        return "Mixed: " + this.a.toString();
    }

    @Override
    public String u() {
        return this.a.u();
    }

    @Override
    public void a(String string) {
        this.a.a(string);
    }

    @Override
    public io.netty.b.g b(int n2) {
        return this.a.b(n2);
    }

    @Override
    public File o() {
        return this.a.o();
    }

    @Override
    public d v() {
        return this.a.v();
    }

    @Override
    public d w() {
        return this.a.w();
    }

    @Override
    public io.netty.b.g a() {
        return this.a.a();
    }

    @Override
    public int ac() {
        return this.a.ac();
    }

    @Override
    public d x() {
        this.a.x();
        return this;
    }

    @Override
    public d d(int n2) {
        this.a.d(n2);
        return this;
    }

    @Override
    public boolean ad() {
        return this.a.ad();
    }

    @Override
    public boolean I(int n2) {
        return this.a.I(n2);
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
}


/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.g;
import io.netty.c.a.d.b.ac;
import io.netty.c.a.d.b.ad;
import io.netty.c.a.d.b.ag;
import io.netty.c.a.d.b.h;
import io.netty.c.a.d.b.i;
import io.netty.c.a.d.b.j;
import io.netty.util.z;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ai
implements i {
    private i a;
    private final long b;
    private final long c;

    public ai(String string, String string2, String string3, String string4, Charset charset, long l2, long l3) {
        this.b = l3;
        this.a = l2 > this.b ? new h(string, string2, string3, string4, charset, l2) : new ag(string, string2, string3, string4, charset, l2);
        this.c = l2;
    }

    @Override
    public void a(g g2, boolean bl2) {
        if (this.a instanceof ag && this.a.s() + (long)g2.r() > this.b) {
            h h2 = new h(this.a.p(), this.a.u(), this.a.v(), this.a.w(), this.a.r(), this.c);
            g g3 = this.a.l();
            if (g3 != null && g3.u()) {
                h2.a(g3.ab(), false);
            }
            this.a.ad();
            this.a = h2;
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
    public g l() {
        return this.a.l();
    }

    @Override
    public Charset r() {
        return this.a.r();
    }

    @Override
    public String v() {
        return this.a.v();
    }

    @Override
    public String w() {
        return this.a.w();
    }

    @Override
    public String u() {
        return this.a.u();
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
    public void a(g g2) {
        if ((long)g2.r() > this.b && this.a instanceof ag) {
            i i2 = this.a;
            this.a = new h(i2.p(), i2.u(), i2.v(), i2.w(), i2.r(), this.c);
            i2.ad();
        }
        this.a.a(g2);
    }

    @Override
    public void a(File file) {
        if (file.length() > this.b && this.a instanceof ag) {
            i i2 = this.a;
            this.a = new h(i2.p(), i2.u(), i2.v(), i2.w(), i2.r(), this.c);
            i2.ad();
        }
        this.a.a(file);
    }

    @Override
    public void a(InputStream inputStream) {
        if (this.a instanceof ag) {
            i i2 = this.a;
            this.a = new h(this.a.p(), this.a.u(), this.a.v(), this.a.w(), this.a.r(), this.c);
            i2.ad();
        }
        this.a.a(inputStream);
    }

    @Override
    public void b(String string) {
        this.a.b(string);
    }

    @Override
    public void c(String string) {
        this.a.c(string);
    }

    @Override
    public void a(String string) {
        this.a.a(string);
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
    public g b(int n2) {
        return this.a.b(n2);
    }

    @Override
    public File o() {
        return this.a.o();
    }

    @Override
    public i x() {
        return this.a.x();
    }

    @Override
    public i B() {
        return this.a.B();
    }

    @Override
    public g a() {
        return this.a.a();
    }

    @Override
    public int ac() {
        return this.a.ac();
    }

    @Override
    public i C() {
        this.a.C();
        return this;
    }

    @Override
    public i d(int n2) {
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


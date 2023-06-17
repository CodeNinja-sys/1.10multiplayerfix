/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import java.util.Collections;
import java.util.Date;
import java.util.Set;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.d.d;
import org.apache.commons.compress.archivers.d.f;
import org.apache.commons.compress.archivers.d.g;
import org.apache.commons.compress.archivers.d.h;
import org.apache.commons.compress.archivers.d.l;
import org.apache.commons.compress.archivers.d.m;

public class e
implements a {
    private String b;
    private g c = org.apache.commons.compress.archivers.d.g.i;
    private int d;
    private Set e = Collections.emptySet();
    private long f;
    private long g;
    private long h;
    private int i;
    private int j;
    private final l k = null;
    private final h l = new h();
    private String m;
    private String n;
    private int o;
    private long p;
    private int q;
    private int r;
    private long s;
    private int t;
    private boolean u;

    public e() {
    }

    public e(String string, String string2) {
        this.b(string);
        this.m = string2;
    }

    protected e(String string, String string2, int n2, g g2) {
        this.a(g2);
        this.b(string);
        this.m = string2;
        this.q = n2;
        this.p = 0L;
    }

    public String b() {
        return this.m;
    }

    protected void a(String string) {
        this.m = string;
    }

    public int c() {
        return this.l.c();
    }

    public int d() {
        return this.r;
    }

    public void a(int n2) {
        this.r = n2;
    }

    public Date e() {
        return new Date(this.s);
    }

    public void a(Date date) {
        this.s = date.getTime();
    }

    public int f() {
        return this.t;
    }

    public void b(int n2) {
        this.t = n2;
    }

    public boolean g() {
        return this.u;
    }

    public void a(boolean bl2) {
        this.u = bl2;
    }

    public long h() {
        return this.p;
    }

    public void a(long l2) {
        this.p = l2;
    }

    public int i() {
        return this.o;
    }

    public void c(int n2) {
        this.o = n2;
    }

    public d j() {
        return this.l.a();
    }

    public int k() {
        return this.l.d();
    }

    public int l() {
        return this.l.e();
    }

    public boolean d(int n2) {
        return (this.l.b(n2) & 1) == 0;
    }

    public int hashCode() {
        return this.q;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || !object.getClass().equals(this.getClass())) {
            return false;
        }
        e e2 = (e)object;
        if (this.l == null || e2.l == null) {
            return false;
        }
        if (this.q != e2.q) {
            return false;
        }
        return (this.k != null || e2.k == null) && (this.k == null || this.k.equals(e2.k));
    }

    public String toString() {
        return this.getName();
    }

    static e a(byte[] arrby) {
        e e2 = new e();
        h h2 = e2.l;
        org.apache.commons.compress.archivers.d.h.a(h2, org.apache.commons.compress.archivers.d.d.a(org.apache.commons.compress.archivers.d.m.b(arrby, 0)));
        org.apache.commons.compress.archivers.d.h.a(h2, org.apache.commons.compress.archivers.d.m.b(arrby, 12));
        e2.q = org.apache.commons.compress.archivers.d.h.b(h2, org.apache.commons.compress.archivers.d.m.b(arrby, 20));
        int n2 = org.apache.commons.compress.archivers.d.m.c(arrby, 32);
        e2.a(org.apache.commons.compress.archivers.d.g.a(n2 >> 12 & 0xF));
        e2.e(n2);
        e2.r = org.apache.commons.compress.archivers.d.m.c(arrby, 34);
        e2.b(org.apache.commons.compress.archivers.d.m.a(arrby, 40));
        long l2 = 1000L * (long)org.apache.commons.compress.archivers.d.m.b(arrby, 48) + (long)(org.apache.commons.compress.archivers.d.m.b(arrby, 52) / 1000);
        e2.c(new Date(l2));
        l2 = 1000L * (long)org.apache.commons.compress.archivers.d.m.b(arrby, 56) + (long)(org.apache.commons.compress.archivers.d.m.b(arrby, 60) / 1000);
        e2.b(new Date(l2));
        e2.s = l2 = 1000L * (long)org.apache.commons.compress.archivers.d.m.b(arrby, 64) + (long)(org.apache.commons.compress.archivers.d.m.b(arrby, 68) / 1000);
        e2.t = org.apache.commons.compress.archivers.d.m.b(arrby, 140);
        e2.f(org.apache.commons.compress.archivers.d.m.b(arrby, 144));
        e2.g(org.apache.commons.compress.archivers.d.m.b(arrby, 148));
        org.apache.commons.compress.archivers.d.h.c(h2, org.apache.commons.compress.archivers.d.m.b(arrby, 160));
        org.apache.commons.compress.archivers.d.h.d(h2, 0);
        for (int i2 = 0; i2 < 512 && i2 < org.apache.commons.compress.archivers.d.h.a(h2); ++i2) {
            if (arrby[164 + i2] != 0) continue;
            org.apache.commons.compress.archivers.d.h.b(h2);
        }
        System.arraycopy(arrby, 164, org.apache.commons.compress.archivers.d.h.c(h2), 0, 512);
        e2.o = h2.b();
        return e2;
    }

    void b(byte[] arrby) {
        org.apache.commons.compress.archivers.d.h.a(this.l, org.apache.commons.compress.archivers.d.m.b(arrby, 16));
        org.apache.commons.compress.archivers.d.h.c(this.l, org.apache.commons.compress.archivers.d.m.b(arrby, 160));
        org.apache.commons.compress.archivers.d.h.d(this.l, 0);
        for (int i2 = 0; i2 < 512 && i2 < org.apache.commons.compress.archivers.d.h.a(this.l); ++i2) {
            if (arrby[164 + i2] != 0) continue;
            org.apache.commons.compress.archivers.d.h.b(this.l);
        }
        System.arraycopy(arrby, 164, org.apache.commons.compress.archivers.d.h.c(this.l), 0, 512);
    }

    public String getName() {
        return this.b;
    }

    String m() {
        return this.n;
    }

    public final void b(String string) {
        this.n = string;
        if (string != null) {
            if (this.isDirectory() && !string.endsWith("/")) {
                string = string + "/";
            }
            if (string.startsWith("./")) {
                string = string.substring(2);
            }
        }
        this.b = string;
    }

    public Date a() {
        return new Date(this.h);
    }

    public boolean isDirectory() {
        return this.c == org.apache.commons.compress.archivers.d.g.f;
    }

    public boolean n() {
        return this.c == org.apache.commons.compress.archivers.d.g.d;
    }

    public boolean o() {
        return this.c == org.apache.commons.compress.archivers.d.g.b;
    }

    public boolean p() {
        return this.c == org.apache.commons.compress.archivers.d.g.g;
    }

    public boolean q() {
        return this.c == org.apache.commons.compress.archivers.d.g.e;
    }

    public boolean r() {
        return this.c == org.apache.commons.compress.archivers.d.g.h;
    }

    public g s() {
        return this.c;
    }

    public void a(g g2) {
        this.c = g2;
    }

    public int t() {
        return this.d;
    }

    public void e(int n2) {
        this.d = n2 & 0xFFF;
        this.e = org.apache.commons.compress.archivers.d.f.a(n2);
    }

    public Set u() {
        return this.e;
    }

    public long getSize() {
        return this.isDirectory() ? -1L : this.f;
    }

    long v() {
        return this.f;
    }

    public void b(long l2) {
        this.f = l2;
    }

    public void b(Date date) {
        this.h = date.getTime();
    }

    public Date w() {
        return new Date(this.g);
    }

    public void c(Date date) {
        this.g = date.getTime();
    }

    public int x() {
        return this.i;
    }

    public void f(int n2) {
        this.i = n2;
    }

    public int y() {
        return this.j;
    }

    public void g(int n2) {
        this.j = n2;
    }
}


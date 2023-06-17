/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.b;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.apache.a.ag;
import org.apache.a.c.b.f;
import org.apache.a.c.b.i;
import org.apache.a.h.a;
import org.apache.a.h.b;
import org.apache.a.h.d;
import org.apache.a.h.g;
import org.apache.a.h.k;
import org.apache.a.h.l;
import org.apache.a.h.m;
import org.apache.a.n;

public class e {
    private String a;
    private byte[] b;
    private InputStream c;
    private List d;
    private Serializable e;
    private File f;
    private g g;
    private String h;
    private boolean i;
    private boolean j;

    e() {
    }

    public static e a() {
        return new e();
    }

    private void o() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public String b() {
        return this.a;
    }

    public e a(String string) {
        this.o();
        this.a = string;
        return this;
    }

    public byte[] c() {
        return this.b;
    }

    public e a(byte[] arrby) {
        this.o();
        this.b = arrby;
        return this;
    }

    public InputStream d() {
        return this.c;
    }

    public e a(InputStream inputStream) {
        this.o();
        this.c = inputStream;
        return this;
    }

    public List e() {
        return this.d;
    }

    public e a(List list) {
        this.o();
        this.d = list;
        return this;
    }

    public e a(ag ... arrag) {
        return this.a(Arrays.asList(arrag));
    }

    public Serializable f() {
        return this.e;
    }

    public e a(Serializable serializable) {
        this.o();
        this.e = serializable;
        return this;
    }

    public File g() {
        return this.f;
    }

    public e a(File file) {
        this.o();
        this.f = file;
        return this;
    }

    public g h() {
        return this.g;
    }

    public e a(g g2) {
        this.g = g2;
        return this;
    }

    public String i() {
        return this.h;
    }

    public e b(String string) {
        this.h = string;
        return this;
    }

    public boolean j() {
        return this.i;
    }

    public e k() {
        this.i = true;
        return this;
    }

    public boolean l() {
        return this.j;
    }

    public e m() {
        this.j = true;
        return this;
    }

    private g b(g g2) {
        return this.g != null ? this.g : g2;
    }

    public n n() {
        a a2;
        if (this.a != null) {
            a2 = new m(this.a, this.b(org.apache.a.h.g.m));
        } else if (this.b != null) {
            a2 = new d(this.b, this.b(org.apache.a.h.g.n));
        } else if (this.c != null) {
            a2 = new k(this.c, 1L, this.b(org.apache.a.h.g.n));
        } else if (this.d != null) {
            a2 = new i((Iterable)this.d, this.g != null ? this.g.b() : null);
        } else if (this.e != null) {
            a2 = new l(this.e);
            a2.a(org.apache.a.h.g.n.toString());
        } else {
            a2 = this.f != null ? new org.apache.a.h.i(this.f, this.b(org.apache.a.h.g.n)) : new b();
        }
        if (a2.d() != null && this.g != null) {
            a2.a(this.g.toString());
        }
        a2.b(this.h);
        a2.a(this.i);
        if (this.j) {
            return new f(a2);
        }
        return a2;
    }
}


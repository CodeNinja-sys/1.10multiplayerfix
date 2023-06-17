/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.n.c;
import org.apache.a.n.k;
import org.apache.a.n.v;
import org.apache.a.w;
import org.apache.a.z;

public class l {
    private c a;
    private c b;

    public static l a() {
        return new l();
    }

    l() {
    }

    private c c() {
        if (this.a == null) {
            this.a = new c();
        }
        return this.a;
    }

    private c d() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public l a(w w2) {
        if (w2 == null) {
            return this;
        }
        this.c().a((Object)w2);
        return this;
    }

    public l b(w w2) {
        if (w2 == null) {
            return this;
        }
        this.c().b((Object)w2);
        return this;
    }

    public l c(w w2) {
        return this.b(w2);
    }

    public l a(w ... arrw) {
        if (arrw == null) {
            return this;
        }
        this.c().a(arrw);
        return this;
    }

    public l b(w ... arrw) {
        if (arrw == null) {
            return this;
        }
        this.c().b(arrw);
        return this;
    }

    public l c(w ... arrw) {
        return this.b(arrw);
    }

    public l a(z z2) {
        if (z2 == null) {
            return this;
        }
        this.d().a((Object)z2);
        return this;
    }

    public l b(z z2) {
        if (z2 == null) {
            return this;
        }
        this.d().b((Object)z2);
        return this;
    }

    public l c(z z2) {
        return this.b(z2);
    }

    public l a(z ... arrz) {
        if (arrz == null) {
            return this;
        }
        this.d().a(arrz);
        return this;
    }

    public l b(z ... arrz) {
        if (arrz == null) {
            return this;
        }
        this.d().b(arrz);
        return this;
    }

    public l c(z ... arrz) {
        return this.b(arrz);
    }

    public k b() {
        return new v(this.a != null ? this.a.a() : null, this.b != null ? this.b.a() : null);
    }
}


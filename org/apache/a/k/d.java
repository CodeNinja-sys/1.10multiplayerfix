/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.util.NoSuchElementException;
import org.apache.a.e;
import org.apache.a.f;
import org.apache.a.h;
import org.apache.a.i;
import org.apache.a.k.g;
import org.apache.a.k.u;
import org.apache.a.k.x;
import org.apache.a.o.a;

public class d
implements h {
    private final i a;
    private final u b;
    private org.apache.a.g c = null;
    private org.apache.a.o.d d = null;
    private x e = null;

    public d(i i2, u u2) {
        this.a = (i)org.apache.a.o.a.a(i2, "Header iterator");
        this.b = (u)org.apache.a.o.a.a(u2, "Parser");
    }

    public d(i i2) {
        this(i2, g.b);
    }

    private void b() {
        this.e = null;
        this.d = null;
        while (this.a.hasNext()) {
            f f2 = this.a.a();
            if (f2 instanceof e) {
                this.d = ((e)f2).a();
                this.e = new x(0, this.d.e());
                this.e.a(((e)f2).b());
                break;
            }
            String string = f2.d();
            if (string == null) continue;
            this.d = new org.apache.a.o.d(string.length());
            this.d.a(string);
            this.e = new x(0, this.d.e());
            break;
        }
    }

    private void c() {
        while (this.a.hasNext() || this.e != null) {
            if (this.e == null || this.e.d()) {
                this.b();
            }
            if (this.e == null) continue;
            while (!this.e.d()) {
                org.apache.a.g g2 = this.b.b(this.d, this.e);
                if (g2.a().length() == 0 && g2.b() == null) continue;
                this.c = g2;
                return;
            }
            if (!this.e.d()) continue;
            this.e = null;
            this.d = null;
        }
    }

    public boolean hasNext() {
        if (this.c == null) {
            this.c();
        }
        return this.c != null;
    }

    public org.apache.a.g a() {
        if (this.c == null) {
            this.c();
        }
        if (this.c == null) {
            throw new NoSuchElementException("No more header elements available");
        }
        org.apache.a.g g2 = this.c;
        this.c = null;
        return g2;
    }

    public final Object next() {
        return this.a();
    }

    public void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}


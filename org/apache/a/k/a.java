/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import org.apache.a.f;
import org.apache.a.i;
import org.apache.a.k.b;
import org.apache.a.k.s;
import org.apache.a.l.j;
import org.apache.a.t;

public abstract class a
implements t {
    protected s b = new s();
    protected j c;

    protected a(j j2) {
        this.c = j2;
    }

    protected a() {
        this(null);
    }

    public boolean a(String string) {
        return this.b.e(string);
    }

    public f[] b(String string) {
        return this.b.b(string);
    }

    public f c(String string) {
        return this.b.c(string);
    }

    public f d(String string) {
        return this.b.d(string);
    }

    public f[] cJ_() {
        return this.b.b();
    }

    public void a(f f2) {
        this.b.a(f2);
    }

    public void a(String string, String string2) {
        org.apache.a.o.a.a((Object)string, "Header name");
        this.b.a(new b(string, string2));
    }

    public void b(f f2) {
        this.b.c(f2);
    }

    public void b(String string, String string2) {
        org.apache.a.o.a.a((Object)string, "Header name");
        this.b.c(new b(string, string2));
    }

    public void a(f[] arrf) {
        this.b.a(arrf);
    }

    public void c(f f2) {
        this.b.b(f2);
    }

    public void e(String string) {
        if (string == null) {
            return;
        }
        i i2 = this.b.c();
        while (i2.hasNext()) {
            f f2 = i2.a();
            if (!string.equalsIgnoreCase(f2.c())) continue;
            i2.remove();
        }
    }

    public i e() {
        return this.b.c();
    }

    public i f(String string) {
        return this.b.f(string);
    }

    public j f() {
        if (this.c == null) {
            this.c = new org.apache.a.l.b();
        }
        return this.c;
    }

    public void a(j j2) {
        this.c = (j)org.apache.a.o.a.a(j2, "HTTP parameters");
    }
}


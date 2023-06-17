/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.nio.charset.Charset;
import org.apache.a.b.m;
import org.apache.a.b.o;
import org.apache.a.c;
import org.apache.a.f;
import org.apache.a.i.a.ac;
import org.apache.a.k.r;
import org.apache.a.n.a;
import org.apache.a.n.g;
import org.apache.a.u;
import org.apache.commons.a.a.d;

public class b
extends ac {
    private final d a = new d(0);
    private boolean b;

    public b(Charset charset) {
        super(charset);
        this.b = false;
    }

    public b(m m2) {
        super(m2);
    }

    public b() {
        this(c.f);
    }

    public String a() {
        return "basic";
    }

    public void a(f f2) {
        super.a(f2);
        this.b = true;
    }

    public boolean d() {
        return this.b;
    }

    public boolean c() {
        return false;
    }

    public f a(o o2, u u2) {
        return this.a(o2, u2, new a());
    }

    public f a(o o2, u u2, g g2) {
        org.apache.a.o.a.a(o2, "Credentials");
        org.apache.a.o.a.a(u2, "HTTP request");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o2.a().getName());
        stringBuilder.append(":");
        stringBuilder.append(o2.b() == null ? "null" : o2.b());
        byte[] arrby = this.a.b(org.apache.a.o.f.a(stringBuilder.toString(), this.a(u2)));
        org.apache.a.o.d d2 = new org.apache.a.o.d(32);
        if (this.e()) {
            d2.a("Proxy-Authorization");
        } else {
            d2.a("Authorization");
        }
        d2.a(": Basic ");
        d2.a(arrby, 0, arrby.length);
        return new r(d2);
    }

    public static f a(o o2, String string, boolean bl2) {
        org.apache.a.o.a.a(o2, "Credentials");
        org.apache.a.o.a.a((Object)string, "charset");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(o2.a().getName());
        stringBuilder.append(":");
        stringBuilder.append(o2.b() == null ? "null" : o2.b());
        byte[] arrby = d.a(org.apache.a.o.f.a(stringBuilder.toString(), string), false);
        org.apache.a.o.d d2 = new org.apache.a.o.d(32);
        if (bl2) {
            d2.a("Proxy-Authorization");
        } else {
            d2.a("Authorization");
        }
        d2.a(": Basic ");
        d2.a(arrby, 0, arrby.length);
        return new r(d2);
    }
}


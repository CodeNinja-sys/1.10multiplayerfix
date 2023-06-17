/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.util.Locale;
import org.apache.a.b.m;
import org.apache.a.b.n;
import org.apache.a.b.o;
import org.apache.a.b.q;
import org.apache.a.e;
import org.apache.a.f;
import org.apache.a.n.g;
import org.apache.a.o.d;
import org.apache.a.u;

public abstract class a
implements n {
    private m a;

    public a(m m2) {
        this.a = m2;
    }

    public a() {
    }

    public void a(f f2) {
        int n2;
        d d2;
        org.apache.a.o.a.a(f2, "Header");
        String string = f2.c();
        if (string.equalsIgnoreCase("WWW-Authenticate")) {
            this.a = m.a;
        } else if (string.equalsIgnoreCase("Proxy-Authenticate")) {
            this.a = m.b;
        } else {
            throw new q("Unexpected header name: " + string);
        }
        if (f2 instanceof e) {
            d2 = ((e)f2).a();
            n2 = ((e)f2).b();
        } else {
            String string2 = f2.d();
            if (string2 == null) {
                throw new q("Header value is null");
            }
            d2 = new d(string2.length());
            d2.a(string2);
            n2 = 0;
        }
        while (n2 < d2.e() && org.apache.a.n.f.a(d2.a(n2))) {
            ++n2;
        }
        int n3 = n2;
        while (n2 < d2.e() && !org.apache.a.n.f.a(d2.a(n2))) {
            ++n2;
        }
        int n4 = n2;
        String string3 = d2.a(n3, n4);
        if (!string3.equalsIgnoreCase(this.a())) {
            throw new q("Invalid scheme identifier: " + string3);
        }
        this.a(d2, n2, d2.e());
    }

    public f a(o o2, u u2, g g2) {
        return this.a(o2, u2);
    }

    protected abstract void a(d var1, int var2, int var3);

    public boolean e() {
        return this.a != null && this.a == m.b;
    }

    public m f() {
        return this.a;
    }

    public String toString() {
        String string = this.a();
        if (string != null) {
            return string.toUpperCase(Locale.US);
        }
        return super.toString();
    }
}


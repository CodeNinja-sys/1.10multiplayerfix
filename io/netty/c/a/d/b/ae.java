/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d.b.ac;
import io.netty.c.a.d.b.ad;
import io.netty.c.a.d.b.d;
import io.netty.util.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

final class ae
extends a
implements ac {
    private final List a = new ArrayList();
    private final Charset b;
    private int c;

    ae(Charset charset) {
        this.b = charset;
    }

    @Override
    public ad y() {
        return ad.c;
    }

    public void a(String string) {
        if (string == null) {
            throw new NullPointerException("value");
        }
        g g2 = bi.a(string, this.b);
        this.a.add(g2);
        this.c += g2.r();
    }

    public void a(String string, int n2) {
        if (string == null) {
            throw new NullPointerException("value");
        }
        g g2 = bi.a(string, this.b);
        this.a.add(n2, g2);
        this.c += g2.r();
    }

    public void b(String string, int n2) {
        if (string == null) {
            throw new NullPointerException("value");
        }
        g g2 = bi.a(string, this.b);
        g g3 = this.a.set(n2, g2);
        if (g3 != null) {
            this.c -= g3.r();
            g3.ad();
        }
        this.c += g2.r();
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
        if (!(ac2 instanceof ae)) {
            throw new ClassCastException("Cannot compare " + (Object)((Object)this.y()) + " with " + (Object)((Object)ac2.y()));
        }
        return this.a((ae)ac2);
    }

    public int a(ae ae2) {
        return this.p().compareToIgnoreCase(ae2.p());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (g g2 : this.a) {
            stringBuilder.append(g2.a(this.b));
        }
        return stringBuilder.toString();
    }

    public int a() {
        return this.c;
    }

    public g b() {
        return bi.c().a(this.a).Y(this.a()).X(0);
    }

    @Override
    public String p() {
        return "InternalAttribute";
    }

    @Override
    protected void d() {
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((ac)object);
    }
}


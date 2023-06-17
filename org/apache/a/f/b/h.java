/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.b;

import java.net.InetAddress;
import org.apache.a.f.b.b;
import org.apache.a.f.b.e;
import org.apache.a.f.b.f;
import org.apache.a.f.b.g;
import org.apache.a.o.a;
import org.apache.a.o.i;
import org.apache.a.r;

public final class h
implements Cloneable,
e {
    private final r a;
    private final InetAddress b;
    private boolean c;
    private r[] d;
    private g e;
    private f f;
    private boolean g;

    public h(r r2, InetAddress inetAddress) {
        org.apache.a.o.a.a(r2, "Target host");
        this.a = r2;
        this.b = inetAddress;
        this.e = org.apache.a.f.b.g.a;
        this.f = org.apache.a.f.b.f.a;
    }

    public void c() {
        this.c = false;
        this.d = null;
        this.e = org.apache.a.f.b.g.a;
        this.f = org.apache.a.f.b.f.a;
        this.g = false;
    }

    public h(b b2) {
        this(b2.a(), b2.b());
    }

    public final void a(boolean bl2) {
        org.apache.a.o.b.a(!this.c, "Already connected");
        this.c = true;
        this.g = bl2;
    }

    public final void a(r r2, boolean bl2) {
        org.apache.a.o.a.a(r2, "Proxy host");
        org.apache.a.o.b.a(!this.c, "Already connected");
        this.c = true;
        this.d = new r[]{r2};
        this.g = bl2;
    }

    public final void b(boolean bl2) {
        org.apache.a.o.b.a(this.c, "No tunnel unless connected");
        org.apache.a.o.b.a(this.d, "No tunnel without proxy");
        this.e = org.apache.a.f.b.g.b;
        this.g = bl2;
    }

    public final void b(r r2, boolean bl2) {
        org.apache.a.o.a.a(r2, "Proxy host");
        org.apache.a.o.b.a(this.c, "No tunnel unless connected");
        org.apache.a.o.b.a(this.d, "No tunnel without proxy");
        r[] arrr = new r[this.d.length + 1];
        System.arraycopy(this.d, 0, arrr, 0, this.d.length);
        arrr[arrr.length - 1] = r2;
        this.d = arrr;
        this.g = bl2;
    }

    public final void c(boolean bl2) {
        org.apache.a.o.b.a(this.c, "No layered protocol unless connected");
        this.f = org.apache.a.f.b.f.b;
        this.g = bl2;
    }

    public final r a() {
        return this.a;
    }

    public final InetAddress b() {
        return this.b;
    }

    public final int d() {
        int n2 = 0;
        if (this.c) {
            n2 = this.d == null ? 1 : this.d.length + 1;
        }
        return n2;
    }

    public final r a(int n2) {
        org.apache.a.o.a.b(n2, "Hop index");
        int n3 = this.d();
        org.apache.a.o.a.a(n2 < n3, "Hop index exceeds tracked route length");
        r r2 = null;
        r2 = n2 < n3 - 1 ? this.d[n2] : this.a;
        return r2;
    }

    public final r e() {
        return this.d == null ? null : this.d[0];
    }

    public final boolean k() {
        return this.c;
    }

    public final g f() {
        return this.e;
    }

    public final boolean g() {
        return this.e == org.apache.a.f.b.g.b;
    }

    public final f h() {
        return this.f;
    }

    public final boolean i() {
        return this.f == org.apache.a.f.b.f.b;
    }

    public final boolean j() {
        return this.g;
    }

    public final b l() {
        return !this.c ? null : new b(this.a, this.b, this.d, this.g, this.e, this.f);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        h h2 = (h)object;
        return this.c == h2.c && this.g == h2.g && this.e == h2.e && this.f == h2.f && i.a(this.a, (Object)h2.a) && i.a(this.b, (Object)h2.b) && i.a(this.d, h2.d);
    }

    public final int hashCode() {
        int n2 = 17;
        n2 = i.a(n2, (Object)this.a);
        n2 = i.a(n2, (Object)this.b);
        if (this.d != null) {
            for (r r2 : this.d) {
                n2 = i.a(n2, (Object)r2);
            }
        }
        n2 = i.a(n2, this.c);
        n2 = i.a(n2, this.g);
        n2 = i.a(n2, (Object)this.e);
        n2 = i.a(n2, (Object)this.f);
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(50 + this.d() * 30);
        stringBuilder.append("RouteTracker[");
        if (this.b != null) {
            stringBuilder.append(this.b);
            stringBuilder.append("->");
        }
        stringBuilder.append('{');
        if (this.c) {
            stringBuilder.append('c');
        }
        if (this.e == org.apache.a.f.b.g.b) {
            stringBuilder.append('t');
        }
        if (this.f == org.apache.a.f.b.f.b) {
            stringBuilder.append('l');
        }
        if (this.g) {
            stringBuilder.append('s');
        }
        stringBuilder.append("}->");
        if (this.d != null) {
            for (r r2 : this.d) {
                stringBuilder.append(r2);
                stringBuilder.append("->");
            }
        }
        stringBuilder.append(this.a);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }
}


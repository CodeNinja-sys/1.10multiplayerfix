/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.b;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.a.f.b.e;
import org.apache.a.f.b.f;
import org.apache.a.f.b.g;
import org.apache.a.o.a;
import org.apache.a.o.i;
import org.apache.a.r;

public final class b
implements Cloneable,
e {
    private final r a;
    private final InetAddress b;
    private final List c;
    private final g d;
    private final f e;
    private final boolean f;

    private b(r r2, InetAddress inetAddress, List list, boolean bl2, g g2, f f2) {
        org.apache.a.o.a.a(r2, "Target host");
        this.a = r2;
        this.b = inetAddress;
        this.c = list != null && !list.isEmpty() ? new ArrayList(list) : null;
        if (g2 == g.b) {
            org.apache.a.o.a.a(this.c != null, "Proxy required if tunnelled");
        }
        this.f = bl2;
        this.d = g2 != null ? g2 : g.a;
        this.e = f2 != null ? f2 : org.apache.a.f.b.f.a;
    }

    public b(r r2, InetAddress inetAddress, r[] arrr, boolean bl2, g g2, f f2) {
        this(r2, inetAddress, arrr != null ? Arrays.asList(arrr) : null, bl2, g2, f2);
    }

    public b(r r2, InetAddress inetAddress, r r3, boolean bl2, g g2, f f2) {
        this(r2, inetAddress, r3 != null ? Collections.singletonList(r3) : null, bl2, g2, f2);
    }

    public b(r r2, InetAddress inetAddress, boolean bl2) {
        this(r2, inetAddress, Collections.emptyList(), bl2, g.a, org.apache.a.f.b.f.a);
    }

    public b(r r2) {
        this(r2, null, Collections.emptyList(), false, g.a, org.apache.a.f.b.f.a);
    }

    public b(r r2, InetAddress inetAddress, r r3, boolean bl2) {
        this(r2, inetAddress, Collections.singletonList(org.apache.a.o.a.a(r3, "Proxy host")), bl2, bl2 ? g.b : g.a, bl2 ? org.apache.a.f.b.f.b : org.apache.a.f.b.f.a);
    }

    public b(r r2, r r3) {
        this(r2, null, r3, false);
    }

    public final r a() {
        return this.a;
    }

    public final InetAddress b() {
        return this.b;
    }

    public final InetSocketAddress c() {
        return this.b != null ? new InetSocketAddress(this.b, 0) : null;
    }

    public final int d() {
        return this.c != null ? this.c.size() + 1 : 1;
    }

    public final r a(int n2) {
        org.apache.a.o.a.b(n2, "Hop index");
        int n3 = this.d();
        org.apache.a.o.a.a(n2 < n3, "Hop index exceeds tracked route length");
        if (n2 < n3 - 1) {
            return (r)this.c.get(n2);
        }
        return this.a;
    }

    public final r e() {
        return this.c != null && !this.c.isEmpty() ? (r)this.c.get(0) : null;
    }

    public final g f() {
        return this.d;
    }

    public final boolean g() {
        return this.d == g.b;
    }

    public final f h() {
        return this.e;
    }

    public final boolean i() {
        return this.e == org.apache.a.f.b.f.b;
    }

    public final boolean j() {
        return this.f;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof b) {
            b b2 = (b)object;
            return this.f == b2.f && this.d == b2.d && this.e == b2.e && i.a(this.a, (Object)b2.a) && i.a(this.b, (Object)b2.b) && i.a(this.c, (Object)b2.c);
        }
        return false;
    }

    public final int hashCode() {
        int n2 = 17;
        n2 = i.a(n2, (Object)this.a);
        n2 = i.a(n2, (Object)this.b);
        if (this.c != null) {
            for (r r2 : this.c) {
                n2 = i.a(n2, (Object)r2);
            }
        }
        n2 = i.a(n2, this.f);
        n2 = i.a(n2, (Object)this.d);
        n2 = i.a(n2, (Object)this.e);
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(50 + this.d() * 30);
        if (this.b != null) {
            stringBuilder.append(this.b);
            stringBuilder.append("->");
        }
        stringBuilder.append('{');
        if (this.d == g.b) {
            stringBuilder.append('t');
        }
        if (this.e == org.apache.a.f.b.f.b) {
            stringBuilder.append('l');
        }
        if (this.f) {
            stringBuilder.append('s');
        }
        stringBuilder.append("}->");
        if (this.c != null) {
            for (r r2 : this.c) {
                stringBuilder.append(r2);
                stringBuilder.append("->");
            }
        }
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }
}


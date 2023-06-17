/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.a;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.a.c.a.d;
import org.apache.a.r;

public class c
implements Cloneable {
    public static final c a = new d().a();
    private final boolean b;
    private final r c;
    private final InetAddress d;
    private final boolean e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final boolean k;
    private final Collection l;
    private final Collection m;
    private final int n;
    private final int o;
    private final int p;

    c(boolean bl2, r r2, InetAddress inetAddress, boolean bl3, String string, boolean bl4, boolean bl5, boolean bl6, int n2, boolean bl7, Collection collection, Collection collection2, int n3, int n4, int n5) {
        this.b = bl2;
        this.c = r2;
        this.d = inetAddress;
        this.e = bl3;
        this.f = string;
        this.g = bl4;
        this.h = bl5;
        this.i = bl6;
        this.j = n2;
        this.k = bl7;
        this.l = collection;
        this.m = collection2;
        this.n = n3;
        this.o = n4;
        this.p = n5;
    }

    public boolean a() {
        return this.b;
    }

    public r b() {
        return this.c;
    }

    public InetAddress c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return this.i;
    }

    public int i() {
        return this.j;
    }

    public boolean j() {
        return this.k;
    }

    public Collection k() {
        return this.l;
    }

    public Collection l() {
        return this.m;
    }

    public int m() {
        return this.n;
    }

    public int n() {
        return this.o;
    }

    public int o() {
        return this.p;
    }

    protected c p() {
        return (c)super.clone();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(", expectContinueEnabled=").append(this.b);
        stringBuilder.append(", proxy=").append(this.c);
        stringBuilder.append(", localAddress=").append(this.d);
        stringBuilder.append(", staleConnectionCheckEnabled=").append(this.e);
        stringBuilder.append(", cookieSpec=").append(this.f);
        stringBuilder.append(", redirectsEnabled=").append(this.g);
        stringBuilder.append(", relativeRedirectsAllowed=").append(this.h);
        stringBuilder.append(", maxRedirects=").append(this.j);
        stringBuilder.append(", circularRedirectsAllowed=").append(this.i);
        stringBuilder.append(", authenticationEnabled=").append(this.k);
        stringBuilder.append(", targetPreferredAuthSchemes=").append(this.l);
        stringBuilder.append(", proxyPreferredAuthSchemes=").append(this.m);
        stringBuilder.append(", connectionRequestTimeout=").append(this.n);
        stringBuilder.append(", connectTimeout=").append(this.o);
        stringBuilder.append(", socketTimeout=").append(this.p);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static d q() {
        return new d();
    }

    public static d a(c c2) {
        return new d().a(c2.a()).a(c2.b()).a(c2.c()).b(c2.d()).a(c2.e()).c(c2.f()).d(c2.g()).e(c2.h()).a(c2.i()).f(c2.j()).a(c2.k()).b(c2.l()).b(c2.m()).c(c2.n()).d(c2.o());
    }

    protected /* synthetic */ Object clone() {
        return this.p();
    }
}


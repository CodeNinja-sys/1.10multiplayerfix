/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.e;

import org.apache.a.e.i;
import org.apache.a.o.a;

public class h
implements Cloneable {
    public static final h a = new i().a();
    private final int b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final boolean f;

    h(int n2, boolean bl2, int n3, boolean bl3, boolean bl4) {
        this.b = n2;
        this.c = bl2;
        this.d = n3;
        this.e = bl3;
        this.f = bl4;
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    protected h f() {
        return (h)super.clone();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[soTimeout=").append(this.b).append(", soReuseAddress=").append(this.c).append(", soLinger=").append(this.d).append(", soKeepAlive=").append(this.e).append(", tcpNoDelay=").append(this.f).append("]");
        return stringBuilder.toString();
    }

    public static i g() {
        return new i();
    }

    public static i a(h h2) {
        org.apache.a.o.a.a(h2, "Socket config");
        return new i().a(h2.a()).a(h2.b()).b(h2.c()).b(h2.d()).c(h2.e());
    }

    protected /* synthetic */ Object clone() {
        return this.f();
    }
}


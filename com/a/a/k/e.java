/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.k;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.k.d;
import java.net.Inet4Address;

public final class e {
    private final Inet4Address a;
    private final Inet4Address b;
    private final int c;
    private final int d;

    public e(Inet4Address inet4Address, Inet4Address inet4Address2, int n2, int n3) {
        cl.a(n2 >= 0 && n2 <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", new Object[]{n2});
        cl.a(n3 >= 0 && n3 <= 65535, "flags '%s' is out of range (0 <= flags <= 0xffff)", new Object[]{n3});
        this.a = (Inet4Address)cc.b(inet4Address, com.a.a.k.d.a());
        this.b = (Inet4Address)cc.b(inet4Address2, com.a.a.k.d.a());
        this.c = n2;
        this.d = n3;
    }

    public Inet4Address a() {
        return this.a;
    }

    public Inet4Address b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }
}


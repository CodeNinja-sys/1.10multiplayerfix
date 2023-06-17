/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import net.minecraft.q.a.d;
import net.minecraft.q.am;
import net.minecraft.u.bw;
import net.minecraft.u.d.b.a;

public class x
implements Comparable {
    private final String a;
    private final String b;
    private final long c;
    private final long d;
    private final boolean e;
    private final am f;
    private final boolean g;
    private final boolean h;
    private final String i;
    private final int j;
    private final boolean k;

    public x(d d2, String string, String string2, long l2, boolean bl2) {
        this.a = string;
        this.b = string2;
        this.c = d2.k();
        this.d = l2;
        this.f = d2.q();
        this.e = bl2;
        this.g = d2.s();
        this.h = d2.v();
        this.i = d2.L();
        this.j = d2.J();
        this.k = d2.K();
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public long e() {
        return this.c;
    }

    public int a(x x2) {
        return this.c < x2.c ? 1 : (this.c > x2.c ? -1 : this.a.compareTo(x2.a));
    }

    public am f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public String i() {
        return bw.b(this.i) ? net.minecraft.u.d.b.a.a("selectWorld.versionUnknown") : this.i;
    }

    public boolean j() {
        return this.k();
    }

    public boolean k() {
        return this.j > 510;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((x)object);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.q.ab;
import net.minecraft.q.am;
import net.minecraft.q.l;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bg
implements p {
    private int a;
    private boolean b;
    private am c;
    private int d;
    private l e;
    private int f;
    private ab g;
    private boolean h;

    public bg() {
    }

    public bg(int n2, am am2, boolean bl2, int n3, l l2, int n4, ab ab2, boolean bl3) {
        this.a = n2;
        this.d = n3;
        this.e = l2;
        this.c = am2;
        this.f = n4;
        this.b = bl2;
        this.g = ab2;
        this.h = bl3;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.K();
        int n2 = a2.F();
        this.b = (n2 & 8) == 8;
        this.c = am.a(n2 &= 0xFFFFFFF7);
        this.d = a2.K();
        this.e = l.a(a2.F());
        this.f = a2.F();
        this.g = ab.a(a2.e(16));
        if (this.g == null) {
            this.g = ab.b;
        }
        this.h = a2.D();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.E(this.a);
        int n2 = this.c.a();
        if (this.b) {
            n2 |= 8;
        }
        a2.B(n2);
        a2.E(this.d);
        a2.B(this.e.a());
        a2.B(this.f);
        a2.a(this.g.a());
        a2.a(this.h);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public am c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public l e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public ab g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }
}


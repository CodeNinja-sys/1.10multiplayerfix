/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.b.cm;
import com.a.a.b.cn;
import net.minecraft.a.p;
import net.minecraft.g.c.a.i;
import net.minecraft.g.hi;
import net.minecraft.g.t;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.f;
import net.minecraft.w.n;

public class bn
extends bm {
    private static final cm b = i.a(p.H).a(hi.a, cn.a((Object)t.b));
    private final f c;
    private final k d;
    int a;

    public bn(f f2) {
        this.c = f2;
        this.d = f2.aQ;
        this.b(7);
    }

    @Override
    public boolean e() {
        if (this.c.bd().nextInt(this.c.ba() ? 50 : 1000) != 0) {
            return false;
        }
        b b2 = new b(this.c.aU, this.c.aV, this.c.aW);
        return b.a(this.d.n(b2)) ? true : this.d.n(b2.c()).c() == p.c;
    }

    @Override
    public void b() {
        this.a = 40;
        this.d.a((n)this.c, (byte)10);
        this.c.N().m();
    }

    @Override
    public void c() {
        this.a = 0;
    }

    @Override
    public boolean a() {
        return this.a > 0;
    }

    public int f() {
        return this.a;
    }

    @Override
    public void d() {
        this.a = Math.max(0, this.a - 1);
        if (this.a == 4) {
            b b2 = new b(this.c.aU, this.c.aV, this.c.aW);
            if (b.a(this.d.n(b2))) {
                if (this.d.G().b("mobGriefing")) {
                    this.d.b(b2, false);
                }
                this.c.Z();
            } else {
                b b3 = b2.c();
                if (this.d.n(b3).c() == p.c) {
                    if (this.d.G().b("mobGriefing")) {
                        this.d.b(2001, b3, net.minecraft.g.cn.c(p.c));
                        this.d.a(b3, p.d.v(), 2);
                    }
                    this.c.Z();
                }
            }
        }
    }
}


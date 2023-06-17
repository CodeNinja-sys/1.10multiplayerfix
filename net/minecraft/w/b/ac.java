/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.g.cn;
import net.minecraft.g.ga;
import net.minecraft.q.l;
import net.minecraft.w.b.q;
import net.minecraft.w.f;

public class ac
extends q {
    private int a;
    private int b = -1;

    public ac(f f2) {
        super(f2);
    }

    @Override
    public boolean e() {
        if (!super.e()) {
            return false;
        }
        if (!this.c.aQ.G().b("mobGriefing")) {
            return false;
        }
        ga ga2 = this.e;
        return !ga.d(this.c.aQ, this.d);
    }

    @Override
    public void b() {
        super.b();
        this.a = 0;
    }

    @Override
    public boolean a() {
        double d2 = this.c.c(this.d);
        if (this.a <= 240) {
            ga ga2 = this.e;
            if (!ga.d(this.c.aQ, this.d) && d2 < 4.0) {
                boolean bl2 = true;
                return bl2;
            }
        }
        boolean bl3 = false;
        return bl3;
    }

    @Override
    public void c() {
        super.c();
        this.c.aQ.c(this.c.ca(), this.d, -1);
    }

    @Override
    public void d() {
        super.d();
        if (this.c.bd().nextInt(20) == 0) {
            this.c.aQ.b(1019, this.d, 0);
        }
        ++this.a;
        int n2 = (int)((float)this.a / 240.0f * 10.0f);
        if (n2 != this.b) {
            this.c.aQ.c(this.c.ca(), this.d, n2);
            this.b = n2;
        }
        if (this.a == 240 && this.c.aQ.R() == l.d) {
            this.c.aQ.f(this.d);
            this.c.aQ.b(1021, this.d, 0);
            this.c.aQ.b(2001, this.d, cn.c(this.e));
        }
    }
}


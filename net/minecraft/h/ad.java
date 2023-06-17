/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.b.d;
import net.minecraft.h.v;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;
import net.minecraft.w.a.b;
import net.minecraft.w.aj;

public class ad
implements y {
    private final aj a;
    private final cu[] b = new cu[3];
    private final b c;
    private net.minecraft.b.b d;
    private int e;

    public ad(b b2, aj aj2) {
        this.c = b2;
        this.a = aj2;
    }

    @Override
    public int e() {
        return this.b.length;
    }

    @Override
    public cu a(int n2) {
        return this.b[n2];
    }

    @Override
    public cu a(int n2, int n3) {
        if (n2 == 2 && this.b[n2] != null) {
            return v.a(this.b, n2, this.b[n2].b);
        }
        cu cu2 = v.a(this.b, n2, n3);
        if (cu2 != null && this.e(n2)) {
            this.a();
        }
        return cu2;
    }

    private boolean e(int n2) {
        return n2 == 0 || n2 == 1;
    }

    @Override
    public cu b(int n2) {
        return v.a(this.b, n2);
    }

    @Override
    public void a(int n2, cu cu2) {
        this.b[n2] = cu2;
        if (cu2 != null && cu2.b > this.g()) {
            cu2.b = this.g();
        }
        if (this.e(n2)) {
            this.a();
        }
    }

    @Override
    public String X() {
        return "mob.villager";
    }

    @Override
    public boolean bO_() {
        return false;
    }

    @Override
    public a aK() {
        return this.bO_() ? new k(this.X()) : new l(this.X(), new Object[0]);
    }

    @Override
    public int g() {
        return 64;
    }

    @Override
    public boolean a_(b b2) {
        return this.a.s() == b2;
    }

    @Override
    public void b(b b2) {
    }

    @Override
    public void c(b b2) {
    }

    @Override
    public boolean b(int n2, cu cu2) {
        return true;
    }

    @Override
    public void C() {
        this.a();
    }

    public void a() {
        this.d = null;
        cu cu2 = this.b[0];
        cu cu3 = this.b[1];
        if (cu2 == null) {
            cu2 = cu3;
            cu3 = null;
        }
        if (cu2 == null) {
            this.a(2, null);
        } else {
            d d2 = this.a.b(this.c);
            if (d2 != null) {
                net.minecraft.b.b b2 = d2.a(cu2, cu3, this.e);
                if (b2 != null && !b2.h()) {
                    this.d = b2;
                    this.a(2, b2.d().j());
                } else if (cu3 != null) {
                    b2 = d2.a(cu3, cu2, this.e);
                    if (b2 != null && !b2.h()) {
                        this.d = b2;
                        this.a(2, b2.d().j());
                    } else {
                        this.a(2, null);
                    }
                } else {
                    this.a(2, null);
                }
            }
        }
        this.a.a(this.a(2));
    }

    public net.minecraft.b.b c() {
        return this.d;
    }

    public void d(int n2) {
        this.e = n2;
        this.a();
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public void j() {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = null;
        }
    }
}


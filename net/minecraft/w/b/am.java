/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.u.b.s;
import net.minecraft.w.a.b;
import net.minecraft.w.b.af;
import net.minecraft.w.b.bm;
import net.minecraft.w.h.al;
import net.minecraft.w.n;

public class am
extends bm {
    private final al a;
    private final double b;
    private double c;
    private double d;
    private double e;

    public am(al al2, double d2) {
        this.a = al2;
        this.b = d2;
        this.b(1);
    }

    @Override
    public boolean e() {
        if (!this.a.s() && this.a.cA()) {
            s s2 = af.a(this.a, 5, 4);
            if (s2 == null) {
                return false;
            }
            this.c = s2.b;
            this.d = s2.c;
            this.e = s2.d;
            return true;
        }
        return false;
    }

    @Override
    public void b() {
        this.a.N().a(this.c, this.d, this.e, this.b);
    }

    @Override
    public boolean a() {
        return !this.a.N().l() && this.a.cA();
    }

    @Override
    public void d() {
        if (this.a.bd().nextInt(50) == 0) {
            n n2 = (n)this.a.db().get(0);
            if (n2 == null) {
                return;
            }
            if (n2 instanceof b) {
                int n3 = this.a.dv();
                int n4 = this.a.dB();
                if (n4 > 0 && this.a.bd().nextInt(n4) < n3) {
                    this.a.f((b)n2);
                    this.a.aQ.a((n)this.a, (byte)7);
                    return;
                }
                this.a.o(5);
            }
            this.a.ct();
            this.a.dG();
            this.a.aQ.a((n)this.a, (byte)6);
        }
    }
}


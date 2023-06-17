/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.a.aa;
import net.minecraft.h.k;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;

public class r
extends j {
    protected r(q q2, ae ae2, k ... arrk) {
        super(q2, ae2, arrk);
        if (ae2 == ae.h) {
            this.b("lootBonusDigger");
        } else if (ae2 == ae.i) {
            this.b("lootBonusFishing");
        } else {
            this.b("lootBonus");
        }
    }

    @Override
    public int a(int n2) {
        return 15 + (n2 - 1) * 9;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean a(j j2) {
        return super.a(j2) && j2 != aa.r;
    }
}


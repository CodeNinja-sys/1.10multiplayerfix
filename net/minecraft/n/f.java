/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.q.k;
import net.minecraft.u.d.l;
import net.minecraft.w.a.b;

public class f
extends aa {
    @Override
    public boolean a(a a2, az az2) {
        return a2.ab() || super.a(a2, az2);
    }

    @Override
    public String a() {
        return "seed";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.seed.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        k k2 = az2 instanceof b ? ((b)az2).aQ : a2.a(0);
        az2.a(new l("commands.seed.success", k2.A()));
    }
}


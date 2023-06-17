/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.q.a.d;

public class ai
extends aa {
    @Override
    public String a() {
        return "toggledownfall";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.downfall.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        this.a(a2);
        ai.a(az2, (t)this, "commands.downfall.success", new Object[0]);
    }

    protected void a(a a2) {
        d d2;
        d2.b(!(d2 = a2.d[0].F()).o());
    }
}


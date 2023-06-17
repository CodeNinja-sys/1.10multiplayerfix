/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import net.minecraft.c.a;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.n.x;
import net.minecraft.u.d.l;
import net.minecraft.w.a.g;

public class am
extends x {
    @Override
    public String a() {
        return "defaultgamemode";
    }

    @Override
    public String a(az az2) {
        return "commands.defaultgamemode.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new ac("commands.defaultgamemode.usage", new Object[0]);
        }
        net.minecraft.q.am am2 = this.a(az2, arrstring[0]);
        this.a(am2, a2);
        am.a(az2, (t)this, "commands.defaultgamemode.success", new l("gameMode." + am2.b(), new Object[0]));
    }

    protected void a(net.minecraft.q.am am2, a a2) {
        a2.a(am2);
        if (a2.aG()) {
            for (g g2 : a2.av().u()) {
                g2.a(am2);
            }
        }
    }
}


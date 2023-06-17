/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.w.a.g;

public class y
extends aa {
    @Override
    public String a() {
        return "spawnpoint";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.spawnpoint.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        b b2;
        if (arrstring.length > 1 && arrstring.length < 4) {
            throw new ac("commands.spawnpoint.usage", new Object[0]);
        }
        g g2 = arrstring.length > 0 ? y.a(a2, az2, arrstring[0]) : y.b(az2);
        b b3 = b2 = arrstring.length > 3 ? y.a(az2, arrstring, 1, true) : g2.aC();
        if (g2.aQ != null) {
            g2.a(b2, true);
            y.a(az2, (t)this, "commands.spawnpoint.success", g2.X(), b2.cy_(), b2.k(), b2.l());
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? y.a(arrstring, a2.T()) : (arrstring.length > 1 && arrstring.length <= 4 ? y.a(arrstring, 1, b2) : Collections.emptyList());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}


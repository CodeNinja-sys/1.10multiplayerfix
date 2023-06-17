/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.t;

public class al
extends aa {
    @Override
    public String a() {
        return "setidletimeout";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(az az2) {
        return "commands.setidletimeout.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length != 1) {
            throw new ac("commands.setidletimeout.usage", new Object[0]);
        }
        int n2 = al.a(arrstring[0], 0);
        a2.c(n2);
        al.a(az2, (t)this, "commands.setidletimeout.success", n2);
    }
}


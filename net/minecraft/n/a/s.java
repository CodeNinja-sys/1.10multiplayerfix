/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.t;

public class s
extends aa {
    @Override
    public String a() {
        return "stop";
    }

    @Override
    public String a(az az2) {
        return "commands.stop.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (a2.d != null) {
            s.a(az2, (t)this, "commands.stop.start", new Object[0]);
        }
        a2.H();
    }
}


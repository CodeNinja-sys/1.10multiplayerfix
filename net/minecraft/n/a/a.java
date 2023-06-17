/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.List;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.u.d.l;
import net.minecraft.w.a.b;

public class a
extends aa {
    @Override
    public String a() {
        return "me";
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String a(az az2) {
        return "commands.me.usage";
    }

    @Override
    public void a(net.minecraft.c.a a2, az az2, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new ac("commands.me.usage", new Object[0]);
        }
        net.minecraft.u.d.a a3 = a.b(az2, arrstring, 0, !(az2 instanceof b));
        a2.av().a(new l("chat.type.emote", az2.aK(), a3));
    }

    @Override
    public List a(net.minecraft.c.a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return a.a(arrstring, a2.T());
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Arrays;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.ag;
import net.minecraft.n.az;
import net.minecraft.u.d.l;
import net.minecraft.u.d.o;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.n;

public class m
extends aa {
    @Override
    public List c() {
        return Arrays.asList("w", "msg");
    }

    @Override
    public String a() {
        return "tell";
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String a(az az2) {
        return "commands.message.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new ac("commands.message.usage", new Object[0]);
        }
        g g2 = m.a(a2, az2, arrstring[0]);
        if (g2 == az2) {
            throw new ag("commands.message.sameTarget", new Object[0]);
        }
        net.minecraft.u.d.a a3 = m.b(az2, arrstring, 1, !(az2 instanceof b));
        l l2 = new l("commands.message.display.incoming", az2.aK(), a3.f());
        l l3 = new l("commands.message.display.outgoing", g2.aK(), a3.f());
        l2.a().a(o.h).b(true);
        l3.a().a(o.h).b(true);
        ((n)g2).a(l2);
        az2.a(l3);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return m.a(arrstring, a2.T());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}


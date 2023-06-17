/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.u.d.b;
import net.minecraft.u.d.n;

public class g
extends aa {
    @Override
    public String a() {
        return "tellraw";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.tellraw.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new ac("commands.tellraw.usage", new Object[0]);
        }
        net.minecraft.w.a.g g2 = g.a(a2, az2, arrstring[0]);
        String string = g.b(arrstring, 1);
        try {
            net.minecraft.u.d.a a3 = b.a(string);
            ((net.minecraft.w.n)g2).a(n.a(az2, a3, g2));
        }
        catch (com.a.b.aa aa2) {
            throw g.a(aa2);
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length == 1 ? g.a(arrstring, a2.T()) : Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}


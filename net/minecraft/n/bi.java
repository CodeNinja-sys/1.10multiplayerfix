/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.w.a.g;
import net.minecraft.w.n;

public class bi
extends aa {
    @Override
    public String a() {
        return "kill";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.kill.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length == 0) {
            g g2 = bi.b(az2);
            g2.aY();
            bi.a(az2, (t)this, "commands.kill.successful", g2.aK());
        } else {
            n n2 = bi.b(a2, az2, arrstring[0]);
            n2.aY();
            bi.a(az2, (t)this, "commands.kill.successful", n2.aK());
        }
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? bi.a(arrstring, a2.T()) : Collections.emptyList();
    }
}


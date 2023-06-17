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
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.x.d.b.s;

public class q
extends aa {
    @Override
    public String a() {
        return "setworldspawn";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.setworldspawn.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        b b2;
        if (arrstring.length == 0) {
            b2 = q.b(az2).aC();
        } else {
            if (arrstring.length != 3 || az2.aE() == null) {
                throw new ac("commands.setworldspawn.usage", new Object[0]);
            }
            b2 = q.a(az2, arrstring, 0, true);
        }
        az2.aE().z(b2);
        a2.av().a(new s(b2));
        q.a(az2, (t)this, "commands.setworldspawn.success", b2.cy_(), b2.k(), b2.l());
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length > 0 && arrstring.length <= 3 ? q.a(arrstring, 0, b2) : Collections.emptyList();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.ag;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.w.a.g;

public class n
extends aa {
    @Override
    public String a() {
        return "kick";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(az az2) {
        return "commands.kick.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length > 0 && arrstring[0].length() > 1) {
            g g2 = a2.av().a(arrstring[0]);
            String string = "Kicked by an operator.";
            boolean bl2 = false;
            if (g2 == null) {
                throw new ag();
            }
            if (arrstring.length >= 2) {
                string = n.a(az2, arrstring, 1).c();
                bl2 = true;
            }
            g2.a.a(string);
            if (bl2) {
                n.a(az2, (t)this, "commands.kick.success.reason", g2.X(), string);
            } else {
                n.a(az2, (t)this, "commands.kick.success", g2.X());
            }
        } else {
            throw new ac("commands.kick.usage", new Object[0]);
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length >= 1 ? n.a(arrstring, a2.T()) : Collections.emptyList();
    }
}


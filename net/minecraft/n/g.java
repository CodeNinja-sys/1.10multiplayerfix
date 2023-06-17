/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.q.h;
import net.minecraft.q.j;
import net.minecraft.u.b.b;
import net.minecraft.u.d.k;
import net.minecraft.x.d.b.aw;

public class g
extends aa {
    @Override
    public String a() {
        return "gamerule";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.gamerule.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        j j2 = this.a(a2);
        String string = arrstring.length > 0 ? arrstring[0] : "";
        String string2 = arrstring.length > 1 ? g.b(arrstring, 1) : "";
        switch (arrstring.length) {
            case 0: {
                az2.a(new k(g.a(j2.b())));
                break;
            }
            case 1: {
                if (!j2.d(string)) {
                    throw new o("commands.gamerule.norule", string);
                }
                String string3 = j2.a(string);
                az2.a(new k(string).a(" = ").a(string3));
                az2.a(br.e, j2.c(string));
                break;
            }
            default: {
                if (j2.a(string, h.b) && !"true".equals(string2) && !"false".equals(string2)) {
                    throw new o("commands.generic.boolean.invalid", string2);
                }
                j2.a(string, string2);
                g.a(j2, string, a2);
                g.a(az2, (t)this, "commands.gamerule.success", string, string2);
            }
        }
    }

    public static void a(j j2, String string, a a2) {
        if ("reducedDebugInfo".equals(string)) {
            byte by2 = (byte)(j2.b(string) ? 22 : 23);
            for (net.minecraft.w.a.g g2 : a2.av().u()) {
                g2.a.a(new aw(g2, by2));
            }
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        j j2;
        if (arrstring.length == 1) {
            return g.a(arrstring, this.a(a2).b());
        }
        if (arrstring.length == 2 && (j2 = this.a(a2)).a(arrstring[0], h.b)) {
            return g.a(arrstring, "true", "false");
        }
        return Collections.emptyList();
    }

    private j a(a a2) {
        return a2.a(0).G();
    }
}


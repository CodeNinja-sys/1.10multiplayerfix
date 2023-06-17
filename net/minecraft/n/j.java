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
import net.minecraft.n.br;
import net.minecraft.n.t;
import net.minecraft.q.v;
import net.minecraft.u.b.b;

public class j
extends aa {
    @Override
    public String a() {
        return "time";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.time.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length > 1) {
            if ("set".equals(arrstring[0])) {
                int n2 = "day".equals(arrstring[1]) ? 1000 : ("night".equals(arrstring[1]) ? 13000 : j.a(arrstring[1], 0));
                this.a(a2, n2);
                j.a(az2, (t)this, "commands.time.set", n2);
                return;
            }
            if ("add".equals(arrstring[0])) {
                int n3 = j.a(arrstring[1], 0);
                this.b(a2, n3);
                j.a(az2, (t)this, "commands.time.added", n3);
                return;
            }
            if ("query".equals(arrstring[0])) {
                if ("daytime".equals(arrstring[1])) {
                    int n4 = (int)(az2.aE().C() % 24000L);
                    az2.a(br.e, n4);
                    j.a(az2, (t)this, "commands.time.query", n4);
                    return;
                }
                if ("day".equals(arrstring[1])) {
                    int n5 = (int)(az2.aE().C() / 24000L % Integer.MAX_VALUE);
                    az2.a(br.e, n5);
                    j.a(az2, (t)this, "commands.time.query", n5);
                    return;
                }
                if ("gametime".equals(arrstring[1])) {
                    int n6 = (int)(az2.aE().B() % Integer.MAX_VALUE);
                    az2.a(br.e, n6);
                    j.a(az2, (t)this, "commands.time.query", n6);
                    return;
                }
            }
        }
        throw new ac("commands.time.usage", new Object[0]);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? j.a(arrstring, "set", "add", "query") : (arrstring.length == 2 && "set".equals(arrstring[0]) ? j.a(arrstring, "day", "night") : (arrstring.length == 2 && "query".equals(arrstring[0]) ? j.a(arrstring, "daytime", "gametime", "day") : Collections.emptyList()));
    }

    protected void a(a a2, int n2) {
        for (int i2 = 0; i2 < a2.d.length; ++i2) {
            a2.d[i2].a((long)n2);
        }
    }

    protected void b(a a2, int n2) {
        for (int i2 = 0; i2 < a2.d.length; ++i2) {
            v v2 = a2.d[i2];
            v2.a(v2.C() + (long)n2);
        }
    }
}


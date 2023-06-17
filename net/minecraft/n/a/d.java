/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.q.aq;
import net.minecraft.q.v;
import net.minecraft.u.d.l;

public class d
extends aa {
    @Override
    public String a() {
        return "save-all";
    }

    @Override
    public String a(az az2) {
        return "commands.save.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        az2.a(new l("commands.save.start", new Object[0]));
        if (a2.av() != null) {
            a2.av().j();
        }
        try {
            boolean bl2;
            v v2;
            int n2;
            for (n2 = 0; n2 < a2.d.length; ++n2) {
                if (a2.d[n2] == null) continue;
                v2 = a2.d[n2];
                bl2 = v2.a;
                v2.a = false;
                v2.a(true, null);
                v2.a = bl2;
            }
            if (arrstring.length > 0 && "flush".equals(arrstring[0])) {
                az2.a(new l("commands.save.flushStart", new Object[0]));
                for (n2 = 0; n2 < a2.d.length; ++n2) {
                    if (a2.d[n2] == null) continue;
                    v2 = a2.d[n2];
                    bl2 = v2.a;
                    v2.a = false;
                    v2.aa();
                    v2.a = bl2;
                }
                az2.a(new l("commands.save.flushEnd", new Object[0]));
            }
        }
        catch (aq aq2) {
            d.a(az2, (t)this, "commands.save.failed", aq2.getMessage());
            return;
        }
        d.a(az2, (t)this, "commands.save.success", new Object[0]);
    }
}


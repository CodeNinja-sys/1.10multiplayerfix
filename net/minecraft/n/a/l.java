/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.q.am;

public class l
extends aa {
    @Override
    public String a() {
        return "publish";
    }

    @Override
    public String a(az az2) {
        return "commands.publish.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        String string = a2.a(am.b, false);
        if (string != null) {
            l.a(az2, (t)this, "commands.publish.started", string);
        } else {
            l.a(az2, (t)this, "commands.publish.failed", new Object[0]);
        }
    }
}


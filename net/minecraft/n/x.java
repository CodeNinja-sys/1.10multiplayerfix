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
import net.minecraft.n.t;
import net.minecraft.q.aj;
import net.minecraft.q.am;
import net.minecraft.u.d.l;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.n;

public class x
extends aa {
    @Override
    public String a() {
        return "gamemode";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.gamemode.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new ac("commands.gamemode.usage", new Object[0]);
        }
        am am2 = this.a(az2, arrstring[0]);
        g g2 = arrstring.length >= 2 ? x.a(a2, az2, arrstring[1]) : x.b(az2);
        ((b)g2).a(am2);
        l l2 = new l("gameMode." + am2.b(), new Object[0]);
        if (az2.aE().G().b("sendCommandFeedback")) {
            ((n)g2).a(new l("gameMode.changed", l2));
        }
        if (g2 == az2) {
            x.a(az2, (t)this, 1, "commands.gamemode.success.self", l2);
        } else {
            x.a(az2, (t)this, 1, "commands.gamemode.success.other", g2.X(), l2);
        }
    }

    protected am a(az az2, String string) {
        am am2 = am.a(string, am.a);
        return am2 == am.a ? aj.a(x.a(string, 0, am.values().length - 2)) : am2;
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length == 1 ? x.a(arrstring, "survival", "creative", "adventure", "spectator") : (arrstring.length == 2 ? x.a(arrstring, a2.T()) : Collections.emptyList());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 1;
    }
}


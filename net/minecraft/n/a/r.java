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
import net.minecraft.u.b.b;
import net.minecraft.u.d.l;

public class r
extends aa {
    @Override
    public String a() {
        return "say";
    }

    @Override
    public int b() {
        return 1;
    }

    @Override
    public String a(az az2) {
        return "commands.say.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length <= 0 || arrstring[0].length() <= 0) {
            throw new ac("commands.say.usage", new Object[0]);
        }
        net.minecraft.u.d.a a3 = r.b(az2, arrstring, 0, true);
        a2.av().a(new l("chat.type.announcement", az2.aK(), a3));
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length >= 1 ? r.a(arrstring, a2.T()) : Collections.emptyList();
    }
}


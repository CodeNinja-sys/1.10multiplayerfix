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
import net.minecraft.u.b.b;
import net.minecraft.u.d.l;

public class aj
extends aa {
    @Override
    public String a() {
        return "difficulty";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.difficulty.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new ac("commands.difficulty.usage", new Object[0]);
        }
        net.minecraft.q.l l2 = this.e(arrstring[0]);
        a2.a(l2);
        aj.a(az2, (t)this, "commands.difficulty.success", new l(l2.b(), new Object[0]));
    }

    protected net.minecraft.q.l e(String string) {
        return !"peaceful".equalsIgnoreCase(string) && !"p".equalsIgnoreCase(string) ? (!"easy".equalsIgnoreCase(string) && !"e".equalsIgnoreCase(string) ? (!"normal".equalsIgnoreCase(string) && !"n".equalsIgnoreCase(string) ? (!"hard".equalsIgnoreCase(string) && !"h".equalsIgnoreCase(string) ? net.minecraft.q.l.a(aj.a(string, 0, 3)) : net.minecraft.q.l.d) : net.minecraft.q.l.c) : net.minecraft.q.l.b) : net.minecraft.q.l.a;
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? aj.a(arrstring, "peaceful", "easy", "normal", "hard") : Collections.emptyList();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.e.n;
import net.minecraft.e.u;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;

public class w
extends aa {
    @Override
    public String a() {
        return "testfor";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.testfor.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        e e2;
        if (arrstring.length < 1) {
            throw new ac("commands.testfor.usage", new Object[0]);
        }
        net.minecraft.w.n n2 = w.b(a2, az2, arrstring[0]);
        e e3 = null;
        if (arrstring.length >= 2) {
            try {
                e3 = n.a(w.b(arrstring, 1));
            }
            catch (i i2) {
                throw new o("commands.testfor.tagError", i2.getMessage());
            }
        }
        if (e3 != null && !u.a(e3, e2 = w.a(n2), true)) {
            throw new o("commands.testfor.failure", n2.X());
        }
        w.a(az2, (t)this, "commands.testfor.success", n2.X());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? w.a(arrstring, a2.T()) : Collections.emptyList();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import net.minecraft.j.f;
import net.minecraft.j.l;
import net.minecraft.u.d.o;

public class q
implements f {
    private final String o;

    public q(String string, o o2) {
        this.o = String.valueOf(string) + o2.d();
        f.a.put(this.o, this);
    }

    @Override
    public String c() {
        return this.o;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public l b() {
        return l.a;
    }
}


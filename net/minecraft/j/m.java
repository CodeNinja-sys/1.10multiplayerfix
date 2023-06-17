/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import net.minecraft.j.f;
import net.minecraft.j.l;

public class m
implements f {
    private final String o;

    public m(String string) {
        this.o = string;
        f.a.put(string, this);
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


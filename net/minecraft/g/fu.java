/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.p;
import net.minecraft.h.aq;
import net.minecraft.h.ar;
import net.minecraft.q.d;
import net.minecraft.q.k;
import net.minecraft.u.d.l;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public class fu
implements d {
    private final k a;
    private final net.minecraft.u.b.b b;

    public fu(k k2, net.minecraft.u.b.b b2) {
        this.a = k2;
        this.b = b2;
    }

    @Override
    public String X() {
        return "anvil";
    }

    @Override
    public boolean bO_() {
        return false;
    }

    @Override
    public net.minecraft.u.d.a aK() {
        return new l(String.valueOf(p.cf.p()) + ".name", new Object[0]);
    }

    @Override
    public aq a(a a2, b b2) {
        return new ar(a2, this.a, this.b, b2);
    }

    @Override
    public String h() {
        return "minecraft:anvil";
    }
}


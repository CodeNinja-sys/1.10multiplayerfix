/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.d.a;

import net.minecraft.h.aq;
import net.minecraft.q.d;
import net.minecraft.w.a.a;

public class b
implements d {
    private final String a;
    private final net.minecraft.u.d.a b;

    public b(String string, net.minecraft.u.d.a a2) {
        this.a = string;
        this.b = a2;
    }

    @Override
    public aq a(a a2, net.minecraft.w.a.b b2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String X() {
        return this.b.c();
    }

    @Override
    public boolean bO_() {
        return true;
    }

    @Override
    public String h() {
        return this.a;
    }

    @Override
    public net.minecraft.u.d.a aK() {
        return this.b;
    }
}


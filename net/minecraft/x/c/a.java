/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.c;

import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.u.d.k;
import net.minecraft.w.n;

public class a
implements az {
    private final StringBuffer a = new StringBuffer();
    private final net.minecraft.c.a b;

    public a(net.minecraft.c.a a2) {
        this.b = a2;
    }

    @Override
    public String X() {
        return "Rcon";
    }

    @Override
    public net.minecraft.u.d.a aK() {
        return new k(this.X());
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
        this.a.append(a2.c());
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    @Override
    public b aC() {
        return net.minecraft.u.b.b.c;
    }

    @Override
    public s aD() {
        return s.a;
    }

    @Override
    public net.minecraft.q.k aE() {
        return this.b.aE();
    }

    @Override
    public n aF() {
        return null;
    }

    @Override
    public boolean aR() {
        return true;
    }

    @Override
    public void a(br br2, int n2) {
    }

    @Override
    public net.minecraft.c.a aS() {
        return this.b;
    }
}


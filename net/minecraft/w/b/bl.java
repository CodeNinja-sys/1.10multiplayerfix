/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.b.bm;
import net.minecraft.w.e.bj;
import net.minecraft.w.h.ak;
import net.minecraft.w.n;

public class bl
extends bm {
    private final bj a;
    private ak b;
    private int c;

    public bl(bj bj2) {
        this.a = bj2;
        this.b(3);
    }

    @Override
    public boolean e() {
        if (!this.a.aQ.n()) {
            return false;
        }
        if (this.a.bd().nextInt(8000) != 0) {
            return false;
        }
        this.b = (ak)this.a.aQ.a(ak.class, this.a.cT().b(6.0, 2.0, 6.0), (n)this.a);
        return this.b != null;
    }

    @Override
    public boolean a() {
        return this.c > 0;
    }

    @Override
    public void b() {
        this.c = 400;
        this.a.a(true);
    }

    @Override
    public void c() {
        this.a.a(false);
        this.b = null;
    }

    @Override
    public void d() {
        this.a.I().a(this.b, 30.0f, 30.0f);
        --this.c;
    }
}


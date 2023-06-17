/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import java.util.List;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.bj;
import net.minecraft.w.h.ak;

public class x
extends bm {
    private final ak a;
    private bj b;
    private int c;
    private boolean d;

    public x(ak ak2) {
        this.a = ak2;
        this.b(3);
    }

    @Override
    public boolean e() {
        if (this.a.dn() >= 0) {
            return false;
        }
        if (!this.a.aQ.n()) {
            return false;
        }
        List list = this.a.aQ.a(bj.class, this.a.cT().b(6.0, 2.0, 6.0));
        if (list.isEmpty()) {
            return false;
        }
        for (bj bj2 : list) {
            if (bj2.q() <= 0) continue;
            this.b = bj2;
            break;
        }
        return this.b != null;
    }

    @Override
    public boolean a() {
        return this.b.q() > 0;
    }

    @Override
    public void b() {
        this.c = this.a.bd().nextInt(320);
        this.d = false;
        this.b.N().m();
    }

    @Override
    public void c() {
        this.b = null;
        this.a.N().m();
    }

    @Override
    public void d() {
        this.a.I().a(this.b, 30.0f, 30.0f);
        if (this.b.q() == this.c) {
            this.a.N().a(this.b, 0.5);
            this.d = true;
        }
        if (this.d && this.a.n(this.b) < 4.0) {
            this.b.a(false);
            this.a.N().m();
        }
    }
}


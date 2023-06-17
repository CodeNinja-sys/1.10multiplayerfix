/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.a.f;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.q;

public class d
extends q {
    private int b;

    public d(a a2) {
        super(a2);
    }

    @Override
    public void a() {
        this.a.aQ.a(this.a.aU, this.a.aV, this.a.aW, f.aS, this.a.S(), 2.5f, 0.8f + this.a.bd().nextFloat() * 0.3f, false);
    }

    @Override
    public void b() {
        if (this.b++ >= 40) {
            this.a.p().a(j.f);
        }
    }

    @Override
    public void e() {
        this.b = 0;
    }

    @Override
    public j g() {
        return j.h;
    }
}


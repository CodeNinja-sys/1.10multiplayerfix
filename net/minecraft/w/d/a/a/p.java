/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.u.b.s;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.k;

public class p
extends k {
    private s b;

    public p(a a2) {
        super(a2);
    }

    @Override
    public void b() {
        if (this.b == null) {
            this.b = new s(this.a.aU, this.a.aV, this.a.aW);
        }
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public void e() {
        this.b = null;
    }

    @Override
    public float c() {
        return 1.0f;
    }

    @Override
    public s f() {
        return this.b;
    }

    @Override
    public j g() {
        return j.k;
    }
}


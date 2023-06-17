/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.ah;
import net.minecraft.w.a.b;
import net.minecraft.w.f.f;
import net.minecraft.w.f.m;

public class s
extends f {
    public s(k k2) {
        super(k2);
    }

    public s(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public static void a(a a2) {
        f.a(a2, "MinecartRideable");
    }

    @Override
    public boolean a(b b2, cu cu2, ah ah2) {
        if (b2.G()) {
            return false;
        }
        if (this.cA()) {
            return true;
        }
        if (!this.aQ.C) {
            b2.r(this);
        }
        return true;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        if (bl2) {
            if (this.cA()) {
                this.ct();
            }
            if (this.v() == 0) {
                this.e(-this.w());
                this.d(10);
                this.a(50.0f);
                this.bN();
            }
        }
    }

    @Override
    public m a() {
        return m.a;
    }
}


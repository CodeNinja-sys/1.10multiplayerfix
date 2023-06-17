/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.u.b.n;
import net.minecraft.w.b.bm;
import net.minecraft.w.h.ac;

class af
extends bm {
    private final ac a;

    public af(ac ac2) {
        this.a = ac2;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void d() {
        int n2 = this.a.bi();
        if (n2 > 100) {
            this.a.b(0.0f, 0.0f, 0.0f);
        } else if (this.a.bd().nextInt(50) == 0 || !ac.a(this.a) || !this.a.c()) {
            float f2 = this.a.bd().nextFloat() * ((float)Math.PI * 2);
            float f3 = n.b(f2) * 0.2f;
            float f4 = -0.1f + this.a.bd().nextFloat() * 0.2f;
            float f5 = n.a(f2) * 0.2f;
            this.a.b(f3, f4, f5);
        }
    }
}


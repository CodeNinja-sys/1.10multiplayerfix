/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.a.u;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class e
implements p {
    private u a;

    public e() {
    }

    public e(u u2) {
        this.a = u2;
    }

    @Override
    public void a(a a2) {
        this.a = (u)a2.a(u.class);
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
    }

    public void a(b b2) {
        b2.a(this);
    }
}


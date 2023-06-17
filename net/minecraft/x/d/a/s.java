/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class s
implements p {
    private net.minecraft.u.b.b a;
    private String[] b;

    public s() {
    }

    public s(net.minecraft.u.b.b b2, net.minecraft.u.d.a[] arra) {
        this.a = b2;
        this.b = new String[]{arra[0].c(), arra[1].c(), arra[2].c(), arra[3].c()};
    }

    @Override
    public void a(a a2) {
        this.a = a2.c();
        this.b = new String[4];
        for (int i2 = 0; i2 < 4; ++i2) {
            this.b[i2] = a2.e(384);
        }
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
        for (int i2 = 0; i2 < 4; ++i2) {
            a2.a(this.b[i2]);
        }
    }

    public void a(b b2) {
        b2.a(this);
    }

    public net.minecraft.u.b.b a() {
        return this.a;
    }

    public String[] b() {
        return this.b;
    }
}


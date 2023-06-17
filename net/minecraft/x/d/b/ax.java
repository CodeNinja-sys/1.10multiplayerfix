/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ax
implements p {
    private int a;

    public ax() {
    }

    public ax(int n2) {
        this.a = n2;
    }

    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.F();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.B(this.a);
    }
}


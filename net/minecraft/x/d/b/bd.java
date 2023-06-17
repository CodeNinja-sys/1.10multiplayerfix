/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bd
implements p {
    private int a;
    private int b;

    public bd() {
    }

    public bd(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.K();
        this.b = a2.K();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.E(this.a);
        a2.E(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}


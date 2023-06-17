/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.e.b;

import net.minecraft.x.e.a;
import net.minecraft.x.p;

public class b
implements p {
    private int a;

    public b() {
    }

    public b(int n2) {
        this.a = n2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }
}


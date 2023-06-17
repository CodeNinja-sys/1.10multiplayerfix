/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ae
implements p {
    private int a;

    public ae() {
    }

    public ae(int n2) {
        this.a = n2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.E();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.B(this.a);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }
}


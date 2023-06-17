/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c;

import net.minecraft.c.a;
import net.minecraft.u.as;

class b
implements as {
    private long b = System.currentTimeMillis();
    final /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void b(String string) {
    }

    @Override
    public void a(int n2) {
        if (System.currentTimeMillis() - this.b >= 1000L) {
            this.b = System.currentTimeMillis();
            net.minecraft.c.a.aX().d("Converting... {}%", n2);
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void c(String string) {
    }
}


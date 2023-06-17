/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class ai
implements p {
    private int a;
    private int b;

    public ai() {
    }

    public ai(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(a a2) {
        this.a = a2.E();
        this.b = a2.E();
    }

    @Override
    public void b(a a2) {
        a2.B(this.a);
        a2.B(this.b);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}


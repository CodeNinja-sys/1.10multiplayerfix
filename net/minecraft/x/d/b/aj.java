/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class aj
implements p {
    private int a;
    private int b;

    public aj() {
    }

    public aj(n n2, int n3) {
        this.a = n2.ca();
        this.b = n3;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.F();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.B(this.b);
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


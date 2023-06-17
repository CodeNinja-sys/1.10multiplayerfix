/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.w.n;
import net.minecraft.x.a;
import net.minecraft.x.d.a.h;
import net.minecraft.x.d.b;

public class p
implements net.minecraft.x.p {
    private int a;
    private h b;
    private int c;

    public p() {
    }

    public p(n n2, h h2) {
        this(n2, h2, 0);
    }

    public p(n n2, h h2, int n3) {
        this.a = n2.ca();
        this.b = h2;
        this.c = n3;
    }

    @Override
    public void a(a a2) {
        this.a = a2.e();
        this.b = (h)a2.a(h.class);
        this.c = a2.e();
    }

    @Override
    public void b(a a2) {
        a2.d(this.a);
        a2.a(this.b);
        a2.d(this.c);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public h a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }
}


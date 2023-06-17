/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.b.a;

import net.minecraft.x.p;
import net.minecraft.x.q;

public class a
implements p {
    private int a;
    private String b;
    private int c;
    private q d;

    public a() {
    }

    public a(int n2, String string, int n3, q q2) {
        this.a = n2;
        this.b = string;
        this.c = n3;
        this.d = q2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.e(255);
        this.c = a2.H();
        this.d = q.a(a2.e());
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
        a2.C(this.c);
        a2.d(this.d.a());
    }

    public void a(net.minecraft.x.b.a a2) {
        a2.a(this);
    }

    public q a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }
}


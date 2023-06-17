/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.u.b.b;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class br
implements p {
    private int a;
    private b b;
    private int c;
    private boolean d;

    public br() {
    }

    public br(int n2, b b2, int n3, boolean bl2) {
        this.a = n2;
        this.b = b2;
        this.c = n3;
        this.d = bl2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.K();
        this.b = a2.c();
        this.c = a2.K();
        this.d = a2.D();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.E(this.a);
        a2.a(this.b);
        a2.E(this.c);
        a2.a(this.d);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public boolean a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    public b d() {
        return this.b;
    }
}


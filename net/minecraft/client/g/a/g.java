/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import net.minecraft.client.g.a.p;
import net.minecraft.client.g.a.t;
import net.minecraft.client.g.bd;

public abstract class g
implements t {
    protected int c = -1;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    protected boolean g;

    public void a(boolean bl2, boolean bl3) {
        int n2;
        int n3;
        this.d = bl2;
        this.e = bl3;
        if (bl2) {
            n3 = bl3 ? 9987 : 9729;
            n2 = 9729;
        } else {
            n3 = bl3 ? 9986 : 9728;
            n2 = 9728;
        }
        bd.b(3553, 10241, n3);
        bd.b(3553, 10240, n2);
    }

    @Override
    public void b(boolean bl2, boolean bl3) {
        this.f = this.d;
        this.g = this.e;
        this.a(bl2, bl3);
    }

    @Override
    public void d() {
        this.a(this.f, this.g);
    }

    @Override
    public int e() {
        if (this.c == -1) {
            this.c = p.a();
        }
        return this.c;
    }

    public void f() {
        if (this.c != -1) {
            p.a(this.c);
            this.c = -1;
        }
    }
}


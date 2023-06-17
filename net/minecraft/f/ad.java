/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.e.e;
import net.minecraft.f.a;
import net.minecraft.f.ap;
import net.minecraft.f.p;
import net.minecraft.n.o;
import net.minecraft.u.d.c;
import net.minecraft.u.d.k;
import net.minecraft.u.d.n;
import net.minecraft.w.a.b;
import net.minecraft.x.d.b.j;

public class ad
extends ap {
    public final net.minecraft.u.d.a[] a = new net.minecraft.u.d.a[]{new k(""), new k(""), new k(""), new k("")};
    public boolean b = false;
    public int c = -1;
    private boolean d = true;
    private b e;
    private final net.minecraft.n.ap f = new net.minecraft.n.ap();

    @Override
    public e a(e e2) {
        super.a(e2);
        for (int i2 = 0; i2 < 4; ++i2) {
            String string = net.minecraft.u.d.b.a(this.a[i2]);
            e2.a("Text" + (i2 + 1), string);
        }
        this.f.b(e2);
        return e2;
    }

    @Override
    protected void a(net.minecraft.q.k k2) {
        this.b(k2);
    }

    @Override
    public void b(e e2) {
        this.d = false;
        super.b(e2);
        p p2 = new p(this);
        for (int i2 = 0; i2 < 4; ++i2) {
            String string = e2.l("Text" + (i2 + 1));
            net.minecraft.u.d.a a2 = net.minecraft.u.d.b.a(string);
            if (this.b) {
                this.a[i2] = new k("hello");
                continue;
            }
            try {
                this.a[i2] = net.minecraft.u.d.n.a(p2, a2, null);
                continue;
            }
            catch (o o2) {
                this.a[i2] = a2;
            }
        }
        this.f.a(e2);
    }

    @Override
    public j bJ_() {
        return new j(this.l, 9, this.d());
    }

    @Override
    public e d() {
        return this.a(new e());
    }

    @Override
    public boolean bK_() {
        return true;
    }

    public boolean b() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.d = bl2;
        if (!bl2) {
            this.e = null;
        }
    }

    public void a(b b2) {
        this.e = b2;
    }

    public b g() {
        return this.e;
    }

    public boolean b(b b2) {
        a a2 = new a(this, b2);
        net.minecraft.u.d.a[] arra = this.a;
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            net.minecraft.u.d.a.a a3;
            c c2;
            net.minecraft.u.d.a a4 = arra[i2];
            c c3 = c2 = a4 == null ? null : a4.a();
            if (c2 == null || c2.h() == null || (a3 = c2.h()).a() != net.minecraft.u.d.a.b.c) continue;
            b2.aS().Y().a(a2, a3.b());
        }
        return true;
    }

    public net.minecraft.n.ap h() {
        return this.f;
    }

    static /* synthetic */ net.minecraft.n.ap a(ad ad2) {
        return ad2.f;
    }
}


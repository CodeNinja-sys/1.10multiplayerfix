/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f;

import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.f.c;
import net.minecraft.q.f.h;
import net.minecraft.u.az;
import net.minecraft.x.a;

public class j
implements h {
    private final az a;
    private final c b;
    private final int c;

    public j(int n2, c c2) {
        this.c = n2;
        this.b = c2;
        this.a = new az(1 << n2);
    }

    @Override
    public int a(b b2) {
        int n2 = this.a.a(b2);
        if (n2 == -1 && (n2 = this.a.b(b2)) >= 1 << this.c) {
            n2 = this.b.a(this.c + 1, b2);
        }
        return n2;
    }

    @Override
    public b a(int n2) {
        return (b)this.a.a(n2);
    }

    @Override
    public void a(a a2) {
        this.a.a();
        int n2 = a2.e();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a.b((b)cn.w.a(a2.e()));
        }
    }

    @Override
    public void b(a a2) {
        int n2 = this.a.b();
        a2.d(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            a2.d(cn.w.a((b)this.a.a(i2)));
        }
    }

    @Override
    public int a() {
        int n2 = net.minecraft.x.a.a(this.a.b());
        for (int i2 = 0; i2 < this.a.b(); ++i2) {
            n2 += net.minecraft.x.a.a(cn.w.a((b)this.a.a(i2)));
        }
        return n2;
    }
}


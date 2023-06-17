/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.q.k;
import net.minecraft.u.ah;
import net.minecraft.u.b.s;
import net.minecraft.w.n;
import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class m
implements p {
    private int a;
    private net.minecraft.x.d.a.b b;
    private s c;
    private ah d;

    public m() {
    }

    public m(n n2) {
        this.a = n2.ca();
        this.b = net.minecraft.x.d.a.b.b;
    }

    public m(n n2, ah ah2) {
        this.a = n2.ca();
        this.b = net.minecraft.x.d.a.b.a;
        this.d = ah2;
    }

    public m(n n2, ah ah2, s s2) {
        this.a = n2.ca();
        this.b = net.minecraft.x.d.a.b.c;
        this.d = ah2;
        this.c = s2;
    }

    @Override
    public void a(a a2) {
        this.a = a2.e();
        this.b = (net.minecraft.x.d.a.b)a2.a(net.minecraft.x.d.a.b.class);
        if (this.b == net.minecraft.x.d.a.b.c) {
            this.c = new s(a2.O(), a2.O(), a2.O());
        }
        if (this.b == net.minecraft.x.d.a.b.a || this.b == net.minecraft.x.d.a.b.c) {
            this.d = (ah)a2.a(ah.class);
        }
    }

    @Override
    public void b(a a2) {
        a2.d(this.a);
        a2.a(this.b);
        if (this.b == net.minecraft.x.d.a.b.c) {
            a2.a((float)this.c.b);
            a2.a((float)this.c.c);
            a2.a((float)this.c.d);
        }
        if (this.b == net.minecraft.x.d.a.b.a || this.b == net.minecraft.x.d.a.b.c) {
            a2.a(this.d);
        }
    }

    public void a(b b2) {
        b2.a(this);
    }

    public n a(k k2) {
        return k2.a(this.a);
    }

    public net.minecraft.x.d.a.b a() {
        return this.b;
    }

    public ah b() {
        return this.d;
    }

    public s c() {
        return this.c;
    }
}


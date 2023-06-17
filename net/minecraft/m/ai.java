/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.b.b;
import net.minecraft.g.bl;
import net.minecraft.g.cd;
import net.minecraft.g.cn;
import net.minecraft.g.fk;
import net.minecraft.m.ar;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bu;

public class ai
extends ar {
    private final bl b;
    private final bl c;

    public ai(cn cn2, bl bl2, bl bl3) {
        super(cn2);
        this.b = bl2;
        this.c = bl3;
        this.e(0);
        this.a(true);
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public String d(cu cu2) {
        return this.b.b(cu2.h());
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (cu2.b != 0 && b2.a(b3.a(ad2), ad2, cu2)) {
            Comparable comparable = this.b.a(cu2);
            net.minecraft.g.c.b b4 = k2.n(b3);
            if (b4.c() == this.b) {
                b b5 = this.b.e();
                Comparable comparable2 = b4.a(b5);
                cd cd2 = (cd)((Object)b4.a(bl.b));
                if ((ad2 == ad.b && cd2 == cd.b || ad2 == ad.a && cd2 == cd.a) && comparable2 == comparable) {
                    net.minecraft.g.c.b b6 = this.a(b5, comparable2);
                    a a2 = b6.d(k2, b3);
                    if (a2 != cn.y && k2.c(a2.a(b3)) && k2.a(b3, b6, 11)) {
                        fk fk2 = this.c.w();
                        k2.a(b2, b3, fk2.e(), bu.e, (fk2.a() + 1.0f) / 2.0f, fk2.b() * 0.8f);
                        --cu2.b;
                    }
                    return ab.a;
                }
            }
            return this.a(b2, cu2, k2, b3.a(ad2), comparable) ? ab.a : super.a(cu2, b2, k2, b3, ah2, ad2, f2, f3, f4);
        }
        return ab.c;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, ad ad2, net.minecraft.w.a.b b3, cu cu2) {
        net.minecraft.g.c.b b4;
        net.minecraft.u.b.b b5 = b2;
        b b6 = this.b.e();
        Comparable comparable = this.b.a(cu2);
        net.minecraft.g.c.b b7 = k2.n(b2);
        if (b7.c() == this.b) {
            boolean bl2;
            boolean bl3 = bl2 = b7.a(bl.b) == cd.a;
            if ((ad2 == ad.b && !bl2 || ad2 == ad.a && bl2) && comparable == b7.a(b6)) {
                return true;
            }
        }
        return (b4 = k2.n(b2 = b2.a(ad2))).c() == this.b && comparable == b4.a(b6) ? true : super.a(k2, b5, ad2, b3, cu2);
    }

    private boolean a(net.minecraft.w.a.b b2, cu cu2, k k2, net.minecraft.u.b.b b3, Object object) {
        Comparable comparable;
        net.minecraft.g.c.b b4 = k2.n(b3);
        if (b4.c() == this.b && (comparable = b4.a(this.b.e())) == object) {
            net.minecraft.g.c.b b5 = this.a(this.b.e(), comparable);
            a a2 = b5.d(k2, b3);
            if (a2 != cn.y && k2.c(a2.a(b3)) && k2.a(b3, b5, 11)) {
                fk fk2 = this.c.w();
                k2.a(b2, b3, fk2.e(), bu.e, (fk2.a() + 1.0f) / 2.0f, fk2.b() * 0.8f);
                --cu2.b;
            }
            return true;
        }
        return false;
    }

    protected net.minecraft.g.c.b a(b b2, Comparable comparable) {
        return this.c.v().a(b2, comparable);
    }
}


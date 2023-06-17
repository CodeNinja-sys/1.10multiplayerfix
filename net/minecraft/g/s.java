/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.a.e;
import net.minecraft.g.ad;
import net.minecraft.g.an;
import net.minecraft.g.bg;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.v.d;

public class s
extends an {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("variant", net.minecraft.g.b.class, new ad());

    public s() {
        this.z(this.O.b().a(a, (Comparable)((Object)net.minecraft.g.b.a)).a(b, (Comparable)((Object)bg.b)));
    }

    @Override
    public e g(b b2) {
        net.minecraft.g.b b3 = (net.minecraft.g.b)((Object)b2.a(a));
        switch ((bg)((Object)b2.a(b))) {
            default: {
                switch (b3) {
                    default: {
                        return net.minecraft.g.b.b.c();
                    }
                    case b: {
                        return net.minecraft.g.b.f.c();
                    }
                    case c: {
                        return net.minecraft.g.a.e.p;
                    }
                    case d: 
                }
                return net.minecraft.g.b.b.c();
            }
            case b: 
        }
        return b3.c();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        list.add(new cu(cg2, 1, net.minecraft.g.b.a.b()));
        list.add(new cu(cg2, 1, net.minecraft.g.b.b.b()));
        list.add(new cu(cg2, 1, net.minecraft.g.b.c.b()));
        list.add(new cu(cg2, 1, net.minecraft.g.b.d.b()));
    }

    @Override
    public b a(int n2) {
        b b2 = this.v().a(a, (Comparable)((Object)net.minecraft.g.b.a((n2 & 3) % 4)));
        switch (n2 & 0xC) {
            case 0: {
                b2 = b2.a(b, (Comparable)((Object)bg.b));
                break;
            }
            case 4: {
                b2 = b2.a(b, (Comparable)((Object)bg.a));
                break;
            }
            case 8: {
                b2 = b2.a(b, (Comparable)((Object)bg.c));
                break;
            }
            default: {
                b2 = b2.a(b, (Comparable)((Object)bg.d));
            }
        }
        return b2;
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((net.minecraft.g.b)((Object)b2.a(a))).b();
        switch ((bg)((Object)b2.a(b))) {
            case a: {
                n2 |= 4;
                break;
            }
            case c: {
                n2 |= 8;
                break;
            }
            case d: {
                n2 |= 0xC;
            }
        }
        return n2;
    }

    @Override
    protected i a() {
        return new i(this, a, b);
    }

    @Override
    protected cu j(b b2) {
        return new cu(cg.a(this), 1, ((net.minecraft.g.b)((Object)b2.a(a))).b());
    }

    @Override
    public int k(b b2) {
        return ((net.minecraft.g.b)((Object)b2.a(a))).b();
    }
}


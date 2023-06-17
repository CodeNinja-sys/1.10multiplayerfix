/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.j;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.a.w;
import net.minecraft.client.g.i.a.z;
import net.minecraft.client.g.i.ac;
import net.minecraft.client.g.i.b;
import net.minecraft.client.g.i.f;
import net.minecraft.client.j.c;
import net.minecraft.client.j.h;
import net.minecraft.u.bp;
import net.minecraft.w.e.af;
import net.minecraft.w.e.d;
import net.minecraft.w.l;

public class as
extends b {
    private static final bp k = new bp("textures/entity/zombie_villager/zombie_villager.png");
    private static final bp l = new bp("textures/entity/zombie_villager/zombie_farmer.png");
    private static final bp m = new bp("textures/entity/zombie_villager/zombie_librarian.png");
    private static final bp n = new bp("textures/entity/zombie_villager/zombie_priest.png");
    private static final bp o = new bp("textures/entity/zombie_villager/zombie_smith.png");
    private static final bp p = new bp("textures/entity/zombie_villager/zombie_butcher.png");
    private static final bp q = new bp("textures/entity/zombie/zombie.png");
    private static final bp r = new bp("textures/entity/zombie/husk.png");
    private final net.minecraft.client.j.b s;
    private final h t;
    private final List u;
    private final List v;

    public as(f f2) {
        super(f2, new c(), 0.5f, 1.0f);
        s s2 = (s)this.i.get(0);
        this.s = this.a;
        this.t = new h();
        this.a(new j(this));
        ac ac2 = new ac(this, this);
        this.a(ac2);
        this.v = ov.a((Iterable)this.i);
        if (s2 instanceof z) {
            this.b(s2);
            this.a(new z(this.t.a));
        }
        this.b(ac2);
        this.a(new w(this));
        this.u = ov.a((Iterable)this.i);
    }

    protected void a(d d2, float f2) {
        if (d2.r() == af.g) {
            float f3 = 1.0625f;
            bd.b(1.0625f, 1.0625f, 1.0625f);
        }
        super.a(d2, f2);
    }

    public void a(d d2, double d3, double d4, double d5, float f2, float f3) {
        this.b(d2);
        super.a(d2, d3, d4, d5, f2, f3);
    }

    protected bp a(d d2) {
        if (d2.s()) {
            switch (d2.t()) {
                case 0: {
                    return l;
                }
                case 1: {
                    return m;
                }
                case 2: {
                    return n;
                }
                case 3: {
                    return o;
                }
                case 4: {
                    return p;
                }
            }
            return k;
        }
        return d2.r() == af.g ? r : q;
    }

    private void b(d d2) {
        if (d2.s()) {
            this.g = this.t;
            this.i = this.u;
        } else {
            this.g = this.s;
            this.i = this.v;
        }
        this.a = (net.minecraft.client.j.b)this.g;
    }

    protected void a(d d2, float f2, float f3, float f4) {
        if (d2.v()) {
            f3 += (float)(Math.cos((double)d2.by * 3.25) * Math.PI * 0.25);
        }
        super.a((l)d2, f2, f3, f4);
    }
}


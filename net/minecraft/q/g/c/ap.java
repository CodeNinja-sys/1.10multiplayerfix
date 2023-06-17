/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.a.i;
import net.minecraft.q.b.am;
import net.minecraft.q.g.c.at;
import net.minecraft.q.g.c.cm;
import net.minecraft.q.g.c.j;
import net.minecraft.u.b.n;
import net.minecraft.w.e.g;

public class ap
extends at {
    private int d = 32;
    private int h = 5;
    public static final List a = Arrays.asList(net.minecraft.a.i.a, net.minecraft.a.i.z, net.minecraft.a.i.i, net.minecraft.a.i.l, net.minecraft.a.i.m);
    public static final List b = Arrays.asList(net.minecraft.a.i.z);
    private static final List i = ov.a();

    static {
        i.add(new am(g.class, 1, 2, 4));
    }

    public ap() {
    }

    public ap(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("spacing")) {
                this.d = n.a((String)entry.getValue(), this.d, 1);
                continue;
            }
            if (!((String)entry.getKey()).equals("separation")) continue;
            this.h = n.a((String)entry.getValue(), this.h, 1);
        }
    }

    @Override
    public String a() {
        return "Monument";
    }

    @Override
    protected boolean a(int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        if (n2 < 0) {
            n2 -= this.d - 1;
        }
        if (n3 < 0) {
            n3 -= this.d - 1;
        }
        int n6 = n2 / this.d;
        int n7 = n3 / this.d;
        Random random = this.g.b(n6, n7, 10387313);
        n6 *= this.d;
        n7 *= this.d;
        if (n4 == (n6 += (random.nextInt(this.d - this.h) + random.nextInt(this.d - this.h)) / 2) && n5 == (n7 += (random.nextInt(this.d - this.h) + random.nextInt(this.d - this.h)) / 2)) {
            if (!this.g.k().a(n4 * 16 + 8, n5 * 16 + 8, 16, b)) {
                return false;
            }
            boolean bl2 = this.g.k().a(n4 * 16 + 8, n5 * 16 + 8, 29, a);
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected j b(int n2, int n3) {
        return new cm(this.g, this.f, n2, n3);
    }

    public List c() {
        return i;
    }
}


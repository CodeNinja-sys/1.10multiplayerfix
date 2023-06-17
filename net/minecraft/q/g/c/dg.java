/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.a.i;
import net.minecraft.l.k;
import net.minecraft.q.g.c.at;
import net.minecraft.q.g.c.dk;
import net.minecraft.q.g.c.j;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;

public class dg
extends at {
    public static final List a = Arrays.asList(i.c, i.d, i.K, i.g);
    private int b;
    private int d = 32;
    private final int h;

    public dg() {
        this.h = 8;
        k.q = this;
    }

    public dg(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("size")) {
                this.b = n.a((String)entry.getValue(), this.b, 0);
                continue;
            }
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.d = n.a((String)entry.getValue(), this.d, 9);
        }
    }

    public s c(int n2, int n3) {
        for (int i2 = -32; i2 < 32; ++i2) {
            for (int i3 = -32; i3 < 32; ++i3) {
                try {
                    j j2;
                    if (!this.a(n2 + i2, n3 + i3) || !((j2 = this.b(i2, i3)) instanceof dk)) continue;
                    continue;
                }
                catch (Throwable throwable) {
                    System.out.println("Error");
                }
            }
        }
        return null;
    }

    @Override
    public String a() {
        return "Village";
    }

    @Override
    protected boolean a(int n2, int n3) {
        boolean bl2;
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
        Random random = this.g.b(n6, n7, 10387312);
        n6 *= this.d;
        n7 *= this.d;
        return n4 == (n6 += random.nextInt(this.d - 8)) && n5 == (n7 += random.nextInt(this.d - 8)) && (bl2 = this.g.k().a(n4 * 16 + 8, n5 * 16 + 8, 0, a));
    }

    @Override
    protected j b(int n2, int n3) {
        return new dk(this.g, this.f, n2, n3, this.b);
    }
}


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
import net.minecraft.q.b.q;
import net.minecraft.q.g.c.at;
import net.minecraft.q.g.c.b;
import net.minecraft.q.g.c.bp;
import net.minecraft.q.g.c.j;
import net.minecraft.q.g.c.r;
import net.minecraft.u.b.n;
import net.minecraft.w.e.u;

public class ae
extends at {
    private static final List a = Arrays.asList(i.d, i.s, i.w, i.x, i.h, i.n, i.F);
    private final List b = ov.a();
    private int d = 32;
    private final int h;

    public ae() {
        this.h = 8;
        this.b.add(new am(u.class, 1, 1, 1));
    }

    public ae(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.d = n.a((String)entry.getValue(), this.d, 9);
        }
    }

    @Override
    public String a() {
        return "Temple";
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
        Random random = this.g.b(n6, n7, 14357617);
        n6 *= this.d;
        n7 *= this.d;
        if (n4 == (n6 += random.nextInt(this.d - 8)) && n5 == (n7 += random.nextInt(this.d - 8))) {
            q q2 = this.g.k().a(new net.minecraft.u.b.b(n4 * 16 + 8, 0, n5 * 16 + 8));
            if (q2 == null) {
                return false;
            }
            for (q q3 : a) {
                if (q2 != q3) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    protected j b(int n2, int n3) {
        return new bp(this.g, this.f, n2, n3);
    }

    public boolean a(net.minecraft.u.b.b b2) {
        j j2 = this.c(b2);
        if (j2 != null && j2 instanceof bp && !j2.a.isEmpty()) {
            r r2 = (r)j2.a.get(0);
            return r2 instanceof b;
        }
        return false;
    }

    public List c() {
        return this.b;
    }
}


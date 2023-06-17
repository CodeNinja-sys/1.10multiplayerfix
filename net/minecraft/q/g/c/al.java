/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.q.g.c.d;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class al
extends d {
    private int a;

    public al() {
    }

    public al(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
        this.a = random.nextInt();
    }

    public static al a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -1, -3, 0, 5, 10, 8, ad2);
        return al.a(dc2) && r.a(list, dc2) == null ? new al(n5, random, dc2, ad2) : null;
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.a = e2.h("Seed");
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Seed", this.a);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3;
        int n4;
        Random random2 = new Random(this.a);
        for (n4 = 0; n4 <= 4; ++n4) {
            for (n3 = 3; n3 <= 4; ++n3) {
                n2 = random2.nextInt(8);
                this.a(k2, dc2, n4, n3, 0, n4, n3, n2, p.by.v(), p.by.v(), false);
            }
        }
        n4 = random2.nextInt(8);
        this.a(k2, dc2, 0, 5, 0, 0, 5, n4, p.by.v(), p.by.v(), false);
        n4 = random2.nextInt(8);
        this.a(k2, dc2, 4, 5, 0, 4, 5, n4, p.by.v(), p.by.v(), false);
        for (n4 = 0; n4 <= 4; ++n4) {
            n3 = random2.nextInt(5);
            this.a(k2, dc2, n4, 2, 0, n4, 2, n3, p.by.v(), p.by.v(), false);
        }
        for (n4 = 0; n4 <= 4; ++n4) {
            for (n3 = 0; n3 <= 1; ++n3) {
                n2 = random2.nextInt(3);
                this.a(k2, dc2, n4, n3, 0, n4, n3, n2, p.by.v(), p.by.v(), false);
            }
        }
        return true;
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.aad;
import java.util.Random;
import java.util.Set;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.q.g.c.ax;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.j;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.m;

public class cm
extends j {
    private final Set c = aad.a();
    private boolean d;

    public cm() {
    }

    public cm(k k2, Random random, int n2, int n3) {
        super(n2, n3);
        this.b(k2, random, n2, n3);
    }

    private void b(k k2, Random random, int n2, int n3) {
        random.setSeed(k2.A());
        long l2 = random.nextLong();
        long l3 = random.nextLong();
        long l4 = (long)n2 * l2;
        long l5 = (long)n3 * l3;
        random.setSeed(l4 ^ l5 ^ k2.A());
        int n4 = n2 * 16 + 8 - 29;
        int n5 = n3 * 16 + 8 - 29;
        ad ad2 = ag.a.a(random);
        this.a.add(new ax(random, n4, n5, ad2));
        this.c();
        this.d = true;
    }

    @Override
    public void a(k k2, Random random, dc dc2) {
        if (!this.d) {
            this.a.clear();
            this.b(k2, random, this.e(), this.f());
        }
        super.a(k2, random, dc2);
    }

    @Override
    public boolean a(m m2) {
        return this.c.contains(m2) ? false : super.a(m2);
    }

    @Override
    public void b(m m2) {
        super.b(m2);
        this.c.add(m2);
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        q q2 = new q();
        for (m m2 : this.c) {
            e e3 = new e();
            e3.a("X", m2.a);
            e3.a("Z", m2.b);
            q2.a(e3);
        }
        e2.a("Processed", q2);
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        if (e2.b("Processed", 9)) {
            q q2 = e2.c("Processed", 10);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                e e3 = q2.b(i2);
                this.c.add(new m(e3.h("X"), e3.h("Z")));
            }
        }
    }
}


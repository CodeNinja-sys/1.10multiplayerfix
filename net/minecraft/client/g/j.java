/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.f.s;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.ac;
import net.minecraft.client.g.b.a.ad;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.bp;
import net.minecraft.client.g.by;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.cn;
import net.minecraft.client.g.h.g;
import net.minecraft.g.c.b;
import net.minecraft.k.a;
import net.minecraft.k.i;
import net.minecraft.q.ab;
import net.minecraft.q.n;
import net.minecraft.u.bo;

public class j
implements net.minecraft.client.f.j {
    private final ac a;
    private final cn b;
    private final by c = new by();
    private final bp d;

    public j(ac ac2, g g2) {
        this.a = ac2;
        this.b = new cn(g2);
        this.d = new bp(g2);
    }

    public ac a() {
        return this.a;
    }

    public void a(b b2, net.minecraft.u.b.b b3, d d2, n n2) {
        if (b2.l() == net.minecraft.u.ac.d) {
            b2 = b2.b(n2, b3);
            aq aq2 = this.a.b(b2);
            aq aq3 = new ad(b2, aq2, d2, b3).a();
            this.b.a(n2, aq3, b2, b3, ci.a().c(), true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(b b2, net.minecraft.u.b.b b3, n n2, net.minecraft.client.g.g g2) {
        try {
            net.minecraft.u.ac ac2 = b2.l();
            if (ac2 == net.minecraft.u.ac.a) {
                return false;
            }
            if (n2.y() != ab.g) {
                try {
                    b2 = b2.b(n2, b3);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            switch (ac2) {
                case d: {
                    return this.b.a(n2, this.a(b2), b2, b3, g2, true);
                }
                case c: {
                    return false;
                }
                case b: {
                    return this.d.a(n2, b2, b3, g2);
                }
            }
            return false;
        }
        catch (Throwable throwable) {
            a a2 = net.minecraft.k.a.a(throwable, "Tesselating block in world");
            i i2 = a2.a("Block being tesselated");
            i.a(i2, b3, b2.c(), b2.c().b(b2));
            throw new bo(a2);
        }
    }

    public cn b() {
        return this.b;
    }

    public aq a(b b2) {
        return this.a.b(b2);
    }

    public void a(b b2, float f2) {
        net.minecraft.u.ac ac2 = b2.l();
        if (ac2 != net.minecraft.u.ac.a) {
            switch (ac2) {
                case d: {
                    aq aq2 = this.a(b2);
                    this.b.a(aq2, b2, f2, true);
                    break;
                }
                case c: {
                    this.c.a(b2.c(), f2);
                }
            }
        }
    }

    public boolean a(net.minecraft.g.cn cn2) {
        if (cn2 == null) {
            return false;
        }
        net.minecraft.u.ac ac2 = cn2.v().l();
        return ac2 == net.minecraft.u.ac.d ? false : ac2 == net.minecraft.u.ac.c;
    }

    @Override
    public void a(s s2) {
        this.d.a();
    }
}


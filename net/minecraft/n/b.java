/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.k;
import net.minecraft.u.b.g;

public class b
extends aa {
    @Override
    public String a() {
        return "testforblocks";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.compare.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 9) {
            throw new ac("commands.compare.usage", new Object[0]);
        }
        az2.a(br.b, 0);
        net.minecraft.u.b.b b2 = b.a(az2, arrstring, 0, false);
        net.minecraft.u.b.b b3 = b.a(az2, arrstring, 3, false);
        net.minecraft.u.b.b b4 = b.a(az2, arrstring, 6, false);
        dc dc2 = new dc(b2, b3);
        dc dc3 = new dc(b4, b4.a(dc2.b()));
        int n2 = dc2.c() * dc2.d() * dc2.e();
        if (n2 > 524288) {
            throw new o("commands.compare.tooManyBlocks", n2, 524288);
        }
        if (dc2.b < 0 || dc2.e >= 256 || dc3.b < 0 || dc3.e >= 256) throw new o("commands.compare.outOfWorld", new Object[0]);
        k k2 = az2.aE();
        if (!k2.a(dc2) || !k2.a(dc3)) throw new o("commands.compare.outOfWorld", new Object[0]);
        boolean bl2 = false;
        if (arrstring.length > 9 && "masked".equals(arrstring[9])) {
            bl2 = true;
        }
        n2 = 0;
        net.minecraft.u.b.b b5 = new net.minecraft.u.b.b(dc3.a - dc2.a, dc3.b - dc2.b, dc3.c - dc2.c);
        g g2 = new g();
        g g3 = new g();
        for (int i2 = dc2.c; i2 <= dc2.f; ++i2) {
            for (int i3 = dc2.b; i3 <= dc2.e; ++i3) {
                for (int i4 = dc2.a; i4 <= dc2.d; ++i4) {
                    g2.b(i4, i3, i2);
                    g3.b(i4 + b5.cy_(), i3 + b5.k(), i2 + b5.l());
                    boolean bl3 = false;
                    net.minecraft.g.c.b b6 = k2.n(g2);
                    if (bl2 && b6.c() == p.a) continue;
                    if (b6 == k2.n(g3)) {
                        ap ap2 = k2.q(g2);
                        ap ap3 = k2.q(g3);
                        if (ap2 != null && ap3 != null) {
                            e e2 = ap2.a(new e());
                            e2.q("x");
                            e2.q("y");
                            e2.q("z");
                            e e3 = ap3.a(new e());
                            e3.q("x");
                            e3.q("y");
                            e3.q("z");
                            if (!e2.equals(e3)) {
                                bl3 = true;
                            }
                        } else if (ap2 != null) {
                            bl3 = true;
                        }
                    } else {
                        bl3 = true;
                    }
                    ++n2;
                    if (!bl3) continue;
                    throw new o("commands.compare.failed", new Object[0]);
                }
            }
        }
        az2.a(br.b, n2);
        b.a(az2, (t)this, "commands.compare.success", n2);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length > 0 && arrstring.length <= 3 ? b.a(arrstring, 0, b2) : (arrstring.length > 3 && arrstring.length <= 6 ? b.a(arrstring, 3, b2) : (arrstring.length > 6 && arrstring.length <= 9 ? b.a(arrstring, 6, b2) : (arrstring.length == 10 ? b.a(arrstring, "masked", "all") : Collections.emptyList())));
    }
}


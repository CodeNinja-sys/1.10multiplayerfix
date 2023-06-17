/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import com.a.a.b.cc;
import com.a.a.d.ov;
import com.c.a.e;
import java.util.List;
import net.minecraft.q.am;
import net.minecraft.w.a.g;
import net.minecraft.x.d.a;
import net.minecraft.x.d.b.az;
import net.minecraft.x.d.b.bj;
import net.minecraft.x.p;

public class bm
implements p {
    private az a;
    private final List b = ov.a();

    public bm() {
    }

    public bm(az az2, g ... arrg) {
        this.a = az2;
        g[] arrg2 = arrg;
        int n2 = arrg.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            g g2 = arrg2[i2];
            this.b.add(new bj(this, g2.ac(), g2.g, g2.c.a(), g2.aT()));
        }
    }

    public bm(az az2, Iterable iterable) {
        this.a = az2;
        for (g g2 : iterable) {
            this.b.add(new bj(this, g2.ac(), g2.g, g2.c.a(), g2.aT()));
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = (az)a2.a(az.class);
        int n2 = a2.e();
        for (int i2 = 0; i2 < n2; ++i2) {
            e e2 = null;
            int n3 = 0;
            am am2 = null;
            net.minecraft.u.d.a a3 = null;
            switch (this.a) {
                case a: {
                    e2 = new e(a2.g(), a2.e(16));
                    int n4 = a2.e();
                    for (int i3 = 0; i3 < n4; ++i3) {
                        String string = a2.e(32767);
                        String string2 = a2.e(32767);
                        if (a2.D()) {
                            e2.c().a(string, new com.c.a.d.a(string, string2, a2.e(32767)));
                            continue;
                        }
                        e2.c().a(string, new com.c.a.d.a(string, string2));
                    }
                    am2 = am.a(a2.e());
                    n3 = a2.e();
                    if (!a2.D()) break;
                    a3 = a2.d();
                    break;
                }
                case b: {
                    e2 = new e(a2.g(), null);
                    am2 = am.a(a2.e());
                    break;
                }
                case c: {
                    e2 = new e(a2.g(), null);
                    n3 = a2.e();
                    break;
                }
                case d: {
                    e2 = new e(a2.g(), null);
                    if (!a2.D()) break;
                    a3 = a2.d();
                    break;
                }
                case e: {
                    e2 = new e(a2.g(), null);
                }
            }
            this.b.add(new bj(this, e2, n3, am2, a3));
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.d(this.b.size());
        for (bj bj2 : this.b) {
            switch (this.a) {
                case a: {
                    a2.a(bj2.a().a());
                    a2.a(bj2.a().b());
                    a2.d(bj2.a().c().g());
                    for (com.c.a.d.a a3 : bj2.a().c().j()) {
                        a2.a(a3.a());
                        a2.a(a3.b());
                        if (a3.d()) {
                            a2.a(true);
                            a2.a(a3.c());
                            continue;
                        }
                        a2.a(false);
                    }
                    a2.d(bj2.c().a());
                    a2.d(bj2.b());
                    if (bj2.d() == null) {
                        a2.a(false);
                        break;
                    }
                    a2.a(true);
                    a2.a(bj2.d());
                    break;
                }
                case b: {
                    a2.a(bj2.a().a());
                    a2.d(bj2.c().a());
                    break;
                }
                case c: {
                    a2.a(bj2.a().a());
                    a2.d(bj2.b());
                    break;
                }
                case d: {
                    a2.a(bj2.a().a());
                    if (bj2.d() == null) {
                        a2.a(false);
                        break;
                    }
                    a2.a(true);
                    a2.a(bj2.d());
                    break;
                }
                case e: {
                    a2.a(bj2.a().a());
                }
            }
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    public List a() {
        return this.b;
    }

    public az b() {
        return this.a;
    }

    public String toString() {
        return cc.a((Object)this).a("action", (Object)this.a).a("entries", this.b).toString();
    }
}


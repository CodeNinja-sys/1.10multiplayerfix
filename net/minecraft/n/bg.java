/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.d.ov;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.e.n;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.h.y;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.q.k;

public class bg
extends aa {
    @Override
    public String a() {
        return "fill";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.fill.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        int n2;
        block24: {
            block19: {
                Object object;
                int n3;
                if (arrstring.length < 7) {
                    throw new ac("commands.fill.usage", new Object[0]);
                }
                az2.a(br.b, 0);
                net.minecraft.u.b.b b2 = bg.a(az2, arrstring, 0, false);
                net.minecraft.u.b.b b3 = bg.a(az2, arrstring, 3, false);
                cn cn2 = aa.c(az2, arrstring[6]);
                int n4 = 0;
                if (arrstring.length >= 8) {
                    n4 = bg.a(arrstring[7], 0, 15);
                }
                net.minecraft.u.b.b b4 = new net.minecraft.u.b.b(Math.min(b2.cy_(), b3.cy_()), Math.min(b2.k(), b3.k()), Math.min(b2.l(), b3.l()));
                net.minecraft.u.b.b b5 = new net.minecraft.u.b.b(Math.max(b2.cy_(), b3.cy_()), Math.max(b2.k(), b3.k()), Math.max(b2.l(), b3.l()));
                n2 = (b5.cy_() - b4.cy_() + 1) * (b5.k() - b4.k() + 1) * (b5.l() - b4.l() + 1);
                if (n2 > 32768) {
                    throw new o("commands.fill.tooManyBlocks", n2, 32768);
                }
                if (b4.k() < 0 || b5.k() >= 256) break block19;
                k k2 = az2.aE();
                for (int i2 = b4.l(); i2 <= b5.l(); i2 += 16) {
                    for (n3 = b4.cy_(); n3 <= b5.cy_(); n3 += 16) {
                        if (k2.d(new net.minecraft.u.b.b(n3, b5.k() - b4.k(), i2))) continue;
                        throw new o("commands.fill.outOfWorld", new Object[0]);
                    }
                }
                e e2 = new e();
                n3 = 0;
                if (arrstring.length >= 10 && cn2.n()) {
                    object = bg.a(az2, arrstring, 9).c();
                    try {
                        e2 = n.a((String)object);
                        n3 = 1;
                    }
                    catch (i i3) {
                        throw new o("commands.fill.tagError", i3.getMessage());
                    }
                }
                object = ov.a();
                n2 = 0;
                for (int i4 = b4.l(); i4 <= b5.l(); ++i4) {
                    for (int i5 = b4.k(); i5 <= b5.k(); ++i5) {
                        for (int i6 = b4.cy_(); i6 <= b5.cy_(); ++i6) {
                            ap ap2;
                            b b6;
                            Object object2;
                            net.minecraft.u.b.b b7;
                            block20: {
                                block21: {
                                    block23: {
                                        block22: {
                                            b7 = new net.minecraft.u.b.b(i6, i5, i4);
                                            if (arrstring.length < 9) break block20;
                                            if ("outline".equals(arrstring[8]) || "hollow".equals(arrstring[8])) break block21;
                                            if (!"destroy".equals(arrstring[8])) break block22;
                                            k2.b(b7, true);
                                            break block20;
                                        }
                                        if (!"keep".equals(arrstring[8])) break block23;
                                        if (!k2.c(b7)) {
                                            continue;
                                        }
                                        break block20;
                                    }
                                    if (!"replace".equals(arrstring[8]) || cn2.n()) break block20;
                                    if (arrstring.length > 9) {
                                        object2 = aa.c(az2, arrstring[9]);
                                        if (k2.n(b7).c() != object2) continue;
                                    }
                                    if (arrstring.length <= 10) break block20;
                                    int n5 = aa.a(arrstring[10]);
                                    b6 = k2.n(b7);
                                    if (b6.c().b(b6) != n5) {
                                        continue;
                                    }
                                    break block20;
                                }
                                if (i6 != b4.cy_() && i6 != b5.cy_() && i5 != b4.k() && i5 != b5.k() && i4 != b4.l() && i4 != b5.l()) {
                                    if (!"hollow".equals(arrstring[8])) continue;
                                    k2.a(b7, p.a.v(), 2);
                                    object.add(b7);
                                    continue;
                                }
                            }
                            if ((object2 = k2.q(b7)) != null) {
                                if (object2 instanceof y) {
                                    ((y)object2).j();
                                }
                                k2.a(b7, p.cv.v(), cn2 == p.cv ? 2 : 4);
                            }
                            if (!k2.a(b7, b6 = cn2.a(n4), 2)) continue;
                            object.add(b7);
                            ++n2;
                            if (n3 == 0 || (ap2 = k2.q(b7)) == null) continue;
                            e2.a("x", b7.cy_());
                            e2.a("y", b7.k());
                            e2.a("z", b7.l());
                            ap2.b(e2);
                        }
                    }
                }
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    net.minecraft.u.b.b b8 = (net.minecraft.u.b.b)iterator.next();
                    cn cn3 = k2.n(b8).c();
                    k2.a(b8, cn3);
                }
                if (n2 <= 0) {
                    throw new o("commands.fill.failed", new Object[0]);
                }
                break block24;
            }
            throw new o("commands.fill.outOfWorld", new Object[0]);
        }
        az2.a(br.b, n2);
        bg.a(az2, (t)this, "commands.fill.success", n2);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length > 0 && arrstring.length <= 3 ? bg.a(arrstring, 0, b2) : (arrstring.length > 3 && arrstring.length <= 6 ? bg.a(arrstring, 3, b2) : (arrstring.length == 7 ? bg.a(arrstring, cn.v.c()) : (arrstring.length == 9 ? bg.a(arrstring, "replace", "destroy", "keep", "hollow", "outline") : (arrstring.length == 10 && "replace".equals(arrstring[8]) ? bg.a(arrstring, cn.v.c()) : Collections.emptyList()))));
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import com.a.a.d.nj;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.a.p;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.r.d;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.u.b.b;
import net.minecraft.w.a.g;

public class i
extends aa {
    @Override
    public String a() {
        return "achievement";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.achievement.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new ac("commands.achievement.usage", new Object[0]);
        }
        k k2 = net.minecraft.r.o.a(arrstring[1]);
        if ((k2 != null || "*".equals(arrstring[1])) && (k2 == null || k2.d())) {
            g g2 = arrstring.length >= 3 ? i.a(a2, az2, arrstring[2]) : i.b(az2);
            boolean bl2 = "give".equalsIgnoreCase(arrstring[0]);
            boolean bl3 = "take".equalsIgnoreCase(arrstring[0]);
            if (bl2 || bl3) {
                if (k2 == null) {
                    if (bl2) {
                        for (d d2 : j.e) {
                            g2.a((k)d2);
                        }
                        i.a(az2, (t)this, "commands.achievement.give.success.all", g2.X());
                    } else if (bl3) {
                        for (d d3 : ov.b(j.e)) {
                            g2.b(d3);
                        }
                        i.a(az2, (t)this, "commands.achievement.take.success.all", g2.X());
                    }
                } else {
                    if (k2 instanceof d) {
                        d d4 = (d)k2;
                        if (bl2) {
                            if (g2.I().a(d4)) {
                                throw new o("commands.achievement.alreadyHave", g2.X(), k2.j());
                            }
                            ArrayList arrayList = ov.a();
                            while (d4.c != null && !g2.I().a(d4.c)) {
                                arrayList.add(d4.c);
                                d4 = d4.c;
                            }
                            for (d d5 : ov.b(arrayList)) {
                                g2.a((k)d5);
                            }
                        } else if (bl3) {
                            if (!g2.I().a(d4)) {
                                throw new o("commands.achievement.dontHave", g2.X(), k2.j());
                            }
                            ArrayList arrayList = ov.a(nj.b(j.e.iterator(), new p(this, g2, k2)));
                            ArrayList arrayList2 = ov.a((Iterable)arrayList);
                            Iterator iterator = arrayList.iterator();
                            while (iterator.hasNext()) {
                                d d6;
                                d d7 = d6 = (d)iterator.next();
                                boolean bl4 = false;
                                while (d7 != null) {
                                    if (d7 == k2) {
                                        bl4 = true;
                                    }
                                    d7 = d7.c;
                                }
                                if (bl4) continue;
                                d7 = d6;
                                while (d7 != null) {
                                    arrayList2.remove(d6);
                                    d7 = d7.c;
                                }
                            }
                            for (d d6 : arrayList2) {
                                g2.b(d6);
                            }
                        }
                    }
                    if (bl2) {
                        g2.a(k2);
                        i.a(az2, (t)this, "commands.achievement.give.success.one", g2.X(), k2.j());
                    } else if (bl3) {
                        g2.b(k2);
                        i.a(az2, (t)this, "commands.achievement.take.success.one", k2.j(), g2.X());
                    }
                }
            }
        } else {
            throw new o("commands.achievement.unknownAchievement", arrstring[1]);
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        if (arrstring.length == 1) {
            return i.a(arrstring, "give", "take");
        }
        if (arrstring.length != 2) {
            return arrstring.length == 3 ? i.a(arrstring, a2.T()) : Collections.emptyList();
        }
        ArrayList arrayList = ov.a();
        for (k k2 : j.e) {
            arrayList.add(k2.e);
        }
        return i.a(arrstring, arrayList);
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 2;
    }
}


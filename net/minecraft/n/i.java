/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.ag;
import net.minecraft.n.ao;
import net.minecraft.n.az;
import net.minecraft.n.ba;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.n.w;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.u.d.l;
import net.minecraft.w.a.b;

public class i
extends aa {
    @Override
    public String a() {
        return "spreadplayers";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.spreadplayers.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 6) {
            throw new ac("commands.spreadplayers.usage", new Object[0]);
        }
        int n2 = 0;
        net.minecraft.u.b.b b2 = az2.aC();
        double d2 = i.b(b2.cy_(), arrstring[n2++], true);
        double d3 = i.b(b2.l(), arrstring[n2++], true);
        double d4 = i.a(arrstring[n2++], 0.0);
        double d5 = i.a(arrstring[n2++], d4 + 1.0);
        boolean bl2 = i.d(arrstring[n2++]);
        ArrayList arrayList = ov.a();
        while (n2 < arrstring.length) {
            Object object;
            String string;
            if (ao.b(string = arrstring[n2++])) {
                object = ao.b(az2, string, net.minecraft.w.n.class);
                if (object.isEmpty()) {
                    throw new ba();
                }
                arrayList.addAll(object);
                continue;
            }
            object = a2.av().a(string);
            if (object == null) {
                throw new ag();
            }
            arrayList.add(object);
        }
        az2.a(br.c, arrayList.size());
        if (arrayList.isEmpty()) {
            throw new ba();
        }
        az2.a(new l("commands.spreadplayers.spreading." + (bl2 ? "teams" : "players"), arrayList.size(), d5, d2, d3, d4));
        this.a(az2, arrayList, new w(d2, d3), d4, d5, ((net.minecraft.w.n)arrayList.get((int)0)).aQ, bl2);
    }

    private void a(az az2, List list, w w2, double d2, double d3, k k2, boolean bl2) {
        Random random = new Random();
        double d4 = w2.a - d3;
        double d5 = w2.b - d3;
        double d6 = w2.a + d3;
        double d7 = w2.b + d3;
        w[] arrw = this.a(random, bl2 ? this.b(list) : list.size(), d4, d5, d6, d7);
        int n2 = this.a(w2, d2, k2, random, d4, d5, d6, d7, arrw, bl2);
        double d8 = this.a(list, k2, arrw, bl2);
        i.a(az2, (t)this, "commands.spreadplayers.success." + (bl2 ? "teams" : "players"), arrw.length, w2.a, w2.b);
        if (arrw.length > 1) {
            az2.a(new l("commands.spreadplayers.info." + (bl2 ? "teams" : "players"), String.format("%.2f", d8), n2));
        }
    }

    private int b(List list) {
        HashSet hashSet = aad.a();
        for (net.minecraft.w.n n2 : list) {
            if (n2 instanceof b) {
                hashSet.add(((b)n2).aA());
                continue;
            }
            hashSet.add(null);
        }
        return hashSet.size();
    }

    private int a(w w2, double d2, k k2, Random random, double d3, double d4, double d5, double d6, w[] arrw, boolean bl2) {
        int n2;
        boolean bl3 = true;
        double d7 = 3.4028234663852886E38;
        for (n2 = 0; n2 < 10000 && bl3; ++n2) {
            Object object;
            int n3;
            bl3 = false;
            d7 = 3.4028234663852886E38;
            for (int i2 = 0; i2 < arrw.length; ++i2) {
                w w3 = arrw[i2];
                n3 = 0;
                object = new w();
                for (int i3 = 0; i3 < arrw.length; ++i3) {
                    if (i2 == i3) continue;
                    w w4 = arrw[i3];
                    double d8 = w3.a(w4);
                    d7 = Math.min(d8, d7);
                    if (!(d8 < d2)) continue;
                    ++n3;
                    ((w)object).a += w4.a - w3.a;
                    ((w)object).b += w4.b - w3.b;
                }
                if (n3 > 0) {
                    ((w)object).a /= (double)n3;
                    ((w)object).b /= (double)n3;
                    double d9 = ((w)object).b();
                    if (d9 > 0.0) {
                        ((w)object).a();
                        w3.b((w)object);
                    } else {
                        w3.a(random, d3, d4, d5, d6);
                    }
                    bl3 = true;
                }
                if (!w3.a(d3, d4, d5, d6)) continue;
                bl3 = true;
            }
            if (bl3) continue;
            object = arrw;
            n3 = arrw.length;
            for (int i4 = 0; i4 < n3; ++i4) {
                w w5 = object[i4];
                if (w5.b(k2)) continue;
                w5.a(random, d3, d4, d5, d6);
                bl3 = true;
            }
        }
        if (n2 >= 10000) {
            throw new o("commands.spreadplayers.failure." + (bl2 ? "teams" : "players"), arrw.length, w2.a, w2.b, String.format("%.2f", d7));
        }
        return n2;
    }

    private double a(List list, k k2, w[] arrw, boolean bl2) {
        double d2 = 0.0;
        int n2 = 0;
        HashMap hashMap = sz.c();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            w w2;
            net.minecraft.w.n n3 = (net.minecraft.w.n)list.get(i2);
            if (bl2) {
                net.minecraft.j.i i3;
                net.minecraft.j.i i4 = i3 = n3 instanceof b ? ((b)n3).aA() : null;
                if (!hashMap.containsKey(i3)) {
                    hashMap.put(i3, arrw[n2++]);
                }
                w2 = (w)hashMap.get(i3);
            } else {
                w2 = arrw[n2++];
            }
            n3.d((float)n.c(w2.a) + 0.5f, w2.a(k2), (double)n.c(w2.b) + 0.5);
            double d3 = Double.MAX_VALUE;
            w[] arrw2 = arrw;
            int n4 = arrw.length;
            for (int i5 = 0; i5 < n4; ++i5) {
                w w3 = arrw2[i5];
                if (w2 == w3) continue;
                double d4 = w2.a(w3);
                d3 = Math.min(d4, d3);
            }
            d2 += d3;
        }
        return d2 /= (double)list.size();
    }

    private w[] a(Random random, int n2, double d2, double d3, double d4, double d5) {
        w[] arrw = new w[n2];
        for (int i2 = 0; i2 < arrw.length; ++i2) {
            w w2 = new w();
            w2.a(random, d2, d3, d4, d5);
            arrw[i2] = w2;
        }
        return arrw;
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length >= 1 && arrstring.length <= 2 ? i.b(arrstring, 0, b2) : Collections.emptyList();
    }
}


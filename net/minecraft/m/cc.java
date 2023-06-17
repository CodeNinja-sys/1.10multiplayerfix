/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.m;
import net.minecraft.w.a.b;

public class cc
extends cg {
    public static a a(cu cu2, String string) {
        e e2;
        if (cu2.n() && (e2 = cu2.o().o("Explosion")) != null) {
            return e2.c(string);
        }
        return null;
    }

    @Override
    public void a(cu cu2, b b2, List list, boolean bl2) {
        e e2;
        if (cu2.n() && (e2 = cu2.o().o("Explosion")) != null) {
            cc.a(e2, list);
        }
    }

    public static void a(e e2, List list) {
        boolean bl2;
        int[] arrn;
        int n2;
        int n3;
        int n4;
        int n5;
        byte by2 = e2.f("Type");
        if (by2 >= 0 && by2 <= 4) {
            list.add(net.minecraft.u.d.b.a.a("item.fireworksCharge.type." + by2).trim());
        } else {
            list.add(net.minecraft.u.d.b.a.a("item.fireworksCharge.type").trim());
        }
        int[] arrn2 = e2.n("Colors");
        if (arrn2.length > 0) {
            boolean bl3 = true;
            String string = "";
            int[] arrn3 = arrn2;
            n5 = arrn2.length;
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = arrn3[n4];
                if (!bl3) {
                    string = String.valueOf(string) + ", ";
                }
                bl3 = false;
                boolean bl4 = false;
                for (n2 = 0; n2 < m.a.length; ++n2) {
                    if (n3 != m.a[n2]) continue;
                    bl4 = true;
                    string = String.valueOf(string) + net.minecraft.u.d.b.a.a("item.fireworksCharge." + cd.a(n2).d());
                    break;
                }
                if (bl4) continue;
                string = String.valueOf(string) + net.minecraft.u.d.b.a.a("item.fireworksCharge.customColor");
            }
            list.add(string);
        }
        if ((arrn = e2.n("FadeColors")).length > 0) {
            boolean bl5 = true;
            String string = String.valueOf(net.minecraft.u.d.b.a.a("item.fireworksCharge.fadeTo")) + " ";
            int[] arrn4 = arrn;
            int n6 = arrn.length;
            for (n5 = 0; n5 < n6; ++n5) {
                n4 = arrn4[n5];
                if (!bl5) {
                    string = String.valueOf(string) + ", ";
                }
                bl5 = false;
                n2 = 0;
                for (int i2 = 0; i2 < 16; ++i2) {
                    if (n4 != m.a[i2]) continue;
                    n2 = 1;
                    string = String.valueOf(string) + net.minecraft.u.d.b.a.a("item.fireworksCharge." + cd.a(i2).d());
                    break;
                }
                if (n2 != 0) continue;
                string = String.valueOf(string) + net.minecraft.u.d.b.a.a("item.fireworksCharge.customColor");
            }
            list.add(string);
        }
        if (bl2 = e2.p("Trail")) {
            list.add(net.minecraft.u.d.b.a.a("item.fireworksCharge.trail"));
        }
        if ((n3 = e2.p("Flicker")) != 0) {
            list.add(net.minecraft.u.d.b.a.a("item.fireworksCharge.flicker"));
        }
    }
}


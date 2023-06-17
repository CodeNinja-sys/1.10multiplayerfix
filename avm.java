/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class avm
extends azg {
    public static azt a(bhl bhl2, String string) {
        bvp bvp2;
        if (bhl2.n() && (bvp2 = bhl2.o().o("Explosion")) != null) {
            return bvp2.c(string);
        }
        return null;
    }

    @Override
    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
        bvp bvp2;
        if (bhl2.n() && (bvp2 = bhl2.o().o("Explosion")) != null) {
            avm.a(bvp2, list);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(bvp bvp2, List list) {
        boolean bl2;
        boolean bl3;
        int[] arrn;
        int n2;
        byte by2 = bvp2.f("Type");
        if (by2 >= 0 && by2 <= 4) {
            list.add(caf.a("item.fireworksCharge.type." + by2).trim());
        } else {
            list.add(caf.a("item.fireworksCharge.type").trim());
        }
        int[] arrn2 = bvp2.n("Colors");
        if (arrn2.length > 0) {
            boolean bl4 = true;
            String string = "";
            for (int n3 : arrn2) {
                if (!bl4) {
                    string = string + ", ";
                }
                bl4 = false;
                int n4 = 0;
                for (n2 = 0; n2 < hr.a.length; ++n2) {
                    if (n3 != hr.a[n2]) continue;
                    n4 = 1;
                    string = string + caf.a("item.fireworksCharge." + dck.a(n2).d());
                    break;
                }
                if (n4 != 0) continue;
                string = string + caf.a("item.fireworksCharge.customColor");
            }
            list.add(string);
        }
        if ((arrn = bvp2.n("FadeColors")).length > 0) {
            void var6_11;
            boolean bl5 = true;
            String bl22 = caf.a("item.fireworksCharge.fadeTo") + " ";
            for (int n4 : arrn) {
                if (!bl5) {
                    String string = (String)var6_11 + ", ";
                }
                bl5 = false;
                n2 = 0;
                for (int i2 = 0; i2 < 16; ++i2) {
                    if (n4 != hr.a[i2]) continue;
                    n2 = 1;
                    String string = (String)var6_11 + caf.a("item.fireworksCharge." + dck.a(i2).d());
                    break;
                }
                if (n2 != 0) continue;
                String string = (String)var6_11 + caf.a("item.fireworksCharge.customColor");
            }
            list.add(var6_11);
        }
        if (bl3 = bvp2.p("Trail")) {
            list.add(caf.a("item.fireworksCharge.trail"));
        }
        if (bl2 = bvp2.p("Flicker")) {
            list.add(caf.a("item.fireworksCharge.flicker"));
        }
    }
}


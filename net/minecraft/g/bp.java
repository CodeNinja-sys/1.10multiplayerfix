/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.bn;
import net.minecraft.g.c.b;
import net.minecraft.g.cf;
import net.minecraft.g.dg;
import net.minecraft.g.fq;
import net.minecraft.g.gg;
import net.minecraft.g.hm;
import net.minecraft.u.at;

public abstract class bp
extends Enum
implements at {
    public static final /* enum */ bp a = new bn(0, "stone");
    public static final /* enum */ bp b = new cf(1, "cobblestone", "cobble");
    public static final /* enum */ bp c = new fq(2, "stone_brick", "brick");
    public static final /* enum */ bp d = new gg(3, "mossy_brick", "mossybrick");
    public static final /* enum */ bp e = new dg(4, "cracked_brick", "crackedbrick");
    public static final /* enum */ bp f = new hm(5, "chiseled_brick", "chiseledbrick");
    private static final bp[] g;
    private final int h;
    private final String i;
    private final String j;
    private static final /* synthetic */ bp[] k;

    static {
        k = new bp[]{a, b, c, d, e, f};
        g = new bp[bp.values().length];
        bp[] arrbp = bp.values();
        int n2 = arrbp.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            bp bp2;
            bp.g[bp2.c()] = bp2 = arrbp[i2];
        }
    }

    /*
     * WARNING - void declaration
     */
    private bp() {
        this((String)var1_-1, (int)var2_-1, (int)var3_1, (String)var4_2, (String)var4_2);
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bp(String string) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.h = (int)string;
        this.i = var4_2;
        this.j = var5_3;
    }

    public int c() {
        return this.h;
    }

    public String toString() {
        return this.i;
    }

    public static bp a(int n2) {
        if (n2 < 0 || n2 >= g.length) {
            n2 = 0;
        }
        return g[n2];
    }

    @Override
    public String a() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    public abstract b b();

    public static bp a(b b2) {
        for (bp bp2 : bp.values()) {
            if (b2 != bp2.b()) continue;
            return bp2;
        }
        return a;
    }

    public static bp[] values() {
        bp[] arrbp = k;
        int n2 = arrbp.length;
        bp[] arrbp2 = new bp[n2];
        System.arraycopy(k, 0, arrbp2, 0, n2);
        return arrbp2;
    }

    public static bp valueOf(String string) {
        return Enum.valueOf(bp.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ bp(int n2, String string, bp bp2) {
        this((String)var1_-1, (int)string, (int)bp2, (String)var4_3);
        void var4_3;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ bp(int n2, String string, String string2, bp bp2) {
        this((String)var1_-1, (int)string, (int)string2, (String)((Object)bp2), (String)var5_4);
        void var5_4;
        void var1_-1;
    }
}


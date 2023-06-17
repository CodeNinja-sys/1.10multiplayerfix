/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.ae;
import net.minecraft.client.g.bz;
import net.minecraft.client.g.cb;

public abstract class bq
extends Enum {
    public static final /* enum */ bq a = new ae();
    public static final /* enum */ bq b = new cb();
    public static final /* enum */ bq c = new bz();
    private static final /* synthetic */ bq[] d;

    static {
        d = new bq[]{a, b, c};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bq() {
        void var2_-1;
        void var1_-1;
    }

    public abstract void a();

    public abstract void b();

    public static bq[] values() {
        bq[] arrbq = d;
        int n2 = arrbq.length;
        bq[] arrbq2 = new bq[n2];
        System.arraycopy(d, 0, arrbq2, 0, n2);
        return arrbq2;
    }

    public static bq valueOf(String string) {
        return Enum.valueOf(bq.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ bq(bq bq2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }
}


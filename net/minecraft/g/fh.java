/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.d.cm;
import com.a.a.d.ov;
import java.util.Collection;
import net.minecraft.g.ak;
import net.minecraft.g.cp;
import net.minecraft.u.at;

public enum fh implements at
{
    a(ak.a, 0, "dandelion"),
    b(ak.b, 0, "poppy"),
    c(ak.b, 1, "blue_orchid", "blueOrchid"),
    d(ak.b, 2, "allium"),
    e(ak.b, 3, "houstonia"),
    f(ak.b, 4, "red_tulip", "tulipRed"),
    g(ak.b, 5, "orange_tulip", "tulipOrange"),
    h(ak.b, 6, "white_tulip", "tulipWhite"),
    i(ak.b, 7, "pink_tulip", "tulipPink"),
    j(ak.b, 8, "oxeye_daisy", "oxeyeDaisy");

    private static final fh[][] k;
    private final ak l;
    private final int m;
    private final String n;
    private final String o;

    static {
        k = new fh[ak.values().length][];
        for (ak ak2 : ak.values()) {
            Collection collection = cm.a((Collection)ov.a(fh.values()), new cp(ak2));
            fh.k[ak2.ordinal()] = collection.toArray(new fh[collection.size()]);
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fh(String string) {
        this((String)var1_-1, (int)var2_-1, (ak)((Object)string), (int)var4_2, (String)var5_3, (String)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fh(String string, String string2) {
        void var6_4;
        void var5_3;
        this.l = string;
        this.m = (int)string2;
        this.n = var5_3;
        this.o = var6_4;
    }

    public ak b() {
        return this.l;
    }

    public int c() {
        return this.m;
    }

    public static fh a(ak ak2, int n2) {
        fh[] arrfh = k[ak2.ordinal()];
        if (n2 < 0 || n2 >= arrfh.length) {
            n2 = 0;
        }
        return arrfh[n2];
    }

    public static fh[] a(ak ak2) {
        return k[ak2.ordinal()];
    }

    public String toString() {
        return this.n;
    }

    @Override
    public String a() {
        return this.n;
    }

    public String d() {
        return this.o;
    }
}


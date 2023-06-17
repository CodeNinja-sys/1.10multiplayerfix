/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.a.w;
import net.minecraft.m.cg;
import net.minecraft.m.cu;

public enum z {
    a(0),
    b(5, "iron", "meo"),
    c(7, "gold", "goo"),
    d(11, "diamond", "dio");

    private final String e;
    private final String f;
    private final int g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private z() {
        void var3_1;
        this.g = var3_1;
        this.e = null;
        this.f = "";
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private z(String string) {
        void var5_3;
        void var4_2;
        this.g = (int)string;
        this.e = "textures/entity/horse/armor/horse_armor_" + (String)var4_2 + ".png";
        this.f = var5_3;
    }

    public int a() {
        return this.ordinal();
    }

    public String b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    public String d() {
        return this.e;
    }

    public static z a(int n2) {
        return z.values()[n2];
    }

    public static z a(cu cu2) {
        return cu2 == null ? a : z.a(cu2.a());
    }

    public static z a(cg cg2) {
        return cg2 == w.cu ? b : (cg2 == w.cv ? c : (cg2 == w.cw ? d : a));
    }

    public static boolean b(cg cg2) {
        return z.a(cg2) != a;
    }
}


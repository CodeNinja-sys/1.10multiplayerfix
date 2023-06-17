/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.sz;
import java.util.Map;
import java.util.Set;

public enum aj {
    a("explode", 0, true),
    b("largeexplode", 1, true),
    c("hugeexplosion", 2, true),
    d("fireworksSpark", 3, false),
    e("bubble", 4, false),
    f("splash", 5, false),
    g("wake", 6, false),
    h("suspended", 7, false),
    i("depthsuspend", 8, false),
    j("crit", 9, false),
    k("magicCrit", 10, false),
    l("smoke", 11, false),
    m("largesmoke", 12, false),
    n("spell", 13, false),
    o("instantSpell", 14, false),
    p("mobSpell", 15, false),
    q("mobSpellAmbient", 16, false),
    r("witchMagic", 17, false),
    s("dripWater", 18, false),
    t("dripLava", 19, false),
    u("angryVillager", 20, false),
    v("happyVillager", 21, false),
    w("townaura", 22, false),
    x("note", 23, false),
    y("portal", 24, false),
    z("enchantmenttable", 25, false),
    A("flame", 26, false),
    B("lava", 27, false),
    C("footstep", 28, false),
    D("cloud", 29, false),
    E("reddust", 30, false),
    F("snowballpoof", 31, false),
    G("snowshovel", 32, false),
    H("slime", 33, false),
    I("heart", 34, false),
    J("barrier", 35, false),
    K("iconcrack", 36, false, 2),
    L("blockcrack", 37, false, 1),
    M("blockdust", 38, false, 1),
    N("droplet", 39, false),
    O("take", 40, false),
    P("mobappearance", 41, true),
    Q("dragonbreath", 42, false),
    R("endRod", 43, false),
    S("damageIndicator", 44, true),
    T("sweepAttack", 45, true),
    U("fallingdust", 46, false, 1);

    private final String V;
    private final int W;
    private final boolean X;
    private final int Y;
    private static final Map Z;
    private static final Map aa;

    static {
        Z = sz.c();
        aa = sz.c();
        for (aj aj2 : aj.values()) {
            Z.put(aj2.c(), aj2);
            aa.put(aj2.b(), aj2);
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aj(boolean bl2, int n2) {
        void var6_4;
        void var5_3;
        this.V = (String)bl2;
        this.W = n2;
        this.X = var5_3;
        this.Y = var6_4;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aj(boolean bl2) {
        this((String)var1_-1, (int)var2_-1, (String)bl2, (int)var4_2, (boolean)var5_3, 0);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    public static Set a() {
        return aa.keySet();
    }

    public String b() {
        return this.V;
    }

    public int c() {
        return this.W;
    }

    public int d() {
        return this.Y;
    }

    public boolean e() {
        return this.X;
    }

    public static aj a(int n2) {
        return (aj)((Object)Z.get(n2));
    }

    public static aj a(String string) {
        return (aj)((Object)aa.get(string));
    }
}


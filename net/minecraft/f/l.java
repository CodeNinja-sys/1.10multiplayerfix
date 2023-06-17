/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.fh;
import net.minecraft.m.cu;

public enum l {
    a("base", "b"),
    b("square_bottom_left", "bl", "   ", "   ", "#  "),
    c("square_bottom_right", "br", "   ", "   ", "  #"),
    d("square_top_left", "tl", "#  ", "   ", "   "),
    e("square_top_right", "tr", "  #", "   ", "   "),
    f("stripe_bottom", "bs", "   ", "   ", "###"),
    g("stripe_top", "ts", "###", "   ", "   "),
    h("stripe_left", "ls", "#  ", "#  ", "#  "),
    i("stripe_right", "rs", "  #", "  #", "  #"),
    j("stripe_center", "cs", " # ", " # ", " # "),
    k("stripe_middle", "ms", "   ", "###", "   "),
    l("stripe_downright", "drs", "#  ", " # ", "  #"),
    m("stripe_downleft", "dls", "  #", " # ", "#  "),
    n("small_stripes", "ss", "# #", "# #", "   "),
    o("cross", "cr", "# #", " # ", "# #"),
    p("straight_cross", "sc", " # ", "###", " # "),
    q("triangle_bottom", "bt", "   ", " # ", "# #"),
    r("triangle_top", "tt", "# #", " # ", "   "),
    s("triangles_bottom", "bts", "   ", "# #", " # "),
    t("triangles_top", "tts", " # ", "# #", "   "),
    u("diagonal_left", "ld", "## ", "#  ", "   "),
    v("diagonal_up_right", "rd", "   ", "  #", " ##"),
    w("diagonal_up_left", "lud", "   ", "#  ", "## "),
    x("diagonal_right", "rud", " ##", "  #", "   "),
    y("circle", "mc", "   ", " # ", "   "),
    z("rhombus", "mr", " # ", "# #", " # "),
    A("half_vertical", "vh", "## ", "## ", "## "),
    B("half_horizontal", "hh", "###", "###", "   "),
    C("half_vertical_right", "vhr", " ##", " ##", " ##"),
    D("half_horizontal_bottom", "hhb", "   ", "###", "###"),
    E("border", "bo", "###", "# #", "###"),
    F("curly_border", "cbo", new cu(net.minecraft.a.p.bn)),
    G("creeper", "cre", new cu(net.minecraft.a.w.ch, 1, 4)),
    H("gradient", "gra", "# #", " # ", " # "),
    I("gradient_up", "gru", " # ", " # ", "# #"),
    J("bricks", "bri", new cu(net.minecraft.a.p.V)),
    K("skull", "sku", new cu(net.minecraft.a.w.ch, 1, 1)),
    L("flower", "flo", new cu(net.minecraft.a.p.O, 1, fh.j.c())),
    M("mojang", "moj", new cu(net.minecraft.a.w.aq, 1, 1));

    private final String N;
    private final String O;
    private final String[] P = new String[3];
    private cu Q;

    /*
     * WARNING - void declaration
     */
    private l() {
        void var4_2;
        void var3_1;
        this.N = var3_1;
        this.O = var4_2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l(cu cu2) {
        this((String)var1_-1, (int)var2_-1, (String)((Object)cu2), (String)var4_2);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.Q = var5_3;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l(String string3, String string4, String string5) {
        this((String)var1_-1, (int)var2_-1, string3, string4);
        void var7_5;
        void var6_4;
        void var2_-1;
        void var1_-1;
        this.P[0] = string5;
        this.P[1] = var6_4;
        this.P[2] = var7_5;
    }

    public String a() {
        return this.N;
    }

    public String b() {
        return this.O;
    }

    public String[] c() {
        return this.P;
    }

    public boolean d() {
        return this.Q != null || this.P[0] != null;
    }

    public boolean e() {
        return this.Q != null;
    }

    public cu f() {
        return this.Q;
    }

    public static l a(String string) {
        for (l l2 : net.minecraft.f.l.values()) {
            if (!l2.O.equals(string)) continue;
            return l2;
        }
        return null;
    }
}


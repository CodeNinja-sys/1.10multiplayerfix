/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum ht implements at
{
    a("empty"),
    b("rose"),
    c("blue_orchid"),
    d("allium"),
    e("houstonia"),
    f("red_tulip"),
    g("orange_tulip"),
    h("white_tulip"),
    i("pink_tulip"),
    j("oxeye_daisy"),
    k("dandelion"),
    l("oak_sapling"),
    m("spruce_sapling"),
    n("birch_sapling"),
    o("jungle_sapling"),
    p("acacia_sapling"),
    q("dark_oak_sapling"),
    r("mushroom_red"),
    s("mushroom_brown"),
    t("dead_bush"),
    u("fern"),
    v("cactus");

    private final String w;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ht() {
        void var3_1;
        this.w = var3_1;
    }

    public String toString() {
        return this.w;
    }

    @Override
    public String a() {
        return this.w;
    }
}


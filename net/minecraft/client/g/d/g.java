/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.d;

public enum g {
    a("Position"),
    b("Normal"),
    c("Vertex Color"),
    d("UV"),
    e("Bone Matrix"),
    f("Blend Weight"),
    g("Padding");

    private final String h;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g() {
        void var3_1;
        this.h = var3_1;
    }

    public String a() {
        return this.h;
    }
}


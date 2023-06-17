/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.i;

import net.minecraft.u.d.a;
import net.minecraft.u.d.l;

public enum f {
    a("enabled"),
    b("disabled"),
    c("prompt");

    private final a d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f() {
        void var3_1;
        this.d = new l("addServer.resourcePack." + (String)var3_1, new Object[0]);
    }

    public a a() {
        return this.d;
    }
}


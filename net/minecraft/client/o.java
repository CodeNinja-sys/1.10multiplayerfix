/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client;

import net.minecraft.client.b.a;
import net.minecraft.client.r;
import net.minecraft.r.m;

class o
implements m {
    final /* synthetic */ r a;

    o(r r2) {
        this.a = r2;
    }

    @Override
    public String a(String string) {
        try {
            return String.format(string, net.minecraft.client.b.a.a(this.a.w.Z.j()));
        }
        catch (Exception exception) {
            return "Error: " + exception.getLocalizedMessage();
        }
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client;

import net.minecraft.client.m;
import net.minecraft.client.r;
import net.minecraft.k.p;

class t
implements p {
    final /* synthetic */ r a;

    t(r r2) {
        this.a = r2;
    }

    public String a() {
        String string = m.a();
        return !"vanilla".equals(string) ? "Definitely; Client brand changed to '" + string + "'" : (r.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.");
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.a;

import net.minecraft.c.a.d;
import net.minecraft.client.m;
import net.minecraft.client.r;
import net.minecraft.k.p;

class f
implements p {
    final /* synthetic */ d a;

    f(d d2) {
        this.a = d2;
    }

    public String a() {
        String string = m.a();
        if (!string.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        string = this.a.V();
        return !"vanilla".equals(string) ? "Definitely; Server brand changed to '" + string + "'" : (r.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and both client + server brands are untouched.");
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}


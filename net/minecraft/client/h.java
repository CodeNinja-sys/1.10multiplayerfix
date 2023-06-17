/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client;

import net.minecraft.client.r;
import net.minecraft.k.p;

class h
implements p {
    final /* synthetic */ r a;

    h(r r2) {
        this.a = r2;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : this.a.w.l) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(string);
            if (!this.a.w.m.contains(string)) continue;
            stringBuilder.append(" (incompatible)");
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}


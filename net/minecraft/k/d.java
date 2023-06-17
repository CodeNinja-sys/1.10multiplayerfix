/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import net.minecraft.k.a;
import net.minecraft.k.p;

class d
implements p {
    final /* synthetic */ a a;

    d(a a2) {
        this.a = a2;
    }

    public String a() {
        return String.valueOf(System.getProperty("java.version")) + ", " + System.getProperty("java.vendor");
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}


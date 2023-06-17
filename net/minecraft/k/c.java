/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import net.minecraft.k.a;
import net.minecraft.k.p;

class c
implements p {
    final /* synthetic */ a a;

    c(a a2) {
        this.a = a2;
    }

    public String a() {
        return String.valueOf(System.getProperty("os.name")) + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}


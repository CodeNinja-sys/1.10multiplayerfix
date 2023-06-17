/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import net.minecraft.k.a;
import net.minecraft.k.p;

class e
implements p {
    final /* synthetic */ a a;

    e(a a2) {
        this.a = a2;
    }

    public String a() {
        return String.valueOf(System.getProperty("java.vm.name")) + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}


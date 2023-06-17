/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.k.p;
import net.minecraft.w.w;

class y
implements p {
    final /* synthetic */ w a;
    private final /* synthetic */ int b;

    y(w w2, int n2) {
        this.a = w2;
        this.b = n2;
    }

    public String a() {
        String string = "Once per " + this.b + " ticks";
        if (this.b == Integer.MAX_VALUE) {
            string = "Maximum (" + string + ")";
        }
        return string;
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.cc;
import net.minecraft.client.k.cv;
import net.minecraft.k.p;

class o
implements p {
    final /* synthetic */ cc a;
    private final /* synthetic */ cv b;

    o(cc cc2, cv cv2) {
        this.a = cc2;
        this.b = cv2;
    }

    public String a() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", this.b.a(), this.b.b(), cc.a((cc)this.a).e, cc.a((cc)this.a).f, this.b.e());
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.cc;
import net.minecraft.k.p;
import org.lwjgl.a.j;

class cd
implements p {
    final /* synthetic */ cc a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;

    cd(cc cc2, int n2, int n3) {
        this.a = cc2;
        this.b = n2;
        this.c = n3;
    }

    public String a() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", this.b, this.c, j.q(), j.r());
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import net.minecraft.k.p;
import net.minecraft.q.g.c.at;

class l
implements p {
    final /* synthetic */ at a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;

    l(at at2, int n2, int n3) {
        this.a = at2;
        this.b = n2;
        this.c = n3;
    }

    public String a() {
        return this.a.a(this.b, this.c) ? "True" : "False";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}


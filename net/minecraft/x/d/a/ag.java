/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.u.ah;
import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class ag
implements p {
    private ah a;

    public ag() {
    }

    public ag(ah ah2) {
        this.a = ah2;
    }

    @Override
    public void a(a a2) {
        this.a = (ah)a2.a(ah.class);
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public ah a() {
        return this.a;
    }
}


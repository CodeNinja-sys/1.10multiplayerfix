/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class aj
implements p {
    private boolean a;
    private boolean b;

    public aj() {
    }

    public aj(boolean bl2, boolean bl3) {
        this.a = bl2;
        this.b = bl3;
    }

    @Override
    public void a(a a2) {
        this.a = a2.D();
        this.b = a2.D();
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
        a2.a(this.b);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }
}


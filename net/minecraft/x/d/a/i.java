/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import java.util.UUID;
import net.minecraft.q.v;
import net.minecraft.w.n;
import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class i
implements p {
    private UUID a;

    public i() {
    }

    public i(UUID uUID) {
        this.a = uUID;
    }

    @Override
    public void a(a a2) {
        this.a = a2.g();
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public n a(v v2) {
        return v2.b(this.a);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c;

import com.a.a.b.cm;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.c.d;
import net.minecraft.q.k;

public class a {
    private final k a;
    private final net.minecraft.u.b.b b;
    private final boolean c;
    private b d;
    private ap e;
    private boolean f;

    public a(k k2, net.minecraft.u.b.b b2, boolean bl2) {
        this.a = k2;
        this.b = b2;
        this.c = bl2;
    }

    public b a() {
        if (this.d == null && (this.c || this.a.d(this.b))) {
            this.d = this.a.n(this.b);
        }
        return this.d;
    }

    public ap b() {
        if (this.e == null && !this.f) {
            this.e = this.a.q(this.b);
            this.f = true;
        }
        return this.e;
    }

    public net.minecraft.u.b.b c() {
        return this.b;
    }

    public static cm a(cm cm2) {
        return new d(cm2);
    }
}


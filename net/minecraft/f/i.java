/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import java.util.Random;
import net.minecraft.e.e;
import net.minecraft.f.ar;
import net.minecraft.q.a.a.g;
import net.minecraft.q.a.a.r;
import net.minecraft.q.v;
import net.minecraft.u.bp;
import net.minecraft.w.a.b;

public abstract class i
extends ar
implements g {
    protected bp a;
    protected long b;

    protected boolean c(e e2) {
        if (e2.b("LootTable", 8)) {
            this.a = new bp(e2.l("LootTable"));
            this.b = e2.i("LootTableSeed");
            return true;
        }
        return false;
    }

    protected boolean d(e e2) {
        if (this.a != null) {
            e2.a("LootTable", this.a.toString());
            if (this.b != 0L) {
                e2.a("LootTableSeed", this.b);
            }
            return true;
        }
        return false;
    }

    protected void a(b b2) {
        if (this.a != null) {
            net.minecraft.q.a.a.i i2 = this.k.W().a(this.a);
            this.a = null;
            Random random = this.b == 0L ? new Random() : new Random(this.b);
            r r2 = new r((v)this.k);
            if (b2 != null) {
                r2.a(b2.aM());
            }
            i2.a(this, random, r2.a());
        }
    }

    @Override
    public bp b() {
        return this.a;
    }

    public void a(bp bp2, long l2) {
        this.a = bp2;
        this.b = l2;
    }
}


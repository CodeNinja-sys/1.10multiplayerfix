/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import java.util.Random;
import net.minecraft.client.c.ac;
import net.minecraft.client.c.e;
import net.minecraft.client.c.z;
import net.minecraft.client.r;
import net.minecraft.u.aw;
import net.minecraft.u.b.n;

public class g
implements aw {
    private final Random a = new Random();
    private final r b;
    private z c;
    private int d = 100;

    public g(r r2) {
        this.b = r2;
    }

    @Override
    public void a() {
        ac ac2 = this.b.V();
        if (this.c != null) {
            if (!ac2.a().a().equals(this.c.c())) {
                this.b.U().b(this.c);
                this.d = n.a(this.a, 0, ac2.b() / 2);
            }
            if (!this.b.U().c(this.c)) {
                this.c = null;
                this.d = Math.min(n.a(this.a, ac2.b(), ac2.c()), this.d);
            }
        }
        this.d = Math.min(this.d, ac2.c());
        if (this.c == null && this.d-- <= 0) {
            this.a(ac2);
        }
    }

    public void a(ac ac2) {
        this.c = e.a(ac2.a());
        this.b.U().a(this.c);
        this.d = Integer.MAX_VALUE;
    }

    public void b() {
        if (this.c != null) {
            this.b.U().b(this.c);
            this.c = null;
            this.d = 0;
        }
    }
}


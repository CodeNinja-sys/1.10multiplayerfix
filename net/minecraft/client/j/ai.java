/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class ai
extends ap {
    w a;
    w b;
    w c;
    w d;

    public ai(int n2) {
        if (n2 > 0) {
            this.a = new w(this, 0, n2);
            this.a.a(-3.0f, 17.0f, -3.0f, 6, 6, 6);
            this.b = new w(this, 32, 0);
            this.b.a(-3.25f, 18.0f, -3.5f, 2, 2, 2);
            this.c = new w(this, 32, 4);
            this.c.a(1.25f, 18.0f, -3.5f, 2, 2, 2);
            this.d = new w(this, 32, 8);
            this.d.a(0.0f, 21.0f, -3.5f, 1, 1, 1);
        } else {
            this.a = new w(this, 0, n2);
            this.a.a(-4.0f, 16.0f, -4.0f, 8, 8, 8);
        }
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        bd.c(0.0f, 0.001f, 0.0f);
        this.a.a(f7);
        if (this.b != null) {
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
        }
    }
}


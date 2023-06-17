/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class av
extends ap {
    private final w a;
    private final w b = new w(this, "glass");
    private w c;

    public av(float f2, boolean bl2) {
        this.b.a(0, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.a = new w(this, "cube");
        this.a.a(32, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        if (bl2) {
            this.c = new w(this, "base");
            this.c.a(0, 16).a(-6.0f, 0.0f, -6.0f, 12, 4, 12);
        }
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        bd.D();
        bd.b(2.0f, 2.0f, 2.0f);
        bd.c(0.0f, -0.5f, 0.0f);
        if (this.c != null) {
            this.c.a(f7);
        }
        bd.b(f3, 0.0f, 1.0f, 0.0f);
        bd.c(0.0f, 0.8f + f4, 0.0f);
        bd.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        this.b.a(f7);
        float f8 = 0.875f;
        bd.b(0.875f, 0.875f, 0.875f);
        bd.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        bd.b(f3, 0.0f, 1.0f, 0.0f);
        this.b.a(f7);
        bd.b(0.875f, 0.875f, 0.875f);
        bd.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        bd.b(f3, 0.0f, 1.0f, 0.0f);
        this.a.a(f7);
        bd.E();
    }
}


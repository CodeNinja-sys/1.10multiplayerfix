/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.bi;
import net.minecraft.client.a.f;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class ax
extends bi {
    private boolean a;
    private boolean b;
    private final f L;
    private float M;
    private float N;
    private float O;
    private boolean P;

    public ax(k k2, double d2, double d3, double d4, double d5, double d6, double d7, f f2) {
        super(k2, d2, d3, d4, 160, 8, -0.004f);
        this.j = d5;
        this.k = d6;
        this.l = d7;
        this.L = f2;
        this.y *= 0.75f;
        this.x = 48 + this.r.nextInt(12);
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public void b(boolean bl2) {
        this.b = bl2;
    }

    @Override
    public boolean bX_() {
        return true;
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!this.b || this.w < this.x / 3 || (this.w + this.x) / 3 % 2 == 0) {
            super.a(g2, n2, f2, f3, f4, f5, f6, f7);
        }
    }

    @Override
    public void b() {
        super.b();
        if (this.a && this.w < this.x / 2 && (this.w + this.x) % 2 == 0) {
            ax ax2 = new ax(this.c, this.g, this.h, this.i, 0.0, 0.0, 0.0, this.L);
            ax2.d(0.99f);
            ax2.a(this.A, this.B, this.C);
            ax2.w = ax2.x / 2;
            if (this.P) {
                ax2.P = true;
                ax2.M = this.M;
                ax2.N = this.N;
                ax2.O = this.O;
            }
            ax2.b = this.b;
            this.L.a(ax2);
        }
    }
}


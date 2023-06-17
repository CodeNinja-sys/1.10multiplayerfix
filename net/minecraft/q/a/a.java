/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import net.minecraft.m.cu;
import net.minecraft.q.a.y;
import net.minecraft.w.a.b;
import net.minecraft.x.p;

public class a {
    public final b a;
    private boolean d = true;
    private int e;
    private int f;
    private int g = 127;
    private int h = 127;
    private int i;
    public int b;
    final /* synthetic */ y c;

    public a(y y2, b b2) {
        this.c = y2;
        this.a = b2;
    }

    public p a(cu cu2) {
        if (this.d) {
            this.d = false;
            return new net.minecraft.x.d.b.a(cu2.h(), this.c.e, this.c.d, this.c.h.values(), this.c.f, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
        }
        return this.i++ % 5 == 0 ? new net.minecraft.x.d.b.a(cu2.h(), this.c.e, this.c.d, this.c.h.values(), this.c.f, 0, 0, 0, 0) : null;
    }

    public void a(int n2, int n3) {
        if (this.d) {
            this.e = Math.min(this.e, n2);
            this.f = Math.min(this.f, n3);
            this.g = Math.max(this.g, n2);
            this.h = Math.max(this.h, n3);
        } else {
            this.d = true;
            this.e = n2;
            this.f = n3;
            this.g = n2;
            this.h = n3;
        }
    }
}


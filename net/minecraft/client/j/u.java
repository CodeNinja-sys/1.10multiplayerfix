/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class u
extends ap {
    private final w a;
    private final w b;

    public u(float f2) {
        this.t = 256;
        this.u = 256;
        this.a("body.body", 0, 0);
        this.a("wing.skin", -56, 88);
        this.a("wingtip.skin", -56, 144);
        this.a("rearleg.main", 0, 0);
        this.a("rearfoot.main", 112, 0);
        this.a("rearlegtip.main", 196, 0);
        this.a("head.upperhead", 112, 30);
        this.a("wing.bone", 112, 88);
        this.a("head.upperlip", 176, 44);
        this.a("jaw.jaw", 176, 65);
        this.a("frontleg.main", 112, 104);
        this.a("wingtip.bone", 112, 136);
        this.a("frontfoot.main", 144, 104);
        this.a("neck.box", 192, 104);
        this.a("frontlegtip.main", 226, 138);
        this.a("body.scale", 220, 53);
        this.a("head.scale", 0, 0);
        this.a("neck.scale", 48, 0);
        this.a("head.nostril", 112, 0);
        float f3 = -16.0f;
        this.a = new w(this, "head");
        this.a.a("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16);
        this.a.a("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16);
        this.a.i = true;
        this.a.a("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6);
        this.a.a("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4);
        this.a.i = false;
        this.a.a("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6);
        this.a.a("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4);
        this.b = new w(this, "jaw");
        this.b.a(0.0f, 4.0f, -8.0f);
        this.b.a("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16);
        this.a.a(this.b);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.b.f = (float)(Math.sin(f2 * (float)Math.PI * 0.2f) + 1.0) * 0.2f;
        this.a.g = f5 * ((float)Math.PI / 180);
        this.a.f = f6 * ((float)Math.PI / 180);
        bd.c(0.0f, -0.374375f, 0.0f);
        bd.b(0.75f, 0.75f, 0.75f);
        this.a.a(f7);
    }
}


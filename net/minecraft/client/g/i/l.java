/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import java.util.Random;
import net.minecraft.client.g.i.a.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.at;
import net.minecraft.g.c.b;
import net.minecraft.u.bp;
import net.minecraft.w.e.au;

public class l
extends n {
    private static final bp a = new bp("textures/entity/enderman/enderman.png");
    private final at b;
    private final Random k = new Random();

    public l(f f2) {
        super(f2, new at(0.0f), 0.5f);
        this.b = (at)this.g;
        this.a(new net.minecraft.client.g.i.a.f(this));
        this.a(new aa(this));
    }

    public void a(au au2, double d2, double d3, double d4, float f2, float f3) {
        b b2 = au2.q();
        this.b.k = b2 != null;
        this.b.l = au2.r();
        if (au2.r()) {
            double d5 = 0.02;
            d2 += this.k.nextGaussian() * 0.02;
            d4 += this.k.nextGaussian() * 0.02;
        }
        super.a(au2, d2, d3, d4, f2, f3);
    }

    protected bp a(au au2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((au)n2);
    }
}


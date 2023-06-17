/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import java.util.Random;
import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.h.aq;
import net.minecraft.h.at;
import net.minecraft.q.d;
import net.minecraft.u.aw;
import net.minecraft.u.b.n;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public class aj
extends ap
implements d,
aw {
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    private static final Random o = new Random();
    private String p;

    @Override
    public e a(e e2) {
        super.a(e2);
        if (this.bO_()) {
            e2.a("CustomName", this.p);
        }
        return e2;
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        if (e2.b("CustomName", 8)) {
            this.p = e2.l("CustomName");
        }
    }

    @Override
    public void a() {
        float f2;
        this.g = this.f;
        this.i = this.h;
        b b2 = this.k.a((float)this.l.cy_() + 0.5f, (float)this.l.k() + 0.5f, (float)this.l.l() + 0.5f, 3.0, false);
        if (b2 != null) {
            double d2 = b2.aU - (double)((float)this.l.cy_() + 0.5f);
            double d3 = b2.aW - (double)((float)this.l.l() + 0.5f);
            this.j = (float)net.minecraft.u.b.n.b(d3, d2);
            this.f += 0.1f;
            if (this.f < 0.5f || o.nextInt(40) == 0) {
                float f3 = this.d;
                do {
                    this.d += (float)(o.nextInt(4) - o.nextInt(4));
                } while (f3 == this.d);
            }
        } else {
            this.j += 0.02f;
            this.f -= 0.1f;
        }
        while (this.h >= (float)Math.PI) {
            this.h -= (float)Math.PI * 2;
        }
        while (this.h < (float)(-Math.PI)) {
            this.h += (float)Math.PI * 2;
        }
        while (this.j >= (float)Math.PI) {
            this.j -= (float)Math.PI * 2;
        }
        while (this.j < (float)(-Math.PI)) {
            this.j += (float)Math.PI * 2;
        }
        for (f2 = this.j - this.h; f2 >= (float)Math.PI; f2 -= (float)Math.PI * 2) {
        }
        while (f2 < (float)(-Math.PI)) {
            f2 += (float)Math.PI * 2;
        }
        this.h += f2 * 0.4f;
        this.f = net.minecraft.u.b.n.a(this.f, 0.0f, 1.0f);
        ++this.a;
        this.c = this.b;
        float f4 = (this.d - this.b) * 0.4f;
        float f5 = 0.2f;
        f4 = net.minecraft.u.b.n.a(f4, -0.2f, 0.2f);
        this.e += (f4 - this.e) * 0.9f;
        this.b += this.e;
    }

    @Override
    public String X() {
        return this.bO_() ? this.p : "container.enchant";
    }

    @Override
    public boolean bO_() {
        return this.p != null && !this.p.isEmpty();
    }

    public void a(String string) {
        this.p = string;
    }

    @Override
    public net.minecraft.u.d.a aK() {
        return this.bO_() ? new k(this.X()) : new l(this.X(), new Object[0]);
    }

    @Override
    public aq a(a a2, b b2) {
        return new at(a2, this.k, this.l);
    }

    @Override
    public String h() {
        return "minecraft:enchanting_table";
    }
}


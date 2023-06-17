/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class app
extends bql
implements avf,
ciq {
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
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        if (this.j_()) {
            bvp2.a("CustomName", this.p);
        }
        return bvp2;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        if (bvp2.b("CustomName", 8)) {
            this.p = bvp2.l("CustomName");
        }
    }

    @Override
    public void a() {
        float f2;
        this.g = this.f;
        this.i = this.h;
        bdl bdl2 = this.k.a((float)this.l.a() + 0.5f, (float)this.l.b() + 0.5f, (float)this.l.c() + 0.5f, 3.0, false);
        if (bdl2 != null) {
            double d2 = bdl2.aU - (double)((float)this.l.a() + 0.5f);
            double d3 = bdl2.aW - (double)((float)this.l.c() + 0.5f);
            this.j = (float)cmk.b(d3, d2);
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
        this.f = cmk.a(this.f, 0.0f, 1.0f);
        ++this.a;
        this.c = this.b;
        float f4 = (this.d - this.b) * 0.4f;
        float f5 = 0.2f;
        f4 = cmk.a(f4, -0.2f, 0.2f);
        this.e += (f4 - this.e) * 0.9f;
        this.b += this.e;
    }

    @Override
    public String i_() {
        return this.j_() ? this.p : "container.enchant";
    }

    @Override
    public boolean j_() {
        return this.p != null && !this.p.isEmpty();
    }

    public void a(String string) {
        this.p = string;
    }

    @Override
    public cbg v() {
        if (this.j_()) {
            return new aym(this.i_());
        }
        return new du(this.i_(), new Object[0]);
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        return new dc(cps2, this.k, this.l);
    }

    @Override
    public String n() {
        return "minecraft:enchanting_table";
    }
}


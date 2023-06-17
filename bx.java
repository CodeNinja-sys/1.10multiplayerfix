/*
 * Decompiled with CFR 0.150.
 */
public class bx
extends chw {
    public bx(iu iu2) {
        super(iu2);
        this.a_(0.3125f, 0.3125f);
    }

    public bx(iu iu2, bga bga2, double d2, double d3, double d4) {
        super(iu2, bga2, d2, d3, d4);
        this.a_(0.3125f, 0.3125f);
    }

    public bx(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        this.a_(0.3125f, 0.3125f);
    }

    public static void a(cgy cgy2) {
        chw.a(cgy2, "SmallFireball");
    }

    @Override
    protected void a(auu auu2) {
        if (!this.aQ.C) {
            if (auu2.d != null) {
                boolean bl2;
                if (!auu2.d.cg() && (bl2 = auu2.d.a(ahy.a(this, (cpk)this.a), 5.0f))) {
                    this.a(this.a, auu2.d);
                    auu2.d.m(5);
                }
            } else {
                cmz cmz2;
                boolean bl3 = true;
                if (this.a != null && this.a instanceof xy) {
                    bl3 = this.aQ.F().b("mobGriefing");
                }
                if (bl3 && this.aQ.c(cmz2 = auu2.a().c(auu2.b))) {
                    this.aQ.a(cmz2, blg.ab.s());
                }
            }
            this.ak_();
        }
    }

    @Override
    public boolean bc_() {
        return false;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        return false;
    }
}


/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class axf
extends bsz {
    private static final bpx k = new bpx("textures/entity/zombie_villager/zombie_villager.png");
    private static final bpx l = new bpx("textures/entity/zombie_villager/zombie_farmer.png");
    private static final bpx m = new bpx("textures/entity/zombie_villager/zombie_librarian.png");
    private static final bpx n = new bpx("textures/entity/zombie_villager/zombie_priest.png");
    private static final bpx o = new bpx("textures/entity/zombie_villager/zombie_smith.png");
    private static final bpx p = new bpx("textures/entity/zombie_villager/zombie_butcher.png");
    private static final bpx q = new bpx("textures/entity/zombie/zombie.png");
    private static final bpx r = new bpx("textures/entity/zombie/husk.png");
    private final chu s;
    private final ks t;
    private final List u;
    private final List v;

    public axf(bid bid2) {
        super(bid2, new chh(), 0.5f, 1.0f);
        czo czo2 = (czo)this.e.get(0);
        this.s = this.a;
        this.t = new ks();
        this.a(new kl(this));
        asw asw2 = new asw(this, this);
        this.a(asw2);
        this.v = ov.a((Iterable)this.e);
        if (czo2 instanceof aot) {
            this.b(czo2);
            this.a(new aot(this.t.e));
        }
        this.b(asw2);
        this.a(new avl(this));
        this.u = ov.a((Iterable)this.e);
    }

    protected void a(oe oe2, float f2) {
        if (oe2.F() == cnf.g) {
            float f3 = 1.0625f;
            cja.b(1.0625f, 1.0625f, 1.0625f);
        }
        super.a(oe2, f2);
    }

    public void a(oe oe2, double d2, double d3, double d4, float f2, float f3) {
        this.b(oe2);
        super.a(oe2, d2, d3, d4, f2, f3);
    }

    protected bpx a(oe oe2) {
        if (oe2.L()) {
            switch (oe2.M()) {
                case 0: {
                    return l;
                }
                case 1: {
                    return m;
                }
                case 2: {
                    return n;
                }
                case 3: {
                    return o;
                }
                case 4: {
                    return p;
                }
            }
            return k;
        }
        if (oe2.F() == cnf.g) {
            return r;
        }
        return q;
    }

    private void b(oe oe2) {
        if (oe2.L()) {
            this.c = this.t;
            this.e = this.u;
        } else {
            this.c = this.s;
            this.e = this.v;
        }
        this.a = (chu)this.c;
    }

    protected void a(oe oe2, float f2, float f3, float f4) {
        if (oe2.Q()) {
            f3 += (float)(Math.cos((double)oe2.by * 3.25) * Math.PI * 0.25);
        }
        super.a((bga)oe2, f2, f3, f4);
    }
}


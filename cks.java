/*
 * Decompiled with CFR 0.150.
 */
public class cks
extends bcf {
    private static final bpx a = new bpx("textures/entity/villager/villager.png");
    private static final bpx b = new bpx("textures/entity/villager/farmer.png");
    private static final bpx k = new bpx("textures/entity/villager/librarian.png");
    private static final bpx l = new bpx("textures/entity/villager/priest.png");
    private static final bpx m = new bpx("textures/entity/villager/smith.png");
    private static final bpx n = new bpx("textures/entity/villager/butcher.png");

    public cks(bid bid2) {
        super(bid2, new bwv(0.0f), 0.5f);
        this.a(new aot(this.b().a));
    }

    public bwv b() {
        return (bwv)super.c();
    }

    protected bpx a(cwp cwp2) {
        switch (cwp2.T()) {
            case 0: {
                return b;
            }
            case 1: {
                return k;
            }
            case 2: {
                return l;
            }
            case 3: {
                return m;
            }
            case 4: {
                return n;
            }
        }
        return a;
    }

    protected void a(cwp cwp2, float f2) {
        float f3 = 0.9375f;
        if (cwp2.aL() < 0) {
            f3 = (float)((double)f3 * 0.5);
            this.h = 0.25f;
        } else {
            this.h = 0.5f;
        }
        cja.b(f3, f3, f3);
    }

    @Override
    public /* synthetic */ axg c() {
        return this.b();
    }
}


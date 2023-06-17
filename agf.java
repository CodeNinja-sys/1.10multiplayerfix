/*
 * Decompiled with CFR 0.150.
 */
public class agf
extends bsz {
    private static final bpx k = new bpx("textures/entity/skeleton/skeleton.png");
    private static final bpx l = new bpx("textures/entity/skeleton/wither_skeleton.png");
    private static final bpx m = new bpx("textures/entity/skeleton/stray.png");

    public agf(bid bid2) {
        super(bid2, new aed(), 0.5f);
        this.a(new kl(this));
        this.a(new bej(this, this));
        this.a(new t(this));
    }

    protected void a(azy azy2, float f2) {
        if (azy2.Z() == aoy.b) {
            cja.b(1.2f, 1.2f, 1.2f);
        }
    }

    @Override
    public void a() {
        cja.c(0.09375f, 0.1875f, 0.0f);
    }

    protected bpx a(azy azy2) {
        aoy aoy2 = azy2.Z();
        if (aoy2 == aoy.b) {
            return l;
        }
        if (aoy2 == aoy.c) {
            return m;
        }
        return k;
    }
}


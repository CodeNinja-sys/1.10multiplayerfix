/*
 * Decompiled with CFR 0.150.
 */
public class cuq
extends wq {
    public static final bpx a = new bpx("textures/entity/armorstand/wood.png");

    public cuq(bid bid2) {
        super(bid2, new avi(), 0.0f);
        nh nh2 = new nh(this, this);
        this.a(nh2);
        this.a(new kl(this));
        this.a(new aot(this.b().e));
    }

    protected bpx a(bdi bdi2) {
        return a;
    }

    public avi b() {
        return (avi)super.c();
    }

    protected void a(bdi bdi2, float f2, float f3, float f4) {
        cja.b(180.0f - f3, 0.0f, 1.0f, 0.0f);
        float f5 = (float)(bdi2.aQ.z() - bdi2.h) + f4;
        if (f5 < 5.0f) {
            cja.b(cmk.a(f5 / 1.5f * (float)Math.PI) * 3.0f, 0.0f, 1.0f, 0.0f);
        }
    }

    protected boolean b(bdi bdi2) {
        return bdi2.cB();
    }

    public void a(bdi bdi2, double d2, double d3, double d4, float f2, float f3) {
        if (bdi2.Z()) {
            this.f = true;
        }
        super.a(bdi2, d2, d3, d4, f2, f3);
        if (bdi2.Z()) {
            this.f = false;
        }
    }

    @Override
    protected /* synthetic */ boolean c(bga bga2) {
        return this.b((bdi)bga2);
    }

    @Override
    public /* synthetic */ axg c() {
        return this.b();
    }
}


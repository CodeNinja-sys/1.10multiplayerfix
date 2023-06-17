/*
 * Decompiled with CFR 0.150.
 */
public class aqx
extends al {
    private abn a;

    public aqx() {
        super("container.enderchest", false, 27);
    }

    public void a(abn abn2) {
        this.a = abn2;
    }

    public void a(bmh bmh2) {
        int n2;
        for (n2 = 0; n2 < this.aI_(); ++n2) {
            this.a(n2, null);
        }
        for (n2 = 0; n2 < bmh2.b(); ++n2) {
            bvp bvp2 = bmh2.b(n2);
            int n3 = bvp2.f("Slot") & 0xFF;
            if (n3 < 0 || n3 >= this.aI_()) continue;
            this.a(n3, bhl.a(bvp2));
        }
    }

    public bmh h() {
        bmh bmh2 = new bmh();
        for (int i2 = 0; i2 < this.aI_(); ++i2) {
            bhl bhl2 = this.a(i2);
            if (bhl2 == null) continue;
            bvp bvp2 = new bvp();
            bvp2.a("Slot", (byte)i2);
            bhl2.b(bvp2);
            bmh2.a(bvp2);
        }
        return bmh2;
    }

    @Override
    public boolean a(bdl bdl2) {
        if (this.a != null && !this.a.a(bdl2)) {
            return false;
        }
        return super.a(bdl2);
    }

    @Override
    public void b(bdl bdl2) {
        if (this.a != null) {
            this.a.f();
        }
        super.b(bdl2);
    }

    @Override
    public void c(bdl bdl2) {
        if (this.a != null) {
            this.a.g();
        }
        super.c(bdl2);
        this.a = null;
    }
}


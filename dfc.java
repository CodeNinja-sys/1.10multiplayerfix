/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class dfc
extends bub
implements vk {
    private boolean a = true;
    private int b = -1;
    private final cmz c = cmz.e;

    public dfc(iu iu2) {
        super(iu2);
    }

    public dfc(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    @Override
    public cta bd_() {
        return cta.f;
    }

    @Override
    public dbk be_() {
        return blg.cp.s();
    }

    @Override
    public int J() {
        return 1;
    }

    @Override
    public int aI_() {
        return 5;
    }

    @Override
    public boolean a(bdl bdl2, bhl bhl2, bqp bqp2) {
        if (!this.aQ.C) {
            bdl2.a(this);
        }
        return true;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = !bl2;
        if (bl3 != this.p()) {
            this.e(bl3);
        }
    }

    public boolean p() {
        return this.a;
    }

    public void e(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public iu b_() {
        return this.aQ;
    }

    @Override
    public double j() {
        return this.aU;
    }

    @Override
    public double k() {
        return this.aV + 0.5;
    }

    @Override
    public double l() {
        return this.aW;
    }

    @Override
    public void bb_() {
        super.bb_();
        if (!this.aQ.C && this.bj() && this.p()) {
            cmz cmz2 = new cmz(this);
            if (cmz2.equals(this.c)) {
                --this.b;
            } else {
                this.g(0);
            }
            if (!this.O()) {
                this.g(0);
                if (this.M()) {
                    this.g(4);
                    this.c_();
                }
            }
        }
    }

    public boolean M() {
        if (cls.a(this)) {
            return true;
        }
        List list = this.aQ.a(er.class, this.cD().b(0.25, 0.0, 0.25), auxx.a);
        if (!list.isEmpty()) {
            cls.a(this, (er)list.get(0));
        }
        return false;
    }

    @Override
    public void a(ahy ahy2) {
        super.a(ahy2);
        if (this.aQ.F().b("doEntityDrops")) {
            this.a(azg.a(blg.cp), 1, 0.0f);
        }
    }

    public static void a(cgy cgy2) {
        bub.a(cgy2, "MinecartHopper");
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("TransferCooldown", this.b);
        bvp2.a("Enabled", this.a);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.b = bvp2.h("TransferCooldown");
        this.a = bvp2.e("Enabled") ? bvp2.p("Enabled") : true;
    }

    public void g(int n2) {
        this.b = n2;
    }

    public boolean O() {
        return this.b > 0;
    }

    @Override
    public String n() {
        return "minecraft:hopper";
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        return new cfq(cps2, this, bdl2);
    }
}


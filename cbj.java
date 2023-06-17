/*
 * Decompiled with CFR 0.150.
 */
public class cbj
extends bql {
    private azg a;
    private int b;

    public cbj() {
    }

    public cbj(azg azg2, int n2) {
        this.a = azg2;
        this.b = n2;
    }

    public static void a(cgy cgy2) {
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        bpx bpx2 = (bpx)azg.g.b(this.a);
        bvp2.a("Item", bpx2 == null ? "" : bpx2.toString());
        bvp2.a("Data", this.b);
        return bvp2;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.a = bvp2.b("Item", 8) ? azg.c(bvp2.l("Item")) : azg.c(bvp2.h("Item"));
        this.b = bvp2.h("Data");
    }

    @Override
    public hv a_() {
        return new hv(this.l, 5, this.b());
    }

    @Override
    public bvp b() {
        return this.b(new bvp());
    }

    public void a(azg azg2, int n2) {
        this.a = azg2;
        this.b = n2;
    }

    public bhl f() {
        return this.a == null ? null : new bhl(this.a, 1, this.b);
    }

    public azg g() {
        return this.a;
    }

    public int h() {
        return this.b;
    }
}


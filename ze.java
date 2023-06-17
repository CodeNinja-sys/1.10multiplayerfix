/*
 * Decompiled with CFR 0.150.
 */
public class ze
extends bql
implements avf {
    private final cft a = new bry(this);

    public static void a(cgy cgy2) {
        cgy2.a(bst.d, (cui)new bjo());
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.a.a(bvp2);
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        this.a.b(bvp2);
        return bvp2;
    }

    @Override
    public void a() {
        this.a.c();
    }

    @Override
    public hv a_() {
        return new hv(this.l, 1, this.b());
    }

    @Override
    public bvp b() {
        bvp bvp2 = this.b(new bvp());
        bvp2.q("SpawnPotentials");
        return bvp2;
    }

    @Override
    public boolean a_(int n2, int n3) {
        if (this.a.b(n2)) {
            return true;
        }
        return super.a_(n2, n3);
    }

    @Override
    public boolean h_() {
        return true;
    }

    public cft d() {
        return this.a;
    }
}


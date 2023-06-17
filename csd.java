/*
 * Decompiled with CFR 0.150.
 */
public class csd
extends bql {
    private int a;

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        bvp2.a("OutputSignal", this.a);
        return bvp2;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.a = bvp2.h("OutputSignal");
    }

    public int f() {
        return this.a;
    }

    public void a(int n2) {
        this.a = n2;
    }
}


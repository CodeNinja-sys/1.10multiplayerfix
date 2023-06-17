/*
 * Decompiled with CFR 0.150.
 */
public class bll
extends ab {
    private static final bpx i = new bpx("textures/gui/container/hopper.png");
    private final tb j;
    private final tb k;

    public bll(cps cps2, tb tb2) {
        super(new cfq(cps2, tb2, bxy.B().h));
        this.j = cps2;
        this.k = tb2;
        this.A = false;
        this.c = 133;
    }

    @Override
    protected void a(int n2, int n3) {
        this.B.a(this.k.v().i(), 8, 6, 0x404040);
        this.B.a(this.j.v().i(), 8, this.c - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(i);
        int n4 = (this.w - this.b) / 2;
        int n5 = (this.x - this.c) / 2;
        this.c(n4, n5, 0, 0, this.b, this.c);
    }
}


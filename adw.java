/*
 * Decompiled with CFR 0.150.
 */
public class adw
extends ab {
    private static final bpx i = new bpx("textures/gui/container/horse.png");
    private final tb j;
    private final tb k;
    private final it l;
    private float m;
    private float r;

    public adw(tb tb2, tb tb3, it it2) {
        super(new bfl(tb2, tb3, it2, bxy.B().h));
        this.j = tb2;
        this.k = tb3;
        this.l = it2;
        this.A = false;
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
        if (this.l.I()) {
            this.c(n4 + 79, n5 + 17, 0, this.c, 90, 54);
        }
        if (this.l.x().j()) {
            this.c(n4 + 7, n5 + 35, 0, this.c + 54, 18, 18);
        }
        nv.a(n4 + 51, n5 + 60, 17, (float)(n4 + 51) - this.m, (float)(n5 + 75 - 50) - this.r, this.l);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m = n2;
        this.r = n3;
        super.a(n2, n3, f2);
    }
}


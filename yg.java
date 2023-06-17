/*
 * Decompiled with CFR 0.150.
 */
public class yg
extends ab {
    private static final bpx i = new bpx("textures/gui/container/generic_54.png");
    private final tb j;
    private final tb k;
    private final int l;

    public yg(tb tb2, tb tb3) {
        super(new cnx(tb2, tb3, bxy.B().h));
        this.j = tb2;
        this.k = tb3;
        this.A = false;
        int n2 = 222;
        int n3 = 114;
        this.l = tb3.aI_() / 9;
        this.c = 114 + this.l * 18;
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
        this.c(n4, n5, 0, 0, this.b, this.l * 18 + 17);
        this.c(n4, n5 + this.l * 18 + 17, 0, 126, this.b, 96);
    }
}


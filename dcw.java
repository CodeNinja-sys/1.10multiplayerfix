/*
 * Decompiled with CFR 0.150.
 */
public class dcw
extends ab {
    private static final bpx j = new bpx("textures/gui/container/dispenser.png");
    private final cps k;
    public tb i;

    public dcw(cps cps2, tb tb2) {
        super(new clj(cps2, tb2));
        this.k = cps2;
        this.i = tb2;
    }

    @Override
    protected void a(int n2, int n3) {
        String string = this.i.v().i();
        this.B.a(string, this.b / 2 - this.B.a(string) / 2, 6, 0x404040);
        this.B.a(this.k.v().i(), 8, this.c - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(j);
        int n4 = (this.w - this.b) / 2;
        int n5 = (this.x - this.c) / 2;
        this.c(n4, n5, 0, 0, this.b, this.c);
    }
}


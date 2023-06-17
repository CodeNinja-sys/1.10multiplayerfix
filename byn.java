/*
 * Decompiled with CFR 0.150.
 */
public class byn
extends ab {
    private static final bpx i = new bpx("textures/gui/container/brewing_stand.png");
    private static final int[] j = new int[]{29, 24, 20, 16, 11, 6, 0};
    private final cps k;
    private final tb l;

    public byn(cps cps2, tb tb2) {
        super(new bol(cps2, tb2));
        this.k = cps2;
        this.l = tb2;
    }

    @Override
    protected void a(int n2, int n3) {
        String string = this.l.v().i();
        this.B.a(string, this.b / 2 - this.B.a(string) / 2, 6, 0x404040);
        this.B.a(this.k.v().i(), 8, this.c - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        int n4;
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(i);
        int n5 = (this.w - this.b) / 2;
        int n6 = (this.x - this.c) / 2;
        this.c(n5, n6, 0, 0, this.b, this.c);
        int n7 = this.l.c(1);
        int n8 = cmk.a((18 * n7 + 20 - 1) / 20, 0, 18);
        if (n8 > 0) {
            this.c(n5 + 60, n6 + 44, 176, 29, n8, 4);
        }
        if ((n4 = this.l.c(0)) > 0) {
            int n9 = (int)(28.0f * (1.0f - (float)n4 / 400.0f));
            if (n9 > 0) {
                this.c(n5 + 97, n6 + 16, 176, 0, 9, n9);
            }
            if ((n9 = j[n4 / 2 % 7]) > 0) {
                this.c(n5 + 63, n6 + 14 + 29 - n9, 185, 29 - n9, 12, n9);
            }
        }
    }
}


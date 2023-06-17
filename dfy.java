/*
 * Decompiled with CFR 0.150.
 */
public class dfy
extends ab {
    private static final bpx i = new bpx("textures/gui/container/furnace.png");
    private final cps j;
    private final tb k;

    public dfy(cps cps2, tb tb2) {
        super(new dk(cps2, tb2));
        this.j = cps2;
        this.k = tb2;
    }

    @Override
    protected void a(int n2, int n3) {
        String string = this.k.v().i();
        this.B.a(string, this.b / 2 - this.B.a(string) / 2, 6, 0x404040);
        this.B.a(this.j.v().i(), 8, this.c - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        int n4;
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(i);
        int n5 = (this.w - this.b) / 2;
        int n6 = (this.x - this.c) / 2;
        this.c(n5, n6, 0, 0, this.b, this.c);
        if (bop.a(this.k)) {
            n4 = this.h(13);
            this.c(n5 + 56, n6 + 36 + 12 - n4, 176, 12 - n4, 14, n4 + 1);
        }
        n4 = this.b(24);
        this.c(n5 + 79, n6 + 34, 176, 14, n4 + 1, 16);
    }

    private int b(int n2) {
        int n3 = this.k.c(2);
        int n4 = this.k.c(3);
        if (n4 == 0 || n3 == 0) {
            return 0;
        }
        return n3 * n2 / n4;
    }

    private int h(int n2) {
        int n3 = this.k.c(1);
        if (n3 == 0) {
            n3 = 200;
        }
        return this.k.c(0) * n2 / n3;
    }
}


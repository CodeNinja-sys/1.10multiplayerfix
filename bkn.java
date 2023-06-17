/*
 * Decompiled with CFR 0.150.
 */
public class bkn
extends ab {
    private static final bpx i = new bpx("textures/gui/container/crafting_table.png");

    public bkn(cps cps2, iu iu2) {
        this(cps2, iu2, cmz.e);
    }

    public bkn(cps cps2, iu iu2, cmz cmz2) {
        super(new fd(cps2, iu2, cmz2));
    }

    @Override
    protected void a(int n2, int n3) {
        this.B.a(bf.a("container.crafting", new Object[0]), 28, 6, 0x404040);
        this.B.a(bf.a("container.inventory", new Object[0]), 8, this.c - 96 + 2, 0x404040);
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


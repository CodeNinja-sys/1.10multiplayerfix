/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.s.o;

public class coy
extends st {
    private final o a;

    public coy(o o2, int n2, int n3, int n4, int n5, int n6) {
        super(bxy.B(), n2, n3, n4, n5, n6);
        this.a = o2;
    }

    @Override
    protected int a() {
        return this.a.a();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.a.a(n2, bl2, n3, n4);
    }

    @Override
    protected boolean a(int n2) {
        return this.a.a(n2);
    }

    @Override
    protected void b() {
        this.a.d();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.a(n2, n3, n4, n5, n6, n7);
    }

    public int l() {
        return this.d;
    }

    public int m() {
        return this.l;
    }

    public int n() {
        return this.k;
    }

    @Override
    protected int e() {
        return this.a.b();
    }

    @Override
    protected int c() {
        return this.a.c();
    }

    @Override
    public void i() {
        super.i();
    }
}


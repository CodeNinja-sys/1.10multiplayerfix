/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.s.g;
import net.minecraft.s.v;
import org.lwjgl.a.j;

public class zq
extends st {
    private final g a;

    public zq(g g2, int n2, int n3, int n4, int n5, int n6) {
        super(bxy.B(), n2, n3, n4, n5, n6);
        this.a = g2;
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
        if (this.o > 0.0f && org.lwjgl.a.j.j()) {
            this.a.a(this.f, this.g, this.v, this.p, this.j);
        }
    }

    public void a(int n2, int n3, int n4, v v2) {
        this.a.a(n2, n3, n4, v2);
    }

    @Override
    protected void b(int n2, int n3, int n4, int n5) {
        int n6 = this.a();
        for (int i2 = 0; i2 < n6; ++i2) {
            int n7 = n3 + i2 * this.j + this.v;
            int n8 = this.j - 4;
            if (n7 > this.g || n7 + n8 < this.f) {
                this.a(i2, n2, n7);
            }
            if (this.t && this.a(i2)) {
                this.a(this.d, n7, n8, net.minecraft.s.v.b);
            }
            this.a(i2, n2, n7, n8, n4, n5);
        }
    }
}


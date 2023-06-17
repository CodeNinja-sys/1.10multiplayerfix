/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.s.f;

public class bxt
extends cwv {
    private final f a;

    public bxt(f f2, int n2, int n3, int n4, String string) {
        super(n2, n3, n4, string);
        this.a = f2;
    }

    public bxt(f f2, int n2, int n3, int n4, String string, int n5, int n6) {
        super(n2, n3, n4, n5, n6, string);
        this.a = f2;
    }

    public int a() {
        return this.j;
    }

    public boolean b() {
        return this.k;
    }

    public void b(boolean bl2) {
        this.k = bl2;
    }

    public void a(String string) {
        this.i = string;
    }

    @Override
    public int c() {
        return super.c();
    }

    public int d() {
        return this.h;
    }

    @Override
    public boolean b(bxy bxy2, int n2, int n3) {
        if (super.b(bxy2, n2, n3)) {
            this.a.b(n2, n3);
        }
        return super.b(bxy2, n2, n3);
    }

    @Override
    public void a(int n2, int n3) {
        this.a.c(n2, n3);
    }

    @Override
    public void a(bxy bxy2, int n2, int n3) {
        this.a.d(n2, n3);
    }

    public f e() {
        return this.a;
    }

    @Override
    public int a(boolean bl2) {
        return this.a.c(bl2);
    }

    public int c(boolean bl2) {
        return super.a(bl2);
    }

    public int f() {
        return this.f;
    }
}


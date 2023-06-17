/*
 * Decompiled with CFR 0.150.
 */
public class qe
implements ckf {
    private final bpx a;
    private final float b;
    private final float c;
    private final int d;
    private final ad e;
    private final boolean f;

    public qe(String string, float f2, float f3, int n2, ad ad2, boolean bl2) {
        this.a = new bpx(string);
        this.b = f2;
        this.c = f3;
        this.d = n2;
        this.e = ad2;
        this.f = bl2;
    }

    public bpx a() {
        return this.a;
    }

    public bpx b() {
        return new bpx(this.a.c(), "sounds/" + this.a.b() + ".ogg");
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }

    @Override
    public int e() {
        return this.d;
    }

    public qe f() {
        return this;
    }

    public ad g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }

    @Override
    public /* synthetic */ Object i() {
        return this.f();
    }
}


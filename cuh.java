/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;

public class cuh
implements cbd {
    private final e a;
    private final bpx b;

    public cuh(e e2) {
        this.a = e2;
        this.b = ciy.d(e2.b());
        ciy.a(this.b, e2.b());
    }

    @Override
    public void a(bou bou2) {
        bxy.B().x().a(new ci(this.a.a()));
    }

    @Override
    public cbg a() {
        return new aym(this.a.b());
    }

    @Override
    public void a(float f2, int n2) {
        bxy.B().P().a(this.b);
        cja.c(1.0f, 1.0f, 1.0f, (float)n2 / 255.0f);
        alo.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        alo.a(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }

    @Override
    public boolean b() {
        return true;
    }
}


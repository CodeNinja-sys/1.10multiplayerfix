/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class axg {
    public float l;
    public boolean m;
    public boolean n = true;
    public List o = ov.a();
    private final Map a = sz.c();
    public int p = 64;
    public int q = 32;

    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
    }

    public void a(bga bga2, float f2, float f3, float f4) {
    }

    public abd a(Random random) {
        return (abd)this.o.get(random.nextInt(this.o.size()));
    }

    protected void a(String string, int n2, int n3) {
        this.a.put(string, new bbz(n2, n3));
    }

    public bbz a(String string) {
        return (bbz)this.a.get(string);
    }

    public static void a(abd abd2, abd abd3) {
        abd3.f = abd2.f;
        abd3.g = abd2.g;
        abd3.h = abd2.h;
        abd3.c = abd2.c;
        abd3.d = abd2.d;
        abd3.e = abd2.e;
    }

    public void a(axg axg2) {
        this.l = axg2.l;
        this.m = axg2.m;
        this.n = axg2.n;
    }
}


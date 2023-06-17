/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import com.a.a.c.an;

public class aiz {
    private final cmz a;
    private final bqk b;
    private final bqk c;
    private final an d;
    private final int e;
    private final int f;
    private final int g;

    public aiz(cmz cmz2, bqk bqk2, bqk bqk3, an an2, int n2, int n3, int n4) {
        this.a = cmz2;
        this.b = bqk2;
        this.c = bqk3;
        this.d = an2;
        this.e = n2;
        this.f = n3;
        this.g = n4;
    }

    public cmz a() {
        return this.a;
    }

    public bqk b() {
        return this.b;
    }

    public bqk c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public amr a(int n2, int n3, int n4) {
        return (amr)this.d.c(ve.a(this.a, this.b(), this.c(), n2, n3, n4));
    }

    public String toString() {
        return cc.a((Object)this).a("up", this.c).a("forwards", this.b).a("frontTopLeft", this.a).toString();
    }
}


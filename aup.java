/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import com.c.a.e;

public class aup {
    private final int b;
    private final bvh c;
    private final e d;
    private final cbg e;
    final /* synthetic */ cgl a;

    public aup(cgl cgl2, e e2, int n2, bvh bvh2, cbg cbg2) {
        this.a = cgl2;
        this.d = e2;
        this.b = n2;
        this.c = bvh2;
        this.e = cbg2;
    }

    public e a() {
        return this.d;
    }

    public int b() {
        return this.b;
    }

    public bvh c() {
        return this.c;
    }

    public cbg d() {
        return this.e;
    }

    public String toString() {
        return cc.a((Object)this).a("latency", this.b).a("gameMode", (Object)this.c).a("profile", this.d).a("displayName", this.e == null ? null : zf.a(this.e)).toString();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import com.a.a.d.sz;
import com.c.a.c.h;
import com.c.a.e;
import java.util.Map;

public class bae {
    private final e b;
    Map a = sz.a(h.class);
    private bvh c;
    private int d;
    private boolean e;
    private String f;
    private cbg g;
    private int h;
    private int i;
    private long j;
    private long k;
    private long l;

    public bae(e e2) {
        this.b = e2;
    }

    public bae(aup aup2) {
        this.b = aup2.a();
        this.c = aup2.c();
        this.d = aup2.b();
        this.g = aup2.d();
    }

    public e a() {
        return this.b;
    }

    public bvh b() {
        return this.c;
    }

    protected void a(bvh bvh2) {
        this.c = bvh2;
    }

    public int c() {
        return this.d;
    }

    protected void a(int n2) {
        this.d = n2;
    }

    public boolean d() {
        return this.f() != null;
    }

    public String e() {
        if (this.f == null) {
            return ccj.b(this.b.a());
        }
        return this.f;
    }

    public bpx f() {
        this.j();
        return (bpx)cc.b(this.a.get((Object)com.c.a.c.h.a), ccj.a(this.b.a()));
    }

    public bpx g() {
        this.j();
        return (bpx)this.a.get((Object)com.c.a.c.h.b);
    }

    public bpx h() {
        this.j();
        return (bpx)this.a.get((Object)com.c.a.c.h.c);
    }

    public ef i() {
        return bxy.B().f.P().g(this.a().b());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void j() {
        bae bae2 = this;
        synchronized (bae2) {
            if (!this.e) {
                this.e = true;
                bxy.B().aa().a(this.b, new agr(this), true);
            }
        }
    }

    public void a(cbg cbg2) {
        this.g = cbg2;
    }

    public cbg k() {
        return this.g;
    }

    public int l() {
        return this.h;
    }

    public void b(int n2) {
        this.h = n2;
    }

    public int m() {
        return this.i;
    }

    public void c(int n2) {
        this.i = n2;
    }

    public long n() {
        return this.j;
    }

    public void a(long l2) {
        this.j = l2;
    }

    public long o() {
        return this.k;
    }

    public void b(long l2) {
        this.k = l2;
    }

    public long p() {
        return this.l;
    }

    public void c(long l2) {
        this.l = l2;
    }

    static /* synthetic */ String a(bae bae2, String string) {
        bae2.f = string;
        return bae2.f;
    }

    static /* synthetic */ String a(bae bae2) {
        return bae2.f;
    }
}


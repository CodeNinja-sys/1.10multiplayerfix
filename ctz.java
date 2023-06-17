/*
 * Decompiled with CFR 0.150.
 */
public class ctz
implements Comparable {
    private final ars a;
    private final int b;
    private final int c;
    private final int d;
    private boolean e;
    private float f = 1.0f;

    public ctz(ars ars2, int n2) {
        this.a = ars2;
        this.b = ars2.c();
        this.c = ars2.d();
        this.d = n2;
        this.e = ddm.a(this.c, n2) > ddm.a(this.b, n2);
    }

    public ars a() {
        return this.a;
    }

    public int b() {
        int n2 = this.e ? this.c : this.b;
        return ddm.a((int)((float)n2 * this.f), this.d);
    }

    public int c() {
        int n2 = this.e ? this.b : this.c;
        return ddm.a((int)((float)n2 * this.f), this.d);
    }

    public void d() {
        this.e = !this.e;
    }

    public boolean e() {
        return this.e;
    }

    public void a(int n2) {
        if (this.b <= n2 || this.c <= n2) {
            return;
        }
        this.f = (float)n2 / (float)Math.min(this.b, this.c);
    }

    public String toString() {
        return "Holder{width=" + this.b + ", height=" + this.c + '}';
    }

    public int a(ctz ctz2) {
        int n2;
        if (this.c() == ctz2.c()) {
            if (this.b() == ctz2.b()) {
                if (this.a.i() == null) {
                    return ctz2.a.i() == null ? 0 : -1;
                }
                return this.a.i().compareTo(ctz2.a.i());
            }
            n2 = this.b() < ctz2.b() ? 1 : -1;
        } else {
            n2 = this.c() < ctz2.c() ? 1 : -1;
        }
        return n2;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((ctz)object);
    }
}


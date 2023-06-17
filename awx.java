/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;

public class awx {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public awx() {
    }

    public awx(int[] arrn) {
        if (arrn.length == 6) {
            this.a = arrn[0];
            this.b = arrn[1];
            this.c = arrn[2];
            this.d = arrn[3];
            this.e = arrn[4];
            this.f = arrn[5];
        }
    }

    public static awx a() {
        return new awx(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static awx a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, bqk bqk2) {
        switch (bqk2) {
            default: {
                return new awx(n2 + n5, n3 + n6, n4 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n10 - 1 + n7);
            }
            case c: {
                return new awx(n2 + n5, n3 + n6, n4 - n10 + 1 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n7);
            }
            case d: {
                return new awx(n2 + n5, n3 + n6, n4 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n10 - 1 + n7);
            }
            case e: {
                return new awx(n2 - n10 + 1 + n7, n3 + n6, n4 + n5, n2 + n7, n3 + n9 - 1 + n6, n4 + n8 - 1 + n5);
            }
            case f: 
        }
        return new awx(n2 + n7, n3 + n6, n4 + n5, n2 + n10 - 1 + n7, n3 + n9 - 1 + n6, n4 + n8 - 1 + n5);
    }

    public static awx a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return new awx(Math.min(n2, n5), Math.min(n3, n6), Math.min(n4, n7), Math.max(n2, n5), Math.max(n3, n6), Math.max(n4, n7));
    }

    public awx(awx awx2) {
        this.a = awx2.a;
        this.b = awx2.b;
        this.c = awx2.c;
        this.d = awx2.d;
        this.e = awx2.e;
        this.f = awx2.f;
    }

    public awx(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n6;
        this.f = n7;
    }

    public awx(cjx cjx2, cjx cjx3) {
        this.a = Math.min(cjx2.a(), cjx3.a());
        this.b = Math.min(cjx2.b(), cjx3.b());
        this.c = Math.min(cjx2.c(), cjx3.c());
        this.d = Math.max(cjx2.a(), cjx3.a());
        this.e = Math.max(cjx2.b(), cjx3.b());
        this.f = Math.max(cjx2.c(), cjx3.c());
    }

    public awx(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.c = n3;
        this.d = n4;
        this.f = n5;
        this.b = 1;
        this.e = 512;
    }

    public boolean a(awx awx2) {
        return this.d >= awx2.a && this.a <= awx2.d && this.f >= awx2.c && this.c <= awx2.f && this.e >= awx2.b && this.b <= awx2.e;
    }

    public boolean a(int n2, int n3, int n4, int n5) {
        return this.d >= n2 && this.a <= n4 && this.f >= n3 && this.c <= n5;
    }

    public void b(awx awx2) {
        this.a = Math.min(this.a, awx2.a);
        this.b = Math.min(this.b, awx2.b);
        this.c = Math.min(this.c, awx2.c);
        this.d = Math.max(this.d, awx2.d);
        this.e = Math.max(this.e, awx2.e);
        this.f = Math.max(this.f, awx2.f);
    }

    public void a(int n2, int n3, int n4) {
        this.a += n2;
        this.b += n3;
        this.c += n4;
        this.d += n2;
        this.e += n3;
        this.f += n4;
    }

    public boolean a(cjx cjx2) {
        return cjx2.a() >= this.a && cjx2.a() <= this.d && cjx2.c() >= this.c && cjx2.c() <= this.f && cjx2.b() >= this.b && cjx2.b() <= this.e;
    }

    public cjx b() {
        return new cjx(this.d - this.a, this.e - this.b, this.f - this.c);
    }

    public int c() {
        return this.d - this.a + 1;
    }

    public int d() {
        return this.e - this.b + 1;
    }

    public int e() {
        return this.f - this.c + 1;
    }

    public cjx f() {
        return new cmz(this.a + (this.d - this.a + 1) / 2, this.b + (this.e - this.b + 1) / 2, this.c + (this.f - this.c + 1) / 2);
    }

    public String toString() {
        return cc.a((Object)this).a("x0", this.a).a("y0", this.b).a("z0", this.c).a("x1", this.d).a("y1", this.e).a("z1", this.f).toString();
    }

    public aya g() {
        return new aya(new int[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }
}


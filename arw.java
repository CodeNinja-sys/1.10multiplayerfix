/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class arw
extends alo {
    protected int a = 200;
    protected int b = 20;
    public int c;
    public int d;
    private final List g;
    public int e;
    private boolean h;
    public boolean f = true;
    private boolean i;
    private final int j;
    private int k;
    private int l;
    private int m;
    private final deb r;
    private int s;

    public arw(deb deb2, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.r = deb2;
        this.e = n2;
        this.c = n3;
        this.d = n4;
        this.a = n5;
        this.b = n6;
        this.g = ov.a();
        this.h = false;
        this.i = false;
        this.j = n7;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.s = 0;
    }

    public void a(String string) {
        this.g.add(bf.a(string, new Object[0]));
    }

    public arw a() {
        this.h = true;
        return this;
    }

    public void a(bxy bxy2, int n2, int n3) {
        if (!this.f) {
            return;
        }
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        this.b(bxy2, n2, n3);
        int n4 = this.d + this.b / 2 + this.s / 2;
        int n5 = n4 - this.g.size() * 10 / 2;
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            if (this.h) {
                this.a(this.r, (String)this.g.get(i2), this.c + this.a / 2, n5 + i2 * 10, this.j);
                continue;
            }
            this.b(this.r, (String)this.g.get(i2), this.c, n5 + i2 * 10, this.j);
        }
    }

    protected void b(bxy bxy2, int n2, int n3) {
        if (this.i) {
            int n4 = this.a + this.s * 2;
            int n5 = this.b + this.s * 2;
            int n6 = this.c - this.s;
            int n7 = this.d - this.s;
            arw.a(n6, n7, n6 + n4, n7 + n5, this.k);
            this.a(n6, n6 + n4, n7, this.l);
            this.a(n6, n6 + n4, n7 + n5, this.m);
            this.b(n6, n7, n7 + n5, this.l);
            this.b(n6 + n4, n7, n7 + n5, this.m);
        }
    }
}


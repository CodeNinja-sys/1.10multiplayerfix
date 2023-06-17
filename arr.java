/*
 * Decompiled with CFR 0.150.
 */
import a.a.a.a.b.as;
import a.a.a.a.b.bl;
import com.a.a.b.cm;
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class arr {
    private static final cm a = new aci();
    private static final cm b = new ccy();
    private final alj c;
    private final List d = ov.a();
    private final as e = new bl(4096);
    private final Set f = aad.a();
    private final List g = ov.b();
    private final List h = ov.b();
    private final List i = ov.a();
    private int j;
    private long k;
    private boolean l = true;
    private boolean m = true;

    public arr(alj alj2) {
        this.c = alj2;
        this.a(((cmt)((Object)alj2.f().al())).s());
    }

    public alj a() {
        return this.c;
    }

    public Iterator b() {
        Iterator iterator = this.i.iterator();
        return new bzw(this, iterator);
    }

    public void c() {
        byf byf2;
        Object object2;
        int n2;
        long l2 = this.c.z();
        if (l2 - this.k > 8000L) {
            this.k = l2;
            for (n2 = 0; n2 < this.i.size(); ++n2) {
                object2 = (asi)this.i.get(n2);
                ((asi)object2).d();
                ((asi)object2).c();
            }
        }
        if (!this.f.isEmpty()) {
            for (Object object2 : this.f) {
                ((asi)object2).d();
            }
            this.f.clear();
        }
        if (this.l && l2 % 4L == 0L) {
            this.l = false;
            Collections.sort(this.h, new jj(this));
        }
        if (this.m && l2 % 4L == 2L) {
            this.m = false;
            Collections.sort(this.g, new qv(this));
        }
        if (!this.h.isEmpty()) {
            long l3 = System.nanoTime() + 50000000L;
            int n3 = 49;
            Iterator iterator = this.h.iterator();
            while (iterator.hasNext()) {
                boolean bl2;
                asi asi2 = (asi)iterator.next();
                if (asi2.f() != null || !asi2.a(bl2 = asi2.a(b))) continue;
                iterator.remove();
                if (asi2.b()) {
                    this.g.remove(asi2);
                }
                if (--n3 >= 0 && System.nanoTime() <= l3) continue;
                break;
            }
        }
        if (!this.g.isEmpty()) {
            n2 = 81;
            object2 = this.g.iterator();
            while (object2.hasNext()) {
                asi asi3 = (asi)object2.next();
                if (!asi3.b()) continue;
                object2.remove();
                if (--n2 >= 0) continue;
                break;
            }
        }
        if (this.d.isEmpty() && !(byf2 = this.c.q).f()) {
            this.c.ad().d();
        }
    }

    public boolean a(int n2, int n3) {
        long l2 = arr.d(n2, n3);
        return this.e.c(l2) != null;
    }

    public asi b(int n2, int n3) {
        return (asi)this.e.c(arr.d(n2, n3));
    }

    private asi c(int n2, int n3) {
        long l2 = arr.d(n2, n3);
        asi asi2 = (asi)this.e.c(l2);
        if (asi2 == null) {
            asi2 = new asi(this, n2, n3);
            this.e.a(l2, asi2);
            this.i.add(asi2);
            if (asi2.f() == null) {
                this.h.add(asi2);
            }
            if (!asi2.b()) {
                this.g.add(asi2);
            }
        }
        return asi2;
    }

    public void a(cmz cmz2) {
        int n2;
        int n3 = cmz2.a() >> 4;
        asi asi2 = this.b(n3, n2 = cmz2.c() >> 4);
        if (asi2 != null) {
            asi2.a(cmz2.a() & 0xF, cmz2.b(), cmz2.c() & 0xF);
        }
    }

    public void a(czt czt2) {
        int n2 = (int)czt2.aU >> 4;
        int n3 = (int)czt2.aW >> 4;
        czt2.d = czt2.aU;
        czt2.e = czt2.aW;
        for (int i2 = n2 - this.j; i2 <= n2 + this.j; ++i2) {
            for (int i3 = n3 - this.j; i3 <= n3 + this.j; ++i3) {
                this.c(i2, i3).a(czt2);
            }
        }
        this.d.add(czt2);
        this.e();
    }

    public void b(czt czt2) {
        int n2 = (int)czt2.d >> 4;
        int n3 = (int)czt2.e >> 4;
        for (int i2 = n2 - this.j; i2 <= n2 + this.j; ++i2) {
            for (int i3 = n3 - this.j; i3 <= n3 + this.j; ++i3) {
                asi asi2 = this.b(i2, i3);
                if (asi2 == null) continue;
                asi2.b(czt2);
            }
        }
        this.d.remove(czt2);
        this.e();
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 - n4;
        int n8 = n3 - n5;
        if (n7 < -n6 || n7 > n6) {
            return false;
        }
        return n8 >= -n6 && n8 <= n6;
    }

    public void c(czt czt2) {
        int n2 = (int)czt2.aU >> 4;
        int n3 = (int)czt2.aW >> 4;
        double d2 = czt2.d - czt2.aU;
        double d3 = czt2.e - czt2.aW;
        double d4 = d2 * d2 + d3 * d3;
        if (d4 < 64.0) {
            return;
        }
        int n4 = (int)czt2.d >> 4;
        int n5 = (int)czt2.e >> 4;
        int n6 = this.j;
        int n7 = n2 - n4;
        int n8 = n3 - n5;
        if (n7 == 0 && n8 == 0) {
            return;
        }
        for (int i2 = n2 - n6; i2 <= n2 + n6; ++i2) {
            for (int i3 = n3 - n6; i3 <= n3 + n6; ++i3) {
                asi asi2;
                if (!this.a(i2, i3, n4, n5, n6)) {
                    this.c(i2, i3).a(czt2);
                }
                if (this.a(i2 - n7, i3 - n8, n2, n3, n6) || (asi2 = this.b(i2 - n7, i3 - n8)) == null) continue;
                asi2.b(czt2);
            }
        }
        czt2.d = czt2.aU;
        czt2.e = czt2.aW;
        this.e();
    }

    public boolean a(czt czt2, int n2, int n3) {
        asi asi2 = this.b(n2, n3);
        return asi2 != null && asi2.d(czt2) && asi2.e();
    }

    public void a(int n2) {
        if ((n2 = cmk.a(n2, 3, 32)) == this.j) {
            return;
        }
        int n3 = n2 - this.j;
        ArrayList arrayList = ov.a((Iterable)this.d);
        for (czt czt2 : arrayList) {
            int n4;
            int n5;
            int n6 = (int)czt2.aU >> 4;
            int n7 = (int)czt2.aW >> 4;
            if (n3 > 0) {
                for (n5 = n6 - n2; n5 <= n6 + n2; ++n5) {
                    for (n4 = n7 - n2; n4 <= n7 + n2; ++n4) {
                        asi asi2 = this.c(n5, n4);
                        if (asi2.d(czt2)) continue;
                        asi2.a(czt2);
                    }
                }
                continue;
            }
            for (n5 = n6 - this.j; n5 <= n6 + this.j; ++n5) {
                for (n4 = n7 - this.j; n4 <= n7 + this.j; ++n4) {
                    if (this.a(n5, n4, n6, n7, n2)) continue;
                    this.c(n5, n4).b(czt2);
                }
            }
        }
        this.j = n2;
        this.e();
    }

    private void e() {
        this.l = true;
        this.m = true;
    }

    public static int b(int n2) {
        return n2 * 16 - 16;
    }

    private static long d(int n2, int n3) {
        return (long)n2 + Integer.MAX_VALUE | (long)n3 + Integer.MAX_VALUE << 32;
    }

    public void a(asi asi2) {
        this.f.add(asi2);
    }

    public void b(asi asi2) {
        zz zz2 = asi2.a();
        long l2 = arr.d(zz2.a, zz2.b);
        asi2.c();
        this.e.a(l2);
        this.i.remove(asi2);
        this.f.remove(asi2);
        this.g.remove(asi2);
        this.h.remove(asi2);
        bhm bhm2 = asi2.f();
        if (bhm2 != null) {
            this.a().ad().a(bhm2);
        }
    }

    static /* synthetic */ cm d() {
        return a;
    }
}


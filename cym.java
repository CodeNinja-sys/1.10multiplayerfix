/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class cym
implements cp {
    private final anu a;
    private final cmb b;
    private final Map c = sz.c();
    private final Map d = sz.c();
    private final Map e = sz.c();
    private double f;
    private boolean g = true;
    private double h;

    public cym(anu anu2, cmb cmb2) {
        this.a = anu2;
        this.b = cmb2;
        this.f = cmb2.c();
        for (int i2 = 0; i2 < 3; ++i2) {
            this.c.put(i2, aad.a());
        }
    }

    @Override
    public cmb a() {
        return this.b;
    }

    @Override
    public double b() {
        return this.f;
    }

    @Override
    public void a(double d2) {
        if (d2 == this.b()) {
            return;
        }
        this.f = d2;
        this.f();
    }

    @Override
    public Collection a(int n2) {
        return (Collection)this.c.get(n2);
    }

    @Override
    public Collection c() {
        HashSet hashSet = aad.a();
        for (int i2 = 0; i2 < 3; ++i2) {
            hashSet.addAll(this.a(i2));
        }
        return hashSet;
    }

    @Override
    public cs a(UUID uUID) {
        return (cs)this.e.get(uUID);
    }

    @Override
    public boolean a(cs cs2) {
        return this.e.get(cs2.a()) != null;
    }

    @Override
    public void b(cs cs2) {
        if (this.a(cs2.a()) != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        Set set = (Set)this.d.get(cs2.b());
        if (set == null) {
            set = aad.a();
            this.d.put(cs2.b(), set);
        }
        ((Set)this.c.get(cs2.c())).add(cs2);
        set.add(cs2);
        this.e.put(cs2.a(), cs2);
        this.f();
    }

    protected void f() {
        this.g = true;
        this.a.a(this);
    }

    @Override
    public void c(cs cs2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            Set set = (Set)this.c.get(i2);
            set.remove(cs2);
        }
        Set set = (Set)this.d.get(cs2.b());
        if (set != null) {
            set.remove(cs2);
            if (set.isEmpty()) {
                this.d.remove(cs2.b());
            }
        }
        this.e.remove(cs2.a());
        this.f();
    }

    @Override
    public void b(UUID uUID) {
        cs cs2 = this.a(uUID);
        if (cs2 != null) {
            this.c(cs2);
        }
    }

    @Override
    public void d() {
        Collection collection = this.c();
        if (collection == null) {
            return;
        }
        collection = ov.a(collection);
        for (cs cs2 : collection) {
            this.c(cs2);
        }
    }

    @Override
    public double e() {
        if (this.g) {
            this.h = this.g();
            this.g = false;
        }
        return this.h;
    }

    private double g() {
        double d2 = this.b();
        for (cs cs2 : this.b(0)) {
            d2 += cs2.d();
        }
        double d3 = d2;
        for (cs cs3 : this.b(1)) {
            d3 += d2 * cs3.d();
        }
        for (cs cs3 : this.b(2)) {
            d3 *= 1.0 + cs3.d();
        }
        return this.b.a(d3);
    }

    private Collection b(int n2) {
        HashSet hashSet = aad.b(this.a(n2));
        for (cmb cmb2 = this.b.e(); cmb2 != null; cmb2 = cmb2.e()) {
            cp cp2 = this.a.d(cmb2);
            if (cp2 == null) continue;
            hashSet.addAll(cp2.a(n2));
        }
        return hashSet;
    }
}


/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.hw;
import com.a.a.d.jt;
import com.a.a.d.mi;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class dcs
extends ss {
    private final bfa a;
    private final jt b;
    private mi c;

    private dcs(bfa bfa2, jt jt2) {
        this.a = bfa2;
        this.b = jt2;
    }

    @Override
    public Collection r() {
        return Collections.unmodifiableCollection(this.b.g());
    }

    @Override
    public Comparable b(bvs bvs2) {
        Comparable comparable = (Comparable)this.b.get(bvs2);
        if (comparable == null) {
            throw new IllegalArgumentException("Cannot get property " + bvs2 + " as it does not exist in " + this.a.r());
        }
        return (Comparable)bvs2.c().cast(comparable);
    }

    @Override
    public dbk a(bvs bvs2, Comparable comparable) {
        Comparable comparable2 = (Comparable)this.b.get(bvs2);
        if (comparable2 == null) {
            throw new IllegalArgumentException("Cannot set property " + bvs2 + " as it does not exist in " + this.a.r());
        }
        if (comparable2 == comparable) {
            return this;
        }
        dbk dbk2 = (dbk)this.c.b(bvs2, comparable);
        if (dbk2 == null) {
            throw new IllegalArgumentException("Cannot set property " + bvs2 + " to " + comparable + " on block " + bfa.v.b(this.a) + ", it is not an allowed value");
        }
        return dbk2;
    }

    @Override
    public jt s() {
        return this.b;
    }

    @Override
    public bfa t() {
        return this.a;
    }

    public boolean equals(Object object) {
        return this == object;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void a(Map map) {
        if (this.c != null) {
            throw new IllegalStateException();
        }
        hw hw2 = hw.k();
        for (Map.Entry entry : this.b.e()) {
            bvs bvs2 = (bvs)entry.getKey();
            for (Comparable comparable : bvs2.a()) {
                if (comparable == entry.getValue()) continue;
                hw2.a(bvs2, comparable, map.get(this.b(bvs2, comparable)));
            }
        }
        this.c = mi.b(hw2);
    }

    private Map b(bvs bvs2, Comparable comparable) {
        HashMap hashMap = sz.b(this.b);
        hashMap.put(bvs2, comparable);
        return hashMap;
    }

    @Override
    public ahk a() {
        return this.a.A(this);
    }

    @Override
    public boolean b() {
        return this.a.v(this);
    }

    @Override
    public boolean a(cpk cpk2) {
        return this.a.a((dbk)this, cpk2);
    }

    @Override
    public int c() {
        return this.a.w(this);
    }

    @Override
    public int d() {
        return this.a.y(this);
    }

    @Override
    public boolean e() {
        return this.a.x(this);
    }

    @Override
    public boolean f() {
        return this.a.z(this);
    }

    @Override
    public bif g() {
        return this.a.a(this);
    }

    @Override
    public dbk a(ih ih2) {
        return this.a.a((dbk)this, ih2);
    }

    @Override
    public dbk a(cdk cdk2) {
        return this.a.a((dbk)this, cdk2);
    }

    @Override
    public boolean h() {
        return this.a.c(this);
    }

    @Override
    public cpb i() {
        return this.a.g(this);
    }

    @Override
    public int a(bnj bnj2, cmz cmz2) {
        return this.a.c((dbk)this, bnj2, cmz2);
    }

    @Override
    public float j() {
        return this.a.k(this);
    }

    @Override
    public boolean k() {
        return this.a.B(this);
    }

    @Override
    public boolean l() {
        return this.a.C(this);
    }

    @Override
    public boolean m() {
        return this.a.i(this);
    }

    @Override
    public int a(bnj bnj2, cmz cmz2, bqk bqk2) {
        return this.a.b(this, bnj2, cmz2, bqk2);
    }

    @Override
    public boolean n() {
        return this.a.h(this);
    }

    @Override
    public int a(iu iu2, cmz cmz2) {
        return this.a.a((dbk)this, iu2, cmz2);
    }

    @Override
    public float b(iu iu2, cmz cmz2) {
        return this.a.d(this, iu2, cmz2);
    }

    @Override
    public float a(bdl bdl2, iu iu2, cmz cmz2) {
        return this.a.a((dbk)this, bdl2, iu2, cmz2);
    }

    @Override
    public int b(bnj bnj2, cmz cmz2, bqk bqk2) {
        return this.a.c(this, bnj2, cmz2, bqk2);
    }

    @Override
    public bez o() {
        return this.a.j(this);
    }

    @Override
    public dbk b(bnj bnj2, cmz cmz2) {
        return this.a.b((dbk)this, bnj2, cmz2);
    }

    @Override
    public cxt c(iu iu2, cmz cmz2) {
        return this.a.c((dbk)this, iu2, cmz2);
    }

    @Override
    public boolean c(bnj bnj2, cmz cmz2, bqk bqk2) {
        return this.a.a((dbk)this, bnj2, cmz2, bqk2);
    }

    @Override
    public boolean p() {
        return this.a.b(this);
    }

    @Override
    public cxt d(iu iu2, cmz cmz2) {
        return this.a.b((dbk)this, iu2, cmz2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        this.a.a(this, iu2, cmz2, cxt2, list, cpk2);
    }

    @Override
    public cxt c(bnj bnj2, cmz cmz2) {
        return this.a.a((dbk)this, bnj2, cmz2);
    }

    @Override
    public auu a(iu iu2, cmz cmz2, amj amj2, amj amj3) {
        return this.a.a((dbk)this, iu2, cmz2, amj2, amj3);
    }

    @Override
    public boolean q() {
        return this.a.f(this);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, int n2, int n3) {
        return this.a.a((dbk)this, iu2, cmz2, n2, n3);
    }

    @Override
    public void a(iu iu2, cmz cmz2, bfa bfa2) {
        this.a.a((dbk)this, iu2, cmz2, bfa2);
    }

    /* synthetic */ dcs(bfa bfa2, jt jt2, cva cva2) {
        this(bfa2, jt2);
    }
}


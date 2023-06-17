/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cr;
import a.a.a.a.a.cy;
import a.a.a.a.a.dh;
import a.a.a.a.a.du;
import a.a.a.a.a.ee;
import a.a.a.a.a.eh;
import a.a.a.a.a.ei;
import a.a.a.a.a.ej;
import java.io.Serializable;
import java.util.Comparator;
import java.util.SortedSet;

public class el
extends ee
implements eh,
Serializable,
Cloneable {
    private static final long c = -7046029254386353129L;
    final cy b;

    private el(int n2, cy cy2) {
        super(n2);
        this.b = cy2;
    }

    private el(int n2) {
        this(n2, (cy)null);
    }

    final int b(int n2, int n3) {
        return this.b == null ? Integer.compare(n2, n3) : this.b.a(n2, n3);
    }

    @Override
    public cr j() {
        return this.h();
    }

    @Override
    public cr d(int n2) {
        du du2 = this.h();
        if (this.b(this.a, n2) <= 0) {
            du2.next();
        }
        return du2;
    }

    @Override
    public cy b() {
        return this.b;
    }

    @Override
    public eh a(int n2, int n3) {
        if (this.b(n2, this.a) <= 0 && this.b(this.a, n3) < 0) {
            return this;
        }
        return ei.a;
    }

    @Override
    public eh b(int n2) {
        if (this.b(this.a, n2) < 0) {
            return this;
        }
        return ei.a;
    }

    @Override
    public eh c(int n2) {
        if (this.b(n2, this.a) <= 0) {
            return this;
        }
        return ei.a;
    }

    @Override
    public int c() {
        return this.a;
    }

    @Override
    public int d() {
        return this.a;
    }

    public Integer i() {
        return this.a;
    }

    public Integer k() {
        return this.a;
    }

    @Override
    public eh a(Integer n2, Integer n3) {
        return this.a((int)n2, (int)n3);
    }

    @Override
    public eh b(Integer n2) {
        return this.b((int)n2);
    }

    @Override
    public eh c(Integer n2) {
        return this.c((int)n2);
    }

    @Override
    public /* synthetic */ dh g() {
        return this.j();
    }

    @Override
    public /* synthetic */ cr bF_() {
        return super.h();
    }

    public /* synthetic */ Object last() {
        return this.k();
    }

    public /* synthetic */ Object first() {
        return this.i();
    }

    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.c((Integer)object);
    }

    public /* synthetic */ SortedSet headSet(Object object) {
        return this.b((Integer)object);
    }

    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }

    public /* synthetic */ Comparator comparator() {
        return this.b();
    }

    /* synthetic */ el(int n2, ej ej2) {
        this(n2);
    }

    /* synthetic */ el(int n2, cy cy2, ej ej2) {
        this(n2, cy2);
    }
}


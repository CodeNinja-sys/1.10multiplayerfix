/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cr;
import a.a.a.a.b.cy;
import a.a.a.a.b.dh;
import a.a.a.a.b.dv;
import a.a.a.a.b.ef;
import a.a.a.a.b.ei;
import a.a.a.a.b.ej;
import a.a.a.a.b.ek;
import java.io.Serializable;
import java.util.Comparator;
import java.util.SortedSet;

public class em
extends ef
implements ei,
Serializable,
Cloneable {
    private static final long c = -7046029254386353129L;
    final cy b;

    private em(long l2, cy cy2) {
        super(l2);
        this.b = cy2;
    }

    private em(long l2) {
        this(l2, (cy)null);
    }

    final int b(long l2, long l3) {
        return this.b == null ? Long.compare(l2, l3) : this.b.a(l2, l3);
    }

    @Override
    public cr j() {
        return this.h();
    }

    @Override
    public cr d(long l2) {
        dv dv2 = this.h();
        if (this.b(this.a, l2) <= 0) {
            dv2.next();
        }
        return dv2;
    }

    @Override
    public cy b() {
        return this.b;
    }

    @Override
    public ei a(long l2, long l3) {
        if (this.b(l2, this.a) <= 0 && this.b(this.a, l3) < 0) {
            return this;
        }
        return ej.a;
    }

    @Override
    public ei b(long l2) {
        if (this.b(this.a, l2) < 0) {
            return this;
        }
        return ej.a;
    }

    @Override
    public ei c(long l2) {
        if (this.b(l2, this.a) <= 0) {
            return this;
        }
        return ej.a;
    }

    @Override
    public long c() {
        return this.a;
    }

    @Override
    public long d() {
        return this.a;
    }

    public Long i() {
        return this.a;
    }

    public Long k() {
        return this.a;
    }

    @Override
    public ei a(Long l2, Long l3) {
        return this.a((long)l2, (long)l3);
    }

    @Override
    public ei b(Long l2) {
        return this.b((long)l2);
    }

    @Override
    public ei c(Long l2) {
        return this.c((long)l2);
    }

    @Override
    public /* synthetic */ dh g() {
        return this.j();
    }

    @Override
    public /* synthetic */ cr bH_() {
        return super.h();
    }

    public /* synthetic */ Object last() {
        return this.k();
    }

    public /* synthetic */ Object first() {
        return this.i();
    }

    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.c((Long)object);
    }

    public /* synthetic */ SortedSet headSet(Object object) {
        return this.b((Long)object);
    }

    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a((Long)object, (Long)object2);
    }

    public /* synthetic */ Comparator comparator() {
        return this.b();
    }

    /* synthetic */ em(long l2, ek ek2) {
        this(l2);
    }

    /* synthetic */ em(long l2, cy cy2, ek ek2) {
        this(l2, cy2);
    }
}


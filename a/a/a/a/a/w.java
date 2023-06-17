/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cr;
import a.a.a.a.a.dh;
import a.a.a.a.a.eh;
import a.a.a.a.a.v;
import java.util.Iterator;
import java.util.SortedSet;

public abstract class w
extends v
implements eh {
    protected w() {
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
    public eh a(Integer n2, Integer n3) {
        return this.a((int)n2, (int)n3);
    }

    public Integer h() {
        return this.c();
    }

    public Integer i() {
        return this.d();
    }

    @Override
    public cr j() {
        return this.bF_();
    }

    @Override
    public abstract cr bF_();

    @Override
    public /* synthetic */ dh a() {
        return this.bF_();
    }

    @Override
    public /* synthetic */ dh g() {
        return this.j();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.bF_();
    }

    public /* synthetic */ Object last() {
        return this.i();
    }

    public /* synthetic */ Object first() {
        return this.h();
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
}


/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cr;
import a.a.a.a.b.dh;
import a.a.a.a.b.ei;
import a.a.a.a.b.v;
import java.util.Iterator;
import java.util.SortedSet;

public abstract class w
extends v
implements ei {
    protected w() {
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
    public ei a(Long l2, Long l3) {
        return this.a((long)l2, (long)l3);
    }

    public Long h() {
        return this.c();
    }

    public Long i() {
        return this.d();
    }

    @Override
    public cr j() {
        return this.bH_();
    }

    @Override
    public abstract cr bH_();

    @Override
    public /* synthetic */ dh a() {
        return this.bH_();
    }

    @Override
    public /* synthetic */ dh g() {
        return this.j();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.bH_();
    }

    public /* synthetic */ Object last() {
        return this.i();
    }

    public /* synthetic */ Object first() {
        return this.h();
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
}


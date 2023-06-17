/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.m.an;
import java.util.Arrays;

final class ap
extends an {
    ap() {
        super(null);
    }

    Class a(Class class_) {
        return class_;
    }

    Iterable b(Class class_) {
        return Arrays.asList(class_.getInterfaces());
    }

    Class c(Class class_) {
        return class_.getSuperclass();
    }

    @Override
    /* synthetic */ Object d(Object object) {
        return this.c((Class)object);
    }

    @Override
    /* synthetic */ Iterable c(Object object) {
        return this.b((Class)object);
    }

    @Override
    /* synthetic */ Class b(Object object) {
        return this.a((Class)object);
    }
}


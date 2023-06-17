/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.b;

import java.lang.reflect.Constructor;
import org.apache.logging.log4j.core.a.a.c;

final class h
extends c {
    private final Class a;
    private final Constructor b;
    private final String c;

    protected h(int n2, Class class_, Constructor constructor, String string) {
        super(n2);
        this.a = class_;
        this.b = constructor;
        this.c = string;
    }

    static /* synthetic */ Class a(h h2) {
        return h2.a;
    }

    static /* synthetic */ Constructor b(h h2) {
        return h2.b;
    }

    static /* synthetic */ String c(h h2) {
        return h2.c;
    }
}


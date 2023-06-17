/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import java.lang.ref.SoftReference;
import java.util.HashMap;

final class d
extends ThreadLocal {
    d() {
    }

    protected SoftReference a() {
        return new SoftReference(new HashMap());
    }

    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}


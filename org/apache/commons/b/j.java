/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import org.apache.commons.b.k;

final class j
extends PhantomReference {
    private final String a;
    private final k b;

    j(String string, k k2, Object object, ReferenceQueue referenceQueue) {
        super(object, referenceQueue);
        this.a = string;
        this.b = k2 == null ? k.a : k2;
    }

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.b.a(new File(this.a));
    }
}


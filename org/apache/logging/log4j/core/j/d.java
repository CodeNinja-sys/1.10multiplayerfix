/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.j;

import org.apache.logging.log4j.core.j.c;

class d
extends SecurityManager {
    private d() {
    }

    public Class a(String string) {
        Class<?>[] arrclass = this.getClassContext();
        boolean bl2 = false;
        for (Class<?> class_ : arrclass) {
            if (class_.getName().equals(string)) {
                bl2 = true;
                continue;
            }
            if (!bl2) continue;
            return class_;
        }
        return null;
    }

    /* synthetic */ d(c c2) {
        this();
    }
}


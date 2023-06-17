/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.bg;
import com.a.b.c.a;
import com.a.b.k;

final class as
implements ap {
    as() {
    }

    public an a(k k2, a a2) {
        Class class_ = a2.a();
        if (!Enum.class.isAssignableFrom(class_) || class_ == Enum.class) {
            return null;
        }
        if (!class_.isEnum()) {
            class_ = class_.getSuperclass();
        }
        return new bg(class_);
    }
}


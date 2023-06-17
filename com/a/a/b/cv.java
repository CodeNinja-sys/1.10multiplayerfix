/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.b.co;
import java.io.Serializable;

class cv
implements cm,
Serializable {
    private final Class a;
    private static final long b = 0L;

    private cv(Class class_) {
        this.a = (Class)cl.a(class_);
    }

    @Override
    public boolean a(Object object) {
        return this.a.isInstance(object);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof cv) {
            cv cv2 = (cv)object;
            return this.a == cv2.a;
        }
        return false;
    }

    public String toString() {
        return "Predicates.instanceOf(" + this.a.getName() + ")";
    }

    /* synthetic */ cv(Class class_, co co2) {
        this(class_);
    }
}


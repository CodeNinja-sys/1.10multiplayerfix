/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.at;
import com.a.a.b.bl;
import com.a.a.b.cl;
import java.io.Serializable;

final class av
implements bl,
Serializable {
    private final Class a;
    private static final long b = 0L;

    private av(Class class_) {
        this.a = (Class)cl.a(class_);
    }

    public Enum a(String string) {
        try {
            return Enum.valueOf(this.a, string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof av && this.a.equals(((av)object).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Enums.valueOf(" + this.a + ")";
    }

    /* synthetic */ av(Class class_, at at2) {
        this(class_);
    }
}


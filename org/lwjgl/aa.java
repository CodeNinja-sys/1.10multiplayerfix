/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import org.lwjgl.d;
import org.lwjgl.z;

public abstract class aa
implements z {
    protected final long a;

    protected aa(long l2) {
        this.a = l2;
    }

    public boolean b() {
        return this.a != 0L;
    }

    public final void c() {
        if (d.i && !this.b()) {
            throw new IllegalStateException("This " + this.getClass().getSimpleName() + " pointer is not valid.");
        }
    }

    @Override
    public final long a() {
        this.c();
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aa)) {
            return false;
        }
        aa aa2 = (aa)object;
        return this.a == aa2.a;
    }

    public int hashCode() {
        return (int)(this.a ^ this.a >>> 32);
    }

    public String toString() {
        return this.getClass().getSimpleName() + " pointer (0x" + Long.toHexString(this.a).toUpperCase() + ")";
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

final class aa {
    private final Object a;
    private final int b;

    public aa(Object object) {
        this.b = System.identityHashCode(object);
        this.a = object;
    }

    public int hashCode() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (!(object instanceof aa)) {
            return false;
        }
        aa aa2 = (aa)object;
        if (this.b != aa2.b) {
            return false;
        }
        return this.a == aa2.a;
    }
}


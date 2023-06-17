/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j;

import org.apache.logging.log4j.f;

class h
implements f {
    private static final long a = 100L;
    private final String b;
    private final f c;

    public h(String string) {
        this.b = string;
        this.c = null;
    }

    public h(String string, f f2) {
        this.b = string;
        this.c = f2;
    }

    @Override
    public String a() {
        return this.b;
    }

    @Override
    public f b() {
        return this.c;
    }

    @Override
    public boolean a(f f2) {
        if (f2 == null) {
            throw new IllegalArgumentException("A marker parameter is required");
        }
        f f3 = this;
        do {
            if (f3 != f2) continue;
            return true;
        } while ((f3 = f3.b()) != null);
        return false;
    }

    @Override
    public boolean a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("A marker name is required");
        }
        f f2 = this;
        do {
            if (!string.equals(f2.a())) continue;
            return true;
        } while ((f2 = f2.b()) != null);
        return false;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof f)) {
            return false;
        }
        f f2 = (f)object;
        return !(this.b != null ? !this.b.equals(f2.a()) : f2.a() != null);
    }

    public int hashCode() {
        return this.b != null ? this.b.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.b);
        if (this.c != null) {
            stringBuilder.append("[ ");
            boolean bl2 = true;
            for (f f2 = this.c; f2 != null; f2 = f2.b()) {
                if (!bl2) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(f2.a());
                bl2 = false;
            }
            stringBuilder.append(" ]");
        }
        return stringBuilder.toString();
    }
}


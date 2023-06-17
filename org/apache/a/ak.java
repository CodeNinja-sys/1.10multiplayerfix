/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a;

import java.io.Serializable;
import org.apache.a.o.a;

public class ak
implements Serializable,
Cloneable {
    private static final long a = 8950662842175091068L;
    protected final String e;
    protected final int f;
    protected final int g;

    public ak(String string, int n2, int n3) {
        this.e = (String)org.apache.a.o.a.a((Object)string, "Protocol name");
        this.f = org.apache.a.o.a.b(n2, "Protocol minor version");
        this.g = org.apache.a.o.a.b(n3, "Protocol minor version");
    }

    public final String a() {
        return this.e;
    }

    public final int b() {
        return this.f;
    }

    public final int c() {
        return this.g;
    }

    public ak a(int n2, int n3) {
        if (n2 == this.f && n3 == this.g) {
            return this;
        }
        return new ak(this.e, n2, n3);
    }

    public final int hashCode() {
        return this.e.hashCode() ^ this.f * 100000 ^ this.g;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ak)) {
            return false;
        }
        ak ak2 = (ak)object;
        return this.e.equals(ak2.e) && this.f == ak2.f && this.g == ak2.g;
    }

    public boolean a(ak ak2) {
        return ak2 != null && this.e.equals(ak2.e);
    }

    public int b(ak ak2) {
        org.apache.a.o.a.a(ak2, "Protocol version");
        org.apache.a.o.a.a(this.e.equals(ak2.e), "Versions for different protocols cannot be compared: %s %s", this, ak2);
        int n2 = this.b() - ak2.b();
        if (n2 == 0) {
            n2 = this.c() - ak2.c();
        }
        return n2;
    }

    public final boolean c(ak ak2) {
        return this.a(ak2) && this.b(ak2) >= 0;
    }

    public final boolean d(ak ak2) {
        return this.a(ak2) && this.b(ak2) <= 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e);
        stringBuilder.append('/');
        stringBuilder.append(Integer.toString(this.f));
        stringBuilder.append('.');
        stringBuilder.append(Integer.toString(this.g));
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }
}


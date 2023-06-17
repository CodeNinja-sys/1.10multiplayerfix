/*
 * Decompiled with CFR 0.150.
 */
package com.c.a;

import com.c.a.d.b;
import java.util.UUID;
import org.apache.commons.c.a.ae;
import org.apache.commons.c.am;

public class e {
    private final UUID a;
    private final String b;
    private final b c = new b();
    private boolean d;

    public e(UUID uUID, String string) {
        if (uUID == null && am.c((CharSequence)string)) {
            throw new IllegalArgumentException("Name and ID cannot both be blank");
        }
        this.a = uUID;
        this.b = string;
    }

    public UUID a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public b c() {
        return this.c;
    }

    public boolean d() {
        return this.a != null && am.d((CharSequence)this.b());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        e e2 = (e)object;
        if (this.a != null ? !this.a.equals(e2.a) : e2.a != null) {
            return false;
        }
        return !(this.b != null ? !this.b.equals(e2.b) : e2.b != null);
    }

    public int hashCode() {
        int n2 = this.a != null ? this.a.hashCode() : 0;
        n2 = 31 * n2 + (this.b != null ? this.b.hashCode() : 0);
        return n2;
    }

    public String toString() {
        return new ae(this).a("id", this.a).a("name", this.b).a("properties", this.c).a("legacy", this.d).toString();
    }

    public boolean e() {
        return this.d;
    }
}


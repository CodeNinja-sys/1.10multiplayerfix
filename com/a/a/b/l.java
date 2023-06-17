/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ak;
import com.a.a.b.cl;
import com.a.a.b.f;
import java.io.Serializable;

final class l
extends ak
implements Serializable {
    private final f a;
    private final f b;
    private static final long c = 0L;

    l(f f2, f f3) {
        this.a = (f)((Object)cl.a((Object)f2));
        this.b = (f)((Object)cl.a((Object)f3));
    }

    protected String a(String string) {
        return string == null ? null : this.a.a(this.b, string);
    }

    protected String b(String string) {
        return string == null ? null : this.b.a(this.a, string);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof l) {
            l l2 = (l)object;
            return this.a.equals((Object)l2.a) && this.b.equals((Object)l2.b);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        return (Object)((Object)this.a) + ".converterTo(" + (Object)((Object)this.b) + ")";
    }

    @Override
    protected /* synthetic */ Object c(Object object) {
        return this.a((String)object);
    }
}


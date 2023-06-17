/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.b.cm;
import java.io.Serializable;
import java.util.regex.Pattern;

class ct
implements cm,
Serializable {
    final Pattern a;
    private static final long b = 0L;

    ct(Pattern pattern) {
        this.a = (Pattern)cl.a(pattern);
    }

    public boolean a(CharSequence charSequence) {
        return this.a.matcher(charSequence).find();
    }

    public int hashCode() {
        return cc.a(new Object[]{this.a.pattern(), this.a.flags()});
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ct) {
            ct ct2 = (ct)object;
            return cc.a((Object)this.a.pattern(), (Object)ct2.a.pattern()) && cc.a((Object)this.a.flags(), (Object)ct2.a.flags());
        }
        return false;
    }

    public String toString() {
        String string = cc.a((Object)this.a).a("pattern", this.a.pattern()).a("pattern.flags", this.a.flags()).toString();
        return "Predicates.contains(" + string + ")";
    }
}


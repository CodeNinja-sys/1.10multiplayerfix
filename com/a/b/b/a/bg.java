/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.a.b;
import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.util.HashMap;
import java.util.Map;

final class bg
extends an {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    public bg(Class class_) {
        try {
            for (Enum enum_ : (Enum[])class_.getEnumConstants()) {
                String string = enum_.name();
                b b2 = class_.getField(string).getAnnotation(b.class);
                if (b2 != null) {
                    string = b2.a();
                }
                this.a.put(string, enum_);
                this.b.put(enum_, string);
            }
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new AssertionError();
        }
    }

    public Enum b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        return (Enum)this.a.get(a2.h());
    }

    public void a(e e2, Enum enum_) {
        e2.b(enum_ == null ? null : (String)this.b.get(enum_));
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.ae;
import com.a.b.b.ak;
import com.a.b.b.f;
import java.lang.reflect.Type;

class j
implements ae {
    private final ak d = ak.a();
    final /* synthetic */ Class a;
    final /* synthetic */ Type b;
    final /* synthetic */ f c;

    j(f f2, Class class_, Type type) {
        this.c = f2;
        this.a = class_;
        this.b = type;
    }

    public Object a() {
        try {
            Object object = this.d.a(this.a);
            return object;
        }
        catch (Exception exception) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + this.b + ". " + "Register an InstanceCreator with Gson for this type may fix this problem.", exception);
        }
    }
}


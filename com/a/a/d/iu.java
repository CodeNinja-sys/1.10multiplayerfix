/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.it;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.yx;
import java.util.Map;

public final class iu
extends ju {
    public iu a(Object object, Object object2) {
        super.b(object, object2);
        return this;
    }

    public iu a(Map map) {
        super.b(map);
        return this;
    }

    public it a() {
        switch (this.b) {
            case 0: {
                return it.i();
            }
            case 1: {
                return it.b(this.a[0].getKey(), this.a[0].getValue());
            }
        }
        return new yx(this.b, this.a);
    }

    @Override
    public /* synthetic */ jt b() {
        return this.a();
    }

    @Override
    public /* synthetic */ ju b(Map map) {
        return this.a(map);
    }

    @Override
    public /* synthetic */ ju b(Object object, Object object2) {
        return this.a(object, object2);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.d.ov;
import java.util.ArrayList;

final class be
extends ThreadLocal {
    be() {
    }

    protected ArrayList a() {
        return ov.b(3);
    }

    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}


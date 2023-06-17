/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aao;
import com.a.a.d.aar;
import com.a.a.d.i;
import java.util.Set;

class aap
extends i {
    final /* synthetic */ aao a;

    aap(aao aao2, int n2) {
        this.a = aao2;
        super(n2);
    }

    protected Set b(int n2) {
        return new aar(this.a.a, n2);
    }

    @Override
    protected /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }
}


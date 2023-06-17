/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.ca;
import java.io.Reader;

final class bs
implements ca {
    final /* synthetic */ Reader a;

    bs(Reader reader) {
        this.a = reader;
    }

    @Override
    public int a() {
        return this.a.read();
    }

    @Override
    public void b() {
        this.a.close();
    }
}


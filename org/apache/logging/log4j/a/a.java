/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.a.n;
import org.apache.logging.log4j.a.r;
import org.apache.logging.log4j.a.u;

public abstract class a
implements n {
    @Override
    public m a(Object object) {
        return new r(object);
    }

    @Override
    public m a(String string) {
        return new u(string);
    }

    @Override
    public abstract m a(String var1, Object ... var2);
}


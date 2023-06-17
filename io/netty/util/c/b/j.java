/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.b;

import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.b.i;
import java.util.logging.Logger;

public class j
extends h {
    @Override
    public g a(String string) {
        return new i(Logger.getLogger(string));
    }
}


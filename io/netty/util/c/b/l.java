/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package io.netty.util.c.b;

import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.b.k;
import org.apache.log4j.Logger;

public class l
extends h {
    @Override
    public g a(String string) {
        return new k(Logger.getLogger((String)string));
    }
}


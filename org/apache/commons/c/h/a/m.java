/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h.a;

import java.io.Writer;
import org.apache.commons.c.h.a.c;

public class m
extends c {
    @Override
    public boolean a(int n2, Writer writer) {
        return n2 >= 55296 && n2 <= 57343;
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.bd;
import com.sun.jna.bs;
import java.lang.reflect.Field;

public class br
extends bs {
    private bd a;
    private Field b;

    br(bd bd2, Field field) {
        this.a = bd2;
        this.b = field;
    }

    public bd a() {
        return this.a;
    }

    public Field b() {
        return this.b;
    }
}


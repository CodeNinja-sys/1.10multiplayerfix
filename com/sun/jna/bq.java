/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.bd;
import com.sun.jna.m;
import java.lang.reflect.Field;

public class bq
extends m {
    private bd a;
    private Field b;

    bq(bd bd2, Field field) {
        super(field.getType());
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


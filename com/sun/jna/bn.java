/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.bd;
import com.sun.jna.be;
import com.sun.jna.bu;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class bn {
    int a;
    int b;
    Map c;
    int d;
    bu e;
    List f;
    boolean g;
    private final bd h;

    private bn(bd bd2) {
        this.h = bd2;
        this.a = -1;
        this.b = 1;
        this.c = Collections.synchronizedMap(new LinkedHashMap());
        this.d = 0;
    }

    bn(bd bd2, be be2) {
        this(bd2);
    }
}


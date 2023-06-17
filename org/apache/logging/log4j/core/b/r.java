/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.lmax.disruptor.EventTranslator
 */
package org.apache.logging.log4j.core.b;

import com.lmax.disruptor.EventTranslator;
import java.util.Map;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.b.a;
import org.apache.logging.log4j.core.b.n;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.j;

public class r
implements EventTranslator {
    private a a;
    private String b;
    private f c;
    private String d;
    private b e;
    private m f;
    private Throwable g;
    private Map h;
    private j i;
    private String j;
    private StackTraceElement k;
    private long l;

    public void a(n n2, long l2) {
        n2.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public void a(a a2, String string, f f2, String string2, b b2, m m2, Throwable throwable, Map map, j j2, String string3, StackTraceElement stackTraceElement, long l2) {
        this.a = a2;
        this.b = string;
        this.c = f2;
        this.d = string2;
        this.e = b2;
        this.f = m2;
        this.g = throwable;
        this.h = map;
        this.i = j2;
        this.j = string3;
        this.k = stackTraceElement;
        this.l = l2;
    }
}


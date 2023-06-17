/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.io.File;
import java.util.List;
import org.apache.logging.log4j.core.config.ac;
import org.apache.logging.log4j.core.config.k;
import org.apache.logging.log4j.core.config.l;

public class q
implements l {
    private static final int a = 15;
    private static final int b = 5;
    private static final int c = 1000;
    private final File d;
    private long e;
    private final List f;
    private final int g;
    private long h;
    private volatile int i = 0;
    private final ac j;

    public q(ac ac2, File file, List list, int n2) {
        this.j = ac2;
        this.d = file;
        this.e = file.lastModified();
        this.f = list;
        this.g = (n2 < 5 ? 5 : n2) * 1000;
        this.h = System.currentTimeMillis() + (long)n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a() {
        if ((++this.i & 0xF) == 0) {
            q q2 = this;
            synchronized (q2) {
                long l2 = System.currentTimeMillis();
                if (l2 >= this.h) {
                    this.h = l2 + (long)this.g;
                    if (this.d.lastModified() > this.e) {
                        this.e = this.d.lastModified();
                        for (k k2 : this.f) {
                            k2.a(this.j);
                        }
                    }
                }
            }
        }
    }
}

